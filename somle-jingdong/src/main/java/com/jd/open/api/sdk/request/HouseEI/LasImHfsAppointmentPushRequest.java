package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasImHfsAppointmentPushResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LasImHfsAppointmentPushRequest extends AbstractRequest implements JdRequest<LasImHfsAppointmentPushResponse> {
   private String ordNo;
   private String serProNo;
   private Date opeT;
   private String serDet;

   public void setOrdNo(String ordNo) {
      this.ordNo = ordNo;
   }

   public String getOrdNo() {
      return this.ordNo;
   }

   public void setSerProNo(String serProNo) {
      this.serProNo = serProNo;
   }

   public String getSerProNo() {
      return this.serProNo;
   }

   public void setOpeT(Date opeT) {
      this.opeT = opeT;
   }

   public Date getOpeT() {
      return this.opeT;
   }

   public void setSerDet(String serDet) {
      this.serDet = serDet;
   }

   public String getSerDet() {
      return this.serDet;
   }

   public String getApiMethod() {
      return "jingdong.las.im.hfs.appointment.push";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ord_no", this.ordNo);
      pmap.put("ser_pro_no", this.serProNo);

      try {
         if (this.opeT != null) {
            pmap.put("ope_t", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.opeT));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("ser_det", this.serDet);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasImHfsAppointmentPushResponse> getResponseClass() {
      return LasImHfsAppointmentPushResponse.class;
   }
}
