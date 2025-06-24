package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzonePictureUpdateResponse extends AbstractResponse {
   private int returnCode;
   private String desc;

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
}
