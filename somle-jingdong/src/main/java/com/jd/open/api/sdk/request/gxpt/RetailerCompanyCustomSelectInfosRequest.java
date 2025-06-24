package com.jd.open.api.sdk.request.gxpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gxpt.RetailerCompanyCustomSelectInfosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RetailerCompanyCustomSelectInfosRequest extends AbstractRequest implements JdRequest<RetailerCompanyCustomSelectInfosResponse> {
   private Integer sellerId;

   public void setSellerId(Integer sellerId) {
      this.sellerId = sellerId;
   }

   public Integer getSellerId() {
      return this.sellerId;
   }

   public String getApiMethod() {
      return "jingdong.retailer.company.custom.select.infos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sellerId", this.sellerId);
      return JsonUtil.toJson(pmap);
   }

   public Class<RetailerCompanyCustomSelectInfosResponse> getResponseClass() {
      return RetailerCompanyCustomSelectInfosResponse.class;
   }
}
