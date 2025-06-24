package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPromoApiUnitServiceLeaguePromoSkuFlowServiceGetFlowPromoInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPromoApiUnitServiceLeaguePromoSkuFlowServiceGetFlowPromoInfoRequest extends AbstractRequest implements JdRequest<MarketToolPromoApiUnitServiceLeaguePromoSkuFlowServiceGetFlowPromoInfoResponse> {
   private String appName;
   private Integer pageIndex;
   private Integer pageSize;
   private Long promoId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.promo.api.unit.service.LeaguePromoSkuFlowService.getFlowPromoInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPromoApiUnitServiceLeaguePromoSkuFlowServiceGetFlowPromoInfoResponse> getResponseClass() {
      return MarketToolPromoApiUnitServiceLeaguePromoSkuFlowServiceGetFlowPromoInfoResponse.class;
   }
}
