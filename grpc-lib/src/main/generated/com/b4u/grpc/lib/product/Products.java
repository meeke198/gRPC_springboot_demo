// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.b4u.grpc.lib.product;

/**
 * Protobuf type {@code Products}
 */
public  final class Products extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Products)
    ProductsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Products.newBuilder() to construct.
  private Products(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Products() {
    product_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Products();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Products(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              product_ = new java.util.ArrayList<com.b4u.grpc.lib.product.ProductResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            product_.add(
                input.readMessage(com.b4u.grpc.lib.product.ProductResponse.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        product_ = java.util.Collections.unmodifiableList(product_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.b4u.grpc.lib.product.ProductProto.internal_static_Products_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.b4u.grpc.lib.product.ProductProto.internal_static_Products_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.b4u.grpc.lib.product.Products.class, com.b4u.grpc.lib.product.Products.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private java.util.List<com.b4u.grpc.lib.product.ProductResponse> product_;
  /**
   * <code>repeated .ProductResponse product = 1;</code>
   */
  public java.util.List<com.b4u.grpc.lib.product.ProductResponse> getProductList() {
    return product_;
  }
  /**
   * <code>repeated .ProductResponse product = 1;</code>
   */
  public java.util.List<? extends com.b4u.grpc.lib.product.ProductResponseOrBuilder> 
      getProductOrBuilderList() {
    return product_;
  }
  /**
   * <code>repeated .ProductResponse product = 1;</code>
   */
  public int getProductCount() {
    return product_.size();
  }
  /**
   * <code>repeated .ProductResponse product = 1;</code>
   */
  public com.b4u.grpc.lib.product.ProductResponse getProduct(int index) {
    return product_.get(index);
  }
  /**
   * <code>repeated .ProductResponse product = 1;</code>
   */
  public com.b4u.grpc.lib.product.ProductResponseOrBuilder getProductOrBuilder(
      int index) {
    return product_.get(index);
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
    for (int i = 0; i < product_.size(); i++) {
      output.writeMessage(1, product_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < product_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, product_.get(i));
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
    if (!(obj instanceof com.b4u.grpc.lib.product.Products)) {
      return super.equals(obj);
    }
    com.b4u.grpc.lib.product.Products other = (com.b4u.grpc.lib.product.Products) obj;

    if (!getProductList()
        .equals(other.getProductList())) return false;
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
    if (getProductCount() > 0) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProductList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.b4u.grpc.lib.product.Products parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.b4u.grpc.lib.product.Products parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.b4u.grpc.lib.product.Products parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.b4u.grpc.lib.product.Products parseFrom(
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
  public static Builder newBuilder(com.b4u.grpc.lib.product.Products prototype) {
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
   * Protobuf type {@code Products}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Products)
      com.b4u.grpc.lib.product.ProductsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.b4u.grpc.lib.product.ProductProto.internal_static_Products_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.b4u.grpc.lib.product.ProductProto.internal_static_Products_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.b4u.grpc.lib.product.Products.class, com.b4u.grpc.lib.product.Products.Builder.class);
    }

    // Construct using com.b4u.grpc.lib.product.Products.newBuilder()
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
        getProductFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productBuilder_ == null) {
        product_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.b4u.grpc.lib.product.ProductProto.internal_static_Products_descriptor;
    }

    @java.lang.Override
    public com.b4u.grpc.lib.product.Products getDefaultInstanceForType() {
      return com.b4u.grpc.lib.product.Products.getDefaultInstance();
    }

    @java.lang.Override
    public com.b4u.grpc.lib.product.Products build() {
      com.b4u.grpc.lib.product.Products result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.b4u.grpc.lib.product.Products buildPartial() {
      com.b4u.grpc.lib.product.Products result = new com.b4u.grpc.lib.product.Products(this);
      int from_bitField0_ = bitField0_;
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          product_ = java.util.Collections.unmodifiableList(product_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
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
      if (other instanceof com.b4u.grpc.lib.product.Products) {
        return mergeFrom((com.b4u.grpc.lib.product.Products)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.b4u.grpc.lib.product.Products other) {
      if (other == com.b4u.grpc.lib.product.Products.getDefaultInstance()) return this;
      if (productBuilder_ == null) {
        if (!other.product_.isEmpty()) {
          if (product_.isEmpty()) {
            product_ = other.product_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductIsMutable();
            product_.addAll(other.product_);
          }
          onChanged();
        }
      } else {
        if (!other.product_.isEmpty()) {
          if (productBuilder_.isEmpty()) {
            productBuilder_.dispose();
            productBuilder_ = null;
            product_ = other.product_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductFieldBuilder() : null;
          } else {
            productBuilder_.addAllMessages(other.product_);
          }
        }
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
      com.b4u.grpc.lib.product.Products parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.b4u.grpc.lib.product.Products) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.b4u.grpc.lib.product.ProductResponse> product_ =
      java.util.Collections.emptyList();
    private void ensureProductIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        product_ = new java.util.ArrayList<com.b4u.grpc.lib.product.ProductResponse>(product_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.b4u.grpc.lib.product.ProductResponse, com.b4u.grpc.lib.product.ProductResponse.Builder, com.b4u.grpc.lib.product.ProductResponseOrBuilder> productBuilder_;

    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public java.util.List<com.b4u.grpc.lib.product.ProductResponse> getProductList() {
      if (productBuilder_ == null) {
        return java.util.Collections.unmodifiableList(product_);
      } else {
        return productBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public int getProductCount() {
      if (productBuilder_ == null) {
        return product_.size();
      } else {
        return productBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public com.b4u.grpc.lib.product.ProductResponse getProduct(int index) {
      if (productBuilder_ == null) {
        return product_.get(index);
      } else {
        return productBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder setProduct(
        int index, com.b4u.grpc.lib.product.ProductResponse value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.set(index, value);
        onChanged();
      } else {
        productBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder setProduct(
        int index, com.b4u.grpc.lib.product.ProductResponse.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.set(index, builderForValue.build());
        onChanged();
      } else {
        productBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder addProduct(com.b4u.grpc.lib.product.ProductResponse value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.add(value);
        onChanged();
      } else {
        productBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder addProduct(
        int index, com.b4u.grpc.lib.product.ProductResponse value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.add(index, value);
        onChanged();
      } else {
        productBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder addProduct(
        com.b4u.grpc.lib.product.ProductResponse.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.add(builderForValue.build());
        onChanged();
      } else {
        productBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder addProduct(
        int index, com.b4u.grpc.lib.product.ProductResponse.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.add(index, builderForValue.build());
        onChanged();
      } else {
        productBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder addAllProduct(
        java.lang.Iterable<? extends com.b4u.grpc.lib.product.ProductResponse> values) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, product_);
        onChanged();
      } else {
        productBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public Builder removeProduct(int index) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.remove(index);
        onChanged();
      } else {
        productBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public com.b4u.grpc.lib.product.ProductResponse.Builder getProductBuilder(
        int index) {
      return getProductFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public com.b4u.grpc.lib.product.ProductResponseOrBuilder getProductOrBuilder(
        int index) {
      if (productBuilder_ == null) {
        return product_.get(index);  } else {
        return productBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public java.util.List<? extends com.b4u.grpc.lib.product.ProductResponseOrBuilder> 
         getProductOrBuilderList() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(product_);
      }
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public com.b4u.grpc.lib.product.ProductResponse.Builder addProductBuilder() {
      return getProductFieldBuilder().addBuilder(
          com.b4u.grpc.lib.product.ProductResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public com.b4u.grpc.lib.product.ProductResponse.Builder addProductBuilder(
        int index) {
      return getProductFieldBuilder().addBuilder(
          index, com.b4u.grpc.lib.product.ProductResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .ProductResponse product = 1;</code>
     */
    public java.util.List<com.b4u.grpc.lib.product.ProductResponse.Builder> 
         getProductBuilderList() {
      return getProductFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.b4u.grpc.lib.product.ProductResponse, com.b4u.grpc.lib.product.ProductResponse.Builder, com.b4u.grpc.lib.product.ProductResponseOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.b4u.grpc.lib.product.ProductResponse, com.b4u.grpc.lib.product.ProductResponse.Builder, com.b4u.grpc.lib.product.ProductResponseOrBuilder>(
                product_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Products)
  }

  // @@protoc_insertion_point(class_scope:Products)
  private static final com.b4u.grpc.lib.product.Products DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.b4u.grpc.lib.product.Products();
  }

  public static com.b4u.grpc.lib.product.Products getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Products>
      PARSER = new com.google.protobuf.AbstractParser<Products>() {
    @java.lang.Override
    public Products parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Products(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Products> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Products> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.b4u.grpc.lib.product.Products getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

