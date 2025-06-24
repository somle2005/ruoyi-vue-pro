package com.jd.open.api.sdk.domain.mall.SubsidyImgExportService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImgUploadExtParam implements Serializable {
   private String imgType;
   private String ruleType;
   private String imgRequirementType;
   private String imgUrl;
   private Integer imgStatus;
   private String imgRemark;

   @JsonProperty("imgType")
   public void setImgType(String imgType) {
      this.imgType = imgType;
   }

   @JsonProperty("imgType")
   public String getImgType() {
      return this.imgType;
   }

   @JsonProperty("ruleType")
   public void setRuleType(String ruleType) {
      this.ruleType = ruleType;
   }

   @JsonProperty("ruleType")
   public String getRuleType() {
      return this.ruleType;
   }

   @JsonProperty("imgRequirementType")
   public void setImgRequirementType(String imgRequirementType) {
      this.imgRequirementType = imgRequirementType;
   }

   @JsonProperty("imgRequirementType")
   public String getImgRequirementType() {
      return this.imgRequirementType;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgStatus")
   public void setImgStatus(Integer imgStatus) {
      this.imgStatus = imgStatus;
   }

   @JsonProperty("imgStatus")
   public Integer getImgStatus() {
      return this.imgStatus;
   }

   @JsonProperty("imgRemark")
   public void setImgRemark(String imgRemark) {
      this.imgRemark = imgRemark;
   }

   @JsonProperty("imgRemark")
   public String getImgRemark() {
      return this.imgRemark;
   }
}
