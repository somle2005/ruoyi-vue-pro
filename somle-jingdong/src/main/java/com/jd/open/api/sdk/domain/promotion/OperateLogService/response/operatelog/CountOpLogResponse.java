package com.jd.open.api.sdk.domain.promotion.OperateLogService.response.operatelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CountOpLogResponse implements Serializable {
   private int count;
   private ResponseResult result;

   @JsonProperty("count")
   public void setCount(int count) {
      this.count = count;
   }

   @JsonProperty("count")
   public int getCount() {
      return this.count;
   }

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }
}
