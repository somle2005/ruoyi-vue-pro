package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoQueryLwbByConditionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoQueryLwbByConditionRequest extends AbstractRequest implements JdRequest<EclpCoQueryLwbByConditionResponse> {
   private String orderNo;
   private String deptNo;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.queryLwbByCondition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("deptNo", this.deptNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoQueryLwbByConditionResponse> getResponseClass() {
      return EclpCoQueryLwbByConditionResponse.class;
   }
}
