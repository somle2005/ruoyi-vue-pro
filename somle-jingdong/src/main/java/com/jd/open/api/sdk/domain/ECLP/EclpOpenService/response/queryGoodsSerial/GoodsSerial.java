package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsSerial;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GoodsSerial implements Serializable {
   private String[] businessNo;
   private String[] businessType;
   private String[] departmentNo;
   private String[] goodsNo;
   private String[] serialNumber;

   @JsonProperty("businessNo")
   public void setBusinessNo(String[] businessNo) {
      this.businessNo = businessNo;
   }

   @JsonProperty("businessNo")
   public String[] getBusinessNo() {
      return this.businessNo;
   }

   @JsonProperty("businessType")
   public void setBusinessType(String[] businessType) {
      this.businessType = businessType;
   }

   @JsonProperty("businessType")
   public String[] getBusinessType() {
      return this.businessType;
   }

   @JsonProperty("departmentNo")
   public void setDepartmentNo(String[] departmentNo) {
      this.departmentNo = departmentNo;
   }

   @JsonProperty("departmentNo")
   public String[] getDepartmentNo() {
      return this.departmentNo;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("serialNumber")
   public void setSerialNumber(String[] serialNumber) {
      this.serialNumber = serialNumber;
   }

   @JsonProperty("serialNumber")
   public String[] getSerialNumber() {
      return this.serialNumber;
   }
}
