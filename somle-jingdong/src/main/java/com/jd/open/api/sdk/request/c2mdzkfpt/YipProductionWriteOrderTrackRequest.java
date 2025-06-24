package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionWriteOrderTrackResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionWriteOrderTrackRequest extends AbstractRequest implements JdRequest<YipProductionWriteOrderTrackResponse> {
   private Date creationTime;
   private Long orderId;

   public void setCreationTime(Date creationTime) {
      this.creationTime = creationTime;
   }

   public Date getCreationTime() {
      return this.creationTime;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.writeOrderTrack";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.creationTime != null) {
            pmap.put("creationTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.creationTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionWriteOrderTrackResponse> getResponseClass() {
      return YipProductionWriteOrderTrackResponse.class;
   }
}
