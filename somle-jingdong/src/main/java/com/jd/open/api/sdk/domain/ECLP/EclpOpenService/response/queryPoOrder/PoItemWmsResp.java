package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PoItemWmsResp implements Serializable {
   private String goodsNo;
   private Integer realInstoreQty;
   private String batchCode;
   private String goodsLevel;
   private String goodsName;
   private Integer goodsStatus;
   private String isvSku;
   private String createTime;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("realInstoreQty")
   public void setRealInstoreQty(Integer realInstoreQty) {
      this.realInstoreQty = realInstoreQty;
   }

   @JsonProperty("realInstoreQty")
   public Integer getRealInstoreQty() {
      return this.realInstoreQty;
   }

   @JsonProperty("batchCode")
   public void setBatchCode(String batchCode) {
      this.batchCode = batchCode;
   }

   @JsonProperty("batchCode")
   public String getBatchCode() {
      return this.batchCode;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("goodsStatus")
   public void setGoodsStatus(Integer goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goodsStatus")
   public Integer getGoodsStatus() {
      return this.goodsStatus;
   }

   @JsonProperty("isvSku")
   public void setIsvSku(String isvSku) {
      this.isvSku = isvSku;
   }

   @JsonProperty("isvSku")
   public String getIsvSku() {
      return this.isvSku;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }
}
