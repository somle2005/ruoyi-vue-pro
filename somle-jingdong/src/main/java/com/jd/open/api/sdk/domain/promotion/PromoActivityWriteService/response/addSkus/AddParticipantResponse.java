package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.addSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AddParticipantResponse implements Serializable {
   private ResponseResult result;
   private List<SkuErrorInfo> errorSkuList;

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }

   @JsonProperty("errorSkuList")
   public void setErrorSkuList(List<SkuErrorInfo> errorSkuList) {
      this.errorSkuList = errorSkuList;
   }

   @JsonProperty("errorSkuList")
   public List<SkuErrorInfo> getErrorSkuList() {
      return this.errorSkuList;
   }
}
