/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description of a job queue
 */
public class ThriftJobQueueInfo implements org.apache.thrift.TBase<ThriftJobQueueInfo, ThriftJobQueueInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftJobQueueInfo");

  private static final org.apache.thrift.protocol.TField QUEUE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("queueName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SCHEDULING_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("schedulingInfo", org.apache.thrift.protocol.TType.STRING, (short)2);

  public String queueName;
  public String schedulingInfo;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUEUE_NAME((short)1, "queueName"),
    SCHEDULING_INFO((short)2, "schedulingInfo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // SCHEDULING_INFO
          return SCHEDULING_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new org.apache.thrift.meta_data.FieldMetaData("queueName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHEDULING_INFO, new org.apache.thrift.meta_data.FieldMetaData("schedulingInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftJobQueueInfo.class, metaDataMap);
  }

  public ThriftJobQueueInfo() {
  }

  public ThriftJobQueueInfo(
    String queueName,
    String schedulingInfo)
  {
    this();
    this.queueName = queueName;
    this.schedulingInfo = schedulingInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftJobQueueInfo(ThriftJobQueueInfo other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetSchedulingInfo()) {
      this.schedulingInfo = other.schedulingInfo;
    }
  }

  public ThriftJobQueueInfo deepCopy() {
    return new ThriftJobQueueInfo(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.schedulingInfo = null;
  }

  public String getQueueName() {
    return this.queueName;
  }

  public ThriftJobQueueInfo setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public String getSchedulingInfo() {
    return this.schedulingInfo;
  }

  public ThriftJobQueueInfo setSchedulingInfo(String schedulingInfo) {
    this.schedulingInfo = schedulingInfo;
    return this;
  }

  public void unsetSchedulingInfo() {
    this.schedulingInfo = null;
  }

  /** Returns true if field schedulingInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetSchedulingInfo() {
    return this.schedulingInfo != null;
  }

  public void setSchedulingInfoIsSet(boolean value) {
    if (!value) {
      this.schedulingInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case SCHEDULING_INFO:
      if (value == null) {
        unsetSchedulingInfo();
      } else {
        setSchedulingInfo((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case SCHEDULING_INFO:
      return getSchedulingInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case SCHEDULING_INFO:
      return isSetSchedulingInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftJobQueueInfo)
      return this.equals((ThriftJobQueueInfo)that);
    return false;
  }

  public boolean equals(ThriftJobQueueInfo that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_schedulingInfo = true && this.isSetSchedulingInfo();
    boolean that_present_schedulingInfo = true && that.isSetSchedulingInfo();
    if (this_present_schedulingInfo || that_present_schedulingInfo) {
      if (!(this_present_schedulingInfo && that_present_schedulingInfo))
        return false;
      if (!this.schedulingInfo.equals(that.schedulingInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_queueName = true && (isSetQueueName());
    builder.append(present_queueName);
    if (present_queueName)
      builder.append(queueName);

    boolean present_schedulingInfo = true && (isSetSchedulingInfo());
    builder.append(present_schedulingInfo);
    if (present_schedulingInfo)
      builder.append(schedulingInfo);

    return builder.toHashCode();
  }

  public int compareTo(ThriftJobQueueInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftJobQueueInfo typedOther = (ThriftJobQueueInfo)other;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(typedOther.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queueName, typedOther.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSchedulingInfo()).compareTo(typedOther.isSetSchedulingInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchedulingInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schedulingInfo, typedOther.schedulingInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // QUEUE_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.queueName = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SCHEDULING_INFO
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.schedulingInfo = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.queueName != null) {
      oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
      oprot.writeString(this.queueName);
      oprot.writeFieldEnd();
    }
    if (this.schedulingInfo != null) {
      oprot.writeFieldBegin(SCHEDULING_INFO_FIELD_DESC);
      oprot.writeString(this.schedulingInfo);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftJobQueueInfo(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("schedulingInfo:");
    if (this.schedulingInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.schedulingInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

