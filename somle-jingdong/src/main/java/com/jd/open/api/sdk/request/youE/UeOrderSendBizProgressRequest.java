package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderSendBizProgressResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderSendBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderSendBizProgressResponse> {
   private String sendDate;
   private String appId;
   private String engineerName;
   private String netWorkContactMan;
   private String engineerCode;
   private String netWorkTel;
   private String netWorkCode;
   private String netWorkAddress;
   private Date sendNetWorkDate;
   private String engineerMobile;
   private String sendEngineeDate;
   private String orderNo;
   private String netWorkName;
   private String sendBy;
   private String type;

   public void setSendDate(String sendDate) {
      this.sendDate = sendDate;
   }

   public String getSendDate() {
      return this.sendDate;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   public String getEngineerName() {
      return this.engineerName;
   }

   public void setNetWorkContactMan(String netWorkContactMan) {
      this.netWorkContactMan = netWorkContactMan;
   }

   public String getNetWorkContactMan() {
      return this.netWorkContactMan;
   }

   public void setEngineerCode(String engineerCode) {
      this.engineerCode = engineerCode;
   }

   public String getEngineerCode() {
      return this.engineerCode;
   }

   public void setNetWorkTel(String netWorkTel) {
      this.netWorkTel = netWorkTel;
   }

   public String getNetWorkTel() {
      return this.netWorkTel;
   }

   public void setNetWorkCode(String netWorkCode) {
      this.netWorkCode = netWorkCode;
   }

   public String getNetWorkCode() {
      return this.netWorkCode;
   }

   public void setNetWorkAddress(String netWorkAddress) {
      this.netWorkAddress = netWorkAddress;
   }

   public String getNetWorkAddress() {
      return this.netWorkAddress;
   }

   public void setSendNetWorkDate(Date sendNetWorkDate) {
      this.sendNetWorkDate = sendNetWorkDate;
   }

   public Date getSendNetWorkDate() {
      return this.sendNetWorkDate;
   }

   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   public String getEngineerMobile() {
      return this.engineerMobile;
   }

   public void setSendEngineeDate(String sendEngineeDate) {
      this.sendEngineeDate = sendEngineeDate;
   }

   public String getSendEngineeDate() {
      return this.sendEngineeDate;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setNetWorkName(String netWorkName) {
      this.netWorkName = netWorkName;
   }

   public String getNetWorkName() {
      return this.netWorkName;
   }

   public void setSendBy(String sendBy) {
      this.sendBy = sendBy;
   }

   public String getSendBy() {
      return this.sendBy;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.sendBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sendDate", this.sendDate);
      pmap.put("appId", this.appId);
      pmap.put("engineerName", this.engineerName);
      pmap.put("netWorkContactMan", this.netWorkContactMan);
      pmap.put("engineerCode", this.engineerCode);
      pmap.put("netWorkTel", this.netWorkTel);
      pmap.put("netWorkCode", this.netWorkCode);
      pmap.put("netWorkAddress", this.netWorkAddress);

      try {
         if (this.sendNetWorkDate != null) {
            pmap.put("sendNetWorkDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.sendNetWorkDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("engineerMobile", this.engineerMobile);
      pmap.put("sendEngineeDate", this.sendEngineeDate);
      pmap.put("orderNo", this.orderNo);
      pmap.put("netWorkName", this.netWorkName);
      pmap.put("sendBy", this.sendBy);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderSendBizProgressResponse> getResponseClass() {
      return UeOrderSendBizProgressResponse.class;
   }
}
