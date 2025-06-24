package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderInsOrderUpdateStateResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderInsOrderUpdateStateRequest extends AbstractRequest implements JdRequest<Jd3csOrderInsOrderUpdateStateResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private Date extensionEndDate;
   private String orderNo;
   private Date extensionBeginDate;
   private Integer handleType;
   private String agreementNo;
   private String failCause;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setExtensionEndDate(Date extensionEndDate) {
      this.extensionEndDate = extensionEndDate;
   }

   public Date getExtensionEndDate() {
      return this.extensionEndDate;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setExtensionBeginDate(Date extensionBeginDate) {
      this.extensionBeginDate = extensionBeginDate;
   }

   public Date getExtensionBeginDate() {
      return this.extensionBeginDate;
   }

   public void setHandleType(Integer handleType) {
      this.handleType = handleType;
   }

   public Integer getHandleType() {
      return this.handleType;
   }

   public void setAgreementNo(String agreementNo) {
      this.agreementNo = agreementNo;
   }

   public String getAgreementNo() {
      return this.agreementNo;
   }

   public void setFailCause(String failCause) {
      this.failCause = failCause;
   }

   public String getFailCause() {
      return this.failCause;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.insOrderUpdateState";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);

      try {
         if (this.extensionEndDate != null) {
            pmap.put("extensionEndDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.extensionEndDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderNo", this.orderNo);

      try {
         if (this.extensionBeginDate != null) {
            pmap.put("extensionBeginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.extensionBeginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("handleType", this.handleType);
      pmap.put("agreementNo", this.agreementNo);
      pmap.put("failCause", this.failCause);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderInsOrderUpdateStateResponse> getResponseClass() {
      return Jd3csOrderInsOrderUpdateStateResponse.class;
   }
}
