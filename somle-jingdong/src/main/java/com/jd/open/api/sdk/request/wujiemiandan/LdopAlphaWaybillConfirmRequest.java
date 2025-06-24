package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillConfirmResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaWaybillConfirmRequest extends AbstractRequest implements JdRequest<LdopAlphaWaybillConfirmResponse> {
   private BigDecimal totalVolume;
   private String volume;
   private String length;
   private String width;
   private String weight;
   private String waybillNo;
   private String height;
   private String providerCode;
   private BigDecimal totalWeight;
   private String vendorCode;

   public void setTotalVolume(BigDecimal totalVolume) {
      this.totalVolume = totalVolume;
   }

   public BigDecimal getTotalVolume() {
      return this.totalVolume;
   }

   public void setVolume(String volume) {
      this.volume = volume;
   }

   public String getVolume() {
      return this.volume;
   }

   public void setLength(String length) {
      this.length = length;
   }

   public String getLength() {
      return this.length;
   }

   public void setWidth(String width) {
      this.width = width;
   }

   public String getWidth() {
      return this.width;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   public String getWeight() {
      return this.weight;
   }

   public void setWaybillNo(String waybillNo) {
      this.waybillNo = waybillNo;
   }

   public String getWaybillNo() {
      return this.waybillNo;
   }

   public void setHeight(String height) {
      this.height = height;
   }

   public String getHeight() {
      return this.height;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setTotalWeight(BigDecimal totalWeight) {
      this.totalWeight = totalWeight;
   }

   public BigDecimal getTotalWeight() {
      return this.totalWeight;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.waybill.confirm";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("totalVolume", this.totalVolume);
      pmap.put("volume", this.volume);
      pmap.put("length", this.length);
      pmap.put("width", this.width);
      pmap.put("weight", this.weight);
      pmap.put("waybillNo", this.waybillNo);
      pmap.put("height", this.height);
      pmap.put("providerCode", this.providerCode);
      pmap.put("totalWeight", this.totalWeight);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaWaybillConfirmResponse> getResponseClass() {
      return LdopAlphaWaybillConfirmResponse.class;
   }
}
