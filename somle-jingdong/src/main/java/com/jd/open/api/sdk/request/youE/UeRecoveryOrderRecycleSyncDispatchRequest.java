package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderRecycleSyncDispatchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderRecycleSyncDispatchRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderRecycleSyncDispatchResponse> {
   private String code;
   private String appid;
   private String orderNo;
   private String engineerIdCard;
   private String engineerName;
   private String engineerMobile;

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
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

   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   public String getEngineerName() {
      return this.engineerName;
   }

   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   public String getEngineerMobile() {
      return this.engineerMobile;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.recycleSyncDispatch";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("appid", this.appid);
      pmap.put("orderNo", this.orderNo);
      pmap.put("engineerIdCard", this.engineerIdCard);
      pmap.put("engineerName", this.engineerName);
      pmap.put("engineerMobile", this.engineerMobile);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderRecycleSyncDispatchResponse> getResponseClass() {
      return UeRecoveryOrderRecycleSyncDispatchResponse.class;
   }
}
