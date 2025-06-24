package com.jd.open.api.sdk.domain.unboundedShop.StoreCategoryProvider.response.queryMetaAttrStoreQualificationList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ResultMessageTO implements Serializable {
   private boolean success;
   private Map<String, String> message;
   private StoreBaseInfoTO value;

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

   @JsonProperty("value")
   public void setValue(StoreBaseInfoTO value) {
      this.value = value;
   }

   @JsonProperty("value")
   public StoreBaseInfoTO getValue() {
      return this.value;
   }
}
