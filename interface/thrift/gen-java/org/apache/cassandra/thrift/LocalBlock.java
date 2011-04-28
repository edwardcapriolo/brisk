/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.thrift;

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

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class LocalBlock implements TBase<LocalBlock, LocalBlock._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LocalBlock");

  private static final TField FILE_FIELD_DESC = new TField("file", TType.STRING, (short)1);
  private static final TField OFFSET_FIELD_DESC = new TField("offset", TType.I64, (short)2);
  private static final TField LENGTH_FIELD_DESC = new TField("length", TType.I64, (short)3);

  public String file;
  public long offset;
  public long length;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    FILE((short)1, "file"),
    OFFSET((short)2, "offset"),
    LENGTH((short)3, "length");

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
        case 1: // FILE
          return FILE;
        case 2: // OFFSET
          return OFFSET;
        case 3: // LENGTH
          return LENGTH;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private static final int __LENGTH_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE, new FieldMetaData("file", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.OFFSET, new FieldMetaData("offset", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.LENGTH, new FieldMetaData("length", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(LocalBlock.class, metaDataMap);
  }

  public LocalBlock() {
  }

  public LocalBlock(
    String file,
    long offset,
    long length)
  {
    this();
    this.file = file;
    this.offset = offset;
    setOffsetIsSet(true);
    this.length = length;
    setLengthIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LocalBlock(LocalBlock other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetFile()) {
      this.file = other.file;
    }
    this.offset = other.offset;
    this.length = other.length;
  }

  public LocalBlock deepCopy() {
    return new LocalBlock(this);
  }

  @Override
  public void clear() {
    this.file = null;
    setOffsetIsSet(false);
    this.offset = 0;
    setLengthIsSet(false);
    this.length = 0;
  }

  public String getFile() {
    return this.file;
  }

  public LocalBlock setFile(String file) {
    this.file = file;
    return this;
  }

  public void unsetFile() {
    this.file = null;
  }

  /** Returns true if field file is set (has been asigned a value) and false otherwise */
  public boolean isSetFile() {
    return this.file != null;
  }

  public void setFileIsSet(boolean value) {
    if (!value) {
      this.file = null;
    }
  }

  public long getOffset() {
    return this.offset;
  }

  public LocalBlock setOffset(long offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bit_vector.clear(__OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been asigned a value) and false otherwise */
  public boolean isSetOffset() {
    return __isset_bit_vector.get(__OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bit_vector.set(__OFFSET_ISSET_ID, value);
  }

  public long getLength() {
    return this.length;
  }

  public LocalBlock setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bit_vector.clear(__LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been asigned a value) and false otherwise */
  public boolean isSetLength() {
    return __isset_bit_vector.get(__LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bit_vector.set(__LENGTH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE:
      if (value == null) {
        unsetFile();
      } else {
        setFile((String)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((Long)value);
      }
      break;

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE:
      return getFile();

    case OFFSET:
      return new Long(getOffset());

    case LENGTH:
      return new Long(getLength());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE:
      return isSetFile();
    case OFFSET:
      return isSetOffset();
    case LENGTH:
      return isSetLength();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LocalBlock)
      return this.equals((LocalBlock)that);
    return false;
  }

  public boolean equals(LocalBlock that) {
    if (that == null)
      return false;

    boolean this_present_file = true && this.isSetFile();
    boolean that_present_file = true && that.isSetFile();
    if (this_present_file || that_present_file) {
      if (!(this_present_file && that_present_file))
        return false;
      if (!this.file.equals(that.file))
        return false;
    }

    boolean this_present_offset = true;
    boolean that_present_offset = true;
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_file = true && (isSetFile());
    builder.append(present_file);
    if (present_file)
      builder.append(file);

    boolean present_offset = true;
    builder.append(present_offset);
    if (present_offset)
      builder.append(offset);

    boolean present_length = true;
    builder.append(present_length);
    if (present_length)
      builder.append(length);

    return builder.toHashCode();
  }

  public int compareTo(LocalBlock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LocalBlock typedOther = (LocalBlock)other;

    lastComparison = Boolean.valueOf(isSetFile()).compareTo(typedOther.isSetFile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile()) {
      lastComparison = TBaseHelper.compareTo(this.file, typedOther.file);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOffset()).compareTo(typedOther.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = TBaseHelper.compareTo(this.offset, typedOther.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLength()).compareTo(typedOther.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = TBaseHelper.compareTo(this.length, typedOther.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FILE
          if (field.type == TType.STRING) {
            this.file = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // OFFSET
          if (field.type == TType.I64) {
            this.offset = iprot.readI64();
            setOffsetIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LENGTH
          if (field.type == TType.I64) {
            this.length = iprot.readI64();
            setLengthIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetOffset()) {
      throw new TProtocolException("Required field 'offset' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetLength()) {
      throw new TProtocolException("Required field 'length' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.file != null) {
      oprot.writeFieldBegin(FILE_FIELD_DESC);
      oprot.writeString(this.file);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(OFFSET_FIELD_DESC);
    oprot.writeI64(this.offset);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LENGTH_FIELD_DESC);
    oprot.writeI64(this.length);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LocalBlock(");
    boolean first = true;

    sb.append("file:");
    if (this.file == null) {
      sb.append("null");
    } else {
      sb.append(this.file);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("offset:");
    sb.append(this.offset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("length:");
    sb.append(this.length);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (file == null) {
      throw new TProtocolException("Required field 'file' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'offset' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'length' because it's a primitive and you chose the non-beans generator.
  }

}
