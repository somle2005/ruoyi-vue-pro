package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InteractCenterServiceReadEvaluateEvaluateActivityDsmServiceGetVenderBeanAccountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractCenterServiceReadEvaluateEvaluateActivityDsmServiceGetVenderBeanAccountRequest extends AbstractRequest implements JdRequest<InteractCenterServiceReadEvaluateEvaluateActivityDsmServiceGetVenderBeanAccountResponse> {
   private String shopName;
   private String supplierCode;

   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   public String getShopName() {
      return this.shopName;
   }

   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   public String getSupplierCode() {
      return this.supplierCode;
   }

   public String getApiMethod() {
      return "jingdong.interact.center.service.read.evaluate.EvaluateActivityDsmService.getVenderBeanAccount";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("shopName", this.shopName);
      pmap.put("supplierCode", this.supplierCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractCenterServiceReadEvaluateEvaluateActivityDsmServiceGetVenderBeanAccountResponse> getResponseClass() {
      return InteractCenterServiceReadEvaluateEvaluateActivityDsmServiceGetVenderBeanAccountResponse.class;
   }
}
