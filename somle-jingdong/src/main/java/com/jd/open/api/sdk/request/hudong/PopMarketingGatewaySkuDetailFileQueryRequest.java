package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewaySkuDetailFileQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewaySkuDetailFileQueryRequest extends AbstractRequest implements JdRequest<PopMarketingGatewaySkuDetailFileQueryResponse> {
   private Integer pageSize;
   private String mktActBaseNo;
   private Integer page;
   private String mktSearchType;
   private String skuId;

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setMktSearchType(String mktSearchType) {
      this.mktSearchType = mktSearchType;
   }

   public String getMktSearchType() {
      return this.mktSearchType;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.sku.detail.file.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("mktActBaseNo", this.mktActBaseNo);
      pmap.put("page", this.page);
      pmap.put("mktSearchType", this.mktSearchType);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewaySkuDetailFileQueryResponse> getResponseClass() {
      return PopMarketingGatewaySkuDetailFileQueryResponse.class;
   }
}
