package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySellerCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SellerCategory implements Serializable {
   private String deptId;
   private String categoryNo;
   private String categoryName;
   private String level;

   @JsonProperty("deptId")
   public void setDeptId(String deptId) {
      this.deptId = deptId;
   }

   @JsonProperty("deptId")
   public String getDeptId() {
      return this.deptId;
   }

   @JsonProperty("categoryNo")
   public void setCategoryNo(String categoryNo) {
      this.categoryNo = categoryNo;
   }

   @JsonProperty("categoryNo")
   public String getCategoryNo() {
      return this.categoryNo;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("level")
   public void setLevel(String level) {
      this.level = level;
   }

   @JsonProperty("level")
   public String getLevel() {
      return this.level;
   }
}
