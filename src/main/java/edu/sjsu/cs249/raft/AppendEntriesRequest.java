// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package edu.sjsu.cs249.raft;

/**
 * Protobuf type {@code raft.AppendEntriesRequest}
 */
public  final class AppendEntriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:raft.AppendEntriesRequest)
    AppendEntriesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppendEntriesRequest.newBuilder() to construct.
  private AppendEntriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppendEntriesRequest() {
    term_ = 0L;
    leaderId_ = 0;
    prevLogIndex_ = 0L;
    prevLogTerm_ = 0L;
    leaderCommit_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppendEntriesRequest(
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

            term_ = input.readUInt64();
            break;
          }
          case 16: {

            leaderId_ = input.readUInt32();
            break;
          }
          case 24: {

            prevLogIndex_ = input.readUInt64();
            break;
          }
          case 32: {

            prevLogTerm_ = input.readUInt64();
            break;
          }
          case 42: {
            edu.sjsu.cs249.raft.Entry.Builder subBuilder = null;
            if (entry_ != null) {
              subBuilder = entry_.toBuilder();
            }
            entry_ = input.readMessage(edu.sjsu.cs249.raft.Entry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entry_);
              entry_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {

            leaderCommit_ = input.readUInt64();
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
    return edu.sjsu.cs249.raft.Raft.internal_static_raft_AppendEntriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.sjsu.cs249.raft.Raft.internal_static_raft_AppendEntriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.sjsu.cs249.raft.AppendEntriesRequest.class, edu.sjsu.cs249.raft.AppendEntriesRequest.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private long term_;
  /**
   * <code>uint64 term = 1;</code>
   */
  public long getTerm() {
    return term_;
  }

  public static final int LEADERID_FIELD_NUMBER = 2;
  private int leaderId_;
  /**
   * <code>uint32 leaderId = 2;</code>
   */
  public int getLeaderId() {
    return leaderId_;
  }

  public static final int PREVLOGINDEX_FIELD_NUMBER = 3;
  private long prevLogIndex_;
  /**
   * <code>uint64 prevLogIndex = 3;</code>
   */
  public long getPrevLogIndex() {
    return prevLogIndex_;
  }

  public static final int PREVLOGTERM_FIELD_NUMBER = 4;
  private long prevLogTerm_;
  /**
   * <code>uint64 prevLogTerm = 4;</code>
   */
  public long getPrevLogTerm() {
    return prevLogTerm_;
  }

  public static final int ENTRY_FIELD_NUMBER = 5;
  private edu.sjsu.cs249.raft.Entry entry_;
  /**
   * <code>.raft.Entry entry = 5;</code>
   */
  public boolean hasEntry() {
    return entry_ != null;
  }
  /**
   * <code>.raft.Entry entry = 5;</code>
   */
  public edu.sjsu.cs249.raft.Entry getEntry() {
    return entry_ == null ? edu.sjsu.cs249.raft.Entry.getDefaultInstance() : entry_;
  }
  /**
   * <code>.raft.Entry entry = 5;</code>
   */
  public edu.sjsu.cs249.raft.EntryOrBuilder getEntryOrBuilder() {
    return getEntry();
  }

  public static final int LEADERCOMMIT_FIELD_NUMBER = 6;
  private long leaderCommit_;
  /**
   * <code>uint64 leaderCommit = 6;</code>
   */
  public long getLeaderCommit() {
    return leaderCommit_;
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
    if (term_ != 0L) {
      output.writeUInt64(1, term_);
    }
    if (leaderId_ != 0) {
      output.writeUInt32(2, leaderId_);
    }
    if (prevLogIndex_ != 0L) {
      output.writeUInt64(3, prevLogIndex_);
    }
    if (prevLogTerm_ != 0L) {
      output.writeUInt64(4, prevLogTerm_);
    }
    if (entry_ != null) {
      output.writeMessage(5, getEntry());
    }
    if (leaderCommit_ != 0L) {
      output.writeUInt64(6, leaderCommit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (term_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, term_);
    }
    if (leaderId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, leaderId_);
    }
    if (prevLogIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, prevLogIndex_);
    }
    if (prevLogTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, prevLogTerm_);
    }
    if (entry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getEntry());
    }
    if (leaderCommit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, leaderCommit_);
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
    if (!(obj instanceof edu.sjsu.cs249.raft.AppendEntriesRequest)) {
      return super.equals(obj);
    }
    edu.sjsu.cs249.raft.AppendEntriesRequest other = (edu.sjsu.cs249.raft.AppendEntriesRequest) obj;

    boolean result = true;
    result = result && (getTerm()
        == other.getTerm());
    result = result && (getLeaderId()
        == other.getLeaderId());
    result = result && (getPrevLogIndex()
        == other.getPrevLogIndex());
    result = result && (getPrevLogTerm()
        == other.getPrevLogTerm());
    result = result && (hasEntry() == other.hasEntry());
    if (hasEntry()) {
      result = result && getEntry()
          .equals(other.getEntry());
    }
    result = result && (getLeaderCommit()
        == other.getLeaderCommit());
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTerm());
    hash = (37 * hash) + LEADERID_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderId();
    hash = (37 * hash) + PREVLOGINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrevLogIndex());
    hash = (37 * hash) + PREVLOGTERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrevLogTerm());
    if (hasEntry()) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntry().hashCode();
    }
    hash = (37 * hash) + LEADERCOMMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLeaderCommit());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.raft.AppendEntriesRequest parseFrom(
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
  public static Builder newBuilder(edu.sjsu.cs249.raft.AppendEntriesRequest prototype) {
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
   * Protobuf type {@code raft.AppendEntriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:raft.AppendEntriesRequest)
      edu.sjsu.cs249.raft.AppendEntriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.sjsu.cs249.raft.Raft.internal_static_raft_AppendEntriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.sjsu.cs249.raft.Raft.internal_static_raft_AppendEntriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.sjsu.cs249.raft.AppendEntriesRequest.class, edu.sjsu.cs249.raft.AppendEntriesRequest.Builder.class);
    }

    // Construct using edu.sjsu.cs249.raft.AppendEntriesRequest.newBuilder()
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
      term_ = 0L;

      leaderId_ = 0;

      prevLogIndex_ = 0L;

      prevLogTerm_ = 0L;

      if (entryBuilder_ == null) {
        entry_ = null;
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }
      leaderCommit_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.sjsu.cs249.raft.Raft.internal_static_raft_AppendEntriesRequest_descriptor;
    }

    @java.lang.Override
    public edu.sjsu.cs249.raft.AppendEntriesRequest getDefaultInstanceForType() {
      return edu.sjsu.cs249.raft.AppendEntriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public edu.sjsu.cs249.raft.AppendEntriesRequest build() {
      edu.sjsu.cs249.raft.AppendEntriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.sjsu.cs249.raft.AppendEntriesRequest buildPartial() {
      edu.sjsu.cs249.raft.AppendEntriesRequest result = new edu.sjsu.cs249.raft.AppendEntriesRequest(this);
      result.term_ = term_;
      result.leaderId_ = leaderId_;
      result.prevLogIndex_ = prevLogIndex_;
      result.prevLogTerm_ = prevLogTerm_;
      if (entryBuilder_ == null) {
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
      }
      result.leaderCommit_ = leaderCommit_;
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
      if (other instanceof edu.sjsu.cs249.raft.AppendEntriesRequest) {
        return mergeFrom((edu.sjsu.cs249.raft.AppendEntriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.sjsu.cs249.raft.AppendEntriesRequest other) {
      if (other == edu.sjsu.cs249.raft.AppendEntriesRequest.getDefaultInstance()) return this;
      if (other.getTerm() != 0L) {
        setTerm(other.getTerm());
      }
      if (other.getLeaderId() != 0) {
        setLeaderId(other.getLeaderId());
      }
      if (other.getPrevLogIndex() != 0L) {
        setPrevLogIndex(other.getPrevLogIndex());
      }
      if (other.getPrevLogTerm() != 0L) {
        setPrevLogTerm(other.getPrevLogTerm());
      }
      if (other.hasEntry()) {
        mergeEntry(other.getEntry());
      }
      if (other.getLeaderCommit() != 0L) {
        setLeaderCommit(other.getLeaderCommit());
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
      edu.sjsu.cs249.raft.AppendEntriesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.sjsu.cs249.raft.AppendEntriesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long term_ ;
    /**
     * <code>uint64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }
    /**
     * <code>uint64 term = 1;</code>
     */
    public Builder setTerm(long value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 term = 1;</code>
     */
    public Builder clearTerm() {
      
      term_ = 0L;
      onChanged();
      return this;
    }

    private int leaderId_ ;
    /**
     * <code>uint32 leaderId = 2;</code>
     */
    public int getLeaderId() {
      return leaderId_;
    }
    /**
     * <code>uint32 leaderId = 2;</code>
     */
    public Builder setLeaderId(int value) {
      
      leaderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 leaderId = 2;</code>
     */
    public Builder clearLeaderId() {
      
      leaderId_ = 0;
      onChanged();
      return this;
    }

    private long prevLogIndex_ ;
    /**
     * <code>uint64 prevLogIndex = 3;</code>
     */
    public long getPrevLogIndex() {
      return prevLogIndex_;
    }
    /**
     * <code>uint64 prevLogIndex = 3;</code>
     */
    public Builder setPrevLogIndex(long value) {
      
      prevLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 prevLogIndex = 3;</code>
     */
    public Builder clearPrevLogIndex() {
      
      prevLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private long prevLogTerm_ ;
    /**
     * <code>uint64 prevLogTerm = 4;</code>
     */
    public long getPrevLogTerm() {
      return prevLogTerm_;
    }
    /**
     * <code>uint64 prevLogTerm = 4;</code>
     */
    public Builder setPrevLogTerm(long value) {
      
      prevLogTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 prevLogTerm = 4;</code>
     */
    public Builder clearPrevLogTerm() {
      
      prevLogTerm_ = 0L;
      onChanged();
      return this;
    }

    private edu.sjsu.cs249.raft.Entry entry_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        edu.sjsu.cs249.raft.Entry, edu.sjsu.cs249.raft.Entry.Builder, edu.sjsu.cs249.raft.EntryOrBuilder> entryBuilder_;
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public boolean hasEntry() {
      return entryBuilder_ != null || entry_ != null;
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public edu.sjsu.cs249.raft.Entry getEntry() {
      if (entryBuilder_ == null) {
        return entry_ == null ? edu.sjsu.cs249.raft.Entry.getDefaultInstance() : entry_;
      } else {
        return entryBuilder_.getMessage();
      }
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public Builder setEntry(edu.sjsu.cs249.raft.Entry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        entryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public Builder setEntry(
        edu.sjsu.cs249.raft.Entry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        entryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public Builder mergeEntry(edu.sjsu.cs249.raft.Entry value) {
      if (entryBuilder_ == null) {
        if (entry_ != null) {
          entry_ =
            edu.sjsu.cs249.raft.Entry.newBuilder(entry_).mergeFrom(value).buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        entryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = null;
        onChanged();
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public edu.sjsu.cs249.raft.Entry.Builder getEntryBuilder() {
      
      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    public edu.sjsu.cs249.raft.EntryOrBuilder getEntryOrBuilder() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilder();
      } else {
        return entry_ == null ?
            edu.sjsu.cs249.raft.Entry.getDefaultInstance() : entry_;
      }
    }
    /**
     * <code>.raft.Entry entry = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        edu.sjsu.cs249.raft.Entry, edu.sjsu.cs249.raft.Entry.Builder, edu.sjsu.cs249.raft.EntryOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            edu.sjsu.cs249.raft.Entry, edu.sjsu.cs249.raft.Entry.Builder, edu.sjsu.cs249.raft.EntryOrBuilder>(
                getEntry(),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
    }

    private long leaderCommit_ ;
    /**
     * <code>uint64 leaderCommit = 6;</code>
     */
    public long getLeaderCommit() {
      return leaderCommit_;
    }
    /**
     * <code>uint64 leaderCommit = 6;</code>
     */
    public Builder setLeaderCommit(long value) {
      
      leaderCommit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 leaderCommit = 6;</code>
     */
    public Builder clearLeaderCommit() {
      
      leaderCommit_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:raft.AppendEntriesRequest)
  }

  // @@protoc_insertion_point(class_scope:raft.AppendEntriesRequest)
  private static final edu.sjsu.cs249.raft.AppendEntriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.sjsu.cs249.raft.AppendEntriesRequest();
  }

  public static edu.sjsu.cs249.raft.AppendEntriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppendEntriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<AppendEntriesRequest>() {
    @java.lang.Override
    public AppendEntriesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppendEntriesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppendEntriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppendEntriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.sjsu.cs249.raft.AppendEntriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
