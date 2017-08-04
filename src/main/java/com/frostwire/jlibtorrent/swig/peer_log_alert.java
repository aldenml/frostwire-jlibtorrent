/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_log_alert extends peer_alert {
  private transient long swigCPtr;

  protected peer_log_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_log_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_log_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_log_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.peer_log_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.peer_log_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.peer_log_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.peer_log_alert_message(swigCPtr, this);
  }

  public void setDirection(peer_log_alert.direction_t value) {
    libtorrent_jni.peer_log_alert_direction_set(swigCPtr, this, value.swigValue());
  }

  public peer_log_alert.direction_t getDirection() {
    return peer_log_alert.direction_t.swigToEnum(libtorrent_jni.peer_log_alert_direction_get(swigCPtr, this));
  }

  public String log_message() {
    return libtorrent_jni.peer_log_alert_log_message(swigCPtr, this);
  }

  public String get_event_type() {
    return libtorrent_jni.peer_log_alert_get_event_type(swigCPtr, this);
  }

  public final static class direction_t {
    public final static peer_log_alert.direction_t incoming_message = new peer_log_alert.direction_t("incoming_message");
    public final static peer_log_alert.direction_t outgoing_message = new peer_log_alert.direction_t("outgoing_message");
    public final static peer_log_alert.direction_t incoming = new peer_log_alert.direction_t("incoming");
    public final static peer_log_alert.direction_t outgoing = new peer_log_alert.direction_t("outgoing");
    public final static peer_log_alert.direction_t info = new peer_log_alert.direction_t("info");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static direction_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + direction_t.class + " with value " + swigValue);
    }

    private direction_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private direction_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private direction_t(String swigName, direction_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static direction_t[] swigValues = { incoming_message, outgoing_message, incoming, outgoing, info };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int priority = libtorrent_jni.peer_log_alert_priority_get();
  public final static int alert_type = libtorrent_jni.peer_log_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.peer_log_alert_static_category_get(), false);
}
