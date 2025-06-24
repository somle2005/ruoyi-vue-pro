package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillUnbindResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaWaybillUnbindRequest extends AbstractRequest implements JdRequest<LdopAlphaWaybillUnbindResponse> {
   private String platformOrderNo;
   private Integer providerId;
   private String providerCode;
   private String operatorName;
   private Date operatorTime;
   private String waybillCodeList;

   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   public String getOperatorName() {
      return this.operatorName;
   }

   public void setOperatorTime(Date operatorTime) {
      this.operatorTime = operatorTime;
   }

   public Date getOperatorTime() {
      return this.operatorTime;
   }

   public void setWaybillCodeList(String waybillCodeList) {
      this.waybillCodeList = waybillCodeList;
   }

   public String getWaybillCodeList() {
      return this.waybillCodeList;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.waybill.unbind";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("platformOrderNo", this.platformOrderNo);
      pmap.put("providerId", this.providerId);
      pmap.put("providerCode", this.providerCode);
      pmap.put("operatorName", this.operatorName);

      try {
         if (this.operatorTime != null) {
            pmap.put("operatorTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operatorTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("waybillCodeList", this.waybillCodeList);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaWaybillUnbindResponse> getResponseClass() {
      return LdopAlphaWaybillUnbindResponse.class;
   }
}
