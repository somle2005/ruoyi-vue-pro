package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteUpdateWareStatusByTimerResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareWriteUpdateWareStatusByTimerRequest extends AbstractRequest implements JdRequest<WareWriteUpdateWareStatusByTimerResponse> {
   private Long wareId;
   private Long upTime;
   private Long downTime;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setUpTime(Long upTime) {
      this.upTime = upTime;
   }

   public Long getUpTime() {
      return this.upTime;
   }

   public void setDownTime(Long downTime) {
      this.downTime = downTime;
   }

   public Long getDownTime() {
      return this.downTime;
   }

   public String getApiMethod() {
      return "jingdong.ware.write.updateWareStatusByTimer";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("upTime", this.upTime);
      pmap.put("downTime", this.downTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteUpdateWareStatusByTimerResponse> getResponseClass() {
      return WareWriteUpdateWareStatusByTimerResponse.class;
   }
}
