package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStoreInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class StoreVo implements Serializable {
   private String storeName;
   private Integer storeType;
   private Integer storeBusinessModel;
   private BigDecimal area;
   private Integer openFlag;
   private Integer crowdsourcingFlag;
   private Integer selfPickFlag;
   private Integer deliverFlag;
   private Integer sellerControlStock;
   private String storeSystem;
   private String contacts;
   private String phone;
   private String province;
   private String city;
   private String county;
   private String town;
   private String address;
   private String postCode;
   private String distributionScope;
   private String geographicCoordinate;
   private String remark;
   private Integer jdstore;

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("storeType")
   public void setStoreType(Integer storeType) {
      this.storeType = storeType;
   }

   @JsonProperty("storeType")
   public Integer getStoreType() {
      return this.storeType;
   }

   @JsonProperty("storeBusinessModel")
   public void setStoreBusinessModel(Integer storeBusinessModel) {
      this.storeBusinessModel = storeBusinessModel;
   }

   @JsonProperty("storeBusinessModel")
   public Integer getStoreBusinessModel() {
      return this.storeBusinessModel;
   }

   @JsonProperty("area")
   public void setArea(BigDecimal area) {
      this.area = area;
   }

   @JsonProperty("area")
   public BigDecimal getArea() {
      return this.area;
   }

   @JsonProperty("openFlag")
   public void setOpenFlag(Integer openFlag) {
      this.openFlag = openFlag;
   }

   @JsonProperty("openFlag")
   public Integer getOpenFlag() {
      return this.openFlag;
   }

   @JsonProperty("crowdsourcingFlag")
   public void setCrowdsourcingFlag(Integer crowdsourcingFlag) {
      this.crowdsourcingFlag = crowdsourcingFlag;
   }

   @JsonProperty("crowdsourcingFlag")
   public Integer getCrowdsourcingFlag() {
      return this.crowdsourcingFlag;
   }

   @JsonProperty("selfPickFlag")
   public void setSelfPickFlag(Integer selfPickFlag) {
      this.selfPickFlag = selfPickFlag;
   }

   @JsonProperty("selfPickFlag")
   public Integer getSelfPickFlag() {
      return this.selfPickFlag;
   }

   @JsonProperty("deliverFlag")
   public void setDeliverFlag(Integer deliverFlag) {
      this.deliverFlag = deliverFlag;
   }

   @JsonProperty("deliverFlag")
   public Integer getDeliverFlag() {
      return this.deliverFlag;
   }

   @JsonProperty("sellerControlStock")
   public void setSellerControlStock(Integer sellerControlStock) {
      this.sellerControlStock = sellerControlStock;
   }

   @JsonProperty("sellerControlStock")
   public Integer getSellerControlStock() {
      return this.sellerControlStock;
   }

   @JsonProperty("storeSystem")
   public void setStoreSystem(String storeSystem) {
      this.storeSystem = storeSystem;
   }

   @JsonProperty("storeSystem")
   public String getStoreSystem() {
      return this.storeSystem;
   }

   @JsonProperty("contacts")
   public void setContacts(String contacts) {
      this.contacts = contacts;
   }

   @JsonProperty("contacts")
   public String getContacts() {
      return this.contacts;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("town")
   public void setTown(String town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String getTown() {
      return this.town;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("postCode")
   public void setPostCode(String postCode) {
      this.postCode = postCode;
   }

   @JsonProperty("postCode")
   public String getPostCode() {
      return this.postCode;
   }

   @JsonProperty("distributionScope")
   public void setDistributionScope(String distributionScope) {
      this.distributionScope = distributionScope;
   }

   @JsonProperty("distributionScope")
   public String getDistributionScope() {
      return this.distributionScope;
   }

   @JsonProperty("geographicCoordinate")
   public void setGeographicCoordinate(String geographicCoordinate) {
      this.geographicCoordinate = geographicCoordinate;
   }

   @JsonProperty("geographicCoordinate")
   public String getGeographicCoordinate() {
      return this.geographicCoordinate;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("jdstore")
   public void setJdstore(Integer jdstore) {
      this.jdstore = jdstore;
   }

   @JsonProperty("jdstore")
   public Integer getJdstore() {
      return this.jdstore;
   }
}
