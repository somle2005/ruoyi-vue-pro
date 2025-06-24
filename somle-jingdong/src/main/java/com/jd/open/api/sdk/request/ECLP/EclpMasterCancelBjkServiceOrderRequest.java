package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterCancelBjkServiceOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterCancelBjkServiceOrderRequest extends AbstractRequest implements JdRequest<EclpMasterCancelBjkServiceOrderResponse> {
   private String deptNo;
   private String serviceNo;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setServiceNo(String serviceNo) {
      this.serviceNo = serviceNo;
   }

   public String getServiceNo() {
      return this.serviceNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.cancelBjkServiceOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("serviceNo", this.serviceNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterCancelBjkServiceOrderResponse> getResponseClass() {
      return EclpMasterCancelBjkServiceOrderResponse.class;
   }
}
