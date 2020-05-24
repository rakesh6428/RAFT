// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package edu.sjsu.cs249.raft;

/**
 * Protobuf type {@code raft.ClientRequestIndexRequest}
 */
public  final class ClientRequestIndexRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:raft.ClientRequestIndexRequest)
    ClientRequestIndexRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientRequestIndexRequest.newBuilder() to construct.
  private ClientRequestIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientRequestIndexRequest() {
    index_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientRequestIndexRequest(
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
          case 8: {

            index_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return edu.sjsu.cs249.raft.Raft.internal_static_raft_ClientRequestIndexRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.sjsu.cs249.raft.Raft.internal_static_raft_ClientRequestIndexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.sjsu.cs249.raft.ClientRequestIndexRequest.class, edu.sjsu.cs249.raft.ClientRequestIndexRequest.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private long index_;
  /**
   * <code>uint64 index = 1;</code>
   */
  public long getIndex() {
    return index_;
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
    if (index_ != 0L) {
      output.writeUInt64(1, index_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, index_);
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
    if (!(obj instanceof edu.sjsu.cs249.raft.ClientRequestIndexRequest)) {
      return super.equals(obj);
    }
    edu.sjsu.cs249.raft.ClientRequestIndexRequest other = (edu.sjsu.cs249.raft.ClientRequestIndexRequest) obj;

    boolean result = true;
    result = result && (getIndex()
        == other.getIndex());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest parseFrom(
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
  public static Builder newBuilder(edu.sjsu.cs249.raft.ClientRequestIndexRequest prototype) {
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
   * Protobuf type {@code raft.ClientRequestIndexRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:raft.ClientRequestIndexRequest)
      edu.sjsu.cs249.raft.ClientRequestIndexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.sjsu.cs249.raft.Raft.internal_static_raft_ClientRequestIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.sjsu.cs249.raft.Raft.internal_static_raft_ClientRequestIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.sjsu.cs249.raft.ClientRequestIndexRequest.class, edu.sjsu.cs249.raft.ClientRequestIndexRequest.Builder.class);
    }

    // Construct using edu.sjsu.cs249.raft.ClientRequestIndexRequest.newBuilder()
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
      index_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.sjsu.cs249.raft.Raft.internal_static_raft_ClientRequestIndexRequest_descriptor;
    }

    @java.lang.Override
    public edu.sjsu.cs249.raft.ClientRequestIndexRequest getDefaultInstanceForType() {
      return edu.sjsu.cs249.raft.ClientRequestIndexRequest.getDefaultInstance();
    }

    @java.lang.Override
    public edu.sjsu.cs249.raft.ClientRequestIndexRequest build() {
      edu.sjsu.cs249.raft.ClientRequestIndexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.sjsu.cs249.raft.ClientRequestIndexRequest buildPartial() {
      edu.sjsu.cs249.raft.ClientRequestIndexRequest result = new edu.sjsu.cs249.raft.ClientRequestIndexRequest(this);
      result.index_ = index_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.sjsu.cs249.raft.ClientRequestIndexRequest) {
        return mergeFrom((edu.sjsu.cs249.raft.ClientRequestIndexRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.sjsu.cs249.raft.ClientRequestIndexRequest other) {
      if (other == edu.sjsu.cs249.raft.ClientRequestIndexRequest.getDefaultInstance()) return this;
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
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
      edu.sjsu.cs249.raft.ClientRequestIndexRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.sjsu.cs249.raft.ClientRequestIndexRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long index_ ;
    /**
     * <code>uint64 index = 1;</code>
     */
    public long getIndex() {
      return index_;
    }
    /**
     * <code>uint64 index = 1;</code>
     */
    public Builder setIndex(long value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 index = 1;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:raft.ClientRequestIndexRequest)
  }

  // @@protoc_insertion_point(class_scope:raft.ClientRequestIndexRequest)
  private static final edu.sjsu.cs249.raft.ClientRequestIndexRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.sjsu.cs249.raft.ClientRequestIndexRequest();
  }

  public static edu.sjsu.cs249.raft.ClientRequestIndexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientRequestIndexRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClientRequestIndexRequest>() {
    @java.lang.Override
    public ClientRequestIndexRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientRequestIndexRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientRequestIndexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientRequestIndexRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.sjsu.cs249.raft.ClientRequestIndexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

