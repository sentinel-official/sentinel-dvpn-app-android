// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/plan/v2/genesis.proto

package sentinel.plan.v2;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisPlanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.plan.v2.GenesisPlan)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the plan field is set.
     */
    boolean hasPlan();
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
     * @return The plan.
     */
    sentinel.plan.v2.PlanOuterClass.Plan getPlan();
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
     */
    sentinel.plan.v2.PlanOuterClass.PlanOrBuilder getPlanOrBuilder();

    /**
     * <code>repeated string nodes = 2;</code>
     * @return A list containing the nodes.
     */
    java.util.List<java.lang.String>
        getNodesList();
    /**
     * <code>repeated string nodes = 2;</code>
     * @return The count of nodes.
     */
    int getNodesCount();
    /**
     * <code>repeated string nodes = 2;</code>
     * @param index The index of the element to return.
     * @return The nodes at the given index.
     */
    java.lang.String getNodes(int index);
    /**
     * <code>repeated string nodes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the nodes at the given index.
     */
    com.google.protobuf.ByteString
        getNodesBytes(int index);
  }
  /**
   * Protobuf type {@code sentinel.plan.v2.GenesisPlan}
   */
  public static final class GenesisPlan extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.plan.v2.GenesisPlan)
      GenesisPlanOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisPlan.newBuilder() to construct.
    private GenesisPlan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisPlan() {
      nodes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisPlan();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sentinel.plan.v2.Genesis.internal_static_sentinel_plan_v2_GenesisPlan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.plan.v2.Genesis.internal_static_sentinel_plan_v2_GenesisPlan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.plan.v2.Genesis.GenesisPlan.class, sentinel.plan.v2.Genesis.GenesisPlan.Builder.class);
    }

    public static final int PLAN_FIELD_NUMBER = 1;
    private sentinel.plan.v2.PlanOuterClass.Plan plan_;
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the plan field is set.
     */
    @java.lang.Override
    public boolean hasPlan() {
      return plan_ != null;
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
     * @return The plan.
     */
    @java.lang.Override
    public sentinel.plan.v2.PlanOuterClass.Plan getPlan() {
      return plan_ == null ? sentinel.plan.v2.PlanOuterClass.Plan.getDefaultInstance() : plan_;
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public sentinel.plan.v2.PlanOuterClass.PlanOrBuilder getPlanOrBuilder() {
      return plan_ == null ? sentinel.plan.v2.PlanOuterClass.Plan.getDefaultInstance() : plan_;
    }

    public static final int NODES_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList nodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string nodes = 2;</code>
     * @return A list containing the nodes.
     */
    public com.google.protobuf.ProtocolStringList
        getNodesList() {
      return nodes_;
    }
    /**
     * <code>repeated string nodes = 2;</code>
     * @return The count of nodes.
     */
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     * <code>repeated string nodes = 2;</code>
     * @param index The index of the element to return.
     * @return The nodes at the given index.
     */
    public java.lang.String getNodes(int index) {
      return nodes_.get(index);
    }
    /**
     * <code>repeated string nodes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the nodes at the given index.
     */
    public com.google.protobuf.ByteString
        getNodesBytes(int index) {
      return nodes_.getByteString(index);
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
      if (plan_ != null) {
        output.writeMessage(1, getPlan());
      }
      for (int i = 0; i < nodes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nodes_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (plan_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPlan());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < nodes_.size(); i++) {
          dataSize += computeStringSizeNoTag(nodes_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getNodesList().size();
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
      if (!(obj instanceof sentinel.plan.v2.Genesis.GenesisPlan)) {
        return super.equals(obj);
      }
      sentinel.plan.v2.Genesis.GenesisPlan other = (sentinel.plan.v2.Genesis.GenesisPlan) obj;

      if (hasPlan() != other.hasPlan()) return false;
      if (hasPlan()) {
        if (!getPlan()
            .equals(other.getPlan())) return false;
      }
      if (!getNodesList()
          .equals(other.getNodesList())) return false;
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
      if (hasPlan()) {
        hash = (37 * hash) + PLAN_FIELD_NUMBER;
        hash = (53 * hash) + getPlan().hashCode();
      }
      if (getNodesCount() > 0) {
        hash = (37 * hash) + NODES_FIELD_NUMBER;
        hash = (53 * hash) + getNodesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static sentinel.plan.v2.Genesis.GenesisPlan parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static sentinel.plan.v2.Genesis.GenesisPlan parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.plan.v2.Genesis.GenesisPlan parseFrom(
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
    public static Builder newBuilder(sentinel.plan.v2.Genesis.GenesisPlan prototype) {
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
     * Protobuf type {@code sentinel.plan.v2.GenesisPlan}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.plan.v2.GenesisPlan)
        sentinel.plan.v2.Genesis.GenesisPlanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.plan.v2.Genesis.internal_static_sentinel_plan_v2_GenesisPlan_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.plan.v2.Genesis.internal_static_sentinel_plan_v2_GenesisPlan_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.plan.v2.Genesis.GenesisPlan.class, sentinel.plan.v2.Genesis.GenesisPlan.Builder.class);
      }

      // Construct using sentinel.plan.v2.Genesis.GenesisPlan.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        plan_ = null;
        if (planBuilder_ != null) {
          planBuilder_.dispose();
          planBuilder_ = null;
        }
        nodes_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.plan.v2.Genesis.internal_static_sentinel_plan_v2_GenesisPlan_descriptor;
      }

      @java.lang.Override
      public sentinel.plan.v2.Genesis.GenesisPlan getDefaultInstanceForType() {
        return sentinel.plan.v2.Genesis.GenesisPlan.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.plan.v2.Genesis.GenesisPlan build() {
        sentinel.plan.v2.Genesis.GenesisPlan result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.plan.v2.Genesis.GenesisPlan buildPartial() {
        sentinel.plan.v2.Genesis.GenesisPlan result = new sentinel.plan.v2.Genesis.GenesisPlan(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(sentinel.plan.v2.Genesis.GenesisPlan result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.plan_ = planBuilder_ == null
              ? plan_
              : planBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          nodes_.makeImmutable();
          result.nodes_ = nodes_;
        }
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
        if (other instanceof sentinel.plan.v2.Genesis.GenesisPlan) {
          return mergeFrom((sentinel.plan.v2.Genesis.GenesisPlan)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.plan.v2.Genesis.GenesisPlan other) {
        if (other == sentinel.plan.v2.Genesis.GenesisPlan.getDefaultInstance()) return this;
        if (other.hasPlan()) {
          mergePlan(other.getPlan());
        }
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ |= 0x00000002;
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
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
                input.readMessage(
                    getPlanFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNodesIsMutable();
                nodes_.add(s);
                break;
              } // case 18
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

      private sentinel.plan.v2.PlanOuterClass.Plan plan_;
      private com.google.protobuf.SingleFieldBuilderV3<
          sentinel.plan.v2.PlanOuterClass.Plan, sentinel.plan.v2.PlanOuterClass.Plan.Builder, sentinel.plan.v2.PlanOuterClass.PlanOrBuilder> planBuilder_;
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the plan field is set.
       */
      public boolean hasPlan() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       * @return The plan.
       */
      public sentinel.plan.v2.PlanOuterClass.Plan getPlan() {
        if (planBuilder_ == null) {
          return plan_ == null ? sentinel.plan.v2.PlanOuterClass.Plan.getDefaultInstance() : plan_;
        } else {
          return planBuilder_.getMessage();
        }
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setPlan(sentinel.plan.v2.PlanOuterClass.Plan value) {
        if (planBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          plan_ = value;
        } else {
          planBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setPlan(
          sentinel.plan.v2.PlanOuterClass.Plan.Builder builderForValue) {
        if (planBuilder_ == null) {
          plan_ = builderForValue.build();
        } else {
          planBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergePlan(sentinel.plan.v2.PlanOuterClass.Plan value) {
        if (planBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            plan_ != null &&
            plan_ != sentinel.plan.v2.PlanOuterClass.Plan.getDefaultInstance()) {
            getPlanBuilder().mergeFrom(value);
          } else {
            plan_ = value;
          }
        } else {
          planBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearPlan() {
        bitField0_ = (bitField0_ & ~0x00000001);
        plan_ = null;
        if (planBuilder_ != null) {
          planBuilder_.dispose();
          planBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      public sentinel.plan.v2.PlanOuterClass.Plan.Builder getPlanBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPlanFieldBuilder().getBuilder();
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      public sentinel.plan.v2.PlanOuterClass.PlanOrBuilder getPlanOrBuilder() {
        if (planBuilder_ != null) {
          return planBuilder_.getMessageOrBuilder();
        } else {
          return plan_ == null ?
              sentinel.plan.v2.PlanOuterClass.Plan.getDefaultInstance() : plan_;
        }
      }
      /**
       * <code>.sentinel.plan.v2.Plan plan = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          sentinel.plan.v2.PlanOuterClass.Plan, sentinel.plan.v2.PlanOuterClass.Plan.Builder, sentinel.plan.v2.PlanOuterClass.PlanOrBuilder> 
          getPlanFieldBuilder() {
        if (planBuilder_ == null) {
          planBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              sentinel.plan.v2.PlanOuterClass.Plan, sentinel.plan.v2.PlanOuterClass.Plan.Builder, sentinel.plan.v2.PlanOuterClass.PlanOrBuilder>(
                  getPlan(),
                  getParentForChildren(),
                  isClean());
          plan_ = null;
        }
        return planBuilder_;
      }

      private com.google.protobuf.LazyStringArrayList nodes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureNodesIsMutable() {
        if (!nodes_.isModifiable()) {
          nodes_ = new com.google.protobuf.LazyStringArrayList(nodes_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @return A list containing the nodes.
       */
      public com.google.protobuf.ProtocolStringList
          getNodesList() {
        nodes_.makeImmutable();
        return nodes_;
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @return The count of nodes.
       */
      public int getNodesCount() {
        return nodes_.size();
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @param index The index of the element to return.
       * @return The nodes at the given index.
       */
      public java.lang.String getNodes(int index) {
        return nodes_.get(index);
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @param index The index of the value to return.
       * @return The bytes of the nodes at the given index.
       */
      public com.google.protobuf.ByteString
          getNodesBytes(int index) {
        return nodes_.getByteString(index);
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @param index The index to set the value at.
       * @param value The nodes to set.
       * @return This builder for chaining.
       */
      public Builder setNodes(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @param value The nodes to add.
       * @return This builder for chaining.
       */
      public Builder addNodes(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureNodesIsMutable();
        nodes_.add(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @param values The nodes to add.
       * @return This builder for chaining.
       */
      public Builder addAllNodes(
          java.lang.Iterable<java.lang.String> values) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodes_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNodes() {
        nodes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string nodes = 2;</code>
       * @param value The bytes of the nodes to add.
       * @return This builder for chaining.
       */
      public Builder addNodesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureNodesIsMutable();
        nodes_.add(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:sentinel.plan.v2.GenesisPlan)
    }

    // @@protoc_insertion_point(class_scope:sentinel.plan.v2.GenesisPlan)
    private static final sentinel.plan.v2.Genesis.GenesisPlan DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.plan.v2.Genesis.GenesisPlan();
    }

    public static sentinel.plan.v2.Genesis.GenesisPlan getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisPlan>
        PARSER = new com.google.protobuf.AbstractParser<GenesisPlan>() {
      @java.lang.Override
      public GenesisPlan parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenesisPlan> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisPlan> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sentinel.plan.v2.Genesis.GenesisPlan getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_plan_v2_GenesisPlan_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_plan_v2_GenesisPlan_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036sentinel/plan/v2/genesis.proto\022\020sentin" +
      "el.plan.v2\032\024gogoproto/gogo.proto\032\033sentin" +
      "el/plan/v2/plan.proto\"H\n\013GenesisPlan\022*\n\004" +
      "plan\030\001 \001(\0132\026.sentinel.plan.v2.PlanB\004\310\336\037\000" +
      "\022\r\n\005nodes\030\002 \003(\tB7Z-github.com/sentinel-o" +
      "fficial/hub/x/plan/types\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          sentinel.plan.v2.PlanOuterClass.getDescriptor(),
        });
    internal_static_sentinel_plan_v2_GenesisPlan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_plan_v2_GenesisPlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_plan_v2_GenesisPlan_descriptor,
        new java.lang.String[] { "Plan", "Nodes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    sentinel.plan.v2.PlanOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
