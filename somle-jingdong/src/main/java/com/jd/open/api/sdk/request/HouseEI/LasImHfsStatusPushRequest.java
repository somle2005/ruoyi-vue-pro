package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasImHfsStatusPushResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LasImHfsStatusPushRequest extends AbstractRequest implements JdRequest<LasImHfsStatusPushResponse> {
   private String ordNo;
   private String opeN;
   private String serProNo;
   private Date opeT;
   private String rem;
   private String det;
   private String loc;

   public void setOrdNo(String ordNo) {
      this.ordNo = ordNo;
   }

   public String getOrdNo() {
      return this.ordNo;
   }

   public void setOpeN(String opeN) {
      this.opeN = opeN;
   }

   public String getOpeN() {
      return this.opeN;
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

   public void setRem(String rem) {
      this.rem = rem;
   }

   public String getRem() {
      return this.rem;
   }

   public void setDet(String det) {
      this.det = det;
   }

   public String getDet() {
      return this.det;
   }

   public void setLoc(String loc) {
      this.loc = loc;
   }

   public String getLoc() {
      return this.loc;
   }

   public String getApiMethod() {
      return "jingdong.las.im.hfs.status.push";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ord_no", this.ordNo);
      pmap.put("ope_n", this.opeN);
      pmap.put("ser_pro_no", this.serProNo);

      try {
         if (this.opeT != null) {
            pmap.put("ope_t", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.opeT));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("rem", this.rem);
      pmap.put("det", this.det);
      pmap.put("loc", this.loc);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasImHfsStatusPushResponse> getResponseClass() {
      return LasImHfsStatusPushResponse.class;
   }
}
