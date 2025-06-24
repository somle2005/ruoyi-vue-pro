package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskVisitingServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskVisitingServiceRequest extends AbstractRequest implements JdRequest<HomefwTaskVisitingServiceResponse> {
   private String venderCode;
   private String orderNo;
   private String masterName;
   private String masterPhone;
   private String serviceDate;

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

   public void setMasterName(String masterName) {
      this.masterName = masterName;
   }

   public String getMasterName() {
      return this.masterName;
   }

   public void setMasterPhone(String masterPhone) {
      this.masterPhone = masterPhone;
   }

   public String getMasterPhone() {
      return this.masterPhone;
   }

   public void setServiceDate(String serviceDate) {
      this.serviceDate = serviceDate;
   }

   public String getServiceDate() {
      return this.serviceDate;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.visitingService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("masterName", this.masterName);
      pmap.put("masterPhone", this.masterPhone);
      pmap.put("serviceDate", this.serviceDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskVisitingServiceResponse> getResponseClass() {
      return HomefwTaskVisitingServiceResponse.class;
   }
}
