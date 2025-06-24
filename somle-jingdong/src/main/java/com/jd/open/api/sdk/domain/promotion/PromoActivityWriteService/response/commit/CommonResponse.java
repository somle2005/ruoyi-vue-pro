package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.commit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CommonResponse implements Serializable {
   private ResponseResult result;

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }
}
