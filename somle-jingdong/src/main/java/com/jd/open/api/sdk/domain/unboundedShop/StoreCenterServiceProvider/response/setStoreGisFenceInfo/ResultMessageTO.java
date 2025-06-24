package com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.setStoreGisFenceInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ResultMessageTO implements Serializable {
   private boolean success;
   private Map<String, String> message;
   private GisFenceInfoTo attribute2;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(Map<String, String> message) {
      this.message = message;
   }

   @JsonProperty("message")
   public Map<String, String> getMessage() {
      return this.message;
   }

   @JsonProperty("attribute2")
   public void setAttribute2(GisFenceInfoTo attribute2) {
      this.attribute2 = attribute2;
   }

   @JsonProperty("attribute2")
   public GisFenceInfoTo getAttribute2() {
      return this.attribute2;
   }
}
