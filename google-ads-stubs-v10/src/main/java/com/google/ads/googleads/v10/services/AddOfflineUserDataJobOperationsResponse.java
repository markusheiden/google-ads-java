// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Response message for
 * [OfflineUserDataJobService.AddOfflineUserDataJobOperations][google.ads.googleads.v10.services.OfflineUserDataJobService.AddOfflineUserDataJobOperations].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse}
 */
public final class AddOfflineUserDataJobOperationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse)
    AddOfflineUserDataJobOperationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddOfflineUserDataJobOperationsResponse.newBuilder() to construct.
  private AddOfflineUserDataJobOperationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddOfflineUserDataJobOperationsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddOfflineUserDataJobOperationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddOfflineUserDataJobOperationsResponse(
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
            com.google.rpc.Status.Builder subBuilder = null;
            if (partialFailureError_ != null) {
              subBuilder = partialFailureError_.toBuilder();
            }
            partialFailureError_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partialFailureError_);
              partialFailureError_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.rpc.Status.Builder subBuilder = null;
            if (warning_ != null) {
              subBuilder = warning_.toBuilder();
            }
            warning_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(warning_);
              warning_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v10.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v10_services_AddOfflineUserDataJobOperationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v10_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.class, com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.Builder.class);
  }

  public static final int PARTIAL_FAILURE_ERROR_FIELD_NUMBER = 1;
  private com.google.rpc.Status partialFailureError_;
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return Whether the partialFailureError field is set.
   */
  @java.lang.Override
  public boolean hasPartialFailureError() {
    return partialFailureError_ != null;
  }
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return The partialFailureError.
   */
  @java.lang.Override
  public com.google.rpc.Status getPartialFailureError() {
    return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
  }
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
    return getPartialFailureError();
  }

  public static final int WARNING_FIELD_NUMBER = 2;
  private com.google.rpc.Status warning_;
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return warning_ != null;
  }
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return The warning.
   */
  @java.lang.Override
  public com.google.rpc.Status getWarning() {
    return warning_ == null ? com.google.rpc.Status.getDefaultInstance() : warning_;
  }
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getWarningOrBuilder() {
    return getWarning();
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
    if (partialFailureError_ != null) {
      output.writeMessage(1, getPartialFailureError());
    }
    if (warning_ != null) {
      output.writeMessage(2, getWarning());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partialFailureError_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPartialFailureError());
    }
    if (warning_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWarning());
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse other = (com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse) obj;

    if (hasPartialFailureError() != other.hasPartialFailureError()) return false;
    if (hasPartialFailureError()) {
      if (!getPartialFailureError()
          .equals(other.getPartialFailureError())) return false;
    }
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning()
          .equals(other.getWarning())) return false;
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
    if (hasPartialFailureError()) {
      hash = (37 * hash) + PARTIAL_FAILURE_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getPartialFailureError().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse prototype) {
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
   * Response message for
   * [OfflineUserDataJobService.AddOfflineUserDataJobOperations][google.ads.googleads.v10.services.OfflineUserDataJobService.AddOfflineUserDataJobOperations].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse)
      com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v10_services_AddOfflineUserDataJobOperationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v10_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.class, com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.newBuilder()
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
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = null;
      } else {
        partialFailureError_ = null;
        partialFailureErrorBuilder_ = null;
      }
      if (warningBuilder_ == null) {
        warning_ = null;
      } else {
        warning_ = null;
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v10_services_AddOfflineUserDataJobOperationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse build() {
      com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse buildPartial() {
      com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse result = new com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse(this);
      if (partialFailureErrorBuilder_ == null) {
        result.partialFailureError_ = partialFailureError_;
      } else {
        result.partialFailureError_ = partialFailureErrorBuilder_.build();
      }
      if (warningBuilder_ == null) {
        result.warning_ = warning_;
      } else {
        result.warning_ = warningBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse) {
        return mergeFrom((com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse other) {
      if (other == com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse.getDefaultInstance()) return this;
      if (other.hasPartialFailureError()) {
        mergePartialFailureError(other.getPartialFailureError());
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
      com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.rpc.Status partialFailureError_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> partialFailureErrorBuilder_;
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     * @return Whether the partialFailureError field is set.
     */
    public boolean hasPartialFailureError() {
      return partialFailureErrorBuilder_ != null || partialFailureError_ != null;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     * @return The partialFailureError.
     */
    public com.google.rpc.Status getPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
      } else {
        return partialFailureErrorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder setPartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partialFailureError_ = value;
        onChanged();
      } else {
        partialFailureErrorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder setPartialFailureError(
        com.google.rpc.Status.Builder builderForValue) {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = builderForValue.build();
        onChanged();
      } else {
        partialFailureErrorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder mergePartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (partialFailureError_ != null) {
          partialFailureError_ =
            com.google.rpc.Status.newBuilder(partialFailureError_).mergeFrom(value).buildPartial();
        } else {
          partialFailureError_ = value;
        }
        onChanged();
      } else {
        partialFailureErrorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder clearPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = null;
        onChanged();
      } else {
        partialFailureError_ = null;
        partialFailureErrorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public com.google.rpc.Status.Builder getPartialFailureErrorBuilder() {
      
      onChanged();
      return getPartialFailureErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
      if (partialFailureErrorBuilder_ != null) {
        return partialFailureErrorBuilder_.getMessageOrBuilder();
      } else {
        return partialFailureError_ == null ?
            com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
      }
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (e.g. auth errors),
     * we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getPartialFailureErrorFieldBuilder() {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureErrorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getPartialFailureError(),
                getParentForChildren(),
                isClean());
        partialFailureError_ = null;
      }
      return partialFailureErrorBuilder_;
    }

    private com.google.rpc.Status warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> warningBuilder_;
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return warningBuilder_ != null || warning_ != null;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     * @return The warning.
     */
    public com.google.rpc.Status getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null ? com.google.rpc.Status.getDefaultInstance() : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder setWarning(com.google.rpc.Status value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
        onChanged();
      } else {
        warningBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder setWarning(
        com.google.rpc.Status.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
        onChanged();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder mergeWarning(com.google.rpc.Status value) {
      if (warningBuilder_ == null) {
        if (warning_ != null) {
          warning_ =
            com.google.rpc.Status.newBuilder(warning_).mergeFrom(value).buildPartial();
        } else {
          warning_ = value;
        }
        onChanged();
      } else {
        warningBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder clearWarning() {
      if (warningBuilder_ == null) {
        warning_ = null;
        onChanged();
      } else {
        warning_ = null;
        warningBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public com.google.rpc.Status.Builder getWarningBuilder() {
      
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null ?
            com.google.rpc.Status.getDefaultInstance() : warning_;
      }
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getWarning(),
                getParentForChildren(),
                isClean());
        warning_ = null;
      }
      return warningBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse)
  private static final com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse();
  }

  public static com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddOfflineUserDataJobOperationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddOfflineUserDataJobOperationsResponse>() {
    @java.lang.Override
    public AddOfflineUserDataJobOperationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddOfflineUserDataJobOperationsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddOfflineUserDataJobOperationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddOfflineUserDataJobOperationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

