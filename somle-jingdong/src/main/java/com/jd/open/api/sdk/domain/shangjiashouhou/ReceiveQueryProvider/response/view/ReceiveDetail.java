package com.jd.open.api.sdk.domain.shangjiashouhou.ReceiveQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ReceiveDetail implements Serializable {
   private Long serviceId;
   private Long receiveId;
   private Integer receiveType;
   private String receiveTypeName;
   private Date receiveDate;
   private String partCode;
   private Integer packingState;
   private String packingStateName;
   private Integer qualityState;
   private String qualityStateName;
   private Integer appearanceState;
   private String appearanceStateName;
   private Integer invoiceRecordState;
   private String invoiceRecordStateName;
   private Integer judgmentReason;
   private String judgmentReasonName;
   private Integer accessoryOrGift;
   private String accessoryOrGiftName;
   private String receiveRemark;
   private Boolean abnormalFlag;
   private List<ReceiveWare> receiveWareList;
   private String extJsonStr;

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("receiveId")
   public void setReceiveId(Long receiveId) {
      this.receiveId = receiveId;
   }

   @JsonProperty("receiveId")
   public Long getReceiveId() {
      return this.receiveId;
   }

   @JsonProperty("receiveType")
   public void setReceiveType(Integer receiveType) {
      this.receiveType = receiveType;
   }

   @JsonProperty("receiveType")
   public Integer getReceiveType() {
      return this.receiveType;
   }

   @JsonProperty("receiveTypeName")
   public void setReceiveTypeName(String receiveTypeName) {
      this.receiveTypeName = receiveTypeName;
   }

   @JsonProperty("receiveTypeName")
   public String getReceiveTypeName() {
      return this.receiveTypeName;
   }

   @JsonProperty("receiveDate")
   public void setReceiveDate(Date receiveDate) {
      this.receiveDate = receiveDate;
   }

   @JsonProperty("receiveDate")
   public Date getReceiveDate() {
      return this.receiveDate;
   }

   @JsonProperty("partCode")
   public void setPartCode(String partCode) {
      this.partCode = partCode;
   }

   @JsonProperty("partCode")
   public String getPartCode() {
      return this.partCode;
   }

   @JsonProperty("packingState")
   public void setPackingState(Integer packingState) {
      this.packingState = packingState;
   }

   @JsonProperty("packingState")
   public Integer getPackingState() {
      return this.packingState;
   }

   @JsonProperty("packingStateName")
   public void setPackingStateName(String packingStateName) {
      this.packingStateName = packingStateName;
   }

   @JsonProperty("packingStateName")
   public String getPackingStateName() {
      return this.packingStateName;
   }

   @JsonProperty("qualityState")
   public void setQualityState(Integer qualityState) {
      this.qualityState = qualityState;
   }

   @JsonProperty("qualityState")
   public Integer getQualityState() {
      return this.qualityState;
   }

   @JsonProperty("qualityStateName")
   public void setQualityStateName(String qualityStateName) {
      this.qualityStateName = qualityStateName;
   }

   @JsonProperty("qualityStateName")
   public String getQualityStateName() {
      return this.qualityStateName;
   }

   @JsonProperty("appearanceState")
   public void setAppearanceState(Integer appearanceState) {
      this.appearanceState = appearanceState;
   }

   @JsonProperty("appearanceState")
   public Integer getAppearanceState() {
      return this.appearanceState;
   }

   @JsonProperty("appearanceStateName")
   public void setAppearanceStateName(String appearanceStateName) {
      this.appearanceStateName = appearanceStateName;
   }

   @JsonProperty("appearanceStateName")
   public String getAppearanceStateName() {
      return this.appearanceStateName;
   }

   @JsonProperty("invoiceRecordState")
   public void setInvoiceRecordState(Integer invoiceRecordState) {
      this.invoiceRecordState = invoiceRecordState;
   }

   @JsonProperty("invoiceRecordState")
   public Integer getInvoiceRecordState() {
      return this.invoiceRecordState;
   }

   @JsonProperty("invoiceRecordStateName")
   public void setInvoiceRecordStateName(String invoiceRecordStateName) {
      this.invoiceRecordStateName = invoiceRecordStateName;
   }

   @JsonProperty("invoiceRecordStateName")
   public String getInvoiceRecordStateName() {
      return this.invoiceRecordStateName;
   }

   @JsonProperty("judgmentReason")
   public void setJudgmentReason(Integer judgmentReason) {
      this.judgmentReason = judgmentReason;
   }

   @JsonProperty("judgmentReason")
   public Integer getJudgmentReason() {
      return this.judgmentReason;
   }

   @JsonProperty("judgmentReasonName")
   public void setJudgmentReasonName(String judgmentReasonName) {
      this.judgmentReasonName = judgmentReasonName;
   }

   @JsonProperty("judgmentReasonName")
   public String getJudgmentReasonName() {
      return this.judgmentReasonName;
   }

   @JsonProperty("accessoryOrGift")
   public void setAccessoryOrGift(Integer accessoryOrGift) {
      this.accessoryOrGift = accessoryOrGift;
   }

   @JsonProperty("accessoryOrGift")
   public Integer getAccessoryOrGift() {
      return this.accessoryOrGift;
   }

   @JsonProperty("accessoryOrGiftName")
   public void setAccessoryOrGiftName(String accessoryOrGiftName) {
      this.accessoryOrGiftName = accessoryOrGiftName;
   }

   @JsonProperty("accessoryOrGiftName")
   public String getAccessoryOrGiftName() {
      return this.accessoryOrGiftName;
   }

   @JsonProperty("receiveRemark")
   public void setReceiveRemark(String receiveRemark) {
      this.receiveRemark = receiveRemark;
   }

   @JsonProperty("receiveRemark")
   public String getReceiveRemark() {
      return this.receiveRemark;
   }

   @JsonProperty("abnormalFlag")
   public void setAbnormalFlag(Boolean abnormalFlag) {
      this.abnormalFlag = abnormalFlag;
   }

   @JsonProperty("abnormalFlag")
   public Boolean getAbnormalFlag() {
      return this.abnormalFlag;
   }

   @JsonProperty("receiveWareList")
   public void setReceiveWareList(List<ReceiveWare> receiveWareList) {
      this.receiveWareList = receiveWareList;
   }

   @JsonProperty("receiveWareList")
   public List<ReceiveWare> getReceiveWareList() {
      return this.receiveWareList;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
