package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PropValueReq implements Serializable {
   private String spuStructValueUnit;
   private String spuStructValueName;
   private Integer spuStructValueId;
   private String spuStructValueVremark;
   private String skuStructValueUnit;
   private String skuStructValueName;
   private Integer skuStructValueId;
   private String skuStructValueVremark;

   @JsonProperty("spuStructValueUnit")
   public void setSpuStructValueUnit(String spuStructValueUnit) {
      this.spuStructValueUnit = spuStructValueUnit;
   }

   @JsonProperty("spuStructValueUnit")
   public String getSpuStructValueUnit() {
      return this.spuStructValueUnit;
   }

   @JsonProperty("spuStructValueName")
   public void setSpuStructValueName(String spuStructValueName) {
      this.spuStructValueName = spuStructValueName;
   }

   @JsonProperty("spuStructValueName")
   public String getSpuStructValueName() {
      return this.spuStructValueName;
   }

   @JsonProperty("spuStructValueId")
   public void setSpuStructValueId(Integer spuStructValueId) {
      this.spuStructValueId = spuStructValueId;
   }

   @JsonProperty("spuStructValueId")
   public Integer getSpuStructValueId() {
      return this.spuStructValueId;
   }

   @JsonProperty("spuStructValueVremark")
   public void setSpuStructValueVremark(String spuStructValueVremark) {
      this.spuStructValueVremark = spuStructValueVremark;
   }

   @JsonProperty("spuStructValueVremark")
   public String getSpuStructValueVremark() {
      return this.spuStructValueVremark;
   }

   @JsonProperty("skuStructValueUnit")
   public void setSkuStructValueUnit(String skuStructValueUnit) {
      this.skuStructValueUnit = skuStructValueUnit;
   }

   @JsonProperty("skuStructValueUnit")
   public String getSkuStructValueUnit() {
      return this.skuStructValueUnit;
   }

   @JsonProperty("skuStructValueName")
   public void setSkuStructValueName(String skuStructValueName) {
      this.skuStructValueName = skuStructValueName;
   }

   @JsonProperty("skuStructValueName")
   public String getSkuStructValueName() {
      return this.skuStructValueName;
   }

   @JsonProperty("skuStructValueId")
   public void setSkuStructValueId(Integer skuStructValueId) {
      this.skuStructValueId = skuStructValueId;
   }

   @JsonProperty("skuStructValueId")
   public Integer getSkuStructValueId() {
      return this.skuStructValueId;
   }

   @JsonProperty("skuStructValueVremark")
   public void setSkuStructValueVremark(String skuStructValueVremark) {
      this.skuStructValueVremark = skuStructValueVremark;
   }

   @JsonProperty("skuStructValueVremark")
   public String getSkuStructValueVremark() {
      return this.skuStructValueVremark;
   }
}
