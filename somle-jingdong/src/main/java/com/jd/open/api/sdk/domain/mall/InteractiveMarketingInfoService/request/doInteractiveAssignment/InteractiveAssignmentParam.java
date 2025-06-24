package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.doInteractiveAssignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class InteractiveAssignmentParam implements Serializable {
   private Map<String, Object> ext;
   private String itemId;
   private int actionType;
   private String pin;
   private Map<String, Object> bizExtParams;
   private String encryptProjectId;
   private String encryptAssignmentId;
   private boolean completionFlag;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("ext")
   public void setExt(Map<String, Object> ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public Map<String, Object> getExt() {
      return this.ext;
   }

   @JsonProperty("itemId")
   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("itemId")
   public String getItemId() {
      return this.itemId;
   }

   @JsonProperty("actionType")
   public void setActionType(int actionType) {
      this.actionType = actionType;
   }

   @JsonProperty("actionType")
   public int getActionType() {
      return this.actionType;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("bizExtParams")
   public void setBizExtParams(Map<String, Object> bizExtParams) {
      this.bizExtParams = bizExtParams;
   }

   @JsonProperty("bizExtParams")
   public Map<String, Object> getBizExtParams() {
      return this.bizExtParams;
   }

   @JsonProperty("encryptProjectId")
   public void setEncryptProjectId(String encryptProjectId) {
      this.encryptProjectId = encryptProjectId;
   }

   @JsonProperty("encryptProjectId")
   public String getEncryptProjectId() {
      return this.encryptProjectId;
   }

   @JsonProperty("encryptAssignmentId")
   public void setEncryptAssignmentId(String encryptAssignmentId) {
      this.encryptAssignmentId = encryptAssignmentId;
   }

   @JsonProperty("encryptAssignmentId")
   public String getEncryptAssignmentId() {
      return this.encryptAssignmentId;
   }

   @JsonProperty("completionFlag")
   public void setCompletionFlag(boolean completionFlag) {
      this.completionFlag = completionFlag;
   }

   @JsonProperty("completionFlag")
   public boolean getCompletionFlag() {
      return this.completionFlag;
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
