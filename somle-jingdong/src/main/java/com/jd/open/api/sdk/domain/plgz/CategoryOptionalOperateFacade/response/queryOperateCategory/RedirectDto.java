package com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.response.queryOperateCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RedirectDto implements Serializable {
   private String redirectUrl;
   private String redirectText;
   private Integer redirectType;

   @JsonProperty("redirectUrl")
   public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
   }

   @JsonProperty("redirectUrl")
   public String getRedirectUrl() {
      return this.redirectUrl;
   }

   @JsonProperty("redirectText")
   public void setRedirectText(String redirectText) {
      this.redirectText = redirectText;
   }

   @JsonProperty("redirectText")
   public String getRedirectText() {
      return this.redirectText;
   }

   @JsonProperty("redirectType")
   public void setRedirectType(Integer redirectType) {
      this.redirectType = redirectType;
   }

   @JsonProperty("redirectType")
   public Integer getRedirectType() {
      return this.redirectType;
   }
}
