package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaAfsRefundApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaAfsRefundApplyRequest extends AbstractRequest implements JdRequest<PopAfsSoaAfsRefundApplyResponse> {
   private String afsServiceId;
   private String processType;
   private String source;
   private String isFreight;
   private String returnPackFeeFlag;
   private Integer businessUnit;
   private String country;

   public void setAfsServiceId(String afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public String getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setProcessType(String processType) {
      this.processType = processType;
   }

   public String getProcessType() {
      return this.processType;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setIsFreight(String isFreight) {
      this.isFreight = isFreight;
   }

   public String getIsFreight() {
      return this.isFreight;
   }

   public void setReturnPackFeeFlag(String returnPackFeeFlag) {
      this.returnPackFeeFlag = returnPackFeeFlag;
   }

   public String getReturnPackFeeFlag() {
      return this.returnPackFeeFlag;
   }

   public void setBusinessUnit(Integer businessUnit) {
      this.businessUnit = businessUnit;
   }

   public Integer getBusinessUnit() {
      return this.businessUnit;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String getCountry() {
      return this.country;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.soa.afsRefundApply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("processType", this.processType);
      pmap.put("source", this.source);
      pmap.put("isFreight", this.isFreight);
      pmap.put("returnPackFeeFlag", this.returnPackFeeFlag);
      pmap.put("businessUnit", this.businessUnit);
      pmap.put("country", this.country);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaAfsRefundApplyResponse> getResponseClass() {
      return PopAfsSoaAfsRefundApplyResponse.class;
   }
}
