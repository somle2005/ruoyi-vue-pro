package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemPurchasernameGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemPurchasernameGetRequest extends AbstractRequest implements JdRequest<VcItemPurchasernameGetResponse> {
   private String purchaserCode;

   public void setPurchaserCode(String purchaserCode) {
      this.purchaserCode = purchaserCode;
   }

   public String getPurchaserCode() {
      return this.purchaserCode;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.purchasername.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("purchaser_code", this.purchaserCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemPurchasernameGetResponse> getResponseClass() {
      return VcItemPurchasernameGetResponse.class;
   }
}
