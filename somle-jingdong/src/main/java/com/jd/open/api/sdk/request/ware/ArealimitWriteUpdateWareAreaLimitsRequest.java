package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ArealimitWriteUpdateWareAreaLimitsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ArealimitWriteUpdateWareAreaLimitsRequest extends AbstractRequest implements JdRequest<ArealimitWriteUpdateWareAreaLimitsResponse> {
   private Long wareId;
   private String areaId;
   private Integer limitType;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setAreaId(String areaId) {
      this.areaId = areaId;
   }

   public String getAreaId() {
      return this.areaId;
   }

   public void setLimitType(Integer limitType) {
      this.limitType = limitType;
   }

   public Integer getLimitType() {
      return this.limitType;
   }

   public String getApiMethod() {
      return "jingdong.arealimit.write.updateWareAreaLimits";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("areaId", this.areaId);
      pmap.put("limitType", this.limitType);
      return JsonUtil.toJson(pmap);
   }

   public Class<ArealimitWriteUpdateWareAreaLimitsResponse> getResponseClass() {
      return ArealimitWriteUpdateWareAreaLimitsResponse.class;
   }
}
