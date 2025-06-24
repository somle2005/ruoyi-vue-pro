package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceManufacturerOrderCourierInformationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceManufacturerOrderCourierInformationRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceManufacturerOrderCourierInformationResponse> {
   private String expressmanCode;
   private String orderNo;
   private String expressmanMobile;
   private String appId;
   private String remark;
   private String expressmanName;

   public void setExpressmanCode(String expressmanCode) {
      this.expressmanCode = expressmanCode;
   }

   public String getExpressmanCode() {
      return this.expressmanCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setExpressmanMobile(String expressmanMobile) {
      this.expressmanMobile = expressmanMobile;
   }

   public String getExpressmanMobile() {
      return this.expressmanMobile;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setExpressmanName(String expressmanName) {
      this.expressmanName = expressmanName;
   }

   public String getExpressmanName() {
      return this.expressmanName;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.manufacturerOrderCourierInformation";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("expressmanCode", this.expressmanCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("expressmanMobile", this.expressmanMobile);
      pmap.put("appId", this.appId);
      pmap.put("remark", this.remark);
      pmap.put("expressmanName", this.expressmanName);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceManufacturerOrderCourierInformationResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceManufacturerOrderCourierInformationResponse.class;
   }
}
