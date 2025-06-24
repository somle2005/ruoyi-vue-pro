package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionQueryRecommandCarriersResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionQueryRecommandCarriersRequest extends AbstractRequest implements JdRequest<YipProductionQueryRecommandCarriersResponse> {
   private String localeStr;
   private String loginName;
   private String vendorCode;

   public void setLocaleStr(String localeStr) {
      this.localeStr = localeStr;
   }

   public String getLocaleStr() {
      return this.localeStr;
   }

   public void setLoginName(String loginName) {
      this.loginName = loginName;
   }

   public String getLoginName() {
      return this.loginName;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.queryRecommandCarriers";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("localeStr", this.localeStr);
      pmap.put("loginName", this.loginName);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionQueryRecommandCarriersResponse> getResponseClass() {
      return YipProductionQueryRecommandCarriersResponse.class;
   }
}
