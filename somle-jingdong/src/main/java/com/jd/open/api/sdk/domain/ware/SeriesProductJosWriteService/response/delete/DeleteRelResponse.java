package com.jd.open.api.sdk.domain.ware.SeriesProductJosWriteService.response.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DeleteRelResponse implements Serializable {
   private Long productId;
   private Boolean success;
   private String errorMsg;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
