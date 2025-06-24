package com.jd.open.api.sdk.domain.ECLP.IbService4Isv.response.queryOutsideMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryOutsideMainResult4Isv implements Serializable {
   private String boxes;
   private Long warehouseIdIn;
   private String productCode;
   private String chargeMode;
   private Byte cancelStatus;
   private Byte outsideStatus;
   private Long warehouseIdOut;
   private String isvOutsideNo;

   @JsonProperty("boxes")
   public void setBoxes(String boxes) {
      this.boxes = boxes;
   }

   @JsonProperty("boxes")
   public String getBoxes() {
      return this.boxes;
   }

   @JsonProperty("warehouseIdIn")
   public void setWarehouseIdIn(Long warehouseIdIn) {
      this.warehouseIdIn = warehouseIdIn;
   }

   @JsonProperty("warehouseIdIn")
   public Long getWarehouseIdIn() {
      return this.warehouseIdIn;
   }

   @JsonProperty("productCode")
   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String getProductCode() {
      return this.productCode;
   }

   @JsonProperty("chargeMode")
   public void setChargeMode(String chargeMode) {
      this.chargeMode = chargeMode;
   }

   @JsonProperty("chargeMode")
   public String getChargeMode() {
      return this.chargeMode;
   }

   @JsonProperty("cancelStatus")
   public void setCancelStatus(Byte cancelStatus) {
      this.cancelStatus = cancelStatus;
   }

   @JsonProperty("cancelStatus")
   public Byte getCancelStatus() {
      return this.cancelStatus;
   }

   @JsonProperty("outsideStatus")
   public void setOutsideStatus(Byte outsideStatus) {
      this.outsideStatus = outsideStatus;
   }

   @JsonProperty("outsideStatus")
   public Byte getOutsideStatus() {
      return this.outsideStatus;
   }

   @JsonProperty("warehouseIdOut")
   public void setWarehouseIdOut(Long warehouseIdOut) {
      this.warehouseIdOut = warehouseIdOut;
   }

   @JsonProperty("warehouseIdOut")
   public Long getWarehouseIdOut() {
      return this.warehouseIdOut;
   }

   @JsonProperty("isvOutsideNo")
   public void setIsvOutsideNo(String isvOutsideNo) {
      this.isvOutsideNo = isvOutsideNo;
   }

   @JsonProperty("isvOutsideNo")
   public String getIsvOutsideNo() {
      return this.isvOutsideNo;
   }
}
