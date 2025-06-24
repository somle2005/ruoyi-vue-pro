package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.applySparePart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ApplyOrder implements Serializable {
   private String receivePhone;
   private String townName;
   private Integer companyType;
   private String receiveAddress;
   private Integer cityId;
   private Integer townId;
   private Integer provinceId;
   private List<SparePart> sparePartList;
   private String purchaserId;
   private String receiveName;
   private String cityName;
   private Integer countyId;
   private String provinceName;
   private Integer channelId;
   private String countyName;

   @JsonProperty("receivePhone")
   public void setReceivePhone(String receivePhone) {
      this.receivePhone = receivePhone;
   }

   @JsonProperty("receivePhone")
   public String getReceivePhone() {
      return this.receivePhone;
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

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
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

   @JsonProperty("receiveName")
   public void setReceiveName(String receiveName) {
      this.receiveName = receiveName;
   }

   @JsonProperty("receiveName")
   public String getReceiveName() {
      return this.receiveName;
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

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
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
}
