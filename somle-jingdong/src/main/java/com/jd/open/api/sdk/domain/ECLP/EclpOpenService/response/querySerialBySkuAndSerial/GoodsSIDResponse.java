package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySerialBySkuAndSerial;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GoodsSIDResponse implements Serializable {
   private List<GoodsSID> goodsSIDList;

   @JsonProperty("goodsSIDList")
   public void setGoodsSIDList(List<GoodsSID> goodsSIDList) {
      this.goodsSIDList = goodsSIDList;
   }

   @JsonProperty("goodsSIDList")
   public List<GoodsSID> getGoodsSIDList() {
      return this.goodsSIDList;
   }
}
