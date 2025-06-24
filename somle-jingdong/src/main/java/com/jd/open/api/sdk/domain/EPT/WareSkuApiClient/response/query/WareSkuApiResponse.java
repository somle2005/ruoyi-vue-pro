package com.jd.open.api.sdk.domain.EPT.WareSkuApiClient.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WareSkuApiResponse implements Serializable {
   private List<Map> skuList;
   private String messegeCode;
   private String message;
   private boolean success;

   @JsonProperty("skuList")
   public void setSkuList(List<Map> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<Map> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("messegeCode")
   public void setMessegeCode(String messegeCode) {
      this.messegeCode = messegeCode;
   }

   @JsonProperty("messegeCode")
   public String getMessegeCode() {
      return this.messegeCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }
}
