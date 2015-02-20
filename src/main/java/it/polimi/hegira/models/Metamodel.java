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

public class Metamodel implements org.apache.thrift.TBase<Metamodel, Metamodel._Fields>, java.io.Serializable, Cloneable, Comparable<Metamodel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Metamodel");

  private static final org.apache.thrift.protocol.TField PARTITION_GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionGroup", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_FAMILIES_FIELD_DESC = new org.apache.thrift.protocol.TField("columnFamilies", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ROW_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("rowKey", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField ACTUAL_VDP_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("actualVdpSize", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetamodelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetamodelTupleSchemeFactory());
  }

  public String partitionGroup; // required
  public List<String> columnFamilies; // optional
  public String rowKey; // required
  public Map<String,List<Column>> columns; // required
  public Map<String,Integer> actualVdpSize; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_GROUP((short)1, "partitionGroup"),
    COLUMN_FAMILIES((short)2, "columnFamilies"),
    ROW_KEY((short)3, "rowKey"),
    COLUMNS((short)4, "columns"),
    ACTUAL_VDP_SIZE((short)5, "actualVdpSize");

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
        case 1: // PARTITION_GROUP
          return PARTITION_GROUP;
        case 2: // COLUMN_FAMILIES
          return COLUMN_FAMILIES;
        case 3: // ROW_KEY
          return ROW_KEY;
        case 4: // COLUMNS
          return COLUMNS;
        case 5: // ACTUAL_VDP_SIZE
          return ACTUAL_VDP_SIZE;
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
  private _Fields optionals[] = {_Fields.COLUMN_FAMILIES,_Fields.ACTUAL_VDP_SIZE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_GROUP, new org.apache.thrift.meta_data.FieldMetaData("partitionGroup", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMN_FAMILIES, new org.apache.thrift.meta_data.FieldMetaData("columnFamilies", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ROW_KEY, new org.apache.thrift.meta_data.FieldMetaData("rowKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Column.class)))));
    tmpMap.put(_Fields.ACTUAL_VDP_SIZE, new org.apache.thrift.meta_data.FieldMetaData("actualVdpSize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Metamodel.class, metaDataMap);
  }

  public Metamodel() {
  	this.columns = new HashMap<String, List<Column>>();
	this.columnFamilies = new ArrayList<String>();
  }

  public Metamodel(
    String partitionGroup,
    String rowKey,
    Map<String,List<Column>> columns)
  {
    this();
    this.partitionGroup = partitionGroup;
    this.rowKey = rowKey;
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Metamodel(Metamodel other) {
    if (other.isSetPartitionGroup()) {
      this.partitionGroup = other.partitionGroup;
    }
    if (other.isSetColumnFamilies()) {
      List<String> __this__columnFamilies = new ArrayList<String>(other.columnFamilies);
      this.columnFamilies = __this__columnFamilies;
    }
    if (other.isSetRowKey()) {
      this.rowKey = other.rowKey;
    }
    if (other.isSetColumns()) {
      Map<String,List<Column>> __this__columns = new HashMap<String,List<Column>>(other.columns.size());
      for (Map.Entry<String, List<Column>> other_element : other.columns.entrySet()) {

        String other_element_key = other_element.getKey();
        List<Column> other_element_value = other_element.getValue();

        String __this__columns_copy_key = other_element_key;

        List<Column> __this__columns_copy_value = new ArrayList<Column>(other_element_value.size());
        for (Column other_element_value_element : other_element_value) {
          __this__columns_copy_value.add(new Column(other_element_value_element));
        }

        __this__columns.put(__this__columns_copy_key, __this__columns_copy_value);
      }
      this.columns = __this__columns;
    }
    if (other.isSetActualVdpSize()) {
      Map<String,Integer> __this__actualVdpSize = new HashMap<String,Integer>(other.actualVdpSize);
      this.actualVdpSize = __this__actualVdpSize;
    }
  }

  public Metamodel deepCopy() {
    return new Metamodel(this);
  }

  @Override
  public void clear() {
    this.partitionGroup = null;
    this.columnFamilies = null;
    this.rowKey = null;
    this.columns = null;
    this.actualVdpSize = null;
  }

  public String getPartitionGroup() {
    return this.partitionGroup;
  }

  public Metamodel setPartitionGroup(String partitionGroup) {
    this.partitionGroup = partitionGroup;
    return this;
  }

  public void unsetPartitionGroup() {
    this.partitionGroup = null;
  }

  /** Returns true if field partitionGroup is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionGroup() {
    return this.partitionGroup != null;
  }

  public void setPartitionGroupIsSet(boolean value) {
    if (!value) {
      this.partitionGroup = null;
    }
  }

  public int getColumnFamiliesSize() {
    return (this.columnFamilies == null) ? 0 : this.columnFamilies.size();
  }

  public java.util.Iterator<String> getColumnFamiliesIterator() {
    return (this.columnFamilies == null) ? null : this.columnFamilies.iterator();
  }

  public void addToColumnFamilies(String elem) {
    if (this.columnFamilies == null) {
      this.columnFamilies = new ArrayList<String>();
    }
    this.columnFamilies.add(elem);
  }

  public List<String> getColumnFamilies() {
    return this.columnFamilies;
  }

  public Metamodel setColumnFamilies(List<String> columnFamilies) {
    this.columnFamilies = columnFamilies;
    return this;
  }

  public void unsetColumnFamilies() {
    this.columnFamilies = null;
  }

  /** Returns true if field columnFamilies is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnFamilies() {
    return this.columnFamilies != null;
  }

  public void setColumnFamiliesIsSet(boolean value) {
    if (!value) {
      this.columnFamilies = null;
    }
  }

  public String getRowKey() {
    return this.rowKey;
  }

  public Metamodel setRowKey(String rowKey) {
    this.rowKey = rowKey;
    return this;
  }

  public void unsetRowKey() {
    this.rowKey = null;
  }

  /** Returns true if field rowKey is set (has been assigned a value) and false otherwise */
  public boolean isSetRowKey() {
    return this.rowKey != null;
  }

  public void setRowKeyIsSet(boolean value) {
    if (!value) {
      this.rowKey = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public void putToColumns(String key, List<Column> val) {
    if (this.columns == null) {
      this.columns = new HashMap<String,List<Column>>();
    }
    this.columns.put(key, val);
  }

  public Map<String,List<Column>> getColumns() {
    return this.columns;
  }

  public Metamodel setColumns(Map<String,List<Column>> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getActualVdpSizeSize() {
    return (this.actualVdpSize == null) ? 0 : this.actualVdpSize.size();
  }

  public void putToActualVdpSize(String key, int val) {
    if (this.actualVdpSize == null) {
      this.actualVdpSize = new HashMap<String,Integer>();
    }
    this.actualVdpSize.put(key, val);
  }

  public Map<String,Integer> getActualVdpSize() {
    return this.actualVdpSize;
  }

  public Metamodel setActualVdpSize(Map<String,Integer> actualVdpSize) {
    this.actualVdpSize = actualVdpSize;
    return this;
  }

  public void unsetActualVdpSize() {
    this.actualVdpSize = null;
  }

  /** Returns true if field actualVdpSize is set (has been assigned a value) and false otherwise */
  public boolean isSetActualVdpSize() {
    return this.actualVdpSize != null;
  }

  public void setActualVdpSizeIsSet(boolean value) {
    if (!value) {
      this.actualVdpSize = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_GROUP:
      if (value == null) {
        unsetPartitionGroup();
      } else {
        setPartitionGroup((String)value);
      }
      break;

    case COLUMN_FAMILIES:
      if (value == null) {
        unsetColumnFamilies();
      } else {
        setColumnFamilies((List<String>)value);
      }
      break;

    case ROW_KEY:
      if (value == null) {
        unsetRowKey();
      } else {
        setRowKey((String)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((Map<String,List<Column>>)value);
      }
      break;

    case ACTUAL_VDP_SIZE:
      if (value == null) {
        unsetActualVdpSize();
      } else {
        setActualVdpSize((Map<String,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_GROUP:
      return getPartitionGroup();

    case COLUMN_FAMILIES:
      return getColumnFamilies();

    case ROW_KEY:
      return getRowKey();

    case COLUMNS:
      return getColumns();

    case ACTUAL_VDP_SIZE:
      return getActualVdpSize();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_GROUP:
      return isSetPartitionGroup();
    case COLUMN_FAMILIES:
      return isSetColumnFamilies();
    case ROW_KEY:
      return isSetRowKey();
    case COLUMNS:
      return isSetColumns();
    case ACTUAL_VDP_SIZE:
      return isSetActualVdpSize();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Metamodel)
      return this.equals((Metamodel)that);
    return false;
  }

  public boolean equals(Metamodel that) {
    if (that == null)
      return false;

    boolean this_present_partitionGroup = true && this.isSetPartitionGroup();
    boolean that_present_partitionGroup = true && that.isSetPartitionGroup();
    if (this_present_partitionGroup || that_present_partitionGroup) {
      if (!(this_present_partitionGroup && that_present_partitionGroup))
        return false;
      if (!this.partitionGroup.equals(that.partitionGroup))
        return false;
    }

    boolean this_present_columnFamilies = true && this.isSetColumnFamilies();
    boolean that_present_columnFamilies = true && that.isSetColumnFamilies();
    if (this_present_columnFamilies || that_present_columnFamilies) {
      if (!(this_present_columnFamilies && that_present_columnFamilies))
        return false;
      if (!this.columnFamilies.equals(that.columnFamilies))
        return false;
    }

    boolean this_present_rowKey = true && this.isSetRowKey();
    boolean that_present_rowKey = true && that.isSetRowKey();
    if (this_present_rowKey || that_present_rowKey) {
      if (!(this_present_rowKey && that_present_rowKey))
        return false;
      if (!this.rowKey.equals(that.rowKey))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_actualVdpSize = true && this.isSetActualVdpSize();
    boolean that_present_actualVdpSize = true && that.isSetActualVdpSize();
    if (this_present_actualVdpSize || that_present_actualVdpSize) {
      if (!(this_present_actualVdpSize && that_present_actualVdpSize))
        return false;
      if (!this.actualVdpSize.equals(that.actualVdpSize))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Metamodel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionGroup()).compareTo(other.isSetPartitionGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionGroup, other.partitionGroup);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnFamilies()).compareTo(other.isSetColumnFamilies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnFamilies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnFamilies, other.columnFamilies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowKey()).compareTo(other.isSetRowKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowKey, other.rowKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActualVdpSize()).compareTo(other.isSetActualVdpSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActualVdpSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actualVdpSize, other.actualVdpSize);
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
    StringBuilder sb = new StringBuilder("Metamodel(");
    boolean first = true;

    sb.append("partitionGroup:");
    if (this.partitionGroup == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionGroup);
    }
    first = false;
    if (isSetColumnFamilies()) {
      if (!first) sb.append(", ");
      sb.append("columnFamilies:");
      if (this.columnFamilies == null) {
        sb.append("null");
      } else {
        sb.append(this.columnFamilies);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("rowKey:");
    if (this.rowKey == null) {
      sb.append("null");
    } else {
      sb.append(this.rowKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (isSetActualVdpSize()) {
      if (!first) sb.append(", ");
      sb.append("actualVdpSize:");
      if (this.actualVdpSize == null) {
        sb.append("null");
      } else {
        sb.append(this.actualVdpSize);
      }
      first = false;
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetamodelStandardSchemeFactory implements SchemeFactory {
    public MetamodelStandardScheme getScheme() {
      return new MetamodelStandardScheme();
    }
  }

  private static class MetamodelStandardScheme extends StandardScheme<Metamodel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Metamodel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitionGroup = iprot.readString();
              struct.setPartitionGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_FAMILIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.columnFamilies = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2;
                  _elem2 = iprot.readString();
                  struct.columnFamilies.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setColumnFamiliesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROW_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rowKey = iprot.readString();
              struct.setRowKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.columns = new HashMap<String,List<Column>>(2*_map3.size);
                for (int _i4 = 0; _i4 < _map3.size; ++_i4)
                {
                  String _key5;
                  List<Column> _val6;
                  _key5 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list7 = iprot.readListBegin();
                    _val6 = new ArrayList<Column>(_list7.size);
                    for (int _i8 = 0; _i8 < _list7.size; ++_i8)
                    {
                      Column _elem9;
                      _elem9 = new Column();
                      _elem9.read(iprot);
                      _val6.add(_elem9);
                    }
                    iprot.readListEnd();
                  }
                  struct.columns.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ACTUAL_VDP_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.actualVdpSize = new HashMap<String,Integer>(2*_map10.size);
                for (int _i11 = 0; _i11 < _map10.size; ++_i11)
                {
                  String _key12;
                  int _val13;
                  _key12 = iprot.readString();
                  _val13 = iprot.readI32();
                  struct.actualVdpSize.put(_key12, _val13);
                }
                iprot.readMapEnd();
              }
              struct.setActualVdpSizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Metamodel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitionGroup != null) {
        oprot.writeFieldBegin(PARTITION_GROUP_FIELD_DESC);
        oprot.writeString(struct.partitionGroup);
        oprot.writeFieldEnd();
      }
      if (struct.columnFamilies != null) {
        if (struct.isSetColumnFamilies()) {
          oprot.writeFieldBegin(COLUMN_FAMILIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columnFamilies.size()));
            for (String _iter14 : struct.columnFamilies)
            {
              oprot.writeString(_iter14);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.rowKey != null) {
        oprot.writeFieldBegin(ROW_KEY_FIELD_DESC);
        oprot.writeString(struct.rowKey);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.columns.size()));
          for (Map.Entry<String, List<Column>> _iter15 : struct.columns.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter15.getValue().size()));
              for (Column _iter16 : _iter15.getValue())
              {
                _iter16.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.actualVdpSize != null) {
        if (struct.isSetActualVdpSize()) {
          oprot.writeFieldBegin(ACTUAL_VDP_SIZE_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.actualVdpSize.size()));
            for (Map.Entry<String, Integer> _iter17 : struct.actualVdpSize.entrySet())
            {
              oprot.writeString(_iter17.getKey());
              oprot.writeI32(_iter17.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetamodelTupleSchemeFactory implements SchemeFactory {
    public MetamodelTupleScheme getScheme() {
      return new MetamodelTupleScheme();
    }
  }

  private static class MetamodelTupleScheme extends TupleScheme<Metamodel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Metamodel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionGroup()) {
        optionals.set(0);
      }
      if (struct.isSetColumnFamilies()) {
        optionals.set(1);
      }
      if (struct.isSetRowKey()) {
        optionals.set(2);
      }
      if (struct.isSetColumns()) {
        optionals.set(3);
      }
      if (struct.isSetActualVdpSize()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPartitionGroup()) {
        oprot.writeString(struct.partitionGroup);
      }
      if (struct.isSetColumnFamilies()) {
        {
          oprot.writeI32(struct.columnFamilies.size());
          for (String _iter18 : struct.columnFamilies)
          {
            oprot.writeString(_iter18);
          }
        }
      }
      if (struct.isSetRowKey()) {
        oprot.writeString(struct.rowKey);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (Map.Entry<String, List<Column>> _iter19 : struct.columns.entrySet())
          {
            oprot.writeString(_iter19.getKey());
            {
              oprot.writeI32(_iter19.getValue().size());
              for (Column _iter20 : _iter19.getValue())
              {
                _iter20.write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetActualVdpSize()) {
        {
          oprot.writeI32(struct.actualVdpSize.size());
          for (Map.Entry<String, Integer> _iter21 : struct.actualVdpSize.entrySet())
          {
            oprot.writeString(_iter21.getKey());
            oprot.writeI32(_iter21.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Metamodel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.partitionGroup = iprot.readString();
        struct.setPartitionGroupIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list22 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.columnFamilies = new ArrayList<String>(_list22.size);
          for (int _i23 = 0; _i23 < _list22.size; ++_i23)
          {
            String _elem24;
            _elem24 = iprot.readString();
            struct.columnFamilies.add(_elem24);
          }
        }
        struct.setColumnFamiliesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rowKey = iprot.readString();
        struct.setRowKeyIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map25 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.columns = new HashMap<String,List<Column>>(2*_map25.size);
          for (int _i26 = 0; _i26 < _map25.size; ++_i26)
          {
            String _key27;
            List<Column> _val28;
            _key27 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val28 = new ArrayList<Column>(_list29.size);
              for (int _i30 = 0; _i30 < _list29.size; ++_i30)
              {
                Column _elem31;
                _elem31 = new Column();
                _elem31.read(iprot);
                _val28.add(_elem31);
              }
            }
            struct.columns.put(_key27, _val28);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map32 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.actualVdpSize = new HashMap<String,Integer>(2*_map32.size);
          for (int _i33 = 0; _i33 < _map32.size; ++_i33)
          {
            String _key34;
            int _val35;
            _key34 = iprot.readString();
            _val35 = iprot.readI32();
            struct.actualVdpSize.put(_key34, _val35);
          }
        }
        struct.setActualVdpSizeIsSet(true);
      }
    }
  }

}

