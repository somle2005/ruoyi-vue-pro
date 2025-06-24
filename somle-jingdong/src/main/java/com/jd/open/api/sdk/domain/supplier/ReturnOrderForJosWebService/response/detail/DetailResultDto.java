package com.jd.open.api.sdk.domain.supplier.ReturnOrderForJosWebService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DetailResultDto implements Serializable {
   private Long returnId;
   private Date createDate;
   private String providerCode;
   private String providerName;
   private String fromDeliverCenterName;
   private String toDeliverCenterName;
   private Integer totalNum;
   private BigDecimal totalPrice;
   private Integer wareVariety;
   private Date bookingDate;
   private Date deliverTime;
   private Integer balanceState;
   private String balanceStateName;
   private Date balanceDate;
   private String opinion;
   private Date outStoreRoomDate;
   private List<RoDetailDto> detailDtoList;

   @JsonProperty("returnId")
   public void setReturnId(Long returnId) {
      this.returnId = returnId;
   }

   @JsonProperty("returnId")
   public Long getReturnId() {
      return this.returnId;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("fromDeliverCenterName")
   public void setFromDeliverCenterName(String fromDeliverCenterName) {
      this.fromDeliverCenterName = fromDeliverCenterName;
   }

   @JsonProperty("fromDeliverCenterName")
   public String getFromDeliverCenterName() {
      return this.fromDeliverCenterName;
   }

   @JsonProperty("toDeliverCenterName")
   public void setToDeliverCenterName(String toDeliverCenterName) {
      this.toDeliverCenterName = toDeliverCenterName;
   }

   @JsonProperty("toDeliverCenterName")
   public String getToDeliverCenterName() {
      return this.toDeliverCenterName;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public Integer getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("totalPrice")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("wareVariety")
   public void setWareVariety(Integer wareVariety) {
      this.wareVariety = wareVariety;
   }

   @JsonProperty("wareVariety")
   public Integer getWareVariety() {
      return this.wareVariety;
   }

   @JsonProperty("bookingDate")
   public void setBookingDate(Date bookingDate) {
      this.bookingDate = bookingDate;
   }

   @JsonProperty("bookingDate")
   public Date getBookingDate() {
      return this.bookingDate;
   }

   @JsonProperty("deliverTime")
   public void setDeliverTime(Date deliverTime) {
      this.deliverTime = deliverTime;
   }

   @JsonProperty("deliverTime")
   public Date getDeliverTime() {
      return this.deliverTime;
   }

   @JsonProperty("balanceState")
   public void setBalanceState(Integer balanceState) {
      this.balanceState = balanceState;
   }

   @JsonProperty("balanceState")
   public Integer getBalanceState() {
      return this.balanceState;
   }

   @JsonProperty("balanceStateName")
   public void setBalanceStateName(String balanceStateName) {
      this.balanceStateName = balanceStateName;
   }

   @JsonProperty("balanceStateName")
   public String getBalanceStateName() {
      return this.balanceStateName;
   }

   @JsonProperty("balanceDate")
   public void setBalanceDate(Date balanceDate) {
      this.balanceDate = balanceDate;
   }

   @JsonProperty("balanceDate")
   public Date getBalanceDate() {
      return this.balanceDate;
   }

   @JsonProperty("opinion")
   public void setOpinion(String opinion) {
      this.opinion = opinion;
   }

   @JsonProperty("opinion")
   public String getOpinion() {
      return this.opinion;
   }

   @JsonProperty("outStoreRoomDate")
   public void setOutStoreRoomDate(Date outStoreRoomDate) {
      this.outStoreRoomDate = outStoreRoomDate;
   }

   @JsonProperty("outStoreRoomDate")
   public Date getOutStoreRoomDate() {
      return this.outStoreRoomDate;
   }

   @JsonProperty("detailDtoList")
   public void setDetailDtoList(List<RoDetailDto> detailDtoList) {
      this.detailDtoList = detailDtoList;
   }

   @JsonProperty("detailDtoList")
   public List<RoDetailDto> getDetailDtoList() {
      return this.detailDtoList;
   }
}
