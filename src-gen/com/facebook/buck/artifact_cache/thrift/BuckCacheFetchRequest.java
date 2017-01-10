/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-03")
public class BuckCacheFetchRequest implements org.apache.thrift.TBase<BuckCacheFetchRequest, BuckCacheFetchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<BuckCacheFetchRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuckCacheFetchRequest");

  private static final org.apache.thrift.protocol.TField RULE_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleKey", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField REPOSITORY_FIELD_DESC = new org.apache.thrift.protocol.TField("repository", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SCHEDULE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("scheduleType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DISTRIBUTED_BUILD_MODE_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("distributedBuildModeEnabled", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuckCacheFetchRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuckCacheFetchRequestTupleSchemeFactory());
  }

  public RuleKey ruleKey; // optional
  public String repository; // optional
  public String scheduleType; // optional
  public boolean distributedBuildModeEnabled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RULE_KEY((short)1, "ruleKey"),
    REPOSITORY((short)2, "repository"),
    SCHEDULE_TYPE((short)3, "scheduleType"),
    DISTRIBUTED_BUILD_MODE_ENABLED((short)4, "distributedBuildModeEnabled");

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
        case 1: // RULE_KEY
          return RULE_KEY;
        case 2: // REPOSITORY
          return REPOSITORY;
        case 3: // SCHEDULE_TYPE
          return SCHEDULE_TYPE;
        case 4: // DISTRIBUTED_BUILD_MODE_ENABLED
          return DISTRIBUTED_BUILD_MODE_ENABLED;
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
  private static final int __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RULE_KEY,_Fields.REPOSITORY,_Fields.SCHEDULE_TYPE,_Fields.DISTRIBUTED_BUILD_MODE_ENABLED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RULE_KEY, new org.apache.thrift.meta_data.FieldMetaData("ruleKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RuleKey.class)));
    tmpMap.put(_Fields.REPOSITORY, new org.apache.thrift.meta_data.FieldMetaData("repository", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHEDULE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("scheduleType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISTRIBUTED_BUILD_MODE_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("distributedBuildModeEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuckCacheFetchRequest.class, metaDataMap);
  }

  public BuckCacheFetchRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuckCacheFetchRequest(BuckCacheFetchRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRuleKey()) {
      this.ruleKey = new RuleKey(other.ruleKey);
    }
    if (other.isSetRepository()) {
      this.repository = other.repository;
    }
    if (other.isSetScheduleType()) {
      this.scheduleType = other.scheduleType;
    }
    this.distributedBuildModeEnabled = other.distributedBuildModeEnabled;
  }

  public BuckCacheFetchRequest deepCopy() {
    return new BuckCacheFetchRequest(this);
  }

  @Override
  public void clear() {
    this.ruleKey = null;
    this.repository = null;
    this.scheduleType = null;
    setDistributedBuildModeEnabledIsSet(false);
    this.distributedBuildModeEnabled = false;
  }

  public RuleKey getRuleKey() {
    return this.ruleKey;
  }

  public BuckCacheFetchRequest setRuleKey(RuleKey ruleKey) {
    this.ruleKey = ruleKey;
    return this;
  }

  public void unsetRuleKey() {
    this.ruleKey = null;
  }

  /** Returns true if field ruleKey is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleKey() {
    return this.ruleKey != null;
  }

  public void setRuleKeyIsSet(boolean value) {
    if (!value) {
      this.ruleKey = null;
    }
  }

  public String getRepository() {
    return this.repository;
  }

  public BuckCacheFetchRequest setRepository(String repository) {
    this.repository = repository;
    return this;
  }

  public void unsetRepository() {
    this.repository = null;
  }

  /** Returns true if field repository is set (has been assigned a value) and false otherwise */
  public boolean isSetRepository() {
    return this.repository != null;
  }

  public void setRepositoryIsSet(boolean value) {
    if (!value) {
      this.repository = null;
    }
  }

  public String getScheduleType() {
    return this.scheduleType;
  }

  public BuckCacheFetchRequest setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public void unsetScheduleType() {
    this.scheduleType = null;
  }

  /** Returns true if field scheduleType is set (has been assigned a value) and false otherwise */
  public boolean isSetScheduleType() {
    return this.scheduleType != null;
  }

  public void setScheduleTypeIsSet(boolean value) {
    if (!value) {
      this.scheduleType = null;
    }
  }

  public boolean isDistributedBuildModeEnabled() {
    return this.distributedBuildModeEnabled;
  }

  public BuckCacheFetchRequest setDistributedBuildModeEnabled(boolean distributedBuildModeEnabled) {
    this.distributedBuildModeEnabled = distributedBuildModeEnabled;
    setDistributedBuildModeEnabledIsSet(true);
    return this;
  }

  public void unsetDistributedBuildModeEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID);
  }

  /** Returns true if field distributedBuildModeEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetDistributedBuildModeEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID);
  }

  public void setDistributedBuildModeEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RULE_KEY:
      if (value == null) {
        unsetRuleKey();
      } else {
        setRuleKey((RuleKey)value);
      }
      break;

    case REPOSITORY:
      if (value == null) {
        unsetRepository();
      } else {
        setRepository((String)value);
      }
      break;

    case SCHEDULE_TYPE:
      if (value == null) {
        unsetScheduleType();
      } else {
        setScheduleType((String)value);
      }
      break;

    case DISTRIBUTED_BUILD_MODE_ENABLED:
      if (value == null) {
        unsetDistributedBuildModeEnabled();
      } else {
        setDistributedBuildModeEnabled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RULE_KEY:
      return getRuleKey();

    case REPOSITORY:
      return getRepository();

    case SCHEDULE_TYPE:
      return getScheduleType();

    case DISTRIBUTED_BUILD_MODE_ENABLED:
      return isDistributedBuildModeEnabled();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RULE_KEY:
      return isSetRuleKey();
    case REPOSITORY:
      return isSetRepository();
    case SCHEDULE_TYPE:
      return isSetScheduleType();
    case DISTRIBUTED_BUILD_MODE_ENABLED:
      return isSetDistributedBuildModeEnabled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuckCacheFetchRequest)
      return this.equals((BuckCacheFetchRequest)that);
    return false;
  }

  public boolean equals(BuckCacheFetchRequest that) {
    if (that == null)
      return false;

    boolean this_present_ruleKey = true && this.isSetRuleKey();
    boolean that_present_ruleKey = true && that.isSetRuleKey();
    if (this_present_ruleKey || that_present_ruleKey) {
      if (!(this_present_ruleKey && that_present_ruleKey))
        return false;
      if (!this.ruleKey.equals(that.ruleKey))
        return false;
    }

    boolean this_present_repository = true && this.isSetRepository();
    boolean that_present_repository = true && that.isSetRepository();
    if (this_present_repository || that_present_repository) {
      if (!(this_present_repository && that_present_repository))
        return false;
      if (!this.repository.equals(that.repository))
        return false;
    }

    boolean this_present_scheduleType = true && this.isSetScheduleType();
    boolean that_present_scheduleType = true && that.isSetScheduleType();
    if (this_present_scheduleType || that_present_scheduleType) {
      if (!(this_present_scheduleType && that_present_scheduleType))
        return false;
      if (!this.scheduleType.equals(that.scheduleType))
        return false;
    }

    boolean this_present_distributedBuildModeEnabled = true && this.isSetDistributedBuildModeEnabled();
    boolean that_present_distributedBuildModeEnabled = true && that.isSetDistributedBuildModeEnabled();
    if (this_present_distributedBuildModeEnabled || that_present_distributedBuildModeEnabled) {
      if (!(this_present_distributedBuildModeEnabled && that_present_distributedBuildModeEnabled))
        return false;
      if (this.distributedBuildModeEnabled != that.distributedBuildModeEnabled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ruleKey = true && (isSetRuleKey());
    list.add(present_ruleKey);
    if (present_ruleKey)
      list.add(ruleKey);

    boolean present_repository = true && (isSetRepository());
    list.add(present_repository);
    if (present_repository)
      list.add(repository);

    boolean present_scheduleType = true && (isSetScheduleType());
    list.add(present_scheduleType);
    if (present_scheduleType)
      list.add(scheduleType);

    boolean present_distributedBuildModeEnabled = true && (isSetDistributedBuildModeEnabled());
    list.add(present_distributedBuildModeEnabled);
    if (present_distributedBuildModeEnabled)
      list.add(distributedBuildModeEnabled);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuckCacheFetchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRuleKey()).compareTo(other.isSetRuleKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleKey, other.ruleKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRepository()).compareTo(other.isSetRepository());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepository()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.repository, other.repository);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScheduleType()).compareTo(other.isSetScheduleType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheduleType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheduleType, other.scheduleType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDistributedBuildModeEnabled()).compareTo(other.isSetDistributedBuildModeEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDistributedBuildModeEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.distributedBuildModeEnabled, other.distributedBuildModeEnabled);
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
    StringBuilder sb = new StringBuilder("BuckCacheFetchRequest(");
    boolean first = true;

    if (isSetRuleKey()) {
      sb.append("ruleKey:");
      if (this.ruleKey == null) {
        sb.append("null");
      } else {
        sb.append(this.ruleKey);
      }
      first = false;
    }
    if (isSetRepository()) {
      if (!first) sb.append(", ");
      sb.append("repository:");
      if (this.repository == null) {
        sb.append("null");
      } else {
        sb.append(this.repository);
      }
      first = false;
    }
    if (isSetScheduleType()) {
      if (!first) sb.append(", ");
      sb.append("scheduleType:");
      if (this.scheduleType == null) {
        sb.append("null");
      } else {
        sb.append(this.scheduleType);
      }
      first = false;
    }
    if (isSetDistributedBuildModeEnabled()) {
      if (!first) sb.append(", ");
      sb.append("distributedBuildModeEnabled:");
      sb.append(this.distributedBuildModeEnabled);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ruleKey != null) {
      ruleKey.validate();
    }
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

  private static class BuckCacheFetchRequestStandardSchemeFactory implements SchemeFactory {
    public BuckCacheFetchRequestStandardScheme getScheme() {
      return new BuckCacheFetchRequestStandardScheme();
    }
  }

  private static class BuckCacheFetchRequestStandardScheme extends StandardScheme<BuckCacheFetchRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuckCacheFetchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RULE_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ruleKey = new RuleKey();
              struct.ruleKey.read(iprot);
              struct.setRuleKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPOSITORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.repository = iprot.readString();
              struct.setRepositoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SCHEDULE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scheduleType = iprot.readString();
              struct.setScheduleTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISTRIBUTED_BUILD_MODE_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.distributedBuildModeEnabled = iprot.readBool();
              struct.setDistributedBuildModeEnabledIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuckCacheFetchRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ruleKey != null) {
        if (struct.isSetRuleKey()) {
          oprot.writeFieldBegin(RULE_KEY_FIELD_DESC);
          struct.ruleKey.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.repository != null) {
        if (struct.isSetRepository()) {
          oprot.writeFieldBegin(REPOSITORY_FIELD_DESC);
          oprot.writeString(struct.repository);
          oprot.writeFieldEnd();
        }
      }
      if (struct.scheduleType != null) {
        if (struct.isSetScheduleType()) {
          oprot.writeFieldBegin(SCHEDULE_TYPE_FIELD_DESC);
          oprot.writeString(struct.scheduleType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDistributedBuildModeEnabled()) {
        oprot.writeFieldBegin(DISTRIBUTED_BUILD_MODE_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.distributedBuildModeEnabled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuckCacheFetchRequestTupleSchemeFactory implements SchemeFactory {
    public BuckCacheFetchRequestTupleScheme getScheme() {
      return new BuckCacheFetchRequestTupleScheme();
    }
  }

  private static class BuckCacheFetchRequestTupleScheme extends TupleScheme<BuckCacheFetchRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuckCacheFetchRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRuleKey()) {
        optionals.set(0);
      }
      if (struct.isSetRepository()) {
        optionals.set(1);
      }
      if (struct.isSetScheduleType()) {
        optionals.set(2);
      }
      if (struct.isSetDistributedBuildModeEnabled()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRuleKey()) {
        struct.ruleKey.write(oprot);
      }
      if (struct.isSetRepository()) {
        oprot.writeString(struct.repository);
      }
      if (struct.isSetScheduleType()) {
        oprot.writeString(struct.scheduleType);
      }
      if (struct.isSetDistributedBuildModeEnabled()) {
        oprot.writeBool(struct.distributedBuildModeEnabled);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuckCacheFetchRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.ruleKey = new RuleKey();
        struct.ruleKey.read(iprot);
        struct.setRuleKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.repository = iprot.readString();
        struct.setRepositoryIsSet(true);
      }
      if (incoming.get(2)) {
        struct.scheduleType = iprot.readString();
        struct.setScheduleTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.distributedBuildModeEnabled = iprot.readBool();
        struct.setDistributedBuildModeEnabledIsSet(true);
      }
    }
  }

}

