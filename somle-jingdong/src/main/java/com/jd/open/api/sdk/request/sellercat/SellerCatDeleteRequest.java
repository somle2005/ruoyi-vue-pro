package com.jd.open.api.sdk.request.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sellercat.SellerCatDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCatDeleteRequest extends AbstractRequest implements JdRequest<SellerCatDeleteResponse> {
   private String cid;

   @JsonProperty("cid")
   public String getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getApiMethod() {
      return "360buy.sellercat.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCatDeleteResponse> getResponseClass() {
      return SellerCatDeleteResponse.class;
   }
}
