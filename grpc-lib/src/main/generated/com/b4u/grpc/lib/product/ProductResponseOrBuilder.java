// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.b4u.grpc.lib.product;

public interface ProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 productId = 1;</code>
   * @return The productId.
   */
  int getProductId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 price = 3;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>int32 quantity = 4;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
