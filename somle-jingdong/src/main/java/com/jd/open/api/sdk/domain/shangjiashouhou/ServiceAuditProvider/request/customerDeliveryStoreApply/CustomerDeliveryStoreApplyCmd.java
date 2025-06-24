package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerDeliveryStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomerDeliveryStoreApplyCmd implements Serializable {
   private String buId;
   private Long afsServiceId;
   private OperatorInfoReq operatorInfoReq;
   private ContactsInfo shopContactInfo;
   private List<WareDetailInfo> returnWareDetailInfo;
   private AuditAddInfo auditAddInfo;

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

   @JsonProperty("operatorInfoReq")
   public void setOperatorInfoReq(OperatorInfoReq operatorInfoReq) {
      this.operatorInfoReq = operatorInfoReq;
   }

   @JsonProperty("operatorInfoReq")
   public OperatorInfoReq getOperatorInfoReq() {
      return this.operatorInfoReq;
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
}
