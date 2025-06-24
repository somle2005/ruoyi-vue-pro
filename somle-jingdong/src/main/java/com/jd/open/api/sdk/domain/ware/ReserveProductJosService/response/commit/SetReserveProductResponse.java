package com.jd.open.api.sdk.domain.ware.ReserveProductJosService.response.commit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SetReserveProductResponse implements Serializable {
   private Boolean success;
   private Long skuId;
   private String errorMsg;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
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
