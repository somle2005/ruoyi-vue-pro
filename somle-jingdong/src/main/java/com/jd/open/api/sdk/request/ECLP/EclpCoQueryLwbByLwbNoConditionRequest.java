package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoQueryLwbByLwbNoConditionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoQueryLwbByLwbNoConditionRequest extends AbstractRequest implements JdRequest<EclpCoQueryLwbByLwbNoConditionResponse> {
   private String lwbNo;
   private String deptNo;
   private String waybillSign;

   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   public String getLwbNo() {
      return this.lwbNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWaybillSign(String waybillSign) {
      this.waybillSign = waybillSign;
   }

   public String getWaybillSign() {
      return this.waybillSign;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.queryLwbByLwbNoCondition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("lwbNo", this.lwbNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("waybillSign", this.waybillSign);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoQueryLwbByLwbNoConditionResponse> getResponseClass() {
      return EclpCoQueryLwbByLwbNoConditionResponse.class;
   }
}
