/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class announce_entry {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected announce_entry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(announce_entry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_announce_entry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public announce_entry() {
    this(libtorrent_jni.new_announce_entry__SWIG_0(), true);
  }

  public announce_entry(announce_entry arg0) {
    this(libtorrent_jni.new_announce_entry__SWIG_1(announce_entry.getCPtr(arg0), arg0), true);
  }

  public void setUrl(String value) {
    libtorrent_jni.announce_entry_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.announce_entry_url_get(swigCPtr, this);
  }

  public void setTrackerid(String value) {
    libtorrent_jni.announce_entry_trackerid_set(swigCPtr, this, value);
  }

  public String getTrackerid() {
    return libtorrent_jni.announce_entry_trackerid_get(swigCPtr, this);
  }

  public void setTier(byte value) {
    libtorrent_jni.announce_entry_tier_set(swigCPtr, this, value);
  }

  public byte getTier() {
    return libtorrent_jni.announce_entry_tier_get(swigCPtr, this);
  }

  public void setFail_limit(byte value) {
    libtorrent_jni.announce_entry_fail_limit_set(swigCPtr, this, value);
  }

  public byte getFail_limit() {
    return libtorrent_jni.announce_entry_fail_limit_get(swigCPtr, this);
  }

  public void reset() {
    libtorrent_jni.announce_entry_reset(swigCPtr, this);
  }

  public void trim() {
    libtorrent_jni.announce_entry_trim(swigCPtr, this);
  }

  public announce_entry(String u) {
    this(libtorrent_jni.new_announce_entry__SWIG_2(u), true);
  }

}
