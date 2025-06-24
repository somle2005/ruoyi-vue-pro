package com.jd.open.api.sdk.domain.youE.UEService.response.part;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class FwTast implements Serializable {
   private String userCity;
   private String saleOrderStat;
   private String userProvince;
   private String wishBookDate;
   private String buyShop;
   private String companyName;
   private Date buyDate;
   private String itemCode;
   private String deliverNo;
   private String remark;
   private String deliverCompany;
   private Date deliverArriveDate;
   private String failureName;
   private String itemName;
   private String userMobile;
   private Integer serviceTypeId;
   private Date createDate;
   private String userTown;
   private String brandName;
   private String orderNo;
   private String saleOrderNo;
   private String userCounty;
   private String userName;
   private String itemCatName;
   private String userAddress;
   private Integer inOrOut;
   private Integer qty;
   private String serviceTypeName;
   private String userAreaId;
   private String productSn;
   private String desenUserMobile;

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("saleOrderStat")
   public void setSaleOrderStat(String saleOrderStat) {
      this.saleOrderStat = saleOrderStat;
   }

   @JsonProperty("saleOrderStat")
   public String getSaleOrderStat() {
      return this.saleOrderStat;
   }

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }

   @JsonProperty("buyShop")
   public void setBuyShop(String buyShop) {
      this.buyShop = buyShop;
   }

   @JsonProperty("buyShop")
   public String getBuyShop() {
      return this.buyShop;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("buyDate")
   public void setBuyDate(Date buyDate) {
      this.buyDate = buyDate;
   }

   @JsonProperty("buyDate")
   public Date getBuyDate() {
      return this.buyDate;
   }

   @JsonProperty("itemCode")
   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   @JsonProperty("itemCode")
   public String getItemCode() {
      return this.itemCode;
   }

   @JsonProperty("deliverNo")
   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   @JsonProperty("deliverNo")
   public String getDeliverNo() {
      return this.deliverNo;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("deliverCompany")
   public void setDeliverCompany(String deliverCompany) {
      this.deliverCompany = deliverCompany;
   }

   @JsonProperty("deliverCompany")
   public String getDeliverCompany() {
      return this.deliverCompany;
   }

   @JsonProperty("deliverArriveDate")
   public void setDeliverArriveDate(Date deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   @JsonProperty("deliverArriveDate")
   public Date getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   @JsonProperty("failureName")
   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   @JsonProperty("failureName")
   public String getFailureName() {
      return this.failureName;
   }

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("serviceTypeId")
   public void setServiceTypeId(Integer serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   @JsonProperty("serviceTypeId")
   public Integer getServiceTypeId() {
      return this.serviceTypeId;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("itemCatName")
   public void setItemCatName(String itemCatName) {
      this.itemCatName = itemCatName;
   }

   @JsonProperty("itemCatName")
   public String getItemCatName() {
      return this.itemCatName;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("inOrOut")
   public void setInOrOut(Integer inOrOut) {
      this.inOrOut = inOrOut;
   }

   @JsonProperty("inOrOut")
   public Integer getInOrOut() {
      return this.inOrOut;
   }

   @JsonProperty("qty")
   public void setQty(Integer qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public Integer getQty() {
      return this.qty;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }

   @JsonProperty("userAreaId")
   public void setUserAreaId(String userAreaId) {
      this.userAreaId = userAreaId;
   }

   @JsonProperty("userAreaId")
   public String getUserAreaId() {
      return this.userAreaId;
   }

   @JsonProperty("productSn")
   public void setProductSn(String productSn) {
      this.productSn = productSn;
   }

   @JsonProperty("productSn")
   public String getProductSn() {
      return this.productSn;
   }

   @JsonProperty("desen_userMobile")
   public void setDesenUserMobile(String desenUserMobile) {
      this.desenUserMobile = desenUserMobile;
   }

   @JsonProperty("desen_userMobile")
   public String getDesenUserMobile() {
      return this.desenUserMobile;
   }
}
