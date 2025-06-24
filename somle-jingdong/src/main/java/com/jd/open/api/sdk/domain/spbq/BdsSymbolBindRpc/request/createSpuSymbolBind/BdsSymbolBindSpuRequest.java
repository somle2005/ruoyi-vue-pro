package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.request.createSpuSymbolBind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BdsSymbolBindSpuRequest implements Serializable {
   private Long relationId;
   private Date submitTime;
   private String ownerName;
   private String bussinessTypeEnum;
   private String spuId;
   private List<BdsSkuBindSymbol> skuBindSymbolList;

   @JsonProperty("relationId")
   public void setRelationId(Long relationId) {
      this.relationId = relationId;
   }

   @JsonProperty("relationId")
   public Long getRelationId() {
      return this.relationId;
   }

   @JsonProperty("submitTime")
   public void setSubmitTime(Date submitTime) {
      this.submitTime = submitTime;
   }

   @JsonProperty("submitTime")
   public Date getSubmitTime() {
      return this.submitTime;
   }

   @JsonProperty("ownerName")
   public void setOwnerName(String ownerName) {
      this.ownerName = ownerName;
   }

   @JsonProperty("ownerName")
   public String getOwnerName() {
      return this.ownerName;
   }

   @JsonProperty("bussinessTypeEnum")
   public void setBussinessTypeEnum(String bussinessTypeEnum) {
      this.bussinessTypeEnum = bussinessTypeEnum;
   }

   @JsonProperty("bussinessTypeEnum")
   public String getBussinessTypeEnum() {
      return this.bussinessTypeEnum;
   }

   @JsonProperty("spuId")
   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public String getSpuId() {
      return this.spuId;
   }

   @JsonProperty("skuBindSymbolList")
   public void setSkuBindSymbolList(List<BdsSkuBindSymbol> skuBindSymbolList) {
      this.skuBindSymbolList = skuBindSymbolList;
   }

   @JsonProperty("skuBindSymbolList")
   public List<BdsSkuBindSymbol> getSkuBindSymbolList() {
      return this.skuBindSymbolList;
   }
}
