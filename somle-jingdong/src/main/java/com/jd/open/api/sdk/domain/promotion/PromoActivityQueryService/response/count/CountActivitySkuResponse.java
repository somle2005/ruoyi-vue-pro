package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.count;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CountActivitySkuResponse implements Serializable {
   private ResponseResult result;
   private Integer count;

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }

   @JsonProperty("count")
   public void setCount(Integer count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Integer getCount() {
      return this.count;
   }
}
