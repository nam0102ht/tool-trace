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
    internal_static_serverpakage_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serverpakage_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serverpakage_Log_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serverpakage_Log_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tlog.proto\022\014serverpakage\"\032\n\007Command\022\017\n\007" +
      "command\030\001 \001(\t\"\022\n\003Log\022\013\n\003log\030\001 \001(\t2\357\002\n\006Ca" +
      "tLog\022:\n\nCommand148\022\025.serverpakage.Comman" +
      "d\032\021.serverpakage.Log\"\000(\001\022:\n\nCommand218\022\025" +
      ".serverpakage.Command\032\021.serverpakage.Log" +
      "\"\000(\001\022:\n\nCommand232\022\025.serverpakage.Comman" +
      "d\032\021.serverpakage.Log\"\000(\001\022:\n\nCommand108\022\025" +
      ".serverpakage.Command\032\021.serverpakage.Log" +
      "\"\000(\001\022:\n\nCommand102\022\025.serverpakage.Comman" +
      "d\032\021.serverpakage.Log\"\000(\001\0229\n\tCommand12\022\025.",
      "serverpakage.Command\032\021.serverpakage.Log\"" +
      "\000(\001B \n\020com.mservice.genB\nGrpcServerP\001b\006p" +
      "roto3"
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
    internal_static_serverpakage_Command_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_serverpakage_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serverpakage_Command_descriptor,
        new java.lang.String[] { "Command", });
    internal_static_serverpakage_Log_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_serverpakage_Log_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serverpakage_Log_descriptor,
        new java.lang.String[] { "Log", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
