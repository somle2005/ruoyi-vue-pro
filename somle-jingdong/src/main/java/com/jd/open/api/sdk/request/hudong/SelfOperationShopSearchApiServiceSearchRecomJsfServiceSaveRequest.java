package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.request.save.Client;
import com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.request.save.SearchRecomVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.SelfOperationShopSearchApiServiceSearchRecomJsfServiceSaveResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SelfOperationShopSearchApiServiceSearchRecomJsfServiceSaveRequest extends AbstractRequest implements JdRequest<SelfOperationShopSearchApiServiceSearchRecomJsfServiceSaveResponse> {
   private Client client;
   private List<SearchRecomVo> searchRecomVos;

   public String getApiMethod() {
      return "jingdong.self.operation.shop.search.api.service.SearchRecomJsfService.save";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("client", this.client);
      pmap.put("searchRecomVos", this.searchRecomVos);
      return JsonUtil.toJson(pmap);
   }

   public Class<SelfOperationShopSearchApiServiceSearchRecomJsfServiceSaveResponse> getResponseClass() {
      return SelfOperationShopSearchApiServiceSearchRecomJsfServiceSaveResponse.class;
   }

   @JsonProperty("client")
   public void setClient(Client client) {
      this.client = client;
   }

   @JsonProperty("client")
   public Client getClient() {
      return this.client;
   }

   @JsonProperty("searchRecomVos")
   public void setSearchRecomVos(List<SearchRecomVo> searchRecomVos) {
      this.searchRecomVos = searchRecomVos;
   }

   @JsonProperty("searchRecomVos")
   public List<SearchRecomVo> getSearchRecomVos() {
      return this.searchRecomVos;
   }
}
