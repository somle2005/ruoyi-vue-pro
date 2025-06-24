package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosHouseSpuAddress implements Serializable {
   private Integer thirdCode;
   private String addressDes;
   private String firstName;
   private String addressImg;
   private Double addressLat;
   private Double addressLon;
   private Integer fourCode;
   private Integer firstCode;
   private String thirdName;
   private String fourName;
   private Integer secondCode;
   private String secondName;

   @JsonProperty("thirdCode")
   public void setThirdCode(Integer thirdCode) {
      this.thirdCode = thirdCode;
   }

   @JsonProperty("thirdCode")
   public Integer getThirdCode() {
      return this.thirdCode;
   }

   @JsonProperty("addressDes")
   public void setAddressDes(String addressDes) {
      this.addressDes = addressDes;
   }

   @JsonProperty("addressDes")
   public String getAddressDes() {
      return this.addressDes;
   }

   @JsonProperty("firstName")
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("firstName")
   public String getFirstName() {
      return this.firstName;
   }

   @JsonProperty("addressImg")
   public void setAddressImg(String addressImg) {
      this.addressImg = addressImg;
   }

   @JsonProperty("addressImg")
   public String getAddressImg() {
      return this.addressImg;
   }

   @JsonProperty("addressLat")
   public void setAddressLat(Double addressLat) {
      this.addressLat = addressLat;
   }

   @JsonProperty("addressLat")
   public Double getAddressLat() {
      return this.addressLat;
   }

   @JsonProperty("addressLon")
   public void setAddressLon(Double addressLon) {
      this.addressLon = addressLon;
   }

   @JsonProperty("addressLon")
   public Double getAddressLon() {
      return this.addressLon;
   }

   @JsonProperty("fourCode")
   public void setFourCode(Integer fourCode) {
      this.fourCode = fourCode;
   }

   @JsonProperty("fourCode")
   public Integer getFourCode() {
      return this.fourCode;
   }

   @JsonProperty("firstCode")
   public void setFirstCode(Integer firstCode) {
      this.firstCode = firstCode;
   }

   @JsonProperty("firstCode")
   public Integer getFirstCode() {
      return this.firstCode;
   }

   @JsonProperty("thirdName")
   public void setThirdName(String thirdName) {
      this.thirdName = thirdName;
   }

   @JsonProperty("thirdName")
   public String getThirdName() {
      return this.thirdName;
   }

   @JsonProperty("fourName")
   public void setFourName(String fourName) {
      this.fourName = fourName;
   }

   @JsonProperty("fourName")
   public String getFourName() {
      return this.fourName;
   }

   @JsonProperty("secondCode")
   public void setSecondCode(Integer secondCode) {
      this.secondCode = secondCode;
   }

   @JsonProperty("secondCode")
   public Integer getSecondCode() {
      return this.secondCode;
   }

   @JsonProperty("secondName")
   public void setSecondName(String secondName) {
      this.secondName = secondName;
   }

   @JsonProperty("secondName")
   public String getSecondName() {
      return this.secondName;
   }
}
