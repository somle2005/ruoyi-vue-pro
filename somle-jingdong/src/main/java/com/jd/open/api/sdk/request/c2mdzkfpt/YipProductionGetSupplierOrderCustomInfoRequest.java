package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionGetSupplierOrderCustomInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionGetSupplierOrderCustomInfoRequest extends AbstractRequest implements JdRequest<YipProductionGetSupplierOrderCustomInfoResponse> {
   private String supplier;
   private Long coId;
   private String venderId;

   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   public String getSupplier() {
      return this.supplier;
   }

   public void setCoId(Long coId) {
      this.coId = coId;
   }

   public Long getCoId() {
      return this.coId;
   }

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.getSupplierOrderCustomInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("supplier", this.supplier);
      pmap.put("coId", this.coId);
      pmap.put("venderId", this.venderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionGetSupplierOrderCustomInfoResponse> getResponseClass() {
      return YipProductionGetSupplierOrderCustomInfoResponse.class;
   }
}
