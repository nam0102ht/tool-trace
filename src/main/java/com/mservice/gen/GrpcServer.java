// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log.proto

package com.mservice.gen;

public final class GrpcServer {
  private GrpcServer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mservice_gen_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mservice_gen_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mservice_gen_Log_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mservice_gen_Log_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tlog.proto\022\020com.mservice.gen\"\032\n\007Command" +
      "\022\017\n\007command\030\001 \001(\t\"\022\n\003Log\022\013\n\003log\030\001 \001(\t2\237\003" +
      "\n\006CatLog\022B\n\nCommand148\022\031.com.mservice.ge" +
      "n.Command\032\025.com.mservice.gen.Log\"\0000\001\022B\n\n" +
      "Command218\022\031.com.mservice.gen.Command\032\025." +
      "com.mservice.gen.Log\"\0000\001\022B\n\nCommand232\022\031" +
      ".com.mservice.gen.Command\032\025.com.mservice" +
      ".gen.Log\"\0000\001\022B\n\nCommand108\022\031.com.mservic" +
      "e.gen.Command\032\025.com.mservice.gen.Log\"\0000\001" +
      "\022B\n\nCommand102\022\031.com.mservice.gen.Comman",
      "d\032\025.com.mservice.gen.Log\"\0000\001\022A\n\tCommand1" +
      "2\022\031.com.mservice.gen.Command\032\025.com.mserv" +
      "ice.gen.Log\"\0000\001B \n\020com.mservice.genB\nGrp" +
      "cServerP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_mservice_gen_Command_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_mservice_gen_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mservice_gen_Command_descriptor,
        new java.lang.String[] { "Command", });
    internal_static_com_mservice_gen_Log_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_mservice_gen_Log_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mservice_gen_Log_descriptor,
        new java.lang.String[] { "Log", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}