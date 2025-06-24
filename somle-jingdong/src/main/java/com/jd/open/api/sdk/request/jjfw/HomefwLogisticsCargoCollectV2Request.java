package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwLogisticsCargoCollectV2Response;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class HomefwLogisticsCargoCollectV2Request extends AbstractRequest implements JdRequest<HomefwLogisticsCargoCollectV2Response> {
   private String venderCode;
   private String orderNo;
   private String logisticsNoExt;
   private String operateTime;
   private String city;
   private Integer siteType;
   private String siteCode;
   private String siteName;
   private String remark;
   private BigDecimal baseCost;
   private BigDecimal getCost;
   private BigDecimal sendCost;
   private BigDecimal packageCost;
   private BigDecimal totalCost;
   private String shippingProvince;
   private String shippingCity;
   private String shippingCounty;
   private String shippingTown;
   private String shippingAddress;
   private BigDecimal totalWeight;
   private BigDecimal totalSquares;
   private String logisticsNoExtDate;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setLogisticsNoExt(String logisticsNoExt) {
      this.logisticsNoExt = logisticsNoExt;
   }

   public String getLogisticsNoExt() {
      return this.logisticsNoExt;
   }

   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   public String getOperateTime() {
      return this.operateTime;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setSiteType(Integer siteType) {
      this.siteType = siteType;
   }

   public Integer getSiteType() {
      return this.siteType;
   }

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setBaseCost(BigDecimal baseCost) {
      this.baseCost = baseCost;
   }

   public BigDecimal getBaseCost() {
      return this.baseCost;
   }

   public void setGetCost(BigDecimal getCost) {
      this.getCost = getCost;
   }

   public BigDecimal getGetCost() {
      return this.getCost;
   }

   public void setSendCost(BigDecimal sendCost) {
      this.sendCost = sendCost;
   }

   public BigDecimal getSendCost() {
      return this.sendCost;
   }

   public void setPackageCost(BigDecimal packageCost) {
      this.packageCost = packageCost;
   }

   public BigDecimal getPackageCost() {
      return this.packageCost;
   }

   public void setTotalCost(BigDecimal totalCost) {
      this.totalCost = totalCost;
   }

   public BigDecimal getTotalCost() {
      return this.totalCost;
   }

   public void setShippingProvince(String shippingProvince) {
      this.shippingProvince = shippingProvince;
   }

   public String getShippingProvince() {
      return this.shippingProvince;
   }

   public void setShippingCity(String shippingCity) {
      this.shippingCity = shippingCity;
   }

   public String getShippingCity() {
      return this.shippingCity;
   }

   public void setShippingCounty(String shippingCounty) {
      this.shippingCounty = shippingCounty;
   }

   public String getShippingCounty() {
      return this.shippingCounty;
   }

   public void setShippingTown(String shippingTown) {
      this.shippingTown = shippingTown;
   }

   public String getShippingTown() {
      return this.shippingTown;
   }

   public void setShippingAddress(String shippingAddress) {
      this.shippingAddress = shippingAddress;
   }

   public String getShippingAddress() {
      return this.shippingAddress;
   }

   public void setTotalWeight(BigDecimal totalWeight) {
      this.totalWeight = totalWeight;
   }

   public BigDecimal getTotalWeight() {
      return this.totalWeight;
   }

   public void setTotalSquares(BigDecimal totalSquares) {
      this.totalSquares = totalSquares;
   }

   public BigDecimal getTotalSquares() {
      return this.totalSquares;
   }

   public void setLogisticsNoExtDate(String logisticsNoExtDate) {
      this.logisticsNoExtDate = logisticsNoExtDate;
   }

   public String getLogisticsNoExtDate() {
      return this.logisticsNoExtDate;
   }

   public String getApiMethod() {
      return "jingdong.homefw.logistics.cargoCollectV2";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("logisticsNoExt", this.logisticsNoExt);
      pmap.put("operateTime", this.operateTime);
      pmap.put("city", this.city);
      pmap.put("siteType", this.siteType);
      pmap.put("siteCode", this.siteCode);
      pmap.put("siteName", this.siteName);
      pmap.put("remark", this.remark);
      pmap.put("baseCost", this.baseCost);
      pmap.put("getCost", this.getCost);
      pmap.put("sendCost", this.sendCost);
      pmap.put("packageCost", this.packageCost);
      pmap.put("totalCost", this.totalCost);
      pmap.put("shippingProvince", this.shippingProvince);
      pmap.put("shippingCity", this.shippingCity);
      pmap.put("shippingCounty", this.shippingCounty);
      pmap.put("shippingTown", this.shippingTown);
      pmap.put("shippingAddress", this.shippingAddress);
      pmap.put("totalWeight", this.totalWeight);
      pmap.put("totalSquares", this.totalSquares);
      pmap.put("logisticsNoExtDate", this.logisticsNoExtDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwLogisticsCargoCollectV2Response> getResponseClass() {
      return HomefwLogisticsCargoCollectV2Response.class;
   }
}
