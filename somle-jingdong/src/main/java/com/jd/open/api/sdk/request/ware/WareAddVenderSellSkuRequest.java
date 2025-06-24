package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareAddVenderSellSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAddVenderSellSkuRequest extends AbstractRequest implements JdRequest<WareAddVenderSellSkuResponse> {
   private String category_id;
   private String index_id;
   private String attribute_id;
   private String attribute_value;
   private String features;
   private String status;

   public String getApiMethod() {
      return "360buy.wares.vendersellsku.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("category_id", this.category_id);
      pmap.put("index_id", this.index_id);
      pmap.put("attribute_id", this.attribute_id);
      pmap.put("attribute_value", this.attribute_value);
      pmap.put("features", this.features);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareAddVenderSellSkuResponse> getResponseClass() {
      return WareAddVenderSellSkuResponse.class;
   }

   public String getCategory_id() {
      return this.category_id;
   }

   public void setCategory_id(String category_id) {
      this.category_id = category_id;
   }

   public String getIndex_id() {
      return this.index_id;
   }

   public void setIndex_id(String index_id) {
      this.index_id = index_id;
   }

   public String getAttribute_id() {
      return this.attribute_id;
   }

   public void setAttribute_id(String attribute_id) {
      this.attribute_id = attribute_id;
   }

   public String getAttribute_value() {
      return this.attribute_value;
   }

   public void setAttribute_value(String attribute_value) {
      this.attribute_value = attribute_value;
   }

   public String getFeatures() {
      return this.features;
   }

   public void setFeatures(String features) {
      this.features = features;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status;
   }
}
