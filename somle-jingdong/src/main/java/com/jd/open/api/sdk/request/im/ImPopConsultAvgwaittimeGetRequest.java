package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.im.ImPopConsultAvgwaittimeGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImPopConsultAvgwaittimeGetRequest extends AbstractRequest implements JdRequest<ImPopConsultAvgwaittimeGetResponse> {
   private String waiter;
   private Date date;

   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   public String getWaiter() {
      return this.waiter;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public Date getDate() {
      return this.date;
   }

   public String getApiMethod() {
      return "jingdong.im.pop.consult.avgwaittime.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("waiter", this.waiter);

      try {
         if (this.date != null) {
            pmap.put("date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.date));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<ImPopConsultAvgwaittimeGetResponse> getResponseClass() {
      return ImPopConsultAvgwaittimeGetResponse.class;
   }
}
