package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.PriceWriteUpdateSkuJdPriceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PriceWriteUpdateSkuJdPriceRequest extends AbstractRequest implements JdRequest<PriceWriteUpdateSkuJdPriceResponse> {
   private BigDecimal jdPrice;
   private Long skuId;

   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.price.write.updateSkuJdPrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("jdPrice", this.jdPrice);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PriceWriteUpdateSkuJdPriceResponse> getResponseClass() {
      return PriceWriteUpdateSkuJdPriceResponse.class;
   }
}
