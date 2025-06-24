package com.jd.open.api.sdk.request.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.WareGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareGetRequest extends AbstractRequest implements JdRequest<WareGetResponse> {
   private String wareId;
   private String regionId;
   private String fields;

   public String getApiMethod() {
      return "jingdong.ware.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("region_id", this.regionId);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareGetResponse> getResponseClass() {
      return WareGetResponse.class;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }

   @JsonProperty("region_id")
   public String getRegionId() {
      return this.regionId;
   }

   @JsonProperty("region_id")
   public void setRegionId(String regionId) {
      this.regionId = regionId;
   }
}
