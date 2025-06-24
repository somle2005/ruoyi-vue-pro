package com.jd.open.api.sdk.domain.youE.CollectedJsfService.request.collected;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseParam implements Serializable {
   private String code;
   private String appid;
   private List<CollectedOrder> data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("appid")
   public void setAppid(String appid) {
      this.appid = appid;
   }

   @JsonProperty("appid")
   public String getAppid() {
      return this.appid;
   }

   @JsonProperty("data")
   public void setData(List<CollectedOrder> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<CollectedOrder> getData() {
      return this.data;
   }
}
