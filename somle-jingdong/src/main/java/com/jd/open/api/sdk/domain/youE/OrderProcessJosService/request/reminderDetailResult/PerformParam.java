package com.jd.open.api.sdk.domain.youE.OrderProcessJosService.request.reminderDetailResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PerformParam implements Serializable {
   private String venderCode;
   private String appId;
   private String createBy;
   private List<RemindResultParam> data;
   private String token;

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("createBy")
   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   @JsonProperty("createBy")
   public String getCreateBy() {
      return this.createBy;
   }

   @JsonProperty("data")
   public void setData(List<RemindResultParam> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<RemindResultParam> getData() {
      return this.data;
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
