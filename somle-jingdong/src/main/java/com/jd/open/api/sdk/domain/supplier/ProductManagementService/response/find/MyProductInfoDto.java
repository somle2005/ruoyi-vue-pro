package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class MyProductInfoDto implements Serializable {
   private String wareId;
   private String wareName;
   private Integer saleState;
   private Date modifyTime;
   private Integer isPrimary;
   private Integer isGaea;

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_name")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("ware_name")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("sale_state")
   public void setSaleState(Integer saleState) {
      this.saleState = saleState;
   }

   @JsonProperty("sale_state")
   public Integer getSaleState() {
      return this.saleState;
   }

   @JsonProperty("modify_time")
   public void setModifyTime(Date modifyTime) {
      this.modifyTime = modifyTime;
   }

   @JsonProperty("modify_time")
   public Date getModifyTime() {
      return this.modifyTime;
   }

   @JsonProperty("is_primary")
   public void setIsPrimary(Integer isPrimary) {
      this.isPrimary = isPrimary;
   }

   @JsonProperty("is_primary")
   public Integer getIsPrimary() {
      return this.isPrimary;
   }

   @JsonProperty("is_gaea")
   public void setIsGaea(Integer isGaea) {
      this.isGaea = isGaea;
   }

   @JsonProperty("is_gaea")
   public Integer getIsGaea() {
      return this.isGaea;
   }
}
