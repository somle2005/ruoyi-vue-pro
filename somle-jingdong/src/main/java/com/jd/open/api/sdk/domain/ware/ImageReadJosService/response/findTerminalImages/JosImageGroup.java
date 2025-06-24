package com.jd.open.api.sdk.domain.ware.ImageReadJosService.response.findTerminalImages;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosImageGroup implements Serializable {
   private Long productId;
   private String site;
   private String userAgent;
   private int imgType;
   private String imageGroupId;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("site")
   public void setSite(String site) {
      this.site = site;
   }

   @JsonProperty("site")
   public String getSite() {
      return this.site;
   }

   @JsonProperty("userAgent")
   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   @JsonProperty("userAgent")
   public String getUserAgent() {
      return this.userAgent;
   }

   @JsonProperty("imgType")
   public void setImgType(int imgType) {
      this.imgType = imgType;
   }

   @JsonProperty("imgType")
   public int getImgType() {
      return this.imgType;
   }

   @JsonProperty("imageGroupId")
   public void setImageGroupId(String imageGroupId) {
      this.imageGroupId = imageGroupId;
   }

   @JsonProperty("imageGroupId")
   public String getImageGroupId() {
      return this.imageGroupId;
   }
}
