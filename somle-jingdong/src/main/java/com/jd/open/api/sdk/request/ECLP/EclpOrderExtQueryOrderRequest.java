package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderExtQueryOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderExtQueryOrderRequest extends AbstractRequest implements JdRequest<EclpOrderExtQueryOrderResponse> {
   private String isvUUID;
   private String spSoNos;
   private String isvSource;
   private String departmentNo;

   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   public String getIsvUUID() {
      return this.isvUUID;
   }

   public void setSpSoNos(String spSoNos) {
      this.spSoNos = spSoNos;
   }

   public String getSpSoNos() {
      return this.spSoNos;
   }

   public void setIsvSource(String isvSource) {
      this.isvSource = isvSource;
   }

   public String getIsvSource() {
      return this.isvSource;
   }

   public void setDepartmentNo(String departmentNo) {
      this.departmentNo = departmentNo;
   }

   public String getDepartmentNo() {
      return this.departmentNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.ext.queryOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("isvUUID", this.isvUUID);
      pmap.put("spSoNos", this.spSoNos);
      pmap.put("isvSource", this.isvSource);
      pmap.put("departmentNo", this.departmentNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderExtQueryOrderResponse> getResponseClass() {
      return EclpOrderExtQueryOrderResponse.class;
   }
}
