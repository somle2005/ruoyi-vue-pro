package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PoItemReject implements Serializable {
   private String goodsNo;
   private String batchNo;
   private List<BatAttr> batAttrList;
   private String goodsLevel;
   private String batchCode;
   private Integer rejectQty;
   private String rejectReason;
   private String[] orderLineNo;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("batchNo")
   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batchNo")
   public String getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("batAttrList")
   public void setBatAttrList(List<BatAttr> batAttrList) {
      this.batAttrList = batAttrList;
   }

   @JsonProperty("batAttrList")
   public List<BatAttr> getBatAttrList() {
      return this.batAttrList;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("batchCode")
   public void setBatchCode(String batchCode) {
      this.batchCode = batchCode;
   }

   @JsonProperty("batchCode")
   public String getBatchCode() {
      return this.batchCode;
   }

   @JsonProperty("rejectQty")
   public void setRejectQty(Integer rejectQty) {
      this.rejectQty = rejectQty;
   }

   @JsonProperty("rejectQty")
   public Integer getRejectQty() {
      return this.rejectQty;
   }

   @JsonProperty("rejectReason")
   public void setRejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
   }

   @JsonProperty("rejectReason")
   public String getRejectReason() {
      return this.rejectReason;
   }

   @JsonProperty("orderLineNo")
   public void setOrderLineNo(String[] orderLineNo) {
      this.orderLineNo = orderLineNo;
   }

   @JsonProperty("orderLineNo")
   public String[] getOrderLineNo() {
      return this.orderLineNo;
   }
}
