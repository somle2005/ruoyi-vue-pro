package com.jd.open.api.sdk.request.ThreePL;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ThreePL.PresortSitefenceimportServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PresortSitefenceimportServiceRequest extends AbstractRequest implements JdRequest<PresortSitefenceimportServiceResponse> {
   private String operationType;
   private String siteCode;
   private String siteName;
   private String siteLocation;
   private Integer fenceNum;
   private String fenceArray;

   public void setOperationType(String operationType) {
      this.operationType = operationType;
   }

   public String getOperationType() {
      return this.operationType;
   }

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public void setSiteLocation(String siteLocation) {
      this.siteLocation = siteLocation;
   }

   public String getSiteLocation() {
      return this.siteLocation;
   }

   public void setFenceNum(Integer fenceNum) {
      this.fenceNum = fenceNum;
   }

   public Integer getFenceNum() {
      return this.fenceNum;
   }

   public void setFenceArray(String fenceArray) {
      this.fenceArray = fenceArray;
   }

   public String getFenceArray() {
      return this.fenceArray;
   }

   public String getApiMethod() {
      return "jingdong.presort.sitefenceimport.service";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operationType", this.operationType);
      pmap.put("siteCode", this.siteCode);
      pmap.put("siteName", this.siteName);
      pmap.put("siteLocation", this.siteLocation);
      pmap.put("fenceNum", this.fenceNum);
      pmap.put("fenceArray", this.fenceArray);
      return JsonUtil.toJson(pmap);
   }

   public Class<PresortSitefenceimportServiceResponse> getResponseClass() {
      return PresortSitefenceimportServiceResponse.class;
   }
}
