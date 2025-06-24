package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionGetOrderInfoByWaybillCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionGetOrderInfoByWaybillCodeRequest extends AbstractRequest implements JdRequest<YipProductionGetOrderInfoByWaybillCodeResponse> {
   private Long orderId;
   private String supplier;
   private String waybillCode;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   public String getSupplier() {
      return this.supplier;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.getOrderInfoByWaybillCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("supplier", this.supplier);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionGetOrderInfoByWaybillCodeResponse> getResponseClass() {
      return YipProductionGetOrderInfoByWaybillCodeResponse.class;
   }
}
