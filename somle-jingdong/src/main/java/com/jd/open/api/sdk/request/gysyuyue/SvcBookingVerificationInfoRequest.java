package com.jd.open.api.sdk.request.gysyuyue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gysyuyue.SvcBookingVerificationInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SvcBookingVerificationInfoRequest extends AbstractRequest implements JdRequest<SvcBookingVerificationInfoResponse> {
   private String verificationCode;
   private String lcnNo;
   private Integer appId;
   private String url;
   private String vinCode;

   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public String getVerificationCode() {
      return this.verificationCode;
   }

   public void setLcnNo(String lcnNo) {
      this.lcnNo = lcnNo;
   }

   public String getLcnNo() {
      return this.lcnNo;
   }

   public void setAppId(Integer appId) {
      this.appId = appId;
   }

   public Integer getAppId() {
      return this.appId;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public void setVinCode(String vinCode) {
      this.vinCode = vinCode;
   }

   public String getVinCode() {
      return this.vinCode;
   }

   public String getApiMethod() {
      return "jingdong.svc.booking.verification.info";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("verificationCode", this.verificationCode);
      pmap.put("lcnNo", this.lcnNo);
      pmap.put("appId", this.appId);
      pmap.put("url", this.url);
      pmap.put("vinCode", this.vinCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<SvcBookingVerificationInfoResponse> getResponseClass() {
      return SvcBookingVerificationInfoResponse.class;
   }
}
