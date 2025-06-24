package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemSpuTemplateGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemSpuTemplateGetRequest extends AbstractRequest implements JdRequest<VcItemSpuTemplateGetResponse> {
   private int cid3;
   private int brandId;
   private String model;

   public void setCid3(int cid3) {
      this.cid3 = cid3;
   }

   public int getCid3() {
      return this.cid3;
   }

   public void setBrandId(int brandId) {
      this.brandId = brandId;
   }

   public int getBrandId() {
      return this.brandId;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getModel() {
      return this.model;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.spuTemplate.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid3", this.cid3);
      pmap.put("brand_id", this.brandId);
      pmap.put("model", this.model);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemSpuTemplateGetResponse> getResponseClass() {
      return VcItemSpuTemplateGetResponse.class;
   }
}
