// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/feed.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * FeedAttributes define the types of data expected to be present in a Feed. A
 * single FeedAttribute specifies the expected type of the FeedItemAttributes
 * with the same FeedAttributeId. Optionally, a FeedAttribute can be marked as
 * being part of a FeedItem's unique key.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.FeedAttribute}
 */
public final class FeedAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.FeedAttribute)
    FeedAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedAttribute.newBuilder() to construct.
  private FeedAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedAttribute() {
    name_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedAttribute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedAttribute(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 40: {
            bitField0_ |= 0x00000001;
            id_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            name_ = s;
            break;
          }
          case 56: {
            bitField0_ |= 0x00000004;
            isPartOfKey_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.FeedAttribute.class, com.google.ads.googleads.v10.resources.FeedAttribute.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 5;
  private long id_;
  /**
   * <pre>
   * ID of the attribute.
   * </pre>
   *
   * <code>optional int64 id = 5;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * ID of the attribute.
   * </pre>
   *
   * <code>optional int64 id = 5;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the attribute. Required.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The name of the attribute. Required.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the attribute. Required.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <pre>
   * Data type for feed attribute. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Data type for feed attribute. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType result = com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType.UNRECOGNIZED : result;
  }

  public static final int IS_PART_OF_KEY_FIELD_NUMBER = 7;
  private boolean isPartOfKey_;
  /**
   * <pre>
   * Indicates that data corresponding to this attribute is part of a
   * FeedItem's unique key. It defaults to false if it is unspecified. Note
   * that a unique key is not required in a Feed's schema, in which case the
   * FeedItems must be referenced by their feed_item_id.
   * </pre>
   *
   * <code>optional bool is_part_of_key = 7;</code>
   * @return Whether the isPartOfKey field is set.
   */
  @java.lang.Override
  public boolean hasIsPartOfKey() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Indicates that data corresponding to this attribute is part of a
   * FeedItem's unique key. It defaults to false if it is unspecified. Note
   * that a unique key is not required in a Feed's schema, in which case the
   * FeedItems must be referenced by their feed_item_id.
   * </pre>
   *
   * <code>optional bool is_part_of_key = 7;</code>
   * @return The isPartOfKey.
   */
  @java.lang.Override
  public boolean getIsPartOfKey() {
    return isPartOfKey_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(5, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, name_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(7, isPartOfKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, name_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isPartOfKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.resources.FeedAttribute)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.FeedAttribute other = (com.google.ads.googleads.v10.resources.FeedAttribute) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (type_ != other.type_) return false;
    if (hasIsPartOfKey() != other.hasIsPartOfKey()) return false;
    if (hasIsPartOfKey()) {
      if (getIsPartOfKey()
          != other.getIsPartOfKey()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasIsPartOfKey()) {
      hash = (37 * hash) + IS_PART_OF_KEY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPartOfKey());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttribute parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.FeedAttribute prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * FeedAttributes define the types of data expected to be present in a Feed. A
   * single FeedAttribute specifies the expected type of the FeedItemAttributes
   * with the same FeedAttributeId. Optionally, a FeedAttribute can be marked as
   * being part of a FeedItem's unique key.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.FeedAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.FeedAttribute)
      com.google.ads.googleads.v10.resources.FeedAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.FeedAttribute.class, com.google.ads.googleads.v10.resources.FeedAttribute.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.FeedAttribute.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;

      isPartOfKey_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttribute_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttribute getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.FeedAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttribute build() {
      com.google.ads.googleads.v10.resources.FeedAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttribute buildPartial() {
      com.google.ads.googleads.v10.resources.FeedAttribute result = new com.google.ads.googleads.v10.resources.FeedAttribute(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isPartOfKey_ = isPartOfKey_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v10.resources.FeedAttribute) {
        return mergeFrom((com.google.ads.googleads.v10.resources.FeedAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.FeedAttribute other) {
      if (other == com.google.ads.googleads.v10.resources.FeedAttribute.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasIsPartOfKey()) {
        setIsPartOfKey(other.getIsPartOfKey());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v10.resources.FeedAttribute parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.resources.FeedAttribute) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <pre>
     * ID of the attribute.
     * </pre>
     *
     * <code>optional int64 id = 5;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ID of the attribute.
     * </pre>
     *
     * <code>optional int64 id = 5;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * ID of the attribute.
     * </pre>
     *
     * <code>optional int64 id = 5;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the attribute.
     * </pre>
     *
     * <code>optional int64 id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the attribute. Required.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The name of the attribute. Required.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the attribute. Required.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the attribute. Required.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the attribute. Required.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the attribute. Required.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Data type for feed attribute. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Data type for feed attribute. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data type for feed attribute. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType result = com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Data type for feed attribute. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data type for feed attribute. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean isPartOfKey_ ;
    /**
     * <pre>
     * Indicates that data corresponding to this attribute is part of a
     * FeedItem's unique key. It defaults to false if it is unspecified. Note
     * that a unique key is not required in a Feed's schema, in which case the
     * FeedItems must be referenced by their feed_item_id.
     * </pre>
     *
     * <code>optional bool is_part_of_key = 7;</code>
     * @return Whether the isPartOfKey field is set.
     */
    @java.lang.Override
    public boolean hasIsPartOfKey() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Indicates that data corresponding to this attribute is part of a
     * FeedItem's unique key. It defaults to false if it is unspecified. Note
     * that a unique key is not required in a Feed's schema, in which case the
     * FeedItems must be referenced by their feed_item_id.
     * </pre>
     *
     * <code>optional bool is_part_of_key = 7;</code>
     * @return The isPartOfKey.
     */
    @java.lang.Override
    public boolean getIsPartOfKey() {
      return isPartOfKey_;
    }
    /**
     * <pre>
     * Indicates that data corresponding to this attribute is part of a
     * FeedItem's unique key. It defaults to false if it is unspecified. Note
     * that a unique key is not required in a Feed's schema, in which case the
     * FeedItems must be referenced by their feed_item_id.
     * </pre>
     *
     * <code>optional bool is_part_of_key = 7;</code>
     * @param value The isPartOfKey to set.
     * @return This builder for chaining.
     */
    public Builder setIsPartOfKey(boolean value) {
      bitField0_ |= 0x00000004;
      isPartOfKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that data corresponding to this attribute is part of a
     * FeedItem's unique key. It defaults to false if it is unspecified. Note
     * that a unique key is not required in a Feed's schema, in which case the
     * FeedItems must be referenced by their feed_item_id.
     * </pre>
     *
     * <code>optional bool is_part_of_key = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPartOfKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isPartOfKey_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.FeedAttribute)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.FeedAttribute)
  private static final com.google.ads.googleads.v10.resources.FeedAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.FeedAttribute();
  }

  public static com.google.ads.googleads.v10.resources.FeedAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedAttribute>
      PARSER = new com.google.protobuf.AbstractParser<FeedAttribute>() {
    @java.lang.Override
    public FeedAttribute parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedAttribute(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

