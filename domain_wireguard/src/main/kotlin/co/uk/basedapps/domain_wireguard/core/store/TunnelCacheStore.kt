package co.uk.basedapps.domain_wireguard.core.store

import co.uk.basedapps.domain.functional.SortedKeyedArrayList
import co.uk.basedapps.domain_wireguard.core.model.TunnelWrapper

interface TunnelCacheStore {
  /**
   * Adds a new tunnel to cached tunnel list.
   */
  fun add(tunnel: TunnelWrapper)

  /**
   * Populates tunnel list, clearing previous cached list.
   */
  fun populate(tunnelList: List<TunnelWrapper>)

  /**
   * Removes the tunnel from the cached list.
   */
  fun delete(tunnel: TunnelWrapper)

  /**
   * Returns cached tunnel list.
   */
  fun getTunnelList(): SortedKeyedArrayList<String, TunnelWrapper>

  /**
   * Update or replace last used tunnel
   */
  fun updateLastUsedTunnel(tunnel: TunnelWrapper?)

  /**
   * Get last used tunnel if exists.
   */
  fun getLastUsedTunnel(): TunnelWrapper?
}
