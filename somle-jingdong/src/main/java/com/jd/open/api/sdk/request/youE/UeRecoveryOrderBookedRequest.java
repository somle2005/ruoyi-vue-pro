package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderBookedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderBookedRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderBookedResponse> {
   private String appid;
   private String engineerFinalOperate;
   private String userFinalOnsite;
   private String userFirstOnsite;
   private String engineerFirstOperate;
   private String orderNo;
   private String code;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setEngineerFinalOperate(String engineerFinalOperate) {
      this.engineerFinalOperate = engineerFinalOperate;
   }

   public String getEngineerFinalOperate() {
      return this.engineerFinalOperate;
   }

   public void setUserFinalOnsite(String userFinalOnsite) {
      this.userFinalOnsite = userFinalOnsite;
   }

   public String getUserFinalOnsite() {
      return this.userFinalOnsite;
   }

   public void setUserFirstOnsite(String userFirstOnsite) {
      this.userFirstOnsite = userFirstOnsite;
   }

   public String getUserFirstOnsite() {
      return this.userFirstOnsite;
   }

   public void setEngineerFirstOperate(String engineerFirstOperate) {
      this.engineerFirstOperate = engineerFirstOperate;
   }

   public String getEngineerFirstOperate() {
      return this.engineerFirstOperate;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.booked";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("engineerFinalOperate", this.engineerFinalOperate);
      pmap.put("userFinalOnsite", this.userFinalOnsite);
      pmap.put("userFirstOnsite", this.userFirstOnsite);
      pmap.put("engineerFirstOperate", this.engineerFirstOperate);
      pmap.put("orderNo", this.orderNo);
      pmap.put("code", this.code);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderBookedResponse> getResponseClass() {
      return UeRecoveryOrderBookedResponse.class;
   }
}
