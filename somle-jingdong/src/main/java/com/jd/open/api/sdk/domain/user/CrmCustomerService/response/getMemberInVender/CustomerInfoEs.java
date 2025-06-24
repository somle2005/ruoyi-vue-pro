package com.jd.open.api.sdk.domain.user.CrmCustomerService.response.getMemberInVender;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomerInfoEs implements Serializable {
   private Long venderId;
   private Long shopId;
   private Long companyId;
   private Long userId;
   private String nickName;
   private String levelAtJd;
   private Long totalOrderPrice;
   private Long totalOrderCount;
   private Long totalGoodsCount;
   private Integer canceledOrderCount;
   private Long avgOrderPrice;
   private String lastOrderDate;
   private Integer orderFrom;
   private String firstOrderDate;
   private Integer customerStatus;
   private Integer levelAtShop;
   private Integer pcFlag;
   private Integer phoneFlag;
   private Integer wxFlag;
   private String increaseDate;
   private String created;
   private String modified;
   private Long huanHuo;
   private Long tuidan;
   private Long tuihuanMoney;
   private Long points;

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

   @JsonProperty("companyId")
   public void setCompanyId(Long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Long getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("userId")
   public void setUserId(Long userId) {
      this.userId = userId;
   }

   @JsonProperty("userId")
   public Long getUserId() {
      return this.userId;
   }

   @JsonProperty("nickName")
   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   @JsonProperty("nickName")
   public String getNickName() {
      return this.nickName;
   }

   @JsonProperty("levelAtJd")
   public void setLevelAtJd(String levelAtJd) {
      this.levelAtJd = levelAtJd;
   }

   @JsonProperty("levelAtJd")
   public String getLevelAtJd() {
      return this.levelAtJd;
   }

   @JsonProperty("totalOrderPrice")
   public void setTotalOrderPrice(Long totalOrderPrice) {
      this.totalOrderPrice = totalOrderPrice;
   }

   @JsonProperty("totalOrderPrice")
   public Long getTotalOrderPrice() {
      return this.totalOrderPrice;
   }

   @JsonProperty("totalOrderCount")
   public void setTotalOrderCount(Long totalOrderCount) {
      this.totalOrderCount = totalOrderCount;
   }

   @JsonProperty("totalOrderCount")
   public Long getTotalOrderCount() {
      return this.totalOrderCount;
   }

   @JsonProperty("totalGoodsCount")
   public void setTotalGoodsCount(Long totalGoodsCount) {
      this.totalGoodsCount = totalGoodsCount;
   }

   @JsonProperty("totalGoodsCount")
   public Long getTotalGoodsCount() {
      return this.totalGoodsCount;
   }

   @JsonProperty("canceledOrderCount")
   public void setCanceledOrderCount(Integer canceledOrderCount) {
      this.canceledOrderCount = canceledOrderCount;
   }

   @JsonProperty("canceledOrderCount")
   public Integer getCanceledOrderCount() {
      return this.canceledOrderCount;
   }

   @JsonProperty("avgOrderPrice")
   public void setAvgOrderPrice(Long avgOrderPrice) {
      this.avgOrderPrice = avgOrderPrice;
   }

   @JsonProperty("avgOrderPrice")
   public Long getAvgOrderPrice() {
      return this.avgOrderPrice;
   }

   @JsonProperty("lastOrderDate")
   public void setLastOrderDate(String lastOrderDate) {
      this.lastOrderDate = lastOrderDate;
   }

   @JsonProperty("lastOrderDate")
   public String getLastOrderDate() {
      return this.lastOrderDate;
   }

   @JsonProperty("orderFrom")
   public void setOrderFrom(Integer orderFrom) {
      this.orderFrom = orderFrom;
   }

   @JsonProperty("orderFrom")
   public Integer getOrderFrom() {
      return this.orderFrom;
   }

   @JsonProperty("firstOrderDate")
   public void setFirstOrderDate(String firstOrderDate) {
      this.firstOrderDate = firstOrderDate;
   }

   @JsonProperty("firstOrderDate")
   public String getFirstOrderDate() {
      return this.firstOrderDate;
   }

   @JsonProperty("customerStatus")
   public void setCustomerStatus(Integer customerStatus) {
      this.customerStatus = customerStatus;
   }

   @JsonProperty("customerStatus")
   public Integer getCustomerStatus() {
      return this.customerStatus;
   }

   @JsonProperty("levelAtShop")
   public void setLevelAtShop(Integer levelAtShop) {
      this.levelAtShop = levelAtShop;
   }

   @JsonProperty("levelAtShop")
   public Integer getLevelAtShop() {
      return this.levelAtShop;
   }

   @JsonProperty("pcFlag")
   public void setPcFlag(Integer pcFlag) {
      this.pcFlag = pcFlag;
   }

   @JsonProperty("pcFlag")
   public Integer getPcFlag() {
      return this.pcFlag;
   }

   @JsonProperty("phoneFlag")
   public void setPhoneFlag(Integer phoneFlag) {
      this.phoneFlag = phoneFlag;
   }

   @JsonProperty("phoneFlag")
   public Integer getPhoneFlag() {
      return this.phoneFlag;
   }

   @JsonProperty("wxFlag")
   public void setWxFlag(Integer wxFlag) {
      this.wxFlag = wxFlag;
   }

   @JsonProperty("wxFlag")
   public Integer getWxFlag() {
      return this.wxFlag;
   }

   @JsonProperty("increaseDate")
   public void setIncreaseDate(String increaseDate) {
      this.increaseDate = increaseDate;
   }

   @JsonProperty("increaseDate")
   public String getIncreaseDate() {
      return this.increaseDate;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("huanHuo")
   public void setHuanHuo(Long huanHuo) {
      this.huanHuo = huanHuo;
   }

   @JsonProperty("huanHuo")
   public Long getHuanHuo() {
      return this.huanHuo;
   }

   @JsonProperty("tuidan")
   public void setTuidan(Long tuidan) {
      this.tuidan = tuidan;
   }

   @JsonProperty("tuidan")
   public Long getTuidan() {
      return this.tuidan;
   }

   @JsonProperty("tuihuanMoney")
   public void setTuihuanMoney(Long tuihuanMoney) {
      this.tuihuanMoney = tuihuanMoney;
   }

   @JsonProperty("tuihuanMoney")
   public Long getTuihuanMoney() {
      return this.tuihuanMoney;
   }

   @JsonProperty("points")
   public void setPoints(Long points) {
      this.points = points;
   }

   @JsonProperty("points")
   public Long getPoints() {
      return this.points;
   }
}
