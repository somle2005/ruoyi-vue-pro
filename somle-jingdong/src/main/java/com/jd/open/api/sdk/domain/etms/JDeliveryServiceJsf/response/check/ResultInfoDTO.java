package com.jd.open.api.sdk.domain.etms.JDeliveryServiceJsf.response.check;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfoDTO implements Serializable {
   private Integer rcode;
   private String rmessage;
   private Integer sourcetSortCenterId;
   private String sourcetSortCenterName;
   private String originalCrossCode;
   private String originalTabletrolleyCode;
   private Integer targetSortCenterId;
   private String targetSortCenterName;
   private String destinationCrossCode;
   private String destinationTabletrolleyCode;
   private Integer siteId;
   private String siteName;
   private String road;
   private Integer aging;
   private String agingName;
   private Integer isHideName;
   private Integer isHideContractNumbers;
   private Integer preSortCode;
   private Integer transType;
   private Integer promiseTimeType;
   private Boolean promiseTimeTypeDownGrade;
   private String orderId;
   private Integer expressOperationMode;

   @JsonProperty("rcode")
   public void setRcode(Integer rcode) {
      this.rcode = rcode;
   }

   @JsonProperty("rcode")
   public Integer getRcode() {
      return this.rcode;
   }

   @JsonProperty("rmessage")
   public void setRmessage(String rmessage) {
      this.rmessage = rmessage;
   }

   @JsonProperty("rmessage")
   public String getRmessage() {
      return this.rmessage;
   }

   @JsonProperty("sourcetSortCenterId")
   public void setSourcetSortCenterId(Integer sourcetSortCenterId) {
      this.sourcetSortCenterId = sourcetSortCenterId;
   }

   @JsonProperty("sourcetSortCenterId")
   public Integer getSourcetSortCenterId() {
      return this.sourcetSortCenterId;
   }

   @JsonProperty("sourcetSortCenterName")
   public void setSourcetSortCenterName(String sourcetSortCenterName) {
      this.sourcetSortCenterName = sourcetSortCenterName;
   }

   @JsonProperty("sourcetSortCenterName")
   public String getSourcetSortCenterName() {
      return this.sourcetSortCenterName;
   }

   @JsonProperty("originalCrossCode")
   public void setOriginalCrossCode(String originalCrossCode) {
      this.originalCrossCode = originalCrossCode;
   }

   @JsonProperty("originalCrossCode")
   public String getOriginalCrossCode() {
      return this.originalCrossCode;
   }

   @JsonProperty("originalTabletrolleyCode")
   public void setOriginalTabletrolleyCode(String originalTabletrolleyCode) {
      this.originalTabletrolleyCode = originalTabletrolleyCode;
   }

   @JsonProperty("originalTabletrolleyCode")
   public String getOriginalTabletrolleyCode() {
      return this.originalTabletrolleyCode;
   }

   @JsonProperty("targetSortCenterId")
   public void setTargetSortCenterId(Integer targetSortCenterId) {
      this.targetSortCenterId = targetSortCenterId;
   }

   @JsonProperty("targetSortCenterId")
   public Integer getTargetSortCenterId() {
      return this.targetSortCenterId;
   }

   @JsonProperty("targetSortCenterName")
   public void setTargetSortCenterName(String targetSortCenterName) {
      this.targetSortCenterName = targetSortCenterName;
   }

   @JsonProperty("targetSortCenterName")
   public String getTargetSortCenterName() {
      return this.targetSortCenterName;
   }

   @JsonProperty("destinationCrossCode")
   public void setDestinationCrossCode(String destinationCrossCode) {
      this.destinationCrossCode = destinationCrossCode;
   }

   @JsonProperty("destinationCrossCode")
   public String getDestinationCrossCode() {
      return this.destinationCrossCode;
   }

   @JsonProperty("destinationTabletrolleyCode")
   public void setDestinationTabletrolleyCode(String destinationTabletrolleyCode) {
      this.destinationTabletrolleyCode = destinationTabletrolleyCode;
   }

   @JsonProperty("destinationTabletrolleyCode")
   public String getDestinationTabletrolleyCode() {
      return this.destinationTabletrolleyCode;
   }

   @JsonProperty("siteId")
   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public Integer getSiteId() {
      return this.siteId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("road")
   public void setRoad(String road) {
      this.road = road;
   }

   @JsonProperty("road")
   public String getRoad() {
      return this.road;
   }

   @JsonProperty("aging")
   public void setAging(Integer aging) {
      this.aging = aging;
   }

   @JsonProperty("aging")
   public Integer getAging() {
      return this.aging;
   }

   @JsonProperty("agingName")
   public void setAgingName(String agingName) {
      this.agingName = agingName;
   }

   @JsonProperty("agingName")
   public String getAgingName() {
      return this.agingName;
   }

   @JsonProperty("isHideName")
   public void setIsHideName(Integer isHideName) {
      this.isHideName = isHideName;
   }

   @JsonProperty("isHideName")
   public Integer getIsHideName() {
      return this.isHideName;
   }

   @JsonProperty("isHideContractNumbers")
   public void setIsHideContractNumbers(Integer isHideContractNumbers) {
      this.isHideContractNumbers = isHideContractNumbers;
   }

   @JsonProperty("isHideContractNumbers")
   public Integer getIsHideContractNumbers() {
      return this.isHideContractNumbers;
   }

   @JsonProperty("preSortCode")
   public void setPreSortCode(Integer preSortCode) {
      this.preSortCode = preSortCode;
   }

   @JsonProperty("preSortCode")
   public Integer getPreSortCode() {
      return this.preSortCode;
   }

   @JsonProperty("transType")
   public void setTransType(Integer transType) {
      this.transType = transType;
   }

   @JsonProperty("transType")
   public Integer getTransType() {
      return this.transType;
   }

   @JsonProperty("promiseTimeType")
   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   @JsonProperty("promiseTimeType")
   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   @JsonProperty("promiseTimeTypeDownGrade")
   public void setPromiseTimeTypeDownGrade(Boolean promiseTimeTypeDownGrade) {
      this.promiseTimeTypeDownGrade = promiseTimeTypeDownGrade;
   }

   @JsonProperty("promiseTimeTypeDownGrade")
   public Boolean getPromiseTimeTypeDownGrade() {
      return this.promiseTimeTypeDownGrade;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("expressOperationMode")
   public void setExpressOperationMode(Integer expressOperationMode) {
      this.expressOperationMode = expressOperationMode;
   }

   @JsonProperty("expressOperationMode")
   public Integer getExpressOperationMode() {
      return this.expressOperationMode;
   }
}
