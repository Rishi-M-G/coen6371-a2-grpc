// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query.proto

package com.assignment.grpc;

/**
 * Protobuf type {@code QueryThreeResponse}
 */
public final class QueryThreeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:QueryThreeResponse)
    QueryThreeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryThreeResponse.newBuilder() to construct.
  private QueryThreeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryThreeResponse() {
    stateExpense_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryThreeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assignment.grpc.Query.internal_static_QueryThreeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assignment.grpc.Query.internal_static_QueryThreeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assignment.grpc.QueryThreeResponse.class, com.assignment.grpc.QueryThreeResponse.Builder.class);
  }

  public static final int STATE_EXPENSE_FIELD_NUMBER = 1;
  private java.util.List<com.assignment.grpc.StateExpenseQueryThree> stateExpense_;
  /**
   * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.assignment.grpc.StateExpenseQueryThree> getStateExpenseList() {
    return stateExpense_;
  }
  /**
   * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.assignment.grpc.StateExpenseQueryThreeOrBuilder> 
      getStateExpenseOrBuilderList() {
    return stateExpense_;
  }
  /**
   * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
   */
  @java.lang.Override
  public int getStateExpenseCount() {
    return stateExpense_.size();
  }
  /**
   * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
   */
  @java.lang.Override
  public com.assignment.grpc.StateExpenseQueryThree getStateExpense(int index) {
    return stateExpense_.get(index);
  }
  /**
   * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
   */
  @java.lang.Override
  public com.assignment.grpc.StateExpenseQueryThreeOrBuilder getStateExpenseOrBuilder(
      int index) {
    return stateExpense_.get(index);
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
    for (int i = 0; i < stateExpense_.size(); i++) {
      output.writeMessage(1, stateExpense_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stateExpense_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, stateExpense_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.assignment.grpc.QueryThreeResponse)) {
      return super.equals(obj);
    }
    com.assignment.grpc.QueryThreeResponse other = (com.assignment.grpc.QueryThreeResponse) obj;

    if (!getStateExpenseList()
        .equals(other.getStateExpenseList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStateExpenseCount() > 0) {
      hash = (37 * hash) + STATE_EXPENSE_FIELD_NUMBER;
      hash = (53 * hash) + getStateExpenseList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assignment.grpc.QueryThreeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.assignment.grpc.QueryThreeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assignment.grpc.QueryThreeResponse parseFrom(
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
  public static Builder newBuilder(com.assignment.grpc.QueryThreeResponse prototype) {
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
   * Protobuf type {@code QueryThreeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:QueryThreeResponse)
      com.assignment.grpc.QueryThreeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assignment.grpc.Query.internal_static_QueryThreeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assignment.grpc.Query.internal_static_QueryThreeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assignment.grpc.QueryThreeResponse.class, com.assignment.grpc.QueryThreeResponse.Builder.class);
    }

    // Construct using com.assignment.grpc.QueryThreeResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (stateExpenseBuilder_ == null) {
        stateExpense_ = java.util.Collections.emptyList();
      } else {
        stateExpense_ = null;
        stateExpenseBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assignment.grpc.Query.internal_static_QueryThreeResponse_descriptor;
    }

    @java.lang.Override
    public com.assignment.grpc.QueryThreeResponse getDefaultInstanceForType() {
      return com.assignment.grpc.QueryThreeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.assignment.grpc.QueryThreeResponse build() {
      com.assignment.grpc.QueryThreeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assignment.grpc.QueryThreeResponse buildPartial() {
      com.assignment.grpc.QueryThreeResponse result = new com.assignment.grpc.QueryThreeResponse(this);
      int from_bitField0_ = bitField0_;
      if (stateExpenseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stateExpense_ = java.util.Collections.unmodifiableList(stateExpense_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stateExpense_ = stateExpense_;
      } else {
        result.stateExpense_ = stateExpenseBuilder_.build();
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
      if (other instanceof com.assignment.grpc.QueryThreeResponse) {
        return mergeFrom((com.assignment.grpc.QueryThreeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assignment.grpc.QueryThreeResponse other) {
      if (other == com.assignment.grpc.QueryThreeResponse.getDefaultInstance()) return this;
      if (stateExpenseBuilder_ == null) {
        if (!other.stateExpense_.isEmpty()) {
          if (stateExpense_.isEmpty()) {
            stateExpense_ = other.stateExpense_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStateExpenseIsMutable();
            stateExpense_.addAll(other.stateExpense_);
          }
          onChanged();
        }
      } else {
        if (!other.stateExpense_.isEmpty()) {
          if (stateExpenseBuilder_.isEmpty()) {
            stateExpenseBuilder_.dispose();
            stateExpenseBuilder_ = null;
            stateExpense_ = other.stateExpense_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stateExpenseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStateExpenseFieldBuilder() : null;
          } else {
            stateExpenseBuilder_.addAllMessages(other.stateExpense_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.assignment.grpc.StateExpenseQueryThree m =
                  input.readMessage(
                      com.assignment.grpc.StateExpenseQueryThree.parser(),
                      extensionRegistry);
              if (stateExpenseBuilder_ == null) {
                ensureStateExpenseIsMutable();
                stateExpense_.add(m);
              } else {
                stateExpenseBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.assignment.grpc.StateExpenseQueryThree> stateExpense_ =
      java.util.Collections.emptyList();
    private void ensureStateExpenseIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stateExpense_ = new java.util.ArrayList<com.assignment.grpc.StateExpenseQueryThree>(stateExpense_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.assignment.grpc.StateExpenseQueryThree, com.assignment.grpc.StateExpenseQueryThree.Builder, com.assignment.grpc.StateExpenseQueryThreeOrBuilder> stateExpenseBuilder_;

    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public java.util.List<com.assignment.grpc.StateExpenseQueryThree> getStateExpenseList() {
      if (stateExpenseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stateExpense_);
      } else {
        return stateExpenseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public int getStateExpenseCount() {
      if (stateExpenseBuilder_ == null) {
        return stateExpense_.size();
      } else {
        return stateExpenseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public com.assignment.grpc.StateExpenseQueryThree getStateExpense(int index) {
      if (stateExpenseBuilder_ == null) {
        return stateExpense_.get(index);
      } else {
        return stateExpenseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder setStateExpense(
        int index, com.assignment.grpc.StateExpenseQueryThree value) {
      if (stateExpenseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStateExpenseIsMutable();
        stateExpense_.set(index, value);
        onChanged();
      } else {
        stateExpenseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder setStateExpense(
        int index, com.assignment.grpc.StateExpenseQueryThree.Builder builderForValue) {
      if (stateExpenseBuilder_ == null) {
        ensureStateExpenseIsMutable();
        stateExpense_.set(index, builderForValue.build());
        onChanged();
      } else {
        stateExpenseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder addStateExpense(com.assignment.grpc.StateExpenseQueryThree value) {
      if (stateExpenseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStateExpenseIsMutable();
        stateExpense_.add(value);
        onChanged();
      } else {
        stateExpenseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder addStateExpense(
        int index, com.assignment.grpc.StateExpenseQueryThree value) {
      if (stateExpenseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStateExpenseIsMutable();
        stateExpense_.add(index, value);
        onChanged();
      } else {
        stateExpenseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder addStateExpense(
        com.assignment.grpc.StateExpenseQueryThree.Builder builderForValue) {
      if (stateExpenseBuilder_ == null) {
        ensureStateExpenseIsMutable();
        stateExpense_.add(builderForValue.build());
        onChanged();
      } else {
        stateExpenseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder addStateExpense(
        int index, com.assignment.grpc.StateExpenseQueryThree.Builder builderForValue) {
      if (stateExpenseBuilder_ == null) {
        ensureStateExpenseIsMutable();
        stateExpense_.add(index, builderForValue.build());
        onChanged();
      } else {
        stateExpenseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder addAllStateExpense(
        java.lang.Iterable<? extends com.assignment.grpc.StateExpenseQueryThree> values) {
      if (stateExpenseBuilder_ == null) {
        ensureStateExpenseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stateExpense_);
        onChanged();
      } else {
        stateExpenseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder clearStateExpense() {
      if (stateExpenseBuilder_ == null) {
        stateExpense_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stateExpenseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public Builder removeStateExpense(int index) {
      if (stateExpenseBuilder_ == null) {
        ensureStateExpenseIsMutable();
        stateExpense_.remove(index);
        onChanged();
      } else {
        stateExpenseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public com.assignment.grpc.StateExpenseQueryThree.Builder getStateExpenseBuilder(
        int index) {
      return getStateExpenseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public com.assignment.grpc.StateExpenseQueryThreeOrBuilder getStateExpenseOrBuilder(
        int index) {
      if (stateExpenseBuilder_ == null) {
        return stateExpense_.get(index);  } else {
        return stateExpenseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public java.util.List<? extends com.assignment.grpc.StateExpenseQueryThreeOrBuilder> 
         getStateExpenseOrBuilderList() {
      if (stateExpenseBuilder_ != null) {
        return stateExpenseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stateExpense_);
      }
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public com.assignment.grpc.StateExpenseQueryThree.Builder addStateExpenseBuilder() {
      return getStateExpenseFieldBuilder().addBuilder(
          com.assignment.grpc.StateExpenseQueryThree.getDefaultInstance());
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public com.assignment.grpc.StateExpenseQueryThree.Builder addStateExpenseBuilder(
        int index) {
      return getStateExpenseFieldBuilder().addBuilder(
          index, com.assignment.grpc.StateExpenseQueryThree.getDefaultInstance());
    }
    /**
     * <code>repeated .StateExpenseQueryThree state_expense = 1;</code>
     */
    public java.util.List<com.assignment.grpc.StateExpenseQueryThree.Builder> 
         getStateExpenseBuilderList() {
      return getStateExpenseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.assignment.grpc.StateExpenseQueryThree, com.assignment.grpc.StateExpenseQueryThree.Builder, com.assignment.grpc.StateExpenseQueryThreeOrBuilder> 
        getStateExpenseFieldBuilder() {
      if (stateExpenseBuilder_ == null) {
        stateExpenseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.assignment.grpc.StateExpenseQueryThree, com.assignment.grpc.StateExpenseQueryThree.Builder, com.assignment.grpc.StateExpenseQueryThreeOrBuilder>(
                stateExpense_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stateExpense_ = null;
      }
      return stateExpenseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:QueryThreeResponse)
  }

  // @@protoc_insertion_point(class_scope:QueryThreeResponse)
  private static final com.assignment.grpc.QueryThreeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assignment.grpc.QueryThreeResponse();
  }

  public static com.assignment.grpc.QueryThreeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryThreeResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryThreeResponse>() {
    @java.lang.Override
    public QueryThreeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryThreeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryThreeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assignment.grpc.QueryThreeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

