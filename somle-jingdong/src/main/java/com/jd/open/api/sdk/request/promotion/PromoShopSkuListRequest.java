package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.list.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.list.ProductQueryVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopSkuListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopSkuListRequest extends AbstractRequest implements JdRequest<PromoShopSkuListResponse> {
   private ClientInfo clientInfo;
   private ProductQueryVo queryVo;

   public String getApiMethod() {
      return "jingdong.promo.shop.sku.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("queryVo", this.queryVo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopSkuListResponse> getResponseClass() {
      return PromoShopSkuListResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("queryVo")
   public void setQueryVo(ProductQueryVo queryVo) {
      this.queryVo = queryVo;
   }

   @JsonProperty("queryVo")
   public ProductQueryVo getQueryVo() {
      return this.queryVo;
   }
}
