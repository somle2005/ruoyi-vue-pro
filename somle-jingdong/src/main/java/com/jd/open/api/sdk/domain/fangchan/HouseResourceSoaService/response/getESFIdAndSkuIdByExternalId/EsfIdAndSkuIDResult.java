package com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.getESFIdAndSkuIdByExternalId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EsfIdAndSkuIDResult implements Serializable {
   private EsfIdAndSkuIDDTO esfIdAndSkuIDDTO;
   private boolean success;
   private int code;
   private String errorMsg;

   @JsonProperty("esfIdAndSkuIDDTO")
   public void setEsfIdAndSkuIDDTO(EsfIdAndSkuIDDTO esfIdAndSkuIDDTO) {
      this.esfIdAndSkuIDDTO = esfIdAndSkuIDDTO;
   }

   @JsonProperty("esfIdAndSkuIDDTO")
   public EsfIdAndSkuIDDTO getEsfIdAndSkuIDDTO() {
      return this.esfIdAndSkuIDDTO;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
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
