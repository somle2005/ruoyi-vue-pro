package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.GetSkuUpdateSettlePriceInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetSkuUpdateSettlePriceInfoRequest extends AbstractRequest implements JdRequest<GetSkuUpdateSettlePriceInfoResponse> {
   private String appid;
   private String venderCode;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public String getApiMethod() {
      return "jingdong.getSkuUpdateSettlePriceInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("venderCode", this.venderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetSkuUpdateSettlePriceInfoResponse> getResponseClass() {
      return GetSkuUpdateSettlePriceInfoResponse.class;
   }
}
