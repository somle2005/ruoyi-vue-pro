package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaVendorRechargeQueryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaVendorRechargeQueryRequest extends AbstractRequest implements JdRequest<LdopAlphaVendorRechargeQueryResponse> {
   private String vendorCode;
   private Integer providerId;
   private String branchCode;
   private Date startTime;
   private Date endTime;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   public String getBranchCode() {
      return this.branchCode;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.vendor.recharge.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("providerId", this.providerId);
      pmap.put("branchCode", this.branchCode);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaVendorRechargeQueryResponse> getResponseClass() {
      return LdopAlphaVendorRechargeQueryResponse.class;
   }
}
