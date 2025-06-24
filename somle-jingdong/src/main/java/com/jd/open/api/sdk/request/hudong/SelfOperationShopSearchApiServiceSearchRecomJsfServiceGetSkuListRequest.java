package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSkuListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSkuListRequest extends AbstractRequest implements JdRequest<SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSkuListResponse> {
   private String keyword;
   private Long promoId;
   private Integer pageNo;
   private Integer pageSize;

   public void setKeyword(String keyword) {
      this.keyword = keyword;
   }

   public String getKeyword() {
      return this.keyword;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.self.operation.shop.search.api.service.SearchRecomJsfService.getSkuList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("keyword", this.keyword);
      pmap.put("promoId", this.promoId);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSkuListResponse> getResponseClass() {
      return SelfOperationShopSearchApiServiceSearchRecomJsfServiceGetSkuListResponse.class;
   }
}
