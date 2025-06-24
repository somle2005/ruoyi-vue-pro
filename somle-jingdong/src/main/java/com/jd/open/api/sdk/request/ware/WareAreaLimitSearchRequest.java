package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareAreaLimitSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAreaLimitSearchRequest extends AbstractRequest implements JdRequest<WareAreaLimitSearchResponse> {
   private String wareId;
   private String type;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.area.limit.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("type", this.type);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareAreaLimitSearchResponse> getResponseClass() {
      return WareAreaLimitSearchResponse.class;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }
}
