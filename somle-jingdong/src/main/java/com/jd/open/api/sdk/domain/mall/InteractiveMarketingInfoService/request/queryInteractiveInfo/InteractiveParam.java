package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class InteractiveParam implements Serializable {
   private String pin;
   private String encryptProjectId;
   private List<String> encryptAssignmentIds;
   private Map<String, Object> ext;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("encryptProjectId")
   public void setEncryptProjectId(String encryptProjectId) {
      this.encryptProjectId = encryptProjectId;
   }

   @JsonProperty("encryptProjectId")
   public String getEncryptProjectId() {
      return this.encryptProjectId;
   }

   @JsonProperty("encryptAssignmentIds")
   public void setEncryptAssignmentIds(List<String> encryptAssignmentIds) {
      this.encryptAssignmentIds = encryptAssignmentIds;
   }

   @JsonProperty("encryptAssignmentIds")
   public List<String> getEncryptAssignmentIds() {
      return this.encryptAssignmentIds;
   }

   @JsonProperty("ext")
   public void setExt(Map<String, Object> ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public Map<String, Object> getExt() {
      return this.ext;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }
}
