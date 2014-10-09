/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package it.polimi.hegira.models;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class Column implements org.apache.thrift.TBase<Column, Column._Fields>, java.io.Serializable, Cloneable, Comparable<Column> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Column");

  private static final org.apache.thrift.protocol.TField COLUMN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("columnName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("columnValue", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMN_VALUE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("columnValueType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField INDEXABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("indexable", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ColumnStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ColumnTupleSchemeFactory());
  }

  public String columnName; // required
  public ByteBuffer columnValue; // required
  public String columnValueType; // required
  public String timestamp; // optional
  public boolean indexable; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_NAME((short)1, "columnName"),
    COLUMN_VALUE((short)2, "columnValue"),
    COLUMN_VALUE_TYPE((short)3, "columnValueType"),
    TIMESTAMP((short)4, "timestamp"),
    INDEXABLE((short)5, "indexable");

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
        case 1: // COLUMN_NAME
          return COLUMN_NAME;
        case 2: // COLUMN_VALUE
          return COLUMN_VALUE;
        case 3: // COLUMN_VALUE_TYPE
          return COLUMN_VALUE_TYPE;
        case 4: // TIMESTAMP
          return TIMESTAMP;
        case 5: // INDEXABLE
          return INDEXABLE;
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
  private static final int __INDEXABLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.TIMESTAMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_NAME, new org.apache.thrift.meta_data.FieldMetaData("columnName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMN_VALUE, new org.apache.thrift.meta_data.FieldMetaData("columnValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_VALUE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("columnValueType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEXABLE, new org.apache.thrift.meta_data.FieldMetaData("indexable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Column.class, metaDataMap);
  }

  public Column() {
  }

  public Column(
    String columnName,
    ByteBuffer columnValue,
    String columnValueType,
    boolean indexable)
  {
    this();
    this.columnName = columnName;
    this.columnValue = columnValue;
    this.columnValueType = columnValueType;
    this.indexable = indexable;
    setIndexableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Column(Column other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColumnName()) {
      this.columnName = other.columnName;
    }
    if (other.isSetColumnValue()) {
      this.columnValue = org.apache.thrift.TBaseHelper.copyBinary(other.columnValue);
;
    }
    if (other.isSetColumnValueType()) {
      this.columnValueType = other.columnValueType;
    }
    if (other.isSetTimestamp()) {
      this.timestamp = other.timestamp;
    }
    this.indexable = other.indexable;
  }

  public Column deepCopy() {
    return new Column(this);
  }

  @Override
  public void clear() {
    this.columnName = null;
    this.columnValue = null;
    this.columnValueType = null;
    this.timestamp = null;
    setIndexableIsSet(false);
    this.indexable = false;
  }

  public String getColumnName() {
    return this.columnName;
  }

  public Column setColumnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  public void unsetColumnName() {
    this.columnName = null;
  }

  /** Returns true if field columnName is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnName() {
    return this.columnName != null;
  }

  public void setColumnNameIsSet(boolean value) {
    if (!value) {
      this.columnName = null;
    }
  }

  public byte[] getColumnValue() {
    setColumnValue(org.apache.thrift.TBaseHelper.rightSize(columnValue));
    return columnValue == null ? null : columnValue.array();
  }

  public ByteBuffer bufferForColumnValue() {
    return columnValue;
  }

  public Column setColumnValue(byte[] columnValue) {
    setColumnValue(columnValue == null ? (ByteBuffer)null : ByteBuffer.wrap(columnValue));
    return this;
  }

  public Column setColumnValue(ByteBuffer columnValue) {
    this.columnValue = columnValue;
    return this;
  }

  public void unsetColumnValue() {
    this.columnValue = null;
  }

  /** Returns true if field columnValue is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnValue() {
    return this.columnValue != null;
  }

  public void setColumnValueIsSet(boolean value) {
    if (!value) {
      this.columnValue = null;
    }
  }

  public String getColumnValueType() {
    return this.columnValueType;
  }

  public Column setColumnValueType(String columnValueType) {
    switch(columnValueType){
		case "BINARY":
			this.columnValueType = "byte[]";
			break;
		case "BOOLEAN":
			this.columnValueType = "Boolean";
			break;
		case "DATETIME":
			this.columnValueType = "Date";
			break;
		case "DOUBLE":
			this.columnValueType = "Double";
			break;
		case "GUID":
			this.columnValueType = "UUID";
			break;
		case "INT32":
			this.columnValueType = "Integer";
			break;
		case "INT64":
			this.columnValueType = "Long";
			break;
		case "STRING":
			this.columnValueType = "String";
			break;
		case "Text":
			/*
			 * GAE Datastore uses Text data-type to store
			 * Strings composed of more than 500 characters.
			 * Other databases don't have this limitation and 
			 * simply use Strings.
			 * So Text data-type is converted into String.
			 * The DatastoreTransformer checks if a String is 
			 * longer than 500 characters and adjusts the data-type
			 * accordingly. 
			 * TODO: find a common list of supportable datatypes and 
			 * map data to them.
			 */
			this.columnValueType = "String";
			break;
		default:
			this.columnValueType = columnValueType;
    }
    return this;
  }

  public void unsetColumnValueType() {
    this.columnValueType = null;
  }

  /** Returns true if field columnValueType is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnValueType() {
    return this.columnValueType != null;
  }

  public void setColumnValueTypeIsSet(boolean value) {
    if (!value) {
      this.columnValueType = null;
    }
  }

  public String getTimestamp() {
    return this.timestamp;
  }

  public Column setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public void unsetTimestamp() {
    this.timestamp = null;
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return this.timestamp != null;
  }

  public void setTimestampIsSet(boolean value) {
    if (!value) {
      this.timestamp = null;
    }
  }

  public boolean isIndexable() {
    return this.indexable;
  }

  public Column setIndexable(boolean indexable) {
    this.indexable = indexable;
    setIndexableIsSet(true);
    return this;
  }

  public void unsetIndexable() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEXABLE_ISSET_ID);
  }

  /** Returns true if field indexable is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexable() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEXABLE_ISSET_ID);
  }

  public void setIndexableIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEXABLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLUMN_NAME:
      if (value == null) {
        unsetColumnName();
      } else {
        setColumnName((String)value);
      }
      break;

    case COLUMN_VALUE:
      if (value == null) {
        unsetColumnValue();
      } else {
        setColumnValue((ByteBuffer)value);
      }
      break;

    case COLUMN_VALUE_TYPE:
      if (value == null) {
        unsetColumnValueType();
      } else {
        setColumnValueType((String)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((String)value);
      }
      break;

    case INDEXABLE:
      if (value == null) {
        unsetIndexable();
      } else {
        setIndexable((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_NAME:
      return getColumnName();

    case COLUMN_VALUE:
      return getColumnValue();

    case COLUMN_VALUE_TYPE:
      return getColumnValueType();

    case TIMESTAMP:
      return getTimestamp();

    case INDEXABLE:
      return Boolean.valueOf(isIndexable());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COLUMN_NAME:
      return isSetColumnName();
    case COLUMN_VALUE:
      return isSetColumnValue();
    case COLUMN_VALUE_TYPE:
      return isSetColumnValueType();
    case TIMESTAMP:
      return isSetTimestamp();
    case INDEXABLE:
      return isSetIndexable();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Column)
      return this.equals((Column)that);
    return false;
  }

  public boolean equals(Column that) {
    if (that == null)
      return false;

    boolean this_present_columnName = true && this.isSetColumnName();
    boolean that_present_columnName = true && that.isSetColumnName();
    if (this_present_columnName || that_present_columnName) {
      if (!(this_present_columnName && that_present_columnName))
        return false;
      if (!this.columnName.equals(that.columnName))
        return false;
    }

    boolean this_present_columnValue = true && this.isSetColumnValue();
    boolean that_present_columnValue = true && that.isSetColumnValue();
    if (this_present_columnValue || that_present_columnValue) {
      if (!(this_present_columnValue && that_present_columnValue))
        return false;
      if (!this.columnValue.equals(that.columnValue))
        return false;
    }

    boolean this_present_columnValueType = true && this.isSetColumnValueType();
    boolean that_present_columnValueType = true && that.isSetColumnValueType();
    if (this_present_columnValueType || that_present_columnValueType) {
      if (!(this_present_columnValueType && that_present_columnValueType))
        return false;
      if (!this.columnValueType.equals(that.columnValueType))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (!this.timestamp.equals(that.timestamp))
        return false;
    }

    boolean this_present_indexable = true;
    boolean that_present_indexable = true;
    if (this_present_indexable || that_present_indexable) {
      if (!(this_present_indexable && that_present_indexable))
        return false;
      if (this.indexable != that.indexable)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Column other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColumnName()).compareTo(other.isSetColumnName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnName, other.columnName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnValue()).compareTo(other.isSetColumnValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnValue, other.columnValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnValueType()).compareTo(other.isSetColumnValueType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnValueType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnValueType, other.columnValueType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndexable()).compareTo(other.isSetIndexable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexable, other.indexable);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Column(");
    boolean first = true;

    sb.append("columnName:");
    if (this.columnName == null) {
      sb.append("null");
    } else {
      sb.append(this.columnName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnValue:");
    if (this.columnValue == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.columnValue, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnValueType:");
    if (this.columnValueType == null) {
      sb.append("null");
    } else {
      sb.append(this.columnValueType);
    }
    first = false;
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      if (this.timestamp == null) {
        sb.append("null");
      } else {
        sb.append(this.timestamp);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("indexable:");
    sb.append(this.indexable);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ColumnStandardSchemeFactory implements SchemeFactory {
    public ColumnStandardScheme getScheme() {
      return new ColumnStandardScheme();
    }
  }

  private static class ColumnStandardScheme extends StandardScheme<Column> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Column struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnName = iprot.readString();
              struct.setColumnNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnValue = iprot.readBinary();
              struct.setColumnValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLUMN_VALUE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnValueType = iprot.readString();
              struct.setColumnValueTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timestamp = iprot.readString();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INDEXABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.indexable = iprot.readBool();
              struct.setIndexableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Column struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columnName != null) {
        oprot.writeFieldBegin(COLUMN_NAME_FIELD_DESC);
        oprot.writeString(struct.columnName);
        oprot.writeFieldEnd();
      }
      if (struct.columnValue != null) {
        oprot.writeFieldBegin(COLUMN_VALUE_FIELD_DESC);
        oprot.writeBinary(struct.columnValue);
        oprot.writeFieldEnd();
      }
      if (struct.columnValueType != null) {
        oprot.writeFieldBegin(COLUMN_VALUE_TYPE_FIELD_DESC);
        oprot.writeString(struct.columnValueType);
        oprot.writeFieldEnd();
      }
      if (struct.timestamp != null) {
        if (struct.isSetTimestamp()) {
          oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
          oprot.writeString(struct.timestamp);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(INDEXABLE_FIELD_DESC);
      oprot.writeBool(struct.indexable);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColumnTupleSchemeFactory implements SchemeFactory {
    public ColumnTupleScheme getScheme() {
      return new ColumnTupleScheme();
    }
  }

  private static class ColumnTupleScheme extends TupleScheme<Column> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Column struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetColumnName()) {
        optionals.set(0);
      }
      if (struct.isSetColumnValue()) {
        optionals.set(1);
      }
      if (struct.isSetColumnValueType()) {
        optionals.set(2);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(3);
      }
      if (struct.isSetIndexable()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetColumnName()) {
        oprot.writeString(struct.columnName);
      }
      if (struct.isSetColumnValue()) {
        oprot.writeBinary(struct.columnValue);
      }
      if (struct.isSetColumnValueType()) {
        oprot.writeString(struct.columnValueType);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeString(struct.timestamp);
      }
      if (struct.isSetIndexable()) {
        oprot.writeBool(struct.indexable);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Column struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.columnName = iprot.readString();
        struct.setColumnNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.columnValue = iprot.readBinary();
        struct.setColumnValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.columnValueType = iprot.readString();
        struct.setColumnValueTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.timestamp = iprot.readString();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(4)) {
        struct.indexable = iprot.readBool();
        struct.setIndexableIsSet(true);
      }
    }
  }

}