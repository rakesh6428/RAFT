// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package edu.sjsu.cs249.raft;

public interface ClientAppendResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:raft.ClientAppendResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 0 means success, 1 means not the leader
   * </pre>
   *
   * <code>uint32 rc = 1;</code>
   */
  int getRc();

  /**
   * <code>uint64 leader = 2;</code>
   */
  long getLeader();

  /**
   * <code>uint64 index = 3;</code>
   */
  long getIndex();
}