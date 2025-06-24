package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskAppointResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskAppointRequest extends AbstractRequest implements JdRequest<HomefwTaskAppointResponse> {
   private String venderCode;
   private String orderNo;
   private Integer appointType;
   private String siteName;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setAppointType(Integer appointType) {
      this.appointType = appointType;
   }

   public Integer getAppointType() {
      return this.appointType;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.appoint";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("appointType", this.appointType);
      pmap.put("siteName", this.siteName);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskAppointResponse> getResponseClass() {
      return HomefwTaskAppointResponse.class;
   }
}
