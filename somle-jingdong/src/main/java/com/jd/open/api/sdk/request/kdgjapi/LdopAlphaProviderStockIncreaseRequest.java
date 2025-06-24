package com.jd.open.api.sdk.request.kdgjapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.kdgjapi.LdopAlphaProviderStockIncreaseResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaProviderStockIncreaseRequest extends AbstractRequest implements JdRequest<LdopAlphaProviderStockIncreaseResponse> {
   private String operatorCode;
   private String vendorCode;
   private String vendorName;
   private String providerId;
   private String providerCode;
   private String providerName;
   private String branchCode;
   private String branchName;
   private Integer amount;
   private Date operatorTime;
   private String operatorName;
   private Integer state;

   public void setOperatorCode(String operatorCode) {
      this.operatorCode = operatorCode;
   }

   public String getOperatorCode() {
      return this.operatorCode;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public String getVendorName() {
      return this.vendorName;
   }

   public void setProviderId(String providerId) {
      this.providerId = providerId;
   }

   public String getProviderId() {
      return this.providerId;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   public String getProviderName() {
      return this.providerName;
   }

   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   public String getBranchCode() {
      return this.branchCode;
   }

   public void setBranchName(String branchName) {
      this.branchName = branchName;
   }

   public String getBranchName() {
      return this.branchName;
   }

   public void setAmount(Integer amount) {
      this.amount = amount;
   }

   public Integer getAmount() {
      return this.amount;
   }

   public void setOperatorTime(Date operatorTime) {
      this.operatorTime = operatorTime;
   }

   public Date getOperatorTime() {
      return this.operatorTime;
   }

   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   public String getOperatorName() {
      return this.operatorName;
   }

   public void setState(Integer state) {
      this.state = state;
   }

   public Integer getState() {
      return this.state;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.provider.stock.increase";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operatorCode", this.operatorCode);
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("vendorName", this.vendorName);
      pmap.put("providerId", this.providerId);
      pmap.put("providerCode", this.providerCode);
      pmap.put("providerName", this.providerName);
      pmap.put("branchCode", this.branchCode);
      pmap.put("branchName", this.branchName);
      pmap.put("amount", this.amount);

      try {
         if (this.operatorTime != null) {
            pmap.put("operatorTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operatorTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("operatorName", this.operatorName);
      pmap.put("state", this.state);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaProviderStockIncreaseResponse> getResponseClass() {
      return LdopAlphaProviderStockIncreaseResponse.class;
   }
}
