package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoGetEclpNoByOutNoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoGetEclpNoByOutNoRequest extends AbstractRequest implements JdRequest<EclpCoGetEclpNoByOutNoResponse> {
   private String deptNo;
   private String outNo;
   private String recepitType;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOutNo(String outNo) {
      this.outNo = outNo;
   }

   public String getOutNo() {
      return this.outNo;
   }

   public void setRecepitType(String recepitType) {
      this.recepitType = recepitType;
   }

   public String getRecepitType() {
      return this.recepitType;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.getEclpNoByOutNo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("outNo", this.outNo);
      pmap.put("recepitType", this.recepitType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoGetEclpNoByOutNoResponse> getResponseClass() {
      return EclpCoGetEclpNoByOutNoResponse.class;
   }
}
