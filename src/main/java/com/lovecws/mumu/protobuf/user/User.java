// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.lovecws.mumu.protobuf.user;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lovecws_mumu_protobuf_user_AppUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lovecws_mumu_protobuf_user_AppUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\036com.lovecws.mumu.protobuf." +
      "user\"\327\001\n\007AppUser\022\016\n\006userId\030\001 \001(\003\022\020\n\010user" +
      "Name\030\002 \001(\t\022\024\n\014userPassword\030\003 \001(\t\0228\n\007sexT" +
      "ype\030\004 \001(\0162\'.com.lovecws.mumu.protobuf.us" +
      "er.SexType\022\021\n\tuserPhone\030\005 \001(\t\022\021\n\tuserEma" +
      "il\030\006 \001(\t\022\024\n\014userBirthday\030\007 \001(\t\022\020\n\010userAr" +
      "ea\030\010 \001(\003\022\014\n\004sign\030\t \001(\t*+\n\007SexType\022\010\n\004MAL" +
      "E\020\000\022\n\n\006FEMALE\020\001\022\n\n\006UNKNOW\020\002B\"\n\036com.lovec" +
      "ws.mumu.protobuf.userP\001b\006proto3"
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
    internal_static_com_lovecws_mumu_protobuf_user_AppUser_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_lovecws_mumu_protobuf_user_AppUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lovecws_mumu_protobuf_user_AppUser_descriptor,
        new java.lang.String[] { "UserId", "UserName", "UserPassword", "SexType", "UserPhone", "UserEmail", "UserBirthday", "UserArea", "Sign", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}