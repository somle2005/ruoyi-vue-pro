package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.request.batchadd.JOSClient;
import com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.request.batchadd.ShortTitleSellerInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.RetailWareTextMaterialBatchaddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RetailWareTextMaterialBatchaddRequest extends AbstractRequest implements JdRequest<RetailWareTextMaterialBatchaddResponse> {
   private JOSClient josClient;
   private ShortTitleSellerInfo shortTitleSellerInfo;

   public String getApiMethod() {
      return "jingdong.retail.ware.text.material.batchadd";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josClient", this.josClient);
      pmap.put("shortTitleSellerInfo", this.shortTitleSellerInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<RetailWareTextMaterialBatchaddResponse> getResponseClass() {
      return RetailWareTextMaterialBatchaddResponse.class;
   }

   @JsonProperty("josClient")
   public void setJosClient(JOSClient josClient) {
      this.josClient = josClient;
   }

   @JsonProperty("josClient")
   public JOSClient getJosClient() {
      return this.josClient;
   }

   @JsonProperty("shortTitleSellerInfo")
   public void setShortTitleSellerInfo(ShortTitleSellerInfo shortTitleSellerInfo) {
      this.shortTitleSellerInfo = shortTitleSellerInfo;
   }

   @JsonProperty("shortTitleSellerInfo")
   public ShortTitleSellerInfo getShortTitleSellerInfo() {
      return this.shortTitleSellerInfo;
   }
}
