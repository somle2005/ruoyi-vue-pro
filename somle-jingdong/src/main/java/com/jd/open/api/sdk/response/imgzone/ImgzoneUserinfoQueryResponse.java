package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzoneUserinfoQueryResponse extends AbstractResponse {
   private int returnCode;
   private String desc;
   private ImgzoneZoneInfo userInfo;

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

   @JsonProperty("userInfo")
   public void setUserInfo(ImgzoneZoneInfo userInfo) {
      this.userInfo = userInfo;
   }

   @JsonProperty("userInfo")
   public ImgzoneZoneInfo getUserInfo() {
      return this.userInfo;
   }
}
