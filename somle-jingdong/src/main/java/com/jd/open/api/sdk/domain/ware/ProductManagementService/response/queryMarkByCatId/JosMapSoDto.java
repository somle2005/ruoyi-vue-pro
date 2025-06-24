package com.jd.open.api.sdk.domain.ware.ProductManagementService.response.queryMarkByCatId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class JosMapSoDto implements Serializable {
   private Map<String, Object> singleObj;
   private String returnMessage;
   private boolean isSuccess;

   @JsonProperty("singleObj")
   public void setSingleObj(Map<String, Object> singleObj) {
      this.singleObj = singleObj;
   }

   @JsonProperty("singleObj")
   public Map<String, Object> getSingleObj() {
      return this.singleObj;
   }

   @JsonProperty("returnMessage")
   public void setReturnMessage(String returnMessage) {
      this.returnMessage = returnMessage;
   }

   @JsonProperty("returnMessage")
   public String getReturnMessage() {
      return this.returnMessage;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }
}
