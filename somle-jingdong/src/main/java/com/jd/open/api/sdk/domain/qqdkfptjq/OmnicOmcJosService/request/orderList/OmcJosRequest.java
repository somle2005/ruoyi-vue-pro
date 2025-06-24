package com.jd.open.api.sdk.domain.qqdkfptjq.OmnicOmcJosService.request.orderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class OmcJosRequest implements Serializable {
   private String authKey;
   private Map<String, Object> data;

   @JsonProperty("authKey")
   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   @JsonProperty("authKey")
   public String getAuthKey() {
      return this.authKey;
   }

   @JsonProperty("data")
   public void setData(Map<String, Object> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Map<String, Object> getData() {
      return this.data;
   }
}
