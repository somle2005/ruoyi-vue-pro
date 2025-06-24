package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.flowLog.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.flowLog.ProductQueryVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopGetFlowLogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopGetFlowLogRequest extends AbstractRequest implements JdRequest<PromoShopGetFlowLogResponse> {
   private ClientInfo clientInfo;
   private ProductQueryVo productQueryVo;

   public String getApiMethod() {
      return "jingdong.promo.shop.get.flowLog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("productQueryVo", this.productQueryVo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopGetFlowLogResponse> getResponseClass() {
      return PromoShopGetFlowLogResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("productQueryVo")
   public void setProductQueryVo(ProductQueryVo productQueryVo) {
      this.productQueryVo = productQueryVo;
   }

   @JsonProperty("productQueryVo")
   public ProductQueryVo getProductQueryVo() {
      return this.productQueryVo;
   }
}
