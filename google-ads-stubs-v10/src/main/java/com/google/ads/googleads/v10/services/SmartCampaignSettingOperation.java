// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/smart_campaign_setting_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * A single operation to update Smart campaign settings for a campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.SmartCampaignSettingOperation}
 */
public final class SmartCampaignSettingOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.SmartCampaignSettingOperation)
    SmartCampaignSettingOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmartCampaignSettingOperation.newBuilder() to construct.
  private SmartCampaignSettingOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmartCampaignSettingOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmartCampaignSettingOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SmartCampaignSettingOperation(
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
            com.google.ads.googleads.v10.resources.SmartCampaignSetting.Builder subBuilder = null;
            if (update_ != null) {
              subBuilder = update_.toBuilder();
            }
            update_ = input.readMessage(com.google.ads.googleads.v10.resources.SmartCampaignSetting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(update_);
              update_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

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
    return com.google.ads.googleads.v10.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v10_services_SmartCampaignSettingOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v10_services_SmartCampaignSettingOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.class, com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.Builder.class);
  }

  public static final int UPDATE_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v10.resources.SmartCampaignSetting update_;
  /**
   * <pre>
   * Update operation: The Smart campaign setting must specify a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
   * @return Whether the update field is set.
   */
  @java.lang.Override
  public boolean hasUpdate() {
    return update_ != null;
  }
  /**
   * <pre>
   * Update operation: The Smart campaign setting must specify a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
   * @return The update.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.SmartCampaignSetting getUpdate() {
    return update_ == null ? com.google.ads.googleads.v10.resources.SmartCampaignSetting.getDefaultInstance() : update_;
  }
  /**
   * <pre>
   * Update operation: The Smart campaign setting must specify a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.SmartCampaignSettingOrBuilder getUpdateOrBuilder() {
    return getUpdate();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (update_ != null) {
      output.writeMessage(1, getUpdate());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (update_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.SmartCampaignSettingOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.SmartCampaignSettingOperation other = (com.google.ads.googleads.v10.services.SmartCampaignSettingOperation) obj;

    if (hasUpdate() != other.hasUpdate()) return false;
    if (hasUpdate()) {
      if (!getUpdate()
          .equals(other.getUpdate())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasUpdate()) {
      hash = (37 * hash) + UPDATE_FIELD_NUMBER;
      hash = (53 * hash) + getUpdate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.SmartCampaignSettingOperation prototype) {
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
   * A single operation to update Smart campaign settings for a campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.SmartCampaignSettingOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.SmartCampaignSettingOperation)
      com.google.ads.googleads.v10.services.SmartCampaignSettingOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v10_services_SmartCampaignSettingOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v10_services_SmartCampaignSettingOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.class, com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.newBuilder()
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
      if (updateBuilder_ == null) {
        update_ = null;
      } else {
        update_ = null;
        updateBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v10_services_SmartCampaignSettingOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SmartCampaignSettingOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SmartCampaignSettingOperation build() {
      com.google.ads.googleads.v10.services.SmartCampaignSettingOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SmartCampaignSettingOperation buildPartial() {
      com.google.ads.googleads.v10.services.SmartCampaignSettingOperation result = new com.google.ads.googleads.v10.services.SmartCampaignSettingOperation(this);
      if (updateBuilder_ == null) {
        result.update_ = update_;
      } else {
        result.update_ = updateBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v10.services.SmartCampaignSettingOperation) {
        return mergeFrom((com.google.ads.googleads.v10.services.SmartCampaignSettingOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.SmartCampaignSettingOperation other) {
      if (other == com.google.ads.googleads.v10.services.SmartCampaignSettingOperation.getDefaultInstance()) return this;
      if (other.hasUpdate()) {
        mergeUpdate(other.getUpdate());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.ads.googleads.v10.services.SmartCampaignSettingOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.SmartCampaignSettingOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v10.resources.SmartCampaignSetting update_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.SmartCampaignSetting, com.google.ads.googleads.v10.resources.SmartCampaignSetting.Builder, com.google.ads.googleads.v10.resources.SmartCampaignSettingOrBuilder> updateBuilder_;
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     * @return Whether the update field is set.
     */
    public boolean hasUpdate() {
      return updateBuilder_ != null || update_ != null;
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     * @return The update.
     */
    public com.google.ads.googleads.v10.resources.SmartCampaignSetting getUpdate() {
      if (updateBuilder_ == null) {
        return update_ == null ? com.google.ads.googleads.v10.resources.SmartCampaignSetting.getDefaultInstance() : update_;
      } else {
        return updateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    public Builder setUpdate(com.google.ads.googleads.v10.resources.SmartCampaignSetting value) {
      if (updateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        update_ = value;
        onChanged();
      } else {
        updateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    public Builder setUpdate(
        com.google.ads.googleads.v10.resources.SmartCampaignSetting.Builder builderForValue) {
      if (updateBuilder_ == null) {
        update_ = builderForValue.build();
        onChanged();
      } else {
        updateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    public Builder mergeUpdate(com.google.ads.googleads.v10.resources.SmartCampaignSetting value) {
      if (updateBuilder_ == null) {
        if (update_ != null) {
          update_ =
            com.google.ads.googleads.v10.resources.SmartCampaignSetting.newBuilder(update_).mergeFrom(value).buildPartial();
        } else {
          update_ = value;
        }
        onChanged();
      } else {
        updateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    public Builder clearUpdate() {
      if (updateBuilder_ == null) {
        update_ = null;
        onChanged();
      } else {
        update_ = null;
        updateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.SmartCampaignSetting.Builder getUpdateBuilder() {
      
      onChanged();
      return getUpdateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.SmartCampaignSettingOrBuilder getUpdateOrBuilder() {
      if (updateBuilder_ != null) {
        return updateBuilder_.getMessageOrBuilder();
      } else {
        return update_ == null ?
            com.google.ads.googleads.v10.resources.SmartCampaignSetting.getDefaultInstance() : update_;
      }
    }
    /**
     * <pre>
     * Update operation: The Smart campaign setting must specify a valid
     * resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.SmartCampaignSetting update = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.SmartCampaignSetting, com.google.ads.googleads.v10.resources.SmartCampaignSetting.Builder, com.google.ads.googleads.v10.resources.SmartCampaignSettingOrBuilder> 
        getUpdateFieldBuilder() {
      if (updateBuilder_ == null) {
        updateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.SmartCampaignSetting, com.google.ads.googleads.v10.resources.SmartCampaignSetting.Builder, com.google.ads.googleads.v10.resources.SmartCampaignSettingOrBuilder>(
                getUpdate(),
                getParentForChildren(),
                isClean());
        update_ = null;
      }
      return updateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.SmartCampaignSettingOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.SmartCampaignSettingOperation)
  private static final com.google.ads.googleads.v10.services.SmartCampaignSettingOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.SmartCampaignSettingOperation();
  }

  public static com.google.ads.googleads.v10.services.SmartCampaignSettingOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartCampaignSettingOperation>
      PARSER = new com.google.protobuf.AbstractParser<SmartCampaignSettingOperation>() {
    @java.lang.Override
    public SmartCampaignSettingOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SmartCampaignSettingOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SmartCampaignSettingOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartCampaignSettingOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.SmartCampaignSettingOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

