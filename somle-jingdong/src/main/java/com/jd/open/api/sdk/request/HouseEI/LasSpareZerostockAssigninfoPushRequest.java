package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockAssigninfoPushResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockAssigninfoPushRequest extends AbstractRequest implements JdRequest<LasSpareZerostockAssigninfoPushResponse> {
   private String afsNo;
   private String ordNo;
   private String afsSerTasNo;
   private String sitNo;
   private String sitN;
   private String sitTel;
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

   public void setSitNo(String sitNo) {
      this.sitNo = sitNo;
   }

   public String getSitNo() {
      return this.sitNo;
   }

   public void setSitN(String sitN) {
      this.sitN = sitN;
   }

   public String getSitN() {
      return this.sitN;
   }

   public void setSitTel(String sitTel) {
      this.sitTel = sitTel;
   }

   public String getSitTel() {
      return this.sitTel;
   }

   public void setActT(String actT) {
      this.actT = actT;
   }

   public String getActT() {
      return this.actT;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.assigninfo.push";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afs_no", this.afsNo);
      pmap.put("ord_no", this.ordNo);
      pmap.put("afs_ser_tas_no", this.afsSerTasNo);
      pmap.put("sit_no", this.sitNo);
      pmap.put("sit_n", this.sitN);
      pmap.put("sit_tel", this.sitTel);
      pmap.put("act_t", this.actT);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockAssigninfoPushResponse> getResponseClass() {
      return LasSpareZerostockAssigninfoPushResponse.class;
   }
}
