package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartResultInfo implements Serializable {
   private String rejectMsg;
   private Integer confirmState;
   private Integer partOrderType;
   private String stateChangeDate;
   private String sparePartNo;
   private Integer auditState;
   private String deliveryCode;

   @JsonProperty("rejectMsg")
   public void setRejectMsg(String rejectMsg) {
      this.rejectMsg = rejectMsg;
   }

   @JsonProperty("rejectMsg")
   public String getRejectMsg() {
      return this.rejectMsg;
   }

   @JsonProperty("confirmState")
   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   @JsonProperty("confirmState")
   public Integer getConfirmState() {
      return this.confirmState;
   }

   @JsonProperty("partOrderType")
   public void setPartOrderType(Integer partOrderType) {
      this.partOrderType = partOrderType;
   }

   @JsonProperty("partOrderType")
   public Integer getPartOrderType() {
      return this.partOrderType;
   }

   @JsonProperty("stateChangeDate")
   public void setStateChangeDate(String stateChangeDate) {
      this.stateChangeDate = stateChangeDate;
   }

   @JsonProperty("stateChangeDate")
   public String getStateChangeDate() {
      return this.stateChangeDate;
   }

   @JsonProperty("sparePartNo")
   public void setSparePartNo(String sparePartNo) {
      this.sparePartNo = sparePartNo;
   }

   @JsonProperty("sparePartNo")
   public String getSparePartNo() {
      return this.sparePartNo;
   }

   @JsonProperty("auditState")
   public void setAuditState(Integer auditState) {
      this.auditState = auditState;
   }

   @JsonProperty("auditState")
   public Integer getAuditState() {
      return this.auditState;
   }

   @JsonProperty("deliveryCode")
   public void setDeliveryCode(String deliveryCode) {
      this.deliveryCode = deliveryCode;
   }

   @JsonProperty("deliveryCode")
   public String getDeliveryCode() {
      return this.deliveryCode;
   }
}
