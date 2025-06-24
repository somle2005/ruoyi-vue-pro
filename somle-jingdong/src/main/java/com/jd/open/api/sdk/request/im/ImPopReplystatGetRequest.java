package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.im.ImPopReplystatGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImPopReplystatGetRequest extends AbstractRequest implements JdRequest<ImPopReplystatGetResponse> {
   private String waiter;
   private Date startTime;
   private Date endTime;

   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   public String getWaiter() {
      return this.waiter;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public String getApiMethod() {
      return "jingdong.im.pop.replystat.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("waiter", this.waiter);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<ImPopReplystatGetResponse> getResponseClass() {
      return ImPopReplystatGetResponse.class;
   }
}
