package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockAssignlogPushResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockAssignlogPushRequest extends AbstractRequest implements JdRequest<LasSpareZerostockAssignlogPushResponse> {
   private String afsNo;
   private String ordNo;
   private String afsSerTasNo;
   private String traInf;
   private String actT;

   public void setAfsNo(String afsNo) {
      this.afsNo = afsNo;
   }

   public String getAfsNo() {
      return this.afsNo;
   }

   public void setOrdNo(String ordNo) {
      this.ordNo = ordNo;
   }

   public String getOrdNo() {
      return this.ordNo;
   }

   public void setAfsSerTasNo(String afsSerTasNo) {
      this.afsSerTasNo = afsSerTasNo;
   }

   public String getAfsSerTasNo() {
      return this.afsSerTasNo;
   }

   public void setTraInf(String traInf) {
      this.traInf = traInf;
   }

   public String getTraInf() {
      return this.traInf;
   }

   public void setActT(String actT) {
      this.actT = actT;
   }

   public String getActT() {
      return this.actT;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.assignlog.push";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afs_no", this.afsNo);
      pmap.put("ord_no", this.ordNo);
      pmap.put("afs_ser_tas_no", this.afsSerTasNo);
      pmap.put("tra_inf", this.traInf);
      pmap.put("act_t", this.actT);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockAssignlogPushResponse> getResponseClass() {
      return LasSpareZerostockAssignlogPushResponse.class;
   }
}
