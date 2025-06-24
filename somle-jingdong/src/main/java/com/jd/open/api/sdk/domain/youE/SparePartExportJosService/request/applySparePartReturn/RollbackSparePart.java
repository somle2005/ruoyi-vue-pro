package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.applySparePartReturn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RollbackSparePart implements Serializable {
   private Integer cityId;
   private Integer townId;
   private String cityName;
   private Integer countyId;
   private String contact;
   private Integer channelId;
   private String countyName;
   private String townName;
   private Integer companyType;
   private String receiveAddress;
   private Integer partsNum;
   private String mobile;
   private Integer provinceId;
   private String purchaserName;
   private List<SparePart> sparePartList;
   private String purchaserId;
   private String rollbackType;
   private String provinceName;

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("contact")
   public void setContact(String contact) {
      this.contact = contact;
   }

   @JsonProperty("contact")
   public String getContact() {
      return this.contact;
   }

   @JsonProperty("channelId")
   public void setChannelId(Integer channelId) {
      this.channelId = channelId;
   }

   @JsonProperty("channelId")
   public Integer getChannelId() {
      return this.channelId;
   }

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("companyType")
   public void setCompanyType(Integer companyType) {
      this.companyType = companyType;
   }

   @JsonProperty("companyType")
   public Integer getCompanyType() {
      return this.companyType;
   }

   @JsonProperty("receiveAddress")
   public void setReceiveAddress(String receiveAddress) {
      this.receiveAddress = receiveAddress;
   }

   @JsonProperty("receiveAddress")
   public String getReceiveAddress() {
      return this.receiveAddress;
   }

   @JsonProperty("partsNum")
   public void setPartsNum(Integer partsNum) {
      this.partsNum = partsNum;
   }

   @JsonProperty("partsNum")
   public Integer getPartsNum() {
      return this.partsNum;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("purchaserName")
   public void setPurchaserName(String purchaserName) {
      this.purchaserName = purchaserName;
   }

   @JsonProperty("purchaserName")
   public String getPurchaserName() {
      return this.purchaserName;
   }

   @JsonProperty("sparePartList")
   public void setSparePartList(List<SparePart> sparePartList) {
      this.sparePartList = sparePartList;
   }

   @JsonProperty("sparePartList")
   public List<SparePart> getSparePartList() {
      return this.sparePartList;
   }

   @JsonProperty("purchaserId")
   public void setPurchaserId(String purchaserId) {
      this.purchaserId = purchaserId;
   }

   @JsonProperty("purchaserId")
   public String getPurchaserId() {
      return this.purchaserId;
   }

   @JsonProperty("rollbackType")
   public void setRollbackType(String rollbackType) {
      this.rollbackType = rollbackType;
   }

   @JsonProperty("rollbackType")
   public String getRollbackType() {
      return this.rollbackType;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }
}
