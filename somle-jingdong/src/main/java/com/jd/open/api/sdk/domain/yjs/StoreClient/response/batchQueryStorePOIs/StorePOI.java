package com.jd.open.api.sdk.domain.yjs.StoreClient.response.batchQueryStorePOIs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StorePOI implements Serializable {
   private String storeAddress;
   private Float pointX;
   private String city;
   private Float pointY;
   private String storePhone;
   private String storeName;
   private String storeId;
   private String shopHours;
   private String shopPhoto;
   private String coordSys;
   private Integer status;
   private String desenStorePhone;

   @JsonProperty("storeAddress")
   public void setStoreAddress(String storeAddress) {
      this.storeAddress = storeAddress;
   }

   @JsonProperty("storeAddress")
   public String getStoreAddress() {
      return this.storeAddress;
   }

   @JsonProperty("pointX")
   public void setPointX(Float pointX) {
      this.pointX = pointX;
   }

   @JsonProperty("pointX")
   public Float getPointX() {
      return this.pointX;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("pointY")
   public void setPointY(Float pointY) {
      this.pointY = pointY;
   }

   @JsonProperty("pointY")
   public Float getPointY() {
      return this.pointY;
   }

   @JsonProperty("storePhone")
   public void setStorePhone(String storePhone) {
      this.storePhone = storePhone;
   }

   @JsonProperty("storePhone")
   public String getStorePhone() {
      return this.storePhone;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("shopHours")
   public void setShopHours(String shopHours) {
      this.shopHours = shopHours;
   }

   @JsonProperty("shopHours")
   public String getShopHours() {
      return this.shopHours;
   }

   @JsonProperty("shopPhoto")
   public void setShopPhoto(String shopPhoto) {
      this.shopPhoto = shopPhoto;
   }

   @JsonProperty("shopPhoto")
   public String getShopPhoto() {
      return this.shopPhoto;
   }

   @JsonProperty("coordSys")
   public void setCoordSys(String coordSys) {
      this.coordSys = coordSys;
   }

   @JsonProperty("coordSys")
   public String getCoordSys() {
      return this.coordSys;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("desen_storePhone")
   public void setDesenStorePhone(String desenStorePhone) {
      this.desenStorePhone = desenStorePhone;
   }

   @JsonProperty("desen_storePhone")
   public String getDesenStorePhone() {
      return this.desenStorePhone;
   }
}
