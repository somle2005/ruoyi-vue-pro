package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.im.ImPopPasslogGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImPopPasslogGetRequest extends AbstractRequest implements JdRequest<ImPopPasslogGetResponse> {
   private String waiter;
   private Date startTime;
   private Date endTime;
   private int page;
   private int pageSize;

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

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.im.pop.passlog.get";
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

      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImPopPasslogGetResponse> getResponseClass() {
      return ImPopPasslogGetResponse.class;
   }
}
