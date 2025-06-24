package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemSaleAttributeSettingsV1GetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemSaleAttributeSettingsV1GetRequest extends AbstractRequest implements JdRequest<VcItemSaleAttributeSettingsV1GetResponse> {
   private Integer cid3;

   public void setCid3(Integer cid3) {
      this.cid3 = cid3;
   }

   public Integer getCid3() {
      return this.cid3;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.saleAttributeSettingsV1.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid3", this.cid3);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemSaleAttributeSettingsV1GetResponse> getResponseClass() {
      return VcItemSaleAttributeSettingsV1GetResponse.class;
   }
}
