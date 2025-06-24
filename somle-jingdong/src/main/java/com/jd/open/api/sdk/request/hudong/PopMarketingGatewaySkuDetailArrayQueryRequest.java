package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewaySkuDetailArrayQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewaySkuDetailArrayQueryRequest extends AbstractRequest implements JdRequest<PopMarketingGatewaySkuDetailArrayQueryResponse> {
   private String mktActBaseNo;
   private String mktSearchType;
   private String skuIds;

   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   public void setMktSearchType(String mktSearchType) {
      this.mktSearchType = mktSearchType;
   }

   public String getMktSearchType() {
      return this.mktSearchType;
   }

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.sku.detail.array.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("mktActBaseNo", this.mktActBaseNo);
      pmap.put("mktSearchType", this.mktSearchType);
      pmap.put("skuIds", this.skuIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewaySkuDetailArrayQueryResponse> getResponseClass() {
      return PopMarketingGatewaySkuDetailArrayQueryResponse.class;
   }
}
