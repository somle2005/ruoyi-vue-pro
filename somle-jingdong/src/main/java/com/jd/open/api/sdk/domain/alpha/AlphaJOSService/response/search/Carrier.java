package com.jd.open.api.sdk.domain.alpha.AlphaJOSService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Carrier implements Serializable {
   private Long carrierId;
   private String carrierName;
   private Integer type;
   private Integer isDefault;
   private Integer sort;
   private Integer useFlag;

   @JsonProperty("carrierId")
   public void setCarrierId(Long carrierId) {
      this.carrierId = carrierId;
   }

   @JsonProperty("carrierId")
   public Long getCarrierId() {
      return this.carrierId;
   }

   @JsonProperty("carrierName")
   public void setCarrierName(String carrierName) {
      this.carrierName = carrierName;
   }

   @JsonProperty("carrierName")
   public String getCarrierName() {
      return this.carrierName;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("isDefault")
   public void setIsDefault(Integer isDefault) {
      this.isDefault = isDefault;
   }

   @JsonProperty("isDefault")
   public Integer getIsDefault() {
      return this.isDefault;
   }

   @JsonProperty("sort")
   public void setSort(Integer sort) {
      this.sort = sort;
   }

   @JsonProperty("sort")
   public Integer getSort() {
      return this.sort;
   }

   @JsonProperty("useFlag")
   public void setUseFlag(Integer useFlag) {
      this.useFlag = useFlag;
   }

   @JsonProperty("useFlag")
   public Integer getUseFlag() {
      return this.useFlag;
   }
}
