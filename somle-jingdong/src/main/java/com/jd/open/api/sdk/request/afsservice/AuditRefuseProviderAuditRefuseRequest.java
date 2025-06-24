package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AuditRefuseProviderAuditRefuseResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AuditRefuseProviderAuditRefuseRequest extends AbstractRequest implements JdRequest<AuditRefuseProviderAuditRefuseResponse> {
   private String serviceId;
   private String approveNotes;
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private int platformSrc;

   public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
   }

   public String getServiceId() {
      return this.serviceId;
   }

   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   public String getApproveNotes() {
      return this.approveNotes;
   }

   public void setOperatorPin(String operatorPin) {
      this.operatorPin = operatorPin;
   }

   public String getOperatorPin() {
      return this.operatorPin;
   }

   public void setOperatorNick(String operatorNick) {
      this.operatorNick = operatorNick;
   }

   public String getOperatorNick() {
      return this.operatorNick;
   }

   public void setOperatorRemark(String operatorRemark) {
      this.operatorRemark = operatorRemark;
   }

   public String getOperatorRemark() {
      return this.operatorRemark;
   }

   public void setOperatorDate(Date operatorDate) {
      this.operatorDate = operatorDate;
   }

   public Date getOperatorDate() {
      return this.operatorDate;
   }

   public void setPlatformSrc(int platformSrc) {
      this.platformSrc = platformSrc;
   }

   public int getPlatformSrc() {
      return this.platformSrc;
   }

   public String getApiMethod() {
      return "jingdong.AuditRefuseProvider.auditRefuse";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("serviceId", this.serviceId);
      pmap.put("approveNotes", this.approveNotes);
      pmap.put("operatorPin", this.operatorPin);
      pmap.put("operatorNick", this.operatorNick);
      pmap.put("operatorRemark", this.operatorRemark);

      try {
         if (this.operatorDate != null) {
            pmap.put("operatorDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operatorDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("platformSrc", this.platformSrc);
      return JsonUtil.toJson(pmap);
   }

   public Class<AuditRefuseProviderAuditRefuseResponse> getResponseClass() {
      return AuditRefuseProviderAuditRefuseResponse.class;
   }
}
