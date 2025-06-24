package com.jd.open.api.sdk.domain.unboundedShop.DjcsServiceProvider.response.getVenderStoreInfoList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StoreInfoResTO implements Serializable {
   private String exStoreId;
   private Long storeId;
   private String storeName;
   private String storePhone;
   private String storeMobile;
   private String slogan;
   private String businessBeginTime;
   private String businessEndTime;
   private Integer storeBizType;
   private String storeImage;
   private Integer firstAddress;
   private Integer secondAddress;
   private Integer thirdAddress;
   private String storeAddress;
   private Integer storeStatus;
   private String coordinate;

   @JsonProperty("exStoreId")
   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   @JsonProperty("exStoreId")
   public String getExStoreId() {
      return this.exStoreId;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("storePhone")
   public void setStorePhone(String storePhone) {
      this.storePhone = storePhone;
   }

   @JsonProperty("storePhone")
   public String getStorePhone() {
      return this.storePhone;
   }

   @JsonProperty("storeMobile")
   public void setStoreMobile(String storeMobile) {
      this.storeMobile = storeMobile;
   }

   @JsonProperty("storeMobile")
   public String getStoreMobile() {
      return this.storeMobile;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
   }

   @JsonProperty("businessBeginTime")
   public void setBusinessBeginTime(String businessBeginTime) {
      this.businessBeginTime = businessBeginTime;
   }

   @JsonProperty("businessBeginTime")
   public String getBusinessBeginTime() {
      return this.businessBeginTime;
   }

   @JsonProperty("businessEndTime")
   public void setBusinessEndTime(String businessEndTime) {
      this.businessEndTime = businessEndTime;
   }

   @JsonProperty("businessEndTime")
   public String getBusinessEndTime() {
      return this.businessEndTime;
   }

   @JsonProperty("storeBizType")
   public void setStoreBizType(Integer storeBizType) {
      this.storeBizType = storeBizType;
   }

   @JsonProperty("storeBizType")
   public Integer getStoreBizType() {
      return this.storeBizType;
   }

   @JsonProperty("storeImage")
   public void setStoreImage(String storeImage) {
      this.storeImage = storeImage;
   }

   @JsonProperty("storeImage")
   public String getStoreImage() {
      return this.storeImage;
   }

   @JsonProperty("firstAddress")
   public void setFirstAddress(Integer firstAddress) {
      this.firstAddress = firstAddress;
   }

   @JsonProperty("firstAddress")
   public Integer getFirstAddress() {
      return this.firstAddress;
   }

   @JsonProperty("secondAddress")
   public void setSecondAddress(Integer secondAddress) {
      this.secondAddress = secondAddress;
   }

   @JsonProperty("secondAddress")
   public Integer getSecondAddress() {
      return this.secondAddress;
   }

   @JsonProperty("thirdAddress")
   public void setThirdAddress(Integer thirdAddress) {
      this.thirdAddress = thirdAddress;
   }

   @JsonProperty("thirdAddress")
   public Integer getThirdAddress() {
      return this.thirdAddress;
   }

   @JsonProperty("storeAddress")
   public void setStoreAddress(String storeAddress) {
      this.storeAddress = storeAddress;
   }

   @JsonProperty("storeAddress")
   public String getStoreAddress() {
      return this.storeAddress;
   }

   @JsonProperty("storeStatus")
   public void setStoreStatus(Integer storeStatus) {
      this.storeStatus = storeStatus;
   }

   @JsonProperty("storeStatus")
   public Integer getStoreStatus() {
      return this.storeStatus;
   }

   @JsonProperty("coordinate")
   public void setCoordinate(String coordinate) {
      this.coordinate = coordinate;
   }

   @JsonProperty("coordinate")
   public String getCoordinate() {
      return this.coordinate;
   }
}
