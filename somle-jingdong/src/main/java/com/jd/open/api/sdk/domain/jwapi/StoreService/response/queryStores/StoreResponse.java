package com.jd.open.api.sdk.domain.jwapi.StoreService.response.queryStores;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StoreResponse implements Serializable {
   private List<BaseStore> stores;
   private Integer resultCode;
   private String message;

   @JsonProperty("stores")
   public void setStores(List<BaseStore> stores) {
      this.stores = stores;
   }

   @JsonProperty("stores")
   public List<BaseStore> getStores() {
      return this.stores;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
