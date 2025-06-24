package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WarePropimgsGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgsGetRequest extends AbstractRequest implements JdRequest<WarePropimgsGetResponse> {
   private String wareId;
   private String attributeValueId;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.propimgs.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("attribute_value_id", this.attributeValueId);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class getResponseClass() {
      return WarePropimgsGetResponse.class;
   }

   public String getAttributeValueId() {
      return this.attributeValueId;
   }

   public void setAttributeValueId(String attributeValueId) {
      this.attributeValueId = attributeValueId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }
}
