package com.jd.open.api.sdk.domain.supplier.ResourceRestJsfServiceJosAPI.response.getResouceUploadToken;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UploadToken implements Serializable {
   private String uploadUrl;
   private String startTime;
   private String token;

   @JsonProperty("upload_url")
   public void setUploadUrl(String uploadUrl) {
      this.uploadUrl = uploadUrl;
   }

   @JsonProperty("upload_url")
   public String getUploadUrl() {
      return this.uploadUrl;
   }

   @JsonProperty("start_time")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("start_time")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("token")
   public void setToken(String token) {
      this.token = token;
   }

   @JsonProperty("token")
   public String getToken() {
      return this.token;
   }
}
