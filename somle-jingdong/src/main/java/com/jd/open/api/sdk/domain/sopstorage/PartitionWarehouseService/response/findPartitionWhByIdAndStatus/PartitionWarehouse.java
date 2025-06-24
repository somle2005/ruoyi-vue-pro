package com.jd.open.api.sdk.domain.sopstorage.PartitionWarehouseService.response.findPartitionWhByIdAndStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PartitionWarehouse implements Serializable {
   private long[] venderId;
   private long[] seqNum;
   private String[] name;
   private int[] useFlag;
   private int[] type;

   @JsonProperty("venderId")
   public void setVenderId(long[] venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public long[] getVenderId() {
      return this.venderId;
   }

   @JsonProperty("seq_num")
   public void setSeqNum(long[] seqNum) {
      this.seqNum = seqNum;
   }

   @JsonProperty("seq_num")
   public long[] getSeqNum() {
      return this.seqNum;
   }

   @JsonProperty("name")
   public void setName(String[] name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String[] getName() {
      return this.name;
   }

   @JsonProperty("use_flag")
   public void setUseFlag(int[] useFlag) {
      this.useFlag = useFlag;
   }

   @JsonProperty("use_flag")
   public int[] getUseFlag() {
      return this.useFlag;
   }

   @JsonProperty("type")
   public void setType(int[] type) {
      this.type = type;
   }

   @JsonProperty("type")
   public int[] getType() {
      return this.type;
   }
}
