package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoCancelB2bLwbMainResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoCancelB2bLwbMainRequest extends AbstractRequest implements JdRequest<EclpCoCancelB2bLwbMainResponse> {
   private String deptNo;
   private String orderNo;
   private String wbNo;

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

   public void setWbNo(String wbNo) {
      this.wbNo = wbNo;
   }

   public String getWbNo() {
      return this.wbNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.cancelB2bLwbMain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("wbNo", this.wbNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoCancelB2bLwbMainResponse> getResponseClass() {
      return EclpCoCancelB2bLwbMainResponse.class;
   }
}
