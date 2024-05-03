// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/deposit/v1/deposit.proto

package sentinel.deposit.v1;

public final class DepositOuterClass {
  private DepositOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DepositOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.deposit.v1.Deposit)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> 
        getCoinsList();
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.Coin getCoins(int index);
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    int getCoinsCount();
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    java.util.List<? extends cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
        getCoinsOrBuilderList();
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getCoinsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code sentinel.deposit.v1.Deposit}
   */
  public static final class Deposit extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.deposit.v1.Deposit)
      DepositOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Deposit.newBuilder() to construct.
    private Deposit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Deposit() {
      address_ = "";
      coins_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Deposit();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sentinel.deposit.v1.DepositOuterClass.internal_static_sentinel_deposit_v1_Deposit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.deposit.v1.DepositOuterClass.internal_static_sentinel_deposit_v1_Deposit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.deposit.v1.DepositOuterClass.Deposit.class, sentinel.deposit.v1.DepositOuterClass.Deposit.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object address_ = "";
    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COINS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> coins_;
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @java.lang.Override
    public java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> getCoinsList() {
      return coins_;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @java.lang.Override
    public java.util.List<? extends cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
        getCoinsOrBuilderList() {
      return coins_;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @java.lang.Override
    public int getCoinsCount() {
      return coins_.size();
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.Coin getCoins(int index) {
      return coins_.get(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getCoinsOrBuilder(
        int index) {
      return coins_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      for (int i = 0; i < coins_.size(); i++) {
        output.writeMessage(2, coins_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
      }
      for (int i = 0; i < coins_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, coins_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof sentinel.deposit.v1.DepositOuterClass.Deposit)) {
        return super.equals(obj);
      }
      sentinel.deposit.v1.DepositOuterClass.Deposit other = (sentinel.deposit.v1.DepositOuterClass.Deposit) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!getCoinsList()
          .equals(other.getCoinsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      if (getCoinsCount() > 0) {
        hash = (37 * hash) + COINS_FIELD_NUMBER;
        hash = (53 * hash) + getCoinsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.deposit.v1.DepositOuterClass.Deposit parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(sentinel.deposit.v1.DepositOuterClass.Deposit prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code sentinel.deposit.v1.Deposit}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.deposit.v1.Deposit)
        sentinel.deposit.v1.DepositOuterClass.DepositOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.deposit.v1.DepositOuterClass.internal_static_sentinel_deposit_v1_Deposit_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.deposit.v1.DepositOuterClass.internal_static_sentinel_deposit_v1_Deposit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.deposit.v1.DepositOuterClass.Deposit.class, sentinel.deposit.v1.DepositOuterClass.Deposit.Builder.class);
      }

      // Construct using sentinel.deposit.v1.DepositOuterClass.Deposit.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        address_ = "";
        if (coinsBuilder_ == null) {
          coins_ = java.util.Collections.emptyList();
        } else {
          coins_ = null;
          coinsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.deposit.v1.DepositOuterClass.internal_static_sentinel_deposit_v1_Deposit_descriptor;
      }

      @java.lang.Override
      public sentinel.deposit.v1.DepositOuterClass.Deposit getDefaultInstanceForType() {
        return sentinel.deposit.v1.DepositOuterClass.Deposit.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.deposit.v1.DepositOuterClass.Deposit build() {
        sentinel.deposit.v1.DepositOuterClass.Deposit result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.deposit.v1.DepositOuterClass.Deposit buildPartial() {
        sentinel.deposit.v1.DepositOuterClass.Deposit result = new sentinel.deposit.v1.DepositOuterClass.Deposit(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(sentinel.deposit.v1.DepositOuterClass.Deposit result) {
        if (coinsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            coins_ = java.util.Collections.unmodifiableList(coins_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.coins_ = coins_;
        } else {
          result.coins_ = coinsBuilder_.build();
        }
      }

      private void buildPartial0(sentinel.deposit.v1.DepositOuterClass.Deposit result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof sentinel.deposit.v1.DepositOuterClass.Deposit) {
          return mergeFrom((sentinel.deposit.v1.DepositOuterClass.Deposit)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.deposit.v1.DepositOuterClass.Deposit other) {
        if (other == sentinel.deposit.v1.DepositOuterClass.Deposit.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (coinsBuilder_ == null) {
          if (!other.coins_.isEmpty()) {
            if (coins_.isEmpty()) {
              coins_ = other.coins_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureCoinsIsMutable();
              coins_.addAll(other.coins_);
            }
            onChanged();
          }
        } else {
          if (!other.coins_.isEmpty()) {
            if (coinsBuilder_.isEmpty()) {
              coinsBuilder_.dispose();
              coinsBuilder_ = null;
              coins_ = other.coins_;
              bitField0_ = (bitField0_ & ~0x00000002);
              coinsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCoinsFieldBuilder() : null;
            } else {
              coinsBuilder_.addAllMessages(other.coins_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                address_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                cosmos.base.v1beta1.CoinOuterClass.Coin m =
                    input.readMessage(
                        cosmos.base.v1beta1.CoinOuterClass.Coin.parser(),
                        extensionRegistry);
                if (coinsBuilder_ == null) {
                  ensureCoinsIsMutable();
                  coins_.add(m);
                } else {
                  coinsBuilder_.addMessage(m);
                }
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object address_ = "";
      /**
       * <code>string address = 1;</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string address = 1;</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string address = 1;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        address_ = getDefaultInstance().getAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1;</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> coins_ =
        java.util.Collections.emptyList();
      private void ensureCoinsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          coins_ = new java.util.ArrayList<cosmos.base.v1beta1.CoinOuterClass.Coin>(coins_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> coinsBuilder_;

      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> getCoinsList() {
        if (coinsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(coins_);
        } else {
          return coinsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public int getCoinsCount() {
        if (coinsBuilder_ == null) {
          return coins_.size();
        } else {
          return coinsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin getCoins(int index) {
        if (coinsBuilder_ == null) {
          return coins_.get(index);
        } else {
          return coinsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder setCoins(
          int index, cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (coinsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCoinsIsMutable();
          coins_.set(index, value);
          onChanged();
        } else {
          coinsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder setCoins(
          int index, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (coinsBuilder_ == null) {
          ensureCoinsIsMutable();
          coins_.set(index, builderForValue.build());
          onChanged();
        } else {
          coinsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder addCoins(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (coinsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCoinsIsMutable();
          coins_.add(value);
          onChanged();
        } else {
          coinsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder addCoins(
          int index, cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (coinsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCoinsIsMutable();
          coins_.add(index, value);
          onChanged();
        } else {
          coinsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder addCoins(
          cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (coinsBuilder_ == null) {
          ensureCoinsIsMutable();
          coins_.add(builderForValue.build());
          onChanged();
        } else {
          coinsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder addCoins(
          int index, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (coinsBuilder_ == null) {
          ensureCoinsIsMutable();
          coins_.add(index, builderForValue.build());
          onChanged();
        } else {
          coinsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder addAllCoins(
          java.lang.Iterable<? extends cosmos.base.v1beta1.CoinOuterClass.Coin> values) {
        if (coinsBuilder_ == null) {
          ensureCoinsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, coins_);
          onChanged();
        } else {
          coinsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder clearCoins() {
        if (coinsBuilder_ == null) {
          coins_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          coinsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public Builder removeCoins(int index) {
        if (coinsBuilder_ == null) {
          ensureCoinsIsMutable();
          coins_.remove(index);
          onChanged();
        } else {
          coinsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getCoinsBuilder(
          int index) {
        return getCoinsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getCoinsOrBuilder(
          int index) {
        if (coinsBuilder_ == null) {
          return coins_.get(index);  } else {
          return coinsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public java.util.List<? extends cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
           getCoinsOrBuilderList() {
        if (coinsBuilder_ != null) {
          return coinsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(coins_);
        }
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder addCoinsBuilder() {
        return getCoinsFieldBuilder().addBuilder(
            cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance());
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder addCoinsBuilder(
          int index) {
        return getCoinsFieldBuilder().addBuilder(
            index, cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance());
      }
      /**
       * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
       */
      public java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin.Builder> 
           getCoinsBuilderList() {
        return getCoinsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
          getCoinsFieldBuilder() {
        if (coinsBuilder_ == null) {
          coinsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                  coins_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          coins_ = null;
        }
        return coinsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:sentinel.deposit.v1.Deposit)
    }

    // @@protoc_insertion_point(class_scope:sentinel.deposit.v1.Deposit)
    private static final sentinel.deposit.v1.DepositOuterClass.Deposit DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.deposit.v1.DepositOuterClass.Deposit();
    }

    public static sentinel.deposit.v1.DepositOuterClass.Deposit getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Deposit>
        PARSER = new com.google.protobuf.AbstractParser<Deposit>() {
      @java.lang.Override
      public Deposit parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Deposit> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Deposit> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sentinel.deposit.v1.DepositOuterClass.Deposit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_deposit_v1_Deposit_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_deposit_v1_Deposit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!sentinel/deposit/v1/deposit.proto\022\023sen" +
      "tinel.deposit.v1\032\024gogoproto/gogo.proto\032\036" +
      "cosmos/base/v1beta1/coin.proto\"v\n\007Deposi" +
      "t\022\017\n\007address\030\001 \001(\t\022Z\n\005coins\030\002 \003(\0132\031.cosm" +
      "os.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com" +
      "/cosmos/cosmos-sdk/types.CoinsB:Z0github" +
      ".com/sentinel-official/hub/x/deposit/typ" +
      "es\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_sentinel_deposit_v1_Deposit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_deposit_v1_Deposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_deposit_v1_Deposit_descriptor,
        new java.lang.String[] { "Address", "Coins", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
