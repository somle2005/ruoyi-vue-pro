package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.storeDoorPick;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StoreDoorPickApplyCmd implements Serializable {
   private String buId;
   private Long afsServiceId;
   private List<WareDetailInfo> returnWareDetailInfo;
   private OperatorInfoReq operatorInfoReq;
   private ContactsInfo pickWareContactInfo;
   private AuditAddInfo auditAddInfo;
   private AppointmentInfo appointmentInfo;
   private ContactsInfo shopContactInfo;
   private String oaid;

   @JsonProperty("buId")
   public void setBuId(String buId) {
      this.buId = buId;
   }

   @JsonProperty("buId")
   public String getBuId() {
      return this.buId;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("returnWareDetailInfo")
   public void setReturnWareDetailInfo(List<WareDetailInfo> returnWareDetailInfo) {
      this.returnWareDetailInfo = returnWareDetailInfo;
   }

   @JsonProperty("returnWareDetailInfo")
   public List<WareDetailInfo> getReturnWareDetailInfo() {
      return this.returnWareDetailInfo;
   }

   @JsonProperty("operatorInfoReq")
   public void setOperatorInfoReq(OperatorInfoReq operatorInfoReq) {
      this.operatorInfoReq = operatorInfoReq;
   }

   @JsonProperty("operatorInfoReq")
   public OperatorInfoReq getOperatorInfoReq() {
      return this.operatorInfoReq;
   }

   @JsonProperty("pickWareContactInfo")
   public void setPickWareContactInfo(ContactsInfo pickWareContactInfo) {
      this.pickWareContactInfo = pickWareContactInfo;
   }

   @JsonProperty("pickWareContactInfo")
   public ContactsInfo getPickWareContactInfo() {
      return this.pickWareContactInfo;
   }

   @JsonProperty("auditAddInfo")
   public void setAuditAddInfo(AuditAddInfo auditAddInfo) {
      this.auditAddInfo = auditAddInfo;
   }

   @JsonProperty("auditAddInfo")
   public AuditAddInfo getAuditAddInfo() {
      return this.auditAddInfo;
   }

   @JsonProperty("appointmentInfo")
   public void setAppointmentInfo(AppointmentInfo appointmentInfo) {
      this.appointmentInfo = appointmentInfo;
   }

   @JsonProperty("appointmentInfo")
   public AppointmentInfo getAppointmentInfo() {
      return this.appointmentInfo;
   }

   @JsonProperty("shopContactInfo")
   public void setShopContactInfo(ContactsInfo shopContactInfo) {
      this.shopContactInfo = shopContactInfo;
   }

   @JsonProperty("shopContactInfo")
   public ContactsInfo getShopContactInfo() {
      return this.shopContactInfo;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
