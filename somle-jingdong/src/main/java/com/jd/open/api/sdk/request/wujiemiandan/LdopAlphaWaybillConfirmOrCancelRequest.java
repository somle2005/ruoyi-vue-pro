package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillConfirmOrCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaWaybillConfirmOrCancelRequest extends AbstractRequest implements JdRequest<LdopAlphaWaybillConfirmOrCancelResponse> {
   private String providerCode;
   private String vendorCode;
   private Integer dealType;
   private String vendorOrderCode;
   private String platformOrderNo;
   private String waybillCode;

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setDealType(Integer dealType) {
      this.dealType = dealType;
   }

   public Integer getDealType() {
      return this.dealType;
   }

   public void setVendorOrderCode(String vendorOrderCode) {
      this.vendorOrderCode = vendorOrderCode;
   }

   public String getVendorOrderCode() {
      return this.vendorOrderCode;
   }

   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.waybill.confirmOrCancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerCode", this.providerCode);
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("dealType", this.dealType);
      pmap.put("vendorOrderCode", this.vendorOrderCode);
      pmap.put("platformOrderNo", this.platformOrderNo);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaWaybillConfirmOrCancelResponse> getResponseClass() {
      return LdopAlphaWaybillConfirmOrCancelResponse.class;
   }
}
