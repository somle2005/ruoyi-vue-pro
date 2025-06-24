package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeInsuranceUpdateStateResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeInsuranceUpdateStateRequest extends AbstractRequest implements JdRequest<UeInsuranceUpdateStateResponse> {
   private Date extensionEndDate;
   private String orderNo;
   private Integer handleType;
   private Date extensionBeginDate;
   private String agreementNo;
   private String failCause;
   private String appId;

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

   public void setHandleType(Integer handleType) {
      this.handleType = handleType;
   }

   public Integer getHandleType() {
      return this.handleType;
   }

   public void setExtensionBeginDate(Date extensionBeginDate) {
      this.extensionBeginDate = extensionBeginDate;
   }

   public Date getExtensionBeginDate() {
      return this.extensionBeginDate;
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

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getApiMethod() {
      return "jingdong.ue.insurance.updateState";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.extensionEndDate != null) {
            pmap.put("extensionEndDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.extensionEndDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderNo", this.orderNo);
      pmap.put("handleType", this.handleType);

      try {
         if (this.extensionBeginDate != null) {
            pmap.put("extensionBeginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.extensionBeginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("agreementNo", this.agreementNo);
      pmap.put("failCause", this.failCause);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeInsuranceUpdateStateResponse> getResponseClass() {
      return UeInsuranceUpdateStateResponse.class;
   }
}
