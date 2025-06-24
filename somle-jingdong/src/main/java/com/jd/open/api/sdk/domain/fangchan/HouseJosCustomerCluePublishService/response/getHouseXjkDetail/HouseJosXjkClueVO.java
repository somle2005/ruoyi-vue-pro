package com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getHouseXjkDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HouseJosXjkClueVO implements Serializable {
   private Long clueId;
   private String freezeNo;
   private String unFreezeNo;
   private String activityName;
   private Long spuId;
   private Long skuId;
   private String spuName;
   private String skuName;
   private Integer layout;
   private Integer nums;
   private String houseNo;
   private BigDecimal freezeAmt;
   private Integer freezeStatus;
   private Date acitvityTime;
   private Integer payStatus;
   private Long orderId;
   private String contractName;
   private String contractPhone;
   private String userIdCard;
   private String recommendName;
   private String recommendPhone;
   private Long venderId;
   private Long shopId;
   private String shopName;
   private String venderName;

   @JsonProperty("clueId")
   public void setClueId(Long clueId) {
      this.clueId = clueId;
   }

   @JsonProperty("clueId")
   public Long getClueId() {
      return this.clueId;
   }

   @JsonProperty("freezeNo")
   public void setFreezeNo(String freezeNo) {
      this.freezeNo = freezeNo;
   }

   @JsonProperty("freezeNo")
   public String getFreezeNo() {
      return this.freezeNo;
   }

   @JsonProperty("unFreezeNo")
   public void setUnFreezeNo(String unFreezeNo) {
      this.unFreezeNo = unFreezeNo;
   }

   @JsonProperty("unFreezeNo")
   public String getUnFreezeNo() {
      return this.unFreezeNo;
   }

   @JsonProperty("activityName")
   public void setActivityName(String activityName) {
      this.activityName = activityName;
   }

   @JsonProperty("activityName")
   public String getActivityName() {
      return this.activityName;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("spuName")
   public void setSpuName(String spuName) {
      this.spuName = spuName;
   }

   @JsonProperty("spuName")
   public String getSpuName() {
      return this.spuName;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("layout")
   public void setLayout(Integer layout) {
      this.layout = layout;
   }

   @JsonProperty("layout")
   public Integer getLayout() {
      return this.layout;
   }

   @JsonProperty("nums")
   public void setNums(Integer nums) {
      this.nums = nums;
   }

   @JsonProperty("nums")
   public Integer getNums() {
      return this.nums;
   }

   @JsonProperty("houseNo")
   public void setHouseNo(String houseNo) {
      this.houseNo = houseNo;
   }

   @JsonProperty("houseNo")
   public String getHouseNo() {
      return this.houseNo;
   }

   @JsonProperty("freezeAmt")
   public void setFreezeAmt(BigDecimal freezeAmt) {
      this.freezeAmt = freezeAmt;
   }

   @JsonProperty("freezeAmt")
   public BigDecimal getFreezeAmt() {
      return this.freezeAmt;
   }

   @JsonProperty("freezeStatus")
   public void setFreezeStatus(Integer freezeStatus) {
      this.freezeStatus = freezeStatus;
   }

   @JsonProperty("freezeStatus")
   public Integer getFreezeStatus() {
      return this.freezeStatus;
   }

   @JsonProperty("acitvityTime")
   public void setAcitvityTime(Date acitvityTime) {
      this.acitvityTime = acitvityTime;
   }

   @JsonProperty("acitvityTime")
   public Date getAcitvityTime() {
      return this.acitvityTime;
   }

   @JsonProperty("payStatus")
   public void setPayStatus(Integer payStatus) {
      this.payStatus = payStatus;
   }

   @JsonProperty("payStatus")
   public Integer getPayStatus() {
      return this.payStatus;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("contractName")
   public void setContractName(String contractName) {
      this.contractName = contractName;
   }

   @JsonProperty("contractName")
   public String getContractName() {
      return this.contractName;
   }

   @JsonProperty("contractPhone")
   public void setContractPhone(String contractPhone) {
      this.contractPhone = contractPhone;
   }

   @JsonProperty("contractPhone")
   public String getContractPhone() {
      return this.contractPhone;
   }

   @JsonProperty("userIdCard")
   public void setUserIdCard(String userIdCard) {
      this.userIdCard = userIdCard;
   }

   @JsonProperty("userIdCard")
   public String getUserIdCard() {
      return this.userIdCard;
   }

   @JsonProperty("recommendName")
   public void setRecommendName(String recommendName) {
      this.recommendName = recommendName;
   }

   @JsonProperty("recommendName")
   public String getRecommendName() {
      return this.recommendName;
   }

   @JsonProperty("recommendPhone")
   public void setRecommendPhone(String recommendPhone) {
      this.recommendPhone = recommendPhone;
   }

   @JsonProperty("recommendPhone")
   public String getRecommendPhone() {
      return this.recommendPhone;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("venderName")
   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   @JsonProperty("venderName")
   public String getVenderName() {
      return this.venderName;
   }
}
