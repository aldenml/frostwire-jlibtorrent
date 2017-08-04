/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class block_downloading_alert extends peer_alert {
  private transient long swigCPtr;

  protected block_downloading_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.block_downloading_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(block_downloading_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_block_downloading_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.block_downloading_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.block_downloading_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.block_downloading_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.block_downloading_alert_message(swigCPtr, this);
  }

  public int getBlock_index() {
    return libtorrent_jni.block_downloading_alert_block_index_get(swigCPtr, this);
  }

  public int getPiece_index() {
    return libtorrent_jni.block_downloading_alert_piece_index_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.block_downloading_alert_priority_get();
  public final static int alert_type = libtorrent_jni.block_downloading_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.block_downloading_alert_static_category_get(), false);
}
