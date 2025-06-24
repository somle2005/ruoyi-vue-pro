package com.jd.open.api.sdk.domain.B2B.NsspInfoProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NsspSkuResp implements Serializable {
   private Long skuId;
   private Integer actualNum;
   private Integer originNum;
   private Integer exceedNum;
   private String skuUuid;
   private Integer skuNum;
   private String nsspUnit;
   private String weightUuid;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("actualNum")
   public void setActualNum(Integer actualNum) {
      this.actualNum = actualNum;
   }

   @JsonProperty("actualNum")
   public Integer getActualNum() {
      return this.actualNum;
   }

   @JsonProperty("originNum")
   public void setOriginNum(Integer originNum) {
      this.originNum = originNum;
   }

   @JsonProperty("originNum")
   public Integer getOriginNum() {
      return this.originNum;
   }

   @JsonProperty("exceedNum")
   public void setExceedNum(Integer exceedNum) {
      this.exceedNum = exceedNum;
   }

   @JsonProperty("exceedNum")
   public Integer getExceedNum() {
      return this.exceedNum;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("nsspUnit")
   public void setNsspUnit(String nsspUnit) {
      this.nsspUnit = nsspUnit;
   }

   @JsonProperty("nsspUnit")
   public String getNsspUnit() {
      return this.nsspUnit;
   }

   @JsonProperty("weightUuid")
   public void setWeightUuid(String weightUuid) {
      this.weightUuid = weightUuid;
   }

   @JsonProperty("weightUuid")
   public String getWeightUuid() {
      return this.weightUuid;
   }
}
