package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwOwnserviceOrderappointResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class HomefwOwnserviceOrderappointRequest extends AbstractRequest implements JdRequest<HomefwOwnserviceOrderappointResponse> {
   private String saleOrderNo;
   private Integer AppointPattern;
   private Integer pickupType;
   private Integer isInsured;
   private String warehouseName;
   private BigDecimal insuranceAmount;
   private String serviceAppid;
   private String siteType;
   private String remark;
   private String sku;
   private String itemServiceAppid;
   private String itemSiteType;
   private String itemRemark;

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public void setAppointPattern(Integer AppointPattern) {
      this.AppointPattern = AppointPattern;
   }

   public Integer getAppointPattern() {
      return this.AppointPattern;
   }

   public void setPickupType(Integer pickupType) {
      this.pickupType = pickupType;
   }

   public Integer getPickupType() {
      return this.pickupType;
   }

   public void setIsInsured(Integer isInsured) {
      this.isInsured = isInsured;
   }

   public Integer getIsInsured() {
      return this.isInsured;
   }

   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   public String getWarehouseName() {
      return this.warehouseName;
   }

   public void setInsuranceAmount(BigDecimal insuranceAmount) {
      this.insuranceAmount = insuranceAmount;
   }

   public BigDecimal getInsuranceAmount() {
      return this.insuranceAmount;
   }

   public void setServiceAppid(String serviceAppid) {
      this.serviceAppid = serviceAppid;
   }

   public String getServiceAppid() {
      return this.serviceAppid;
   }

   public void setSiteType(String siteType) {
      this.siteType = siteType;
   }

   public String getSiteType() {
      return this.siteType;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
   }

   public void setItemServiceAppid(String itemServiceAppid) {
      this.itemServiceAppid = itemServiceAppid;
   }

   public String getItemServiceAppid() {
      return this.itemServiceAppid;
   }

   public void setItemSiteType(String itemSiteType) {
      this.itemSiteType = itemSiteType;
   }

   public String getItemSiteType() {
      return this.itemSiteType;
   }

   public void setItemRemark(String itemRemark) {
      this.itemRemark = itemRemark;
   }

   public String getItemRemark() {
      return this.itemRemark;
   }

   public String getApiMethod() {
      return "jingdong.homefw.ownservice.orderappoint";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("saleOrderNo", this.saleOrderNo);
      pmap.put("AppointPattern", this.AppointPattern);
      pmap.put("pickupType", this.pickupType);
      pmap.put("isInsured", this.isInsured);
      pmap.put("warehouseName", this.warehouseName);
      pmap.put("insuranceAmount", this.insuranceAmount);
      pmap.put("serviceAppid", this.serviceAppid);
      pmap.put("siteType", this.siteType);
      pmap.put("remark", this.remark);
      pmap.put("sku", this.sku);
      pmap.put("itemServiceAppid", this.itemServiceAppid);
      pmap.put("itemSiteType", this.itemSiteType);
      pmap.put("itemRemark", this.itemRemark);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwOwnserviceOrderappointResponse> getResponseClass() {
      return HomefwOwnserviceOrderappointResponse.class;
   }
}
