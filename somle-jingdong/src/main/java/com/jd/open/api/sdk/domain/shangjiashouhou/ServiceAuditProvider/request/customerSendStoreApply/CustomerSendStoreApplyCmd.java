package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerSendStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomerSendStoreApplyCmd implements Serializable {
   private Long afsServiceId;
   private String buId;
   private OperatorInfoReq operatorInfoReq;
   private ContactsInfo returnWareContactInfo;
   private ContactsInfo shopContactInfo;
   private List<WareDetailInfo> returnWareDetailInfo;
   private AuditAddInfo auditAddInfo;
   private String oaid;

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("buId")
   public void setBuId(String buId) {
      this.buId = buId;
   }

   @JsonProperty("buId")
   public String getBuId() {
      return this.buId;
   }

   @JsonProperty("operatorInfoReq")
   public void setOperatorInfoReq(OperatorInfoReq operatorInfoReq) {
      this.operatorInfoReq = operatorInfoReq;
   }

   @JsonProperty("operatorInfoReq")
   public OperatorInfoReq getOperatorInfoReq() {
      return this.operatorInfoReq;
   }

   @JsonProperty("returnWareContactInfo")
   public void setReturnWareContactInfo(ContactsInfo returnWareContactInfo) {
      this.returnWareContactInfo = returnWareContactInfo;
   }

   @JsonProperty("returnWareContactInfo")
   public ContactsInfo getReturnWareContactInfo() {
      return this.returnWareContactInfo;
   }

   @JsonProperty("shopContactInfo")
   public void setShopContactInfo(ContactsInfo shopContactInfo) {
      this.shopContactInfo = shopContactInfo;
   }

   @JsonProperty("shopContactInfo")
   public ContactsInfo getShopContactInfo() {
      return this.shopContactInfo;
   }

   @JsonProperty("returnWareDetailInfo")
   public void setReturnWareDetailInfo(List<WareDetailInfo> returnWareDetailInfo) {
      this.returnWareDetailInfo = returnWareDetailInfo;
   }

   @JsonProperty("returnWareDetailInfo")
   public List<WareDetailInfo> getReturnWareDetailInfo() {
      return this.returnWareDetailInfo;
   }

   @JsonProperty("auditAddInfo")
   public void setAuditAddInfo(AuditAddInfo auditAddInfo) {
      this.auditAddInfo = auditAddInfo;
   }

   @JsonProperty("auditAddInfo")
   public AuditAddInfo getAuditAddInfo() {
      return this.auditAddInfo;
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
