package com.jd.open.api.sdk.domain.gysyuyue.JosBigBookJsfService.response.queryBook;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HariQueryResult implements Serializable {
   private String bookNo;
   private String bookDate;
   private String supNo;
   private String poNo;
   private Integer whNo;
   private Integer dcNo;
   private String ownerNo;
   private Integer status;
   private String bookTimePeriod;
   private String bookTime;
   private Integer returnType;
   private String carrier;

   @JsonProperty("bookNo")
   public void setBookNo(String bookNo) {
      this.bookNo = bookNo;
   }

   @JsonProperty("bookNo")
   public String getBookNo() {
      return this.bookNo;
   }

   @JsonProperty("bookDate")
   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   @JsonProperty("bookDate")
   public String getBookDate() {
      return this.bookDate;
   }

   @JsonProperty("supNo")
   public void setSupNo(String supNo) {
      this.supNo = supNo;
   }

   @JsonProperty("supNo")
   public String getSupNo() {
      return this.supNo;
   }

   @JsonProperty("poNo")
   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   @JsonProperty("poNo")
   public String getPoNo() {
      return this.poNo;
   }

   @JsonProperty("whNo")
   public void setWhNo(Integer whNo) {
      this.whNo = whNo;
   }

   @JsonProperty("whNo")
   public Integer getWhNo() {
      return this.whNo;
   }

   @JsonProperty("dcNo")
   public void setDcNo(Integer dcNo) {
      this.dcNo = dcNo;
   }

   @JsonProperty("dcNo")
   public Integer getDcNo() {
      return this.dcNo;
   }

   @JsonProperty("ownerNo")
   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   @JsonProperty("ownerNo")
   public String getOwnerNo() {
      return this.ownerNo;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("bookTimePeriod")
   public void setBookTimePeriod(String bookTimePeriod) {
      this.bookTimePeriod = bookTimePeriod;
   }

   @JsonProperty("bookTimePeriod")
   public String getBookTimePeriod() {
      return this.bookTimePeriod;
   }

   @JsonProperty("bookTime")
   public void setBookTime(String bookTime) {
      this.bookTime = bookTime;
   }

   @JsonProperty("bookTime")
   public String getBookTime() {
      return this.bookTime;
   }

   @JsonProperty("returnType")
   public void setReturnType(Integer returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Integer getReturnType() {
      return this.returnType;
   }

   @JsonProperty("carrier")
   public void setCarrier(String carrier) {
      this.carrier = carrier;
   }

   @JsonProperty("carrier")
   public String getCarrier() {
      return this.carrier;
   }
}
