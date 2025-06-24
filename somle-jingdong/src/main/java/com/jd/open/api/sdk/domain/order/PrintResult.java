package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.codec.Base64;
import com.jd.open.api.sdk.response.AbstractResponse;

public final class PrintResult extends AbstractResponse {
   private static final long serialVersionUID = -8208419145322734272L;
   private String htmlContent;
   private String htmlContent_base64;
   private String imageData;

   @JsonProperty("html_content")
   private String getHtmlContent_base64() {
      return this.htmlContent_base64;
   }

   @JsonProperty("html_content")
   private void setHtmlContent_base64(String htmlContent_base64) {
      this.htmlContent_base64 = htmlContent_base64;
   }

   @JsonProperty("image_data")
   public String getImageData() {
      return this.imageData;
   }

   @JsonProperty("image_data")
   public void setImageData(String imageData) {
      this.imageData = imageData;
   }

   public String getHtmlContent() {
      String hc = new String(Base64.decodeBase64(this.htmlContent_base64.getBytes()));
      return hc;
   }

   public void setHtmlContent(String htmlContent) {
      this.htmlContent = htmlContent;
   }
}
