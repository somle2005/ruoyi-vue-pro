package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.SubmitRefundResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SubmitRefundRequest extends AbstractRequest implements JdRequest<SubmitRefundResponse> {
   private boolean freightFeeFlag;
   private String vendorPin;
   private Long afsServiceId;
   private String vendorCode;
   private Integer businessUnit;

   public void setFreightFeeFlag(boolean freightFeeFlag) {
      this.freightFeeFlag = freightFeeFlag;
   }

   public boolean getFreightFeeFlag() {
      return this.freightFeeFlag;
   }

   public void setVendorPin(String vendorPin) {
      this.vendorPin = vendorPin;
   }

   public String getVendorPin() {
      return this.vendorPin;
   }

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setBusinessUnit(Integer businessUnit) {
      this.businessUnit = businessUnit;
   }

   public Integer getBusinessUnit() {
      return this.businessUnit;
   }

   public String getApiMethod() {
      return "jingdong.submitRefund";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("freightFeeFlag", this.freightFeeFlag);
      pmap.put("vendorPin", this.vendorPin);
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("businessUnit", this.businessUnit);
      return JsonUtil.toJson(pmap);
   }

   public Class<SubmitRefundResponse> getResponseClass() {
      return SubmitRefundResponse.class;
   }
}
