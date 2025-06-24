package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwUpdateRtwOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwUpdateRtwOrderRequest extends AbstractRequest implements JdRequest<EclpRtwUpdateRtwOrderResponse> {
   private String eclpRtwNo;
   private String isvRtwNum;
   private String ownerNo;
   private String packageNo;
   private String shipperName;
   private String senderName;
   private String senderTelPhone;
   private String senderMobilePhone;

   public void setEclpRtwNo(String eclpRtwNo) {
      this.eclpRtwNo = eclpRtwNo;
   }

   public String getEclpRtwNo() {
      return this.eclpRtwNo;
   }

   public void setIsvRtwNum(String isvRtwNum) {
      this.isvRtwNum = isvRtwNum;
   }

   public String getIsvRtwNum() {
      return this.isvRtwNum;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
   }

   public void setPackageNo(String packageNo) {
      this.packageNo = packageNo;
   }

   public String getPackageNo() {
      return this.packageNo;
   }

   public void setShipperName(String shipperName) {
      this.shipperName = shipperName;
   }

   public String getShipperName() {
      return this.shipperName;
   }

   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public void setSenderTelPhone(String senderTelPhone) {
      this.senderTelPhone = senderTelPhone;
   }

   public String getSenderTelPhone() {
      return this.senderTelPhone;
   }

   public void setSenderMobilePhone(String senderMobilePhone) {
      this.senderMobilePhone = senderMobilePhone;
   }

   public String getSenderMobilePhone() {
      return this.senderMobilePhone;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.updateRtwOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpRtwNo", this.eclpRtwNo);
      pmap.put("isvRtwNum", this.isvRtwNum);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("packageNo", this.packageNo);
      pmap.put("shipperName", this.shipperName);
      pmap.put("senderName", this.senderName);
      pmap.put("senderTelPhone", this.senderTelPhone);
      pmap.put("senderMobilePhone", this.senderMobilePhone);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwUpdateRtwOrderResponse> getResponseClass() {
      return EclpRtwUpdateRtwOrderResponse.class;
   }
}
