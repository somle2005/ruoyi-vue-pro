package com.jd.open.api.sdk.request.jdxcx;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jdxcx.MiniappBrandBenefitReportResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MiniappBrandBenefitReportRequest extends AbstractRequest implements JdRequest<MiniappBrandBenefitReportResponse> {
   private String benId;
   private String benState;
   private String openId;
   private String benType;
   private String benNo;
   private Long reportTime;
   private String openIdBuyer;
   private String xidBuyer;

   public void setBenId(String benId) {
      this.benId = benId;
   }

   public String getBenId() {
      return this.benId;
   }

   public void setBenState(String benState) {
      this.benState = benState;
   }

   public String getBenState() {
      return this.benState;
   }

   public void setOpenId(String openId) {
      this.openId = openId;
   }

   public String getOpenId() {
      return this.openId;
   }

   public void setBenType(String benType) {
      this.benType = benType;
   }

   public String getBenType() {
      return this.benType;
   }

   public void setBenNo(String benNo) {
      this.benNo = benNo;
   }

   public String getBenNo() {
      return this.benNo;
   }

   public void setReportTime(Long reportTime) {
      this.reportTime = reportTime;
   }

   public Long getReportTime() {
      return this.reportTime;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.miniapp.brand.benefit.report";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("benId", this.benId);
      pmap.put("benState", this.benState);
      pmap.put("openId", this.openId);
      pmap.put("benType", this.benType);
      pmap.put("benNo", this.benNo);
      pmap.put("reportTime", this.reportTime);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<MiniappBrandBenefitReportResponse> getResponseClass() {
      return MiniappBrandBenefitReportResponse.class;
   }
}
