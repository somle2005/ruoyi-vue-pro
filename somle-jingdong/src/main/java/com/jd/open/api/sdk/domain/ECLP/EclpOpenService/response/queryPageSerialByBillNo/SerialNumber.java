package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPageSerialByBillNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SerialNumber implements Serializable {
   private String goodsNo;
   private String serialNumber;
   private Byte bizType;
   private String bizTypeName;
   private String bizNo;
   private String createTimeStr;
   private String warehouseNo;
   private String warehouseName;
   private String isvGoodsNo;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("serialNumber")
   public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
   }

   @JsonProperty("serialNumber")
   public String getSerialNumber() {
      return this.serialNumber;
   }

   @JsonProperty("bizType")
   public void setBizType(Byte bizType) {
      this.bizType = bizType;
   }

   @JsonProperty("bizType")
   public Byte getBizType() {
      return this.bizType;
   }

   @JsonProperty("bizTypeName")
   public void setBizTypeName(String bizTypeName) {
      this.bizTypeName = bizTypeName;
   }

   @JsonProperty("bizTypeName")
   public String getBizTypeName() {
      return this.bizTypeName;
   }

   @JsonProperty("bizNo")
   public void setBizNo(String bizNo) {
      this.bizNo = bizNo;
   }

   @JsonProperty("bizNo")
   public String getBizNo() {
      return this.bizNo;
   }

   @JsonProperty("createTimeStr")
   public void setCreateTimeStr(String createTimeStr) {
      this.createTimeStr = createTimeStr;
   }

   @JsonProperty("createTimeStr")
   public String getCreateTimeStr() {
      return this.createTimeStr;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }
}
