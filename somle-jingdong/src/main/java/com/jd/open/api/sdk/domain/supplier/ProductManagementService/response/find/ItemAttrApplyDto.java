package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ItemAttrApplyDto implements Serializable {
   private String applyId;
   private Date applyTime;
   private String wareGroupId;
   private String publicName;
   private Integer state;

   @JsonProperty("apply_id")
   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("apply_id")
   public String getApplyId() {
      return this.applyId;
   }

   @JsonProperty("apply_time")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("apply_time")
   public Date getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("ware_group_id")
   public void setWareGroupId(String wareGroupId) {
      this.wareGroupId = wareGroupId;
   }

   @JsonProperty("ware_group_id")
   public String getWareGroupId() {
      return this.wareGroupId;
   }

   @JsonProperty("public_name")
   public void setPublicName(String publicName) {
      this.publicName = publicName;
   }

   @JsonProperty("public_name")
   public String getPublicName() {
      return this.publicName;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }
}
