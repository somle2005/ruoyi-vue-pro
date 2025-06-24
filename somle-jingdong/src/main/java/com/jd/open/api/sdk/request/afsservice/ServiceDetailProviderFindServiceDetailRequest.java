package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.ServiceDetailProviderFindServiceDetailResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ServiceDetailProviderFindServiceDetailRequest extends AbstractRequest implements JdRequest<ServiceDetailProviderFindServiceDetailResponse> {
   private Long afsServiceId;
   private String appendInfoStep;
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private int platformSrc;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setAppendInfoStep(String appendInfoStep) {
      this.appendInfoStep = appendInfoStep;
   }

   public String getAppendInfoStep() {
      return this.appendInfoStep;
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
      return "jingdong.ServiceDetailProvider.findServiceDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("appendInfoStep", this.appendInfoStep);
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

   public Class<ServiceDetailProviderFindServiceDetailResponse> getResponseClass() {
      return ServiceDetailProviderFindServiceDetailResponse.class;
   }
}
