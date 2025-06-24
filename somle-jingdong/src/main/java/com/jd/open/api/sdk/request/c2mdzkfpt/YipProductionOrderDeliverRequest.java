package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionOrderDeliverResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionOrderDeliverRequest extends AbstractRequest implements JdRequest<YipProductionOrderDeliverResponse> {
   private String carrierName;
   private String shipNo;
   private String localeStr;
   private String loginName;
   private Long coId;
   private BigDecimal guaranteeAmount;
   private Long carrierId;
   private Integer packageNum;
   private String vendorCode;
   private String coIds;

   public void setCarrierName(String carrierName) {
      this.carrierName = carrierName;
   }

   public String getCarrierName() {
      return this.carrierName;
   }

   public void setShipNo(String shipNo) {
      this.shipNo = shipNo;
   }

   public String getShipNo() {
      return this.shipNo;
   }

   public void setLocaleStr(String localeStr) {
      this.localeStr = localeStr;
   }

   public String getLocaleStr() {
      return this.localeStr;
   }

   public void setLoginName(String loginName) {
      this.loginName = loginName;
   }

   public String getLoginName() {
      return this.loginName;
   }

   public void setCoId(Long coId) {
      this.coId = coId;
   }

   public Long getCoId() {
      return this.coId;
   }

   public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
      this.guaranteeAmount = guaranteeAmount;
   }

   public BigDecimal getGuaranteeAmount() {
      return this.guaranteeAmount;
   }

   public void setCarrierId(Long carrierId) {
      this.carrierId = carrierId;
   }

   public Long getCarrierId() {
      return this.carrierId;
   }

   public void setPackageNum(Integer packageNum) {
      this.packageNum = packageNum;
   }

   public Integer getPackageNum() {
      return this.packageNum;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setCoIds(String coIds) {
      this.coIds = coIds;
   }

   public String getCoIds() {
      return this.coIds;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.orderDeliver";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("carrierName", this.carrierName);
      pmap.put("shipNo", this.shipNo);
      pmap.put("localeStr", this.localeStr);
      pmap.put("loginName", this.loginName);
      pmap.put("coId", this.coId);
      pmap.put("guaranteeAmount", this.guaranteeAmount);
      pmap.put("carrierId", this.carrierId);
      pmap.put("packageNum", this.packageNum);
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("coIds", this.coIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionOrderDeliverResponse> getResponseClass() {
      return YipProductionOrderDeliverResponse.class;
   }
}
