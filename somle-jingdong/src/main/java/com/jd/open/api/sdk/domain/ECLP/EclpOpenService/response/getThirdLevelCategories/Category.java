package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getThirdLevelCategories;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Category implements Serializable {
   private String[] categoryNo;
   private String[] categoryName;

   @JsonProperty("categoryNo")
   public void setCategoryNo(String[] categoryNo) {
      this.categoryNo = categoryNo;
   }

   @JsonProperty("categoryNo")
   public String[] getCategoryNo() {
      return this.categoryNo;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String[] categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String[] getCategoryName() {
      return this.categoryName;
   }
}
