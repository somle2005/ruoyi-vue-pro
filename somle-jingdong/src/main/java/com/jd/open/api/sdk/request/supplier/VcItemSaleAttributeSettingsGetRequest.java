package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemSaleAttributeSettingsGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemSaleAttributeSettingsGetRequest extends AbstractRequest implements JdRequest<VcItemSaleAttributeSettingsGetResponse> {
   private int cid3;

   public void setCid3(int cid3) {
      this.cid3 = cid3;
   }

   public int getCid3() {
      return this.cid3;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.saleAttributeSettings.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid3", this.cid3);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemSaleAttributeSettingsGetResponse> getResponseClass() {
      return VcItemSaleAttributeSettingsGetResponse.class;
   }
}
