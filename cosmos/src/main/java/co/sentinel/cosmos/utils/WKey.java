package co.sentinel.cosmos.utils;

import static org.bitcoinj.core.ECKey.CURVE;
import static co.sentinel.cosmos.base.BaseChain.AKASH_MAIN;
import static co.sentinel.cosmos.base.BaseChain.ALTHEA_TEST;
import static co.sentinel.cosmos.base.BaseChain.BAND_MAIN;
import static co.sentinel.cosmos.base.BaseChain.BNB_MAIN;
import static co.sentinel.cosmos.base.BaseChain.BNB_TEST;
import static co.sentinel.cosmos.base.BaseChain.CERTIK_MAIN;
import static co.sentinel.cosmos.base.BaseChain.CERTIK_TEST;
import static co.sentinel.cosmos.base.BaseChain.COSMOS_MAIN;
import static co.sentinel.cosmos.base.BaseChain.COSMOS_TEST;
import static co.sentinel.cosmos.base.BaseChain.CRYPTO_MAIN;
import static co.sentinel.cosmos.base.BaseChain.FETCHAI_MAIN;
import static co.sentinel.cosmos.base.BaseChain.IOV_MAIN;
import static co.sentinel.cosmos.base.BaseChain.IOV_TEST;
import static co.sentinel.cosmos.base.BaseChain.IRIS_MAIN;
import static co.sentinel.cosmos.base.BaseChain.IRIS_TEST;
import static co.sentinel.cosmos.base.BaseChain.KAVA_MAIN;
import static co.sentinel.cosmos.base.BaseChain.KAVA_TEST;
import static co.sentinel.cosmos.base.BaseChain.KI_MAIN;
import static co.sentinel.cosmos.base.BaseChain.MEDI_TEST;
import static co.sentinel.cosmos.base.BaseChain.OKEX_MAIN;
import static co.sentinel.cosmos.base.BaseChain.OK_TEST;
import static co.sentinel.cosmos.base.BaseChain.OSMOSIS_MAIN;
import static co.sentinel.cosmos.base.BaseChain.PERSIS_MAIN;
import static co.sentinel.cosmos.base.BaseChain.RIZON_TEST;
import static co.sentinel.cosmos.base.BaseChain.SECRET_MAIN;
import static co.sentinel.cosmos.base.BaseChain.SENTINEL_MAIN;
import static co.sentinel.cosmos.base.BaseChain.SIF_MAIN;

import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
import com.google.protobuf.Any;

import org.bitcoinj.core.Bech32;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.crypto.ChildNumber;
import org.bitcoinj.crypto.DeterministicHierarchy;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.crypto.HDKeyDerivation;
import org.bitcoinj.crypto.MnemonicCode;
import org.bitcoinj.crypto.MnemonicException;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.util.encoders.Hex;
import org.web3j.crypto.Keys;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.sentinel.cosmos.base.BaseChain;
import co.sentinel.cosmos.base.BaseConstant;
import co.sentinel.cosmos.crypto.Sha256;
import timber.log.Timber;

public class WKey {

    private static final String CHARSET = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";

    public static byte[] getEntropy() {
        byte[] seed = new byte[32];
        new SecureRandom().nextBytes(seed);
        return seed;
    }

    public static List<String> getRandomMnemonic(byte[] entropy) {
        List<String> result = new ArrayList<>();
        try {
            result = MnemonicCode.INSTANCE.toMnemonic(entropy);

        } catch (MnemonicException.MnemonicLengthException e) {
            if (BaseConstant.IS_SHOTimber)
                e.printStackTrace();

        }
        return result;
    }

    public static byte[] toEntropy(ArrayList<String> words) {
        try {
            return new MnemonicCode().toEntropy(words);
        } catch (Exception e) {
            Timber.e(e);
            return null;
        }
    }

    public static boolean isMnemonicWords(ArrayList<String> words) {
        boolean result = true;
        List<String> mnemonics = MnemonicCode.INSTANCE.getWordList();
        for (String insert : words) {
            if (!mnemonics.contains(insert)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static byte[] getByteHdSeedFromWords(ArrayList<String> words) {
        return getHDSeed(toEntropy(words));
    }

    public static String getStringHdSeedFromWords(ArrayList<String> words) {
        return WUtil.ByteArrayToHexString(getByteHdSeedFromWords(words));
    }

    public static boolean isValidStringHdSeedFromWords(ArrayList<String> words) {
        if (getByteHdSeedFromWords(words) == null) {
            return false;
        } else {
            return true;
        }
    }


    public static byte[] getHDSeed(byte[] entropy) {
        try {
            return MnemonicCode.toSeed(MnemonicCode.INSTANCE.toMnemonic(entropy), "");
        } catch (Exception e) {
            return null;
        }
    }

    public static String getDpAddressFromEntropy(BaseChain chain, String entropy, int path, boolean newBip, int customPath) {
        DeterministicKey childKey = getKeyWithPathfromEntropy(chain, entropy, path, newBip, customPath);
        if ((chain.equals(OKEX_MAIN) || chain.equals(OK_TEST)) && newBip) {
            return generateAddressFromPriv("ex", childKey.getPrivateKeyAsHex());
        }
        return getDpAddress(chain, childKey.getPublicKeyAsHex());
    }

    public static DeterministicKey getKeyWithPathfromEntropy(BaseChain chain, String entropy, int path, boolean newBip44, int customPath) {
        if (!chain.equals(FETCHAI_MAIN)) {
            return getKeyWithPathfromEntropy(chain, entropy, path, newBip44);
        } else {
            DeterministicKey masterKey = HDKeyDerivation.createMasterPrivateKey(getHDSeed(WUtil.HexStringToByteArray(entropy)));
            if (customPath != 2) {
                DeterministicKey targetKey = new DeterministicHierarchy(masterKey).deriveChild(WKey.getFetchParentPath(customPath), true, true, new ChildNumber(path));
                return targetKey;
            } else {
                DeterministicKey targetKey = new DeterministicHierarchy(masterKey).deriveChild(WKey.getFetchParentPath(customPath), true, true, new ChildNumber(path, true));
                DeterministicKey targetKey2 = new DeterministicHierarchy(targetKey).deriveChild(WKey.getFetchParentPath2(), true, true, ChildNumber.ZERO);
                return targetKey2;
            }
        }
    }

    public static List<ChildNumber> getFetchParentPath(int customPath) {
        if (customPath == 1) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(60, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);         // m/44'/60'/0'/0/X
        } else if (customPath == 2) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(60, true));                                                      // m/44'/60'/X'/0/0
        } else if (customPath == 3) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(60, true), ChildNumber.ZERO_HARDENED);                           // m/44'/60'/0'/X
        }
        return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(118, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);            // m/44'/118'/0'/0/X
    }

    public static List<ChildNumber> getFetchParentPath2() {
        return ImmutableList.of(ChildNumber.ZERO);
    }

    public static List<ChildNumber> getParentPath(BaseChain chain, boolean newBip) {
        if (chain.equals(COSMOS_MAIN) || chain.equals(IRIS_MAIN) || chain.equals(CERTIK_MAIN) || chain.equals(CERTIK_TEST) || chain.equals(AKASH_MAIN) || chain.equals(SENTINEL_MAIN) || chain.equals(FETCHAI_MAIN) || chain.equals(SIF_MAIN) ||
                chain.equals(COSMOS_TEST) || chain.equals(IRIS_TEST) || chain.equals(KI_MAIN) || chain.equals(OSMOSIS_MAIN)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(118, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(BNB_MAIN) || chain.equals(BNB_TEST)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(714, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(KAVA_MAIN) || chain.equals(KAVA_TEST)) {
            if (newBip) {
                return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(459, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);
            } else {
                return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(118, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);
            }

        } else if (chain.equals(BAND_MAIN)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(494, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(IOV_MAIN) || chain.equals(IOV_TEST)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(234, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(OKEX_MAIN) || chain.equals(OK_TEST)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(996, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(SECRET_MAIN)) {
            if (newBip) {
                return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(529, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);
            } else {
                return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(118, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);
            }

        } else if (chain.equals(PERSIS_MAIN)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(750, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(CRYPTO_MAIN)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(394, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(RIZON_TEST)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(1217, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(MEDI_TEST)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(371, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        } else if (chain.equals(ALTHEA_TEST)) {
            return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(60, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);

        }
        return ImmutableList.of(new ChildNumber(44, true), new ChildNumber(118, true), ChildNumber.ZERO_HARDENED, ChildNumber.ZERO);
    }

    public static DeterministicKey getKeyWithPathfromEntropy(BaseChain chain, String entropy, int path, boolean newBip44) {
        DeterministicKey masterKey = HDKeyDerivation.createMasterPrivateKey(getHDSeed(BytesUtil.HexStringToByteArray(entropy)));
        return new DeterministicHierarchy(masterKey).deriveChild(WKey.getParentPath(chain, newBip44), true, true, new ChildNumber(path));
    }

    // For gRpc Keys
    public static Any generateGrpcPubKeyFromPriv(String privateKey) {
        ECKey ecKey = ECKey.fromPrivate(new BigInteger(privateKey, 16));
        cosmos.crypto.secp256k1.Keys.PubKey pubKey = cosmos.crypto.secp256k1.Keys.PubKey.newBuilder().setKey(ByteString.copyFrom(ecKey.getPubKey())).build();
        return Any.newBuilder().setTypeUrl("/cosmos.crypto.secp256k1.PubKey").setValue(pubKey.toByteString()).build();
    }


    // Ethermint Style Key gen (OKex)
    public static String createNewAddressSecp256k1(String mainPrefix, byte[] publickKey) throws Exception {
        byte[] uncompressedPubKey = CURVE.getCurve().decodePoint(publickKey).getEncoded(false);
        byte[] pub = new byte[64];
        System.arraycopy(uncompressedPubKey, 1, pub, 0, 64);

        byte[] address = Keys.getAddress(pub);
        Timber.w("eth address %s", BytesUtil.ByteArrayToHexString(address));

        String addressResult = null;
        try {
            byte[] bytes = convertBits(address, 8, 5, true);
            addressResult = Bech32.encode(mainPrefix, bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return addressResult;
    }

    public static String generatePubKeyHexFromPriv(String privateKey) {
        ECKey k = ECKey.fromPrivate(new BigInteger(privateKey, 16));
        return k.getPublicKeyAsHex();
    }

    public static String generateAddressFromPub(String prefix, String pubKey) {
        try {
            String addr = createNewAddressSecp256k1(prefix, Hex.decode(pubKey));
            return addr;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String generateAddressFromPriv(String prefix, String privateKey) {
        String pub = generatePubKeyHexFromPriv(privateKey);
        return generateAddressFromPub(prefix, pub);
    }


    public static String getDpAddress(BaseChain chain, String pubHex) {
        String result = null;
        MessageDigest digest = Sha256.getSha256Digest();
        byte[] hash = digest.digest(BytesUtil.HexStringToByteArray(pubHex));

        RIPEMD160Digest digest2 = new RIPEMD160Digest();
        digest2.update(hash, 0, hash.length);

        byte[] hash3 = new byte[digest2.getDigestSize()];
        digest2.doFinal(hash3, 0);

        try {
            byte[] converted = convertBits(hash3, 8, 5, true);
            if (chain.equals(COSMOS_MAIN) || chain.equals(COSMOS_TEST)) {
                result = bech32Encode("cosmos".getBytes(), converted);
            } else if (chain.equals(IRIS_MAIN) || chain.equals(IRIS_TEST)) {
                result = bech32Encode("iaa".getBytes(), converted);
            } else if (chain.equals(BNB_MAIN)) {
                result = bech32Encode("bnb".getBytes(), converted);
            } else if (chain.equals(KAVA_MAIN) || chain.equals(KAVA_TEST)) {
                result = bech32Encode("kava".getBytes(), converted);
            } else if (chain.equals(BAND_MAIN)) {
                result = bech32Encode("band".getBytes(), converted);
            } else if (chain.equals(BNB_TEST)) {
                result = bech32Encode("tbnb".getBytes(), converted);
            } else if (chain.equals(IOV_MAIN) || chain.equals(IOV_TEST)) {
                result = bech32Encode("star".getBytes(), converted);
            } else if (chain.equals(OKEX_MAIN) || chain.equals(OK_TEST)) {
                result = bech32Encode("ex".getBytes(), converted);
            } else if (chain.equals(CERTIK_MAIN) || chain.equals(CERTIK_TEST)) {
                result = bech32Encode("certik".getBytes(), converted);
            } else if (chain.equals(SECRET_MAIN)) {
                result = bech32Encode("secret".getBytes(), converted);
            } else if (chain.equals(AKASH_MAIN)) {
                result = bech32Encode("akash".getBytes(), converted);
            } else if (chain.equals(PERSIS_MAIN)) {
                result = bech32Encode("persistence".getBytes(), converted);
            } else if (chain.equals(SENTINEL_MAIN)) {
                result = bech32Encode("sent".getBytes(), converted);
            } else if (chain.equals(FETCHAI_MAIN)) {
                result = bech32Encode("fetch".getBytes(), converted);
            } else if (chain.equals(CRYPTO_MAIN)) {
                result = bech32Encode("cro".getBytes(), converted);
            } else if (chain.equals(SIF_MAIN)) {
                result = bech32Encode("sif".getBytes(), converted);
            } else if (chain.equals(KI_MAIN)) {
                result = bech32Encode("ki".getBytes(), converted);
            } else if (chain.equals(OSMOSIS_MAIN)) {
                result = bech32Encode("osmo".getBytes(), converted);
            } else if (chain.equals(RIZON_TEST)) {
                result = bech32Encode("rizon".getBytes(), converted);
            } else if (chain.equals(MEDI_TEST)) {
                result = bech32Encode("panacea".getBytes(), converted);
            } else if (chain.equals(ALTHEA_TEST)) {
                result = bech32Encode("althea".getBytes(), converted);
            }

        } catch (Exception e) {
            Timber.w("Secp256k1 genDPAddress Error");
        }
        return result;
    }

    public static byte[] convertBits(byte[] data, int frombits, int tobits, boolean pad) throws Exception {
        int acc = 0;
        int bits = 0;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int maxv = (1 << tobits) - 1;
        for (int i = 0; i < data.length; i++) {
            int value = data[i] & 0xff;
            if ((value >>> frombits) != 0) {
                throw new Exception("invalid data range: data[" + i + "]=" + value + " (frombits=" + frombits + ")");
            }
            acc = (acc << frombits) | value;
            bits += frombits;
            while (bits >= tobits) {
                bits -= tobits;
                baos.write((acc >>> bits) & maxv);
            }
        }
        if (pad) {
            if (bits > 0) {
                baos.write((acc << (tobits - bits)) & maxv);
            }
        } else if (bits >= frombits) {
            throw new Exception("illegal zero padding");
        } else if (((acc << (tobits - bits)) & maxv) != 0) {
            throw new Exception("non-zero padding");
        }
        return baos.toByteArray();
    }

    public static String bech32Encode(byte[] hrp, byte[] data) {
        byte[] chk = createChecksum(hrp, data);
        byte[] combined = new byte[chk.length + data.length];

        System.arraycopy(data, 0, combined, 0, data.length);
        System.arraycopy(chk, 0, combined, data.length, chk.length);

        byte[] xlat = new byte[combined.length];
        for (int i = 0; i < combined.length; i++) {
            xlat[i] = (byte) CHARSET.charAt(combined[i]);
        }

        byte[] ret = new byte[hrp.length + xlat.length + 1];
        System.arraycopy(hrp, 0, ret, 0, hrp.length);
        System.arraycopy(new byte[]{0x31}, 0, ret, hrp.length, 1);
        System.arraycopy(xlat, 0, ret, hrp.length + 1, xlat.length);

        return new String(ret);
    }

    public static HrpAndData bech32Decode(String bech) {

        if (!bech.equals(bech.toLowerCase()) && !bech.equals(bech.toUpperCase())) {
            throw new IllegalArgumentException("bech32 cannot mix upper and lower case");
        }

        byte[] buffer = bech.getBytes();
        for (byte b : buffer) {
            if (b < 0x21 || b > 0x7e)
                throw new IllegalArgumentException("bech32 characters out of range");
        }

        bech = bech.toLowerCase();
        int pos = bech.lastIndexOf("1");
        if (pos < 1) {
            throw new IllegalArgumentException("bech32 missing separator");
        } else if (pos + 7 > bech.length()) {
            throw new IllegalArgumentException("bech32 separator misplaced");
        } else if (bech.length() < 8) {
            throw new IllegalArgumentException("bech32 input too short");
        } else if (bech.length() > 90) {
            throw new IllegalArgumentException("bech32 input too long");
        }

        String s = bech.substring(pos + 1);
        for (int i = 0; i < s.length(); i++) {
            if (CHARSET.indexOf(s.charAt(i)) == -1) {
                throw new IllegalArgumentException("bech32 characters  out of range");
            }
        }

        byte[] hrp = bech.substring(0, pos).getBytes();

        byte[] data = new byte[bech.length() - pos - 1];
        for (int j = 0, i = pos + 1; i < bech.length(); i++, j++) {
            data[j] = (byte) CHARSET.indexOf(bech.charAt(i));
        }

        if (!verifyChecksum(hrp, data)) {
            throw new IllegalArgumentException("invalid bech32 checksum");
        }

        byte[] ret = new byte[data.length - 6];
        System.arraycopy(data, 0, ret, 0, data.length - 6);

        return new HrpAndData(hrp, ret);
    }

    private static boolean verifyChecksum(byte[] hrp, byte[] data) {
        byte[] exp = hrpExpand(hrp);

        byte[] values = new byte[exp.length + data.length];
        System.arraycopy(exp, 0, values, 0, exp.length);
        System.arraycopy(data, 0, values, exp.length, data.length);

        return (1 == polymod(values));
    }

    private static byte[] createChecksum(byte[] hrp, byte[] data) {
        byte[] zeroes = new byte[]{0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] expanded = hrpExpand(hrp);
        byte[] values = new byte[zeroes.length + expanded.length + data.length];

        System.arraycopy(expanded, 0, values, 0, expanded.length);
        System.arraycopy(data, 0, values, expanded.length, data.length);
        System.arraycopy(zeroes, 0, values, expanded.length + data.length, zeroes.length);

        int polymod = polymod(values) ^ 1;
        byte[] ret = new byte[6];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (byte) ((polymod >> 5 * (5 - i)) & 0x1f);
        }

        return ret;
    }

    private static int polymod(byte[] values) {
        final int[] GENERATORS = {0x3b6a57b2, 0x26508e6d, 0x1ea119fa, 0x3d4233dd, 0x2a1462b3};

        int chk = 1;

        for (byte b : values) {
            byte top = (byte) (chk >> 0x19);
            chk = b ^ ((chk & 0x1ffffff) << 5);
            for (int i = 0; i < 5; i++) {
                chk ^= ((top >> i) & 1) == 1 ? GENERATORS[i] : 0;
            }
        }

        return chk;
    }

    private static byte[] hrpExpand(byte[] hrp) {
        byte[] buf1 = new byte[hrp.length];
        byte[] buf2 = new byte[hrp.length];
        byte[] mid = new byte[1];

        for (int i = 0; i < hrp.length; i++) {
            buf1[i] = (byte) (hrp[i] >> 5);
        }
        mid[0] = 0x00;
        for (int i = 0; i < hrp.length; i++) {
            buf2[i] = (byte) (hrp[i] & 0x1f);
        }

        byte[] ret = new byte[(hrp.length * 2) + 1];
        System.arraycopy(buf1, 0, ret, 0, buf1.length);
        System.arraycopy(mid, 0, ret, buf1.length, mid.length);
        System.arraycopy(buf2, 0, ret, buf1.length + mid.length, buf2.length);

        return ret;
    }


    public static class HrpAndData {

        public byte[] hrp;
        public byte[] data;

        public HrpAndData(byte[] hrp, byte[] data) {
            this.hrp = hrp;
            this.data = data;
        }

        public byte[] getHrp() {
            return this.hrp;
        }

        public byte[] getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "HrpAndData [hrp=" + Arrays.toString(hrp) + ", data=" + Arrays.toString(data) + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Arrays.hashCode(data);
            result = prime * result + Arrays.hashCode(hrp);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            HrpAndData other = (HrpAndData) obj;
            if (!Arrays.equals(data, other.data))
                return false;
            if (!Arrays.equals(hrp, other.hrp))
                return false;
            return true;
        }
    }
}
