package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoSkusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoSkusRequest extends AbstractRequest implements JdRequest<MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoSkusResponse> {
   private String appName;
   private int pageSize;
   private long promoId;
   private int pageIndex;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPromoId(long promoId) {
      this.promoId = promoId;
   }

   public long getPromoId() {
      return this.promoId;
   }

   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   public int getPageIndex() {
      return this.pageIndex;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.promo.api.unit.service.PlusDiscountReadOuterService.getPromoSkus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("pageSize", this.pageSize);
      pmap.put("promoId", this.promoId);
      pmap.put("pageIndex", this.pageIndex);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoSkusResponse> getResponseClass() {
      return MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoSkusResponse.class;
   }
}
