package com.jd.open.api.sdk.domain.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WareImg {
   private String imgName;
   private String url;

   @JsonProperty("img_name")
   public String getImgName() {
      return this.imgName;
   }

   @JsonProperty("img_name")
   public void setImgName(String imgName) {
      this.imgName = imgName;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }
}
