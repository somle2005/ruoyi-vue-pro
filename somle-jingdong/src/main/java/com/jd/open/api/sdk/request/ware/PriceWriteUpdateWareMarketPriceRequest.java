package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.PriceWriteUpdateWareMarketPriceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PriceWriteUpdateWareMarketPriceRequest extends AbstractRequest implements JdRequest<PriceWriteUpdateWareMarketPriceResponse> {
   private Long wareId;
   private BigDecimal marketPrice;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   public String getApiMethod() {
      return "jingdong.price.write.updateWareMarketPrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("marketPrice", this.marketPrice);
      return JsonUtil.toJson(pmap);
   }

   public Class<PriceWriteUpdateWareMarketPriceResponse> getResponseClass() {
      return PriceWriteUpdateWareMarketPriceResponse.class;
   }
}
