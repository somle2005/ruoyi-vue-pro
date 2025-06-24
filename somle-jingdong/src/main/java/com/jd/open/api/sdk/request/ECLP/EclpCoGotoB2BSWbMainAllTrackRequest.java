package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoGotoB2BSWbMainAllTrackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoGotoB2BSWbMainAllTrackRequest extends AbstractRequest implements JdRequest<EclpCoGotoB2BSWbMainAllTrackResponse> {
   private String deptNo;
   private int newWBType;
   private String no;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setNewWBType(int newWBType) {
      this.newWBType = newWBType;
   }

   public int getNewWBType() {
      return this.newWBType;
   }

   public void setNo(String no) {
      this.no = no;
   }

   public String getNo() {
      return this.no;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.gotoB2BSWbMainAllTrack";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("newWBType", this.newWBType);
      pmap.put("no", this.no);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoGotoB2BSWbMainAllTrackResponse> getResponseClass() {
      return EclpCoGotoB2BSWbMainAllTrackResponse.class;
   }
}
