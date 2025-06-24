package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.OrderQueryResource.response.queryOrderPay.QueryOrderByPayResVo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryOrderPayResponse extends AbstractResponse {
   private QueryOrderByPayResVo resVo;

   @JsonProperty("resVo")
   public void setResVo(QueryOrderByPayResVo resVo) {
      this.resVo = resVo;
   }

   @JsonProperty("resVo")
   public QueryOrderByPayResVo getResVo() {
      return this.resVo;
   }
}
