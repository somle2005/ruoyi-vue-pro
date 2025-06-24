package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPageSerialByBillNo.OQueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpSerialQueryPageSerialByBillNoResponse extends AbstractResponse {
   private OQueryResult querypageserialbybillnoResult;

   @JsonProperty("querypageserialbybillno_result")
   public void setQuerypageserialbybillnoResult(OQueryResult querypageserialbybillnoResult) {
      this.querypageserialbybillnoResult = querypageserialbybillnoResult;
   }

   @JsonProperty("querypageserialbybillno_result")
   public OQueryResult getQuerypageserialbybillnoResult() {
      return this.querypageserialbybillnoResult;
   }
}
