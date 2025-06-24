package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.SellerVenderInfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerVenderInfoGetRequest extends AbstractRequest implements JdRequest<SellerVenderInfoGetResponse> {
   private String extJsonParam;

   public void setExtJsonParam(String extJsonParam) {
      this.extJsonParam = extJsonParam;
   }

   public String getExtJsonParam() {
      return this.extJsonParam;
   }

   public String getApiMethod() {
      return "jingdong.seller.vender.info.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ext_json_param", this.extJsonParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerVenderInfoGetResponse> getResponseClass() {
      return SellerVenderInfoGetResponse.class;
   }
}
