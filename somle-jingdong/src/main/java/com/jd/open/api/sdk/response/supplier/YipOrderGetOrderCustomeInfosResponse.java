package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.OrderCustomInfoGetterJos.response.getOrderCustomeInfos.DataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipOrderGetOrderCustomeInfosResponse extends AbstractResponse {
   private DataResult dataResult;

   @JsonProperty("dataResult")
   public void setDataResult(DataResult dataResult) {
      this.dataResult = dataResult;
   }

   @JsonProperty("dataResult")
   public DataResult getDataResult() {
      return this.dataResult;
   }
}
