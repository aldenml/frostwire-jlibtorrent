/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class save_resume_data_alert extends torrent_alert {
  private transient long swigCPtr;

  protected save_resume_data_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.save_resume_data_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(save_resume_data_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_save_resume_data_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.save_resume_data_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.save_resume_data_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.save_resume_data_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.save_resume_data_alert_message(swigCPtr, this);
  }

  public void setParams(add_torrent_params value) {
    libtorrent_jni.save_resume_data_alert_params_set(swigCPtr, this, add_torrent_params.getCPtr(value), value);
  }

  public add_torrent_params getParams() {
    long cPtr = libtorrent_jni.save_resume_data_alert_params_get(swigCPtr, this);
    return (cPtr == 0) ? null : new add_torrent_params(cPtr, false);
  }

  public final static int priority = libtorrent_jni.save_resume_data_alert_priority_get();
  public final static int alert_type = libtorrent_jni.save_resume_data_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.save_resume_data_alert_static_category_get(), false);
}
