package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasImHfsUninstallPushResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LasImHfsUninstallPushRequest extends AbstractRequest implements JdRequest<LasImHfsUninstallPushResponse> {
   private String ordNo;
   private String serProNo;
   private Date opeT;
   private String opeN;
   private String opeTel;
   private String uniDet;

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

   public void setOpeN(String opeN) {
      this.opeN = opeN;
   }

   public String getOpeN() {
      return this.opeN;
   }

   public void setOpeTel(String opeTel) {
      this.opeTel = opeTel;
   }

   public String getOpeTel() {
      return this.opeTel;
   }

   public void setUniDet(String uniDet) {
      this.uniDet = uniDet;
   }

   public String getUniDet() {
      return this.uniDet;
   }

   public String getApiMethod() {
      return "jingdong.las.im.hfs.uninstall.push";
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

      pmap.put("ope_n", this.opeN);
      pmap.put("ope_tel", this.opeTel);
      pmap.put("uni_det", this.uniDet);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasImHfsUninstallPushResponse> getResponseClass() {
      return LasImHfsUninstallPushResponse.class;
   }
}
