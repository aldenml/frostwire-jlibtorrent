/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class invalid_request_alert extends peer_alert {
  private transient long swigCPtr;

  protected invalid_request_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.invalid_request_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(invalid_request_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_invalid_request_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.invalid_request_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.invalid_request_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.invalid_request_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.invalid_request_alert_message(swigCPtr, this);
  }

  public peer_request getRequest() {
    long cPtr = libtorrent_jni.invalid_request_alert_request_get(swigCPtr, this);
    return (cPtr == 0) ? null : new peer_request(cPtr, false);
  }

  public boolean getWe_have() {
    return libtorrent_jni.invalid_request_alert_we_have_get(swigCPtr, this);
  }

  public boolean getPeer_interested() {
    return libtorrent_jni.invalid_request_alert_peer_interested_get(swigCPtr, this);
  }

  public boolean getWithheld() {
    return libtorrent_jni.invalid_request_alert_withheld_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.invalid_request_alert_priority_get();
  public final static int alert_type = libtorrent_jni.invalid_request_alert_alert_type_get();
}
