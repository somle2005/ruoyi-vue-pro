package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareAreaLimitUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAreaLimitUpdateRequest extends AbstractRequest implements JdRequest<WareAreaLimitUpdateResponse> {
   private String levs;
   private String areaIds;
   private String areaFids;
   private String wareId;
   private String type;

   public String getApiMethod() {
      return "360buy.ware.area.limit.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("levs", this.levs);
      pmap.put("area_fids", this.areaFids);
      pmap.put("area_ids", this.areaIds);
      pmap.put("ware_id", this.wareId);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareAreaLimitUpdateResponse> getResponseClass() {
      return WareAreaLimitUpdateResponse.class;
   }

   public String getLevs() {
      return this.levs;
   }

   public void setLevs(String levs) {
      this.levs = levs;
   }

   public String getAreaIds() {
      return this.areaIds;
   }

   public void setAreaIds(String areaIds) {
      this.areaIds = areaIds;
   }

   public String getAreaFids() {
      return this.areaFids;
   }

   public void setAreaFids(String areaFids) {
      this.areaFids = areaFids;
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
