package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoCancelLwbMainResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoCancelLwbMainRequest extends AbstractRequest implements JdRequest<EclpCoCancelLwbMainResponse> {
   private String deptNo;
   private String orderNo;
   private String lwbNo;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   public String getLwbNo() {
      return this.lwbNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.cancelLwbMain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("lwbNo", this.lwbNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoCancelLwbMainResponse> getResponseClass() {
      return EclpCoCancelLwbMainResponse.class;
   }
}
