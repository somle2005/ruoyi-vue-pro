package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bPoPoMidProviderQueryPurOrderDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bPoPoMidProviderQueryPurOrderDetailRequest extends AbstractRequest implements JdRequest<B2bPoPoMidProviderQueryPurOrderDetailResponse> {
   private String poId;
   private String tagName;

   public void setPoId(String poId) {
      this.poId = poId;
   }

   public String getPoId() {
      return this.poId;
   }

   public void setTagName(String tagName) {
      this.tagName = tagName;
   }

   public String getTagName() {
      return this.tagName;
   }

   public String getApiMethod() {
      return "jingdong.b2b.po.PoMidProvider.queryPurOrderDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("poId", this.poId);
      pmap.put("tagName", this.tagName);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bPoPoMidProviderQueryPurOrderDetailResponse> getResponseClass() {
      return B2bPoPoMidProviderQueryPurOrderDetailResponse.class;
   }
}
