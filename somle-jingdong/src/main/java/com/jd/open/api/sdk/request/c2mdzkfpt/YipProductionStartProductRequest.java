package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionStartProductResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionStartProductRequest extends AbstractRequest implements JdRequest<YipProductionStartProductResponse> {
   private String localeStr;
   private String loginName;
   private Long coId;
   private Integer addressId;
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

   public void setCoId(Long coId) {
      this.coId = coId;
   }

   public Long getCoId() {
      return this.coId;
   }

   public void setAddressId(Integer addressId) {
      this.addressId = addressId;
   }

   public Integer getAddressId() {
      return this.addressId;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.startProduct";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("localeStr", this.localeStr);
      pmap.put("loginName", this.loginName);
      pmap.put("coId", this.coId);
      pmap.put("addressId", this.addressId);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionStartProductResponse> getResponseClass() {
      return YipProductionStartProductResponse.class;
   }
}
