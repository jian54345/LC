// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class LockEquipmentCsReqOuterClass {
  /**
   * Protobuf type {@code LockEquipmentCsReq}
   */
  public static final class LockEquipmentCsReq extends ProtoMessage<LockEquipmentCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 equipment_unique_id = 8;</code>
     */
    private int equipmentUniqueId;

    /**
     * <code>optional bool is_protected = 1;</code>
     */
    private boolean isProtected;

    private LockEquipmentCsReq() {
    }

    /**
     * @return a new empty instance of {@code LockEquipmentCsReq}
     */
    public static LockEquipmentCsReq newInstance() {
      return new LockEquipmentCsReq();
    }

    /**
     * <code>optional uint32 equipment_unique_id = 8;</code>
     * @return whether the equipmentUniqueId field is set
     */
    public boolean hasEquipmentUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 8;</code>
     * @return this
     */
    public LockEquipmentCsReq clearEquipmentUniqueId() {
      bitField0_ &= ~0x00000001;
      equipmentUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 8;</code>
     * @return the equipmentUniqueId
     */
    public int getEquipmentUniqueId() {
      return equipmentUniqueId;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 8;</code>
     * @param value the equipmentUniqueId to set
     * @return this
     */
    public LockEquipmentCsReq setEquipmentUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      equipmentUniqueId = value;
      return this;
    }

    /**
     * <code>optional bool is_protected = 1;</code>
     * @return whether the isProtected field is set
     */
    public boolean hasIsProtected() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_protected = 1;</code>
     * @return this
     */
    public LockEquipmentCsReq clearIsProtected() {
      bitField0_ &= ~0x00000002;
      isProtected = false;
      return this;
    }

    /**
     * <code>optional bool is_protected = 1;</code>
     * @return the isProtected
     */
    public boolean getIsProtected() {
      return isProtected;
    }

    /**
     * <code>optional bool is_protected = 1;</code>
     * @param value the isProtected to set
     * @return this
     */
    public LockEquipmentCsReq setIsProtected(final boolean value) {
      bitField0_ |= 0x00000002;
      isProtected = value;
      return this;
    }

    @Override
    public LockEquipmentCsReq copyFrom(final LockEquipmentCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        equipmentUniqueId = other.equipmentUniqueId;
        isProtected = other.isProtected;
      }
      return this;
    }

    @Override
    public LockEquipmentCsReq mergeFrom(final LockEquipmentCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEquipmentUniqueId()) {
        setEquipmentUniqueId(other.equipmentUniqueId);
      }
      if (other.hasIsProtected()) {
        setIsProtected(other.isProtected);
      }
      return this;
    }

    @Override
    public LockEquipmentCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      equipmentUniqueId = 0;
      isProtected = false;
      return this;
    }

    @Override
    public LockEquipmentCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LockEquipmentCsReq)) {
        return false;
      }
      LockEquipmentCsReq other = (LockEquipmentCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEquipmentUniqueId() || equipmentUniqueId == other.equipmentUniqueId)
        && (!hasIsProtected() || isProtected == other.isProtected);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 8);
        output.writeBoolNoTag(isProtected);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LockEquipmentCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // equipmentUniqueId
            equipmentUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // isProtected
            isProtected = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.equipmentUniqueId, equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isProtected, isProtected);
      }
      output.endObject();
    }

    @Override
    public LockEquipmentCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1867136902:
          case 760467160: {
            if (input.isAtField(FieldNames.equipmentUniqueId)) {
              if (!input.trySkipNullValue()) {
                equipmentUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 569879972:
          case -1919645991: {
            if (input.isAtField(FieldNames.isProtected)) {
              if (!input.trySkipNullValue()) {
                isProtected = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public LockEquipmentCsReq clone() {
      return new LockEquipmentCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LockEquipmentCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LockEquipmentCsReq(), data).checkInitialized();
    }

    public static LockEquipmentCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LockEquipmentCsReq(), input).checkInitialized();
    }

    public static LockEquipmentCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LockEquipmentCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating LockEquipmentCsReq messages
     */
    public static MessageFactory<LockEquipmentCsReq> getFactory() {
      return LockEquipmentCsReqFactory.INSTANCE;
    }

    private enum LockEquipmentCsReqFactory implements MessageFactory<LockEquipmentCsReq> {
      INSTANCE;

      @Override
      public LockEquipmentCsReq create() {
        return LockEquipmentCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName equipmentUniqueId = FieldName.forField("equipmentUniqueId", "equipment_unique_id");

      static final FieldName isProtected = FieldName.forField("isProtected", "is_protected");
    }
  }
}
