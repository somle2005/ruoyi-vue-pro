package com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PrintObject implements Serializable {
   private List<String> waybillCodes;
   private Integer electronicSheetType;
   private List<String> packageCodes;
   private List<String> boxCodes;
   private List<String> orderIds;
   private Map<String, CustomerPropertyRequest> customProperties;
   private Integer codeType;

   @JsonProperty("waybillCodes")
   public void setWaybillCodes(List<String> waybillCodes) {
      this.waybillCodes = waybillCodes;
   }

   @JsonProperty("waybillCodes")
   public List<String> getWaybillCodes() {
      return this.waybillCodes;
   }

   @JsonProperty("electronicSheetType")
   public void setElectronicSheetType(Integer electronicSheetType) {
      this.electronicSheetType = electronicSheetType;
   }

   @JsonProperty("electronicSheetType")
   public Integer getElectronicSheetType() {
      return this.electronicSheetType;
   }

   @JsonProperty("packageCodes")
   public void setPackageCodes(List<String> packageCodes) {
      this.packageCodes = packageCodes;
   }

   @JsonProperty("packageCodes")
   public List<String> getPackageCodes() {
      return this.packageCodes;
   }

   @JsonProperty("boxCodes")
   public void setBoxCodes(List<String> boxCodes) {
      this.boxCodes = boxCodes;
   }

   @JsonProperty("boxCodes")
   public List<String> getBoxCodes() {
      return this.boxCodes;
   }

   @JsonProperty("orderIds")
   public void setOrderIds(List<String> orderIds) {
      this.orderIds = orderIds;
   }

   @JsonProperty("orderIds")
   public List<String> getOrderIds() {
      return this.orderIds;
   }

   @JsonProperty("customProperties")
   public void setCustomProperties(Map<String, CustomerPropertyRequest> customProperties) {
      this.customProperties = customProperties;
   }

   @JsonProperty("customProperties")
   public Map<String, CustomerPropertyRequest> getCustomProperties() {
      return this.customProperties;
   }

   @JsonProperty("codeType")
   public void setCodeType(Integer codeType) {
      this.codeType = codeType;
   }

   @JsonProperty("codeType")
   public Integer getCodeType() {
      return this.codeType;
   }
}
