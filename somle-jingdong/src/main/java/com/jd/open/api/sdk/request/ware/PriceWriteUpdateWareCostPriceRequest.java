package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.PriceWriteUpdateWareCostPriceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PriceWriteUpdateWareCostPriceRequest extends AbstractRequest implements JdRequest<PriceWriteUpdateWareCostPriceResponse> {
   private Long wareId;
   private BigDecimal costPrice;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setCostPrice(BigDecimal costPrice) {
      this.costPrice = costPrice;
   }

   public BigDecimal getCostPrice() {
      return this.costPrice;
   }

   public String getApiMethod() {
      return "jingdong.price.write.updateWareCostPrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("costPrice", this.costPrice);
      return JsonUtil.toJson(pmap);
   }

   public Class<PriceWriteUpdateWareCostPriceResponse> getResponseClass() {
      return PriceWriteUpdateWareCostPriceResponse.class;
   }
}
