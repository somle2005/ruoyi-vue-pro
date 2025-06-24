package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveRewardInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class InteractiveRewardParam implements Serializable {
   private Map<String, String> ext;
   private String encryptProjectPoolId;
   private String pin;
   private String encryptProjectId;
   private List<String> encryptAssignmentIds;
   private int projectFailRewardsFlag;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("ext")
   public void setExt(Map<String, String> ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public Map<String, String> getExt() {
      return this.ext;
   }

   @JsonProperty("encryptProjectPoolId")
   public void setEncryptProjectPoolId(String encryptProjectPoolId) {
      this.encryptProjectPoolId = encryptProjectPoolId;
   }

   @JsonProperty("encryptProjectPoolId")
   public String getEncryptProjectPoolId() {
      return this.encryptProjectPoolId;
   }

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

   @JsonProperty("projectFailRewardsFlag")
   public void setProjectFailRewardsFlag(int projectFailRewardsFlag) {
      this.projectFailRewardsFlag = projectFailRewardsFlag;
   }

   @JsonProperty("projectFailRewardsFlag")
   public int getProjectFailRewardsFlag() {
      return this.projectFailRewardsFlag;
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
