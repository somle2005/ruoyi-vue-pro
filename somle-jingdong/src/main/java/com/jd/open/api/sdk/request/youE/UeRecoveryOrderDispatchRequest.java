package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderDispatchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderDispatchRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderDispatchResponse> {
   private String appid;
   private String engineerName;
   private String dispatch;
   private String engineerMobile;
   private String orderNo;
   private String engineerIdCard;
   private String code;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   public String getEngineerName() {
      return this.engineerName;
   }

   public void setDispatch(String dispatch) {
      this.dispatch = dispatch;
   }

   public String getDispatch() {
      return this.dispatch;
   }

   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   public String getEngineerMobile() {
      return this.engineerMobile;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setEngineerIdCard(String engineerIdCard) {
      this.engineerIdCard = engineerIdCard;
   }

   public String getEngineerIdCard() {
      return this.engineerIdCard;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.dispatch";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("engineerName", this.engineerName);
      pmap.put("dispatch", this.dispatch);
      pmap.put("engineerMobile", this.engineerMobile);
      pmap.put("orderNo", this.orderNo);
      pmap.put("engineerIdCard", this.engineerIdCard);
      pmap.put("code", this.code);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderDispatchResponse> getResponseClass() {
      return UeRecoveryOrderDispatchResponse.class;
   }
}
