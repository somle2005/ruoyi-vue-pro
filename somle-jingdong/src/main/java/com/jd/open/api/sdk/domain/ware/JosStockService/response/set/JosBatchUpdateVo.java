package com.jd.open.api.sdk.domain.ware.JosStockService.response.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosBatchUpdateVo implements Serializable {
   private String message;
   private Long data;
   private Integer storeId;
   private Boolean success;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(Long data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Long getData() {
      return this.data;
   }

   @JsonProperty("storeId")
   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer getStoreId() {
      return this.storeId;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }
}
