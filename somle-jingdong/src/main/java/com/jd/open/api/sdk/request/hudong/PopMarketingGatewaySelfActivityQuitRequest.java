package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewaySelfActivityQuitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewaySelfActivityQuitRequest extends AbstractRequest implements JdRequest<PopMarketingGatewaySelfActivityQuitResponse> {
   private String catGysCode;
   private String mktActBaseNo;

   public void setCatGysCode(String catGysCode) {
      this.catGysCode = catGysCode;
   }

   public String getCatGysCode() {
      return this.catGysCode;
   }

   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.self.activity.quit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("catGysCode", this.catGysCode);
      pmap.put("mktActBaseNo", this.mktActBaseNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewaySelfActivityQuitResponse> getResponseClass() {
      return PopMarketingGatewaySelfActivityQuitResponse.class;
   }
}
