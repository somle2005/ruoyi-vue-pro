package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionOrderDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionOrderDetailRequest extends AbstractRequest implements JdRequest<YipProductionOrderDetailResponse> {
   private String localeStr;
   private String loginName;
   private Long coId;
   private Integer pageSize;
   private String source;
   private Integer page;
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

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.orderDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("localeStr", this.localeStr);
      pmap.put("loginName", this.loginName);
      pmap.put("coId", this.coId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("source", this.source);
      pmap.put("page", this.page);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionOrderDetailResponse> getResponseClass() {
      return YipProductionOrderDetailResponse.class;
   }
}
