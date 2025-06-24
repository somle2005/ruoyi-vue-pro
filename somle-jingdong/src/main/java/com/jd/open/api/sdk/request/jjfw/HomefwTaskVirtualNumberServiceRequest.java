package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskVirtualNumberServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskVirtualNumberServiceRequest extends AbstractRequest implements JdRequest<HomefwTaskVirtualNumberServiceResponse> {
   private String venderCode;
   private String saleOrderNo;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.virtualNumberService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("saleOrderNo", this.saleOrderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskVirtualNumberServiceResponse> getResponseClass() {
      return HomefwTaskVirtualNumberServiceResponse.class;
   }
}
