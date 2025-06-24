package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ItemPicAuditDto implements Serializable {
   private Integer state;
   private String operateTime;
   private String erpCode;
   private String opinion;
   private String erpName;

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("operate_time")
   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   @JsonProperty("operate_time")
   public String getOperateTime() {
      return this.operateTime;
   }

   @JsonProperty("erp_code")
   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   @JsonProperty("erp_code")
   public String getErpCode() {
      return this.erpCode;
   }

   @JsonProperty("opinion")
   public void setOpinion(String opinion) {
      this.opinion = opinion;
   }

   @JsonProperty("opinion")
   public String getOpinion() {
      return this.opinion;
   }

   @JsonProperty("erp_name")
   public void setErpName(String erpName) {
      this.erpName = erpName;
   }

   @JsonProperty("erp_name")
   public String getErpName() {
      return this.erpName;
   }
}
