package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzonePictureUploadResponse extends AbstractResponse {
   private int returnCode;
   private String desc;
   private String pictureId;
   private String pictureUrl;

   @JsonProperty("return_code")
   public void setReturnCode(int returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public int getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("picture_id")
   public void setPictureId(String pictureId) {
      this.pictureId = pictureId;
   }

   @JsonProperty("picture_id")
   public String getPictureId() {
      return this.pictureId;
   }

   @JsonProperty("picture_url")
   public void setPictureUrl(String pictureUrl) {
      this.pictureUrl = pictureUrl;
   }

   @JsonProperty("picture_url")
   public String getPictureUrl() {
      return this.pictureUrl;
   }
}
