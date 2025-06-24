package com.jd.open.api.sdk.domain.fangchan.RentPlotSaasService.response.listPlotInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PlotInfoSaasVO implements Serializable {
   private Long[] id;
   private Long[] plotId;
   private String[] plotName;
   private String[] nickName;
   private String[] location;
   private Integer[] firstCode;
   private Integer[] secondCode;
   private Integer[] thirdCode;
   private String[] firstName;
   private String[] secondName;
   private String[] thirdName;
   private String[] addressDes;
   private Double[] distance;
   private Double averagePrice;
   private boolean ifCityUse;

   @JsonProperty("id")
   public void setId(Long[] id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long[] getId() {
      return this.id;
   }

   @JsonProperty("plotId")
   public void setPlotId(Long[] plotId) {
      this.plotId = plotId;
   }

   @JsonProperty("plotId")
   public Long[] getPlotId() {
      return this.plotId;
   }

   @JsonProperty("plotName")
   public void setPlotName(String[] plotName) {
      this.plotName = plotName;
   }

   @JsonProperty("plotName")
   public String[] getPlotName() {
      return this.plotName;
   }

   @JsonProperty("nickName")
   public void setNickName(String[] nickName) {
      this.nickName = nickName;
   }

   @JsonProperty("nickName")
   public String[] getNickName() {
      return this.nickName;
   }

   @JsonProperty("location")
   public void setLocation(String[] location) {
      this.location = location;
   }

   @JsonProperty("location")
   public String[] getLocation() {
      return this.location;
   }

   @JsonProperty("firstCode")
   public void setFirstCode(Integer[] firstCode) {
      this.firstCode = firstCode;
   }

   @JsonProperty("firstCode")
   public Integer[] getFirstCode() {
      return this.firstCode;
   }

   @JsonProperty("secondCode")
   public void setSecondCode(Integer[] secondCode) {
      this.secondCode = secondCode;
   }

   @JsonProperty("secondCode")
   public Integer[] getSecondCode() {
      return this.secondCode;
   }

   @JsonProperty("thirdCode")
   public void setThirdCode(Integer[] thirdCode) {
      this.thirdCode = thirdCode;
   }

   @JsonProperty("thirdCode")
   public Integer[] getThirdCode() {
      return this.thirdCode;
   }

   @JsonProperty("firstName")
   public void setFirstName(String[] firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("firstName")
   public String[] getFirstName() {
      return this.firstName;
   }

   @JsonProperty("secondName")
   public void setSecondName(String[] secondName) {
      this.secondName = secondName;
   }

   @JsonProperty("secondName")
   public String[] getSecondName() {
      return this.secondName;
   }

   @JsonProperty("thirdName")
   public void setThirdName(String[] thirdName) {
      this.thirdName = thirdName;
   }

   @JsonProperty("thirdName")
   public String[] getThirdName() {
      return this.thirdName;
   }

   @JsonProperty("addressDes")
   public void setAddressDes(String[] addressDes) {
      this.addressDes = addressDes;
   }

   @JsonProperty("addressDes")
   public String[] getAddressDes() {
      return this.addressDes;
   }

   @JsonProperty("distance")
   public void setDistance(Double[] distance) {
      this.distance = distance;
   }

   @JsonProperty("distance")
   public Double[] getDistance() {
      return this.distance;
   }

   @JsonProperty("averagePrice")
   public void setAveragePrice(Double averagePrice) {
      this.averagePrice = averagePrice;
   }

   @JsonProperty("averagePrice")
   public Double getAveragePrice() {
      return this.averagePrice;
   }

   @JsonProperty("ifCityUse")
   public void setIfCityUse(boolean ifCityUse) {
      this.ifCityUse = ifCityUse;
   }

   @JsonProperty("ifCityUse")
   public boolean getIfCityUse() {
      return this.ifCityUse;
   }
}
