// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/google_ads_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Request message for [GoogleAdsService.SearchStream][google.ads.googleads.v10.services.GoogleAdsService.SearchStream].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest}
 */
public final class SearchGoogleAdsStreamRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest)
    SearchGoogleAdsStreamRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchGoogleAdsStreamRequest.newBuilder() to construct.
  private SearchGoogleAdsStreamRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchGoogleAdsStreamRequest() {
    customerId_ = "";
    query_ = "";
    summaryRowSetting_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchGoogleAdsStreamRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchGoogleAdsStreamRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            query_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            summaryRowSetting_ = rawValue;
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
    return com.google.ads.googleads.v10.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v10_services_SearchGoogleAdsStreamRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v10_services_SearchGoogleAdsStreamRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.class, com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * Required. The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private volatile java.lang.Object query_;
  /**
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUMMARY_ROW_SETTING_FIELD_NUMBER = 3;
  private int summaryRowSetting_;
  /**
   * <pre>
   * Determines whether a summary row will be returned. By default, summary row
   * is not returned. If requested, the summary row will be sent in a response
   * by itself after all other query results are returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
   * @return The enum numeric value on the wire for summaryRowSetting.
   */
  @java.lang.Override public int getSummaryRowSettingValue() {
    return summaryRowSetting_;
  }
  /**
   * <pre>
   * Determines whether a summary row will be returned. By default, summary row
   * is not returned. If requested, the summary row will be sent in a response
   * by itself after all other query results are returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
   * @return The summaryRowSetting.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting getSummaryRowSetting() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting result = com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting.valueOf(summaryRowSetting_);
    return result == null ? com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, query_);
    }
    if (summaryRowSetting_ != com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, summaryRowSetting_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, query_);
    }
    if (summaryRowSetting_ != com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, summaryRowSetting_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest other = (com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getQuery()
        .equals(other.getQuery())) return false;
    if (summaryRowSetting_ != other.summaryRowSetting_) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + SUMMARY_ROW_SETTING_FIELD_NUMBER;
    hash = (53 * hash) + summaryRowSetting_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest prototype) {
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
   * Request message for [GoogleAdsService.SearchStream][google.ads.googleads.v10.services.GoogleAdsService.SearchStream].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest)
      com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v10_services_SearchGoogleAdsStreamRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v10_services_SearchGoogleAdsStreamRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.class, com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.newBuilder()
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
      customerId_ = "";

      query_ = "";

      summaryRowSetting_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.GoogleAdsServiceProto.internal_static_google_ads_googleads_v10_services_SearchGoogleAdsStreamRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest build() {
      com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest buildPartial() {
      com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest result = new com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest(this);
      result.customerId_ = customerId_;
      result.query_ = query_;
      result.summaryRowSetting_ = summaryRowSetting_;
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
      if (other instanceof com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest) {
        return mergeFrom((com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest other) {
      if (other == com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (other.summaryRowSetting_ != 0) {
        setSummaryRowSettingValue(other.getSummaryRowSettingValue());
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
      com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer being queried.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer being queried.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer being queried.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer being queried.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer being queried.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     * Required. The query string.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The query string.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The query string.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      query_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The query string.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      
      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The query string.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      query_ = value;
      onChanged();
      return this;
    }

    private int summaryRowSetting_ = 0;
    /**
     * <pre>
     * Determines whether a summary row will be returned. By default, summary row
     * is not returned. If requested, the summary row will be sent in a response
     * by itself after all other query results are returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
     * @return The enum numeric value on the wire for summaryRowSetting.
     */
    @java.lang.Override public int getSummaryRowSettingValue() {
      return summaryRowSetting_;
    }
    /**
     * <pre>
     * Determines whether a summary row will be returned. By default, summary row
     * is not returned. If requested, the summary row will be sent in a response
     * by itself after all other query results are returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
     * @param value The enum numeric value on the wire for summaryRowSetting to set.
     * @return This builder for chaining.
     */
    public Builder setSummaryRowSettingValue(int value) {
      
      summaryRowSetting_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Determines whether a summary row will be returned. By default, summary row
     * is not returned. If requested, the summary row will be sent in a response
     * by itself after all other query results are returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
     * @return The summaryRowSetting.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting getSummaryRowSetting() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting result = com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting.valueOf(summaryRowSetting_);
      return result == null ? com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Determines whether a summary row will be returned. By default, summary row
     * is not returned. If requested, the summary row will be sent in a response
     * by itself after all other query results are returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
     * @param value The summaryRowSetting to set.
     * @return This builder for chaining.
     */
    public Builder setSummaryRowSetting(com.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      summaryRowSetting_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Determines whether a summary row will be returned. By default, summary row
     * is not returned. If requested, the summary row will be sent in a response
     * by itself after all other query results are returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSummaryRowSetting() {
      
      summaryRowSetting_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest)
  private static final com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest();
  }

  public static com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchGoogleAdsStreamRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchGoogleAdsStreamRequest>() {
    @java.lang.Override
    public SearchGoogleAdsStreamRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchGoogleAdsStreamRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchGoogleAdsStreamRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchGoogleAdsStreamRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

