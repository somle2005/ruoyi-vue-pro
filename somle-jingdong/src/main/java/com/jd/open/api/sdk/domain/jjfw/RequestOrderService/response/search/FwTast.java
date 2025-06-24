package com.jd.open.api.sdk.domain.jjfw.RequestOrderService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FwTast implements Serializable {
   private String userCity;
   private String userTown;
   private String itemCatIdPath;
   private String brandName;
   private String itemCatNamePath;
   private String orderNo;
   private String saleOrderNo;
   private String userProvince;
   private String userCounty;
   private String companyShopName;
   private String companyName;
   private String remark;
   private String userName;
   private String userAddress;
   private String skuName;
   private String areaIdPath;
   private String userMobile;
   private String sku;
   private String serviceTypeName;
   private Date createDate;
   private String shopCode;
   private String productName;
   private String productValue;
   private String serviceTypeCode;
   private Date appointDate;
   private Integer brandId;
   private String serviceItemName;
   private String senderName;
   private String senderMobile;
   private String senderProvince;
   private String senderCity;
   private String senderCounty;
   private String senderTown;
   private String senderAddress;
   private Integer storeType;
   private String companyShortCode;
   private String outerId;
   private Integer num;
   private Integer serviceNum;
   private String expectDeliverDate;
   private Integer oldToNew;
   private List<MainOrderInfo> mainOrderInfoList;
   private String wishBookDate;

   @JsonProperty("userCity")
   public void setUserCity(String userCity) {
      this.userCity = userCity;
   }

   @JsonProperty("userCity")
   public String getUserCity() {
      return this.userCity;
   }

   @JsonProperty("userTown")
   public void setUserTown(String userTown) {
      this.userTown = userTown;
   }

   @JsonProperty("userTown")
   public String getUserTown() {
      return this.userTown;
   }

   @JsonProperty("itemCatIdPath")
   public void setItemCatIdPath(String itemCatIdPath) {
      this.itemCatIdPath = itemCatIdPath;
   }

   @JsonProperty("itemCatIdPath")
   public String getItemCatIdPath() {
      return this.itemCatIdPath;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("itemCatNamePath")
   public void setItemCatNamePath(String itemCatNamePath) {
      this.itemCatNamePath = itemCatNamePath;
   }

   @JsonProperty("itemCatNamePath")
   public String getItemCatNamePath() {
      return this.itemCatNamePath;
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

   @JsonProperty("userProvince")
   public void setUserProvince(String userProvince) {
      this.userProvince = userProvince;
   }

   @JsonProperty("userProvince")
   public String getUserProvince() {
      return this.userProvince;
   }

   @JsonProperty("userCounty")
   public void setUserCounty(String userCounty) {
      this.userCounty = userCounty;
   }

   @JsonProperty("userCounty")
   public String getUserCounty() {
      return this.userCounty;
   }

   @JsonProperty("companyShopName")
   public void setCompanyShopName(String companyShopName) {
      this.companyShopName = companyShopName;
   }

   @JsonProperty("companyShopName")
   public String getCompanyShopName() {
      return this.companyShopName;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("areaIdPath")
   public void setAreaIdPath(String areaIdPath) {
      this.areaIdPath = areaIdPath;
   }

   @JsonProperty("areaIdPath")
   public String getAreaIdPath() {
      return this.areaIdPath;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("shopCode")
   public void setShopCode(String shopCode) {
      this.shopCode = shopCode;
   }

   @JsonProperty("shopCode")
   public String getShopCode() {
      return this.shopCode;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("productValue")
   public void setProductValue(String productValue) {
      this.productValue = productValue;
   }

   @JsonProperty("productValue")
   public String getProductValue() {
      return this.productValue;
   }

   @JsonProperty("serviceTypeCode")
   public void setServiceTypeCode(String serviceTypeCode) {
      this.serviceTypeCode = serviceTypeCode;
   }

   @JsonProperty("serviceTypeCode")
   public String getServiceTypeCode() {
      return this.serviceTypeCode;
   }

   @JsonProperty("appointDate")
   public void setAppointDate(Date appointDate) {
      this.appointDate = appointDate;
   }

   @JsonProperty("appointDate")
   public Date getAppointDate() {
      return this.appointDate;
   }

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("serviceItemName")
   public void setServiceItemName(String serviceItemName) {
      this.serviceItemName = serviceItemName;
   }

   @JsonProperty("serviceItemName")
   public String getServiceItemName() {
      return this.serviceItemName;
   }

   @JsonProperty("senderName")
   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   @JsonProperty("senderName")
   public String getSenderName() {
      return this.senderName;
   }

   @JsonProperty("senderMobile")
   public void setSenderMobile(String senderMobile) {
      this.senderMobile = senderMobile;
   }

   @JsonProperty("senderMobile")
   public String getSenderMobile() {
      return this.senderMobile;
   }

   @JsonProperty("senderProvince")
   public void setSenderProvince(String senderProvince) {
      this.senderProvince = senderProvince;
   }

   @JsonProperty("senderProvince")
   public String getSenderProvince() {
      return this.senderProvince;
   }

   @JsonProperty("senderCity")
   public void setSenderCity(String senderCity) {
      this.senderCity = senderCity;
   }

   @JsonProperty("senderCity")
   public String getSenderCity() {
      return this.senderCity;
   }

   @JsonProperty("senderCounty")
   public void setSenderCounty(String senderCounty) {
      this.senderCounty = senderCounty;
   }

   @JsonProperty("senderCounty")
   public String getSenderCounty() {
      return this.senderCounty;
   }

   @JsonProperty("senderTown")
   public void setSenderTown(String senderTown) {
      this.senderTown = senderTown;
   }

   @JsonProperty("senderTown")
   public String getSenderTown() {
      return this.senderTown;
   }

   @JsonProperty("senderAddress")
   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   @JsonProperty("senderAddress")
   public String getSenderAddress() {
      return this.senderAddress;
   }

   @JsonProperty("storeType")
   public void setStoreType(Integer storeType) {
      this.storeType = storeType;
   }

   @JsonProperty("storeType")
   public Integer getStoreType() {
      return this.storeType;
   }

   @JsonProperty("companyShortCode")
   public void setCompanyShortCode(String companyShortCode) {
      this.companyShortCode = companyShortCode;
   }

   @JsonProperty("companyShortCode")
   public String getCompanyShortCode() {
      return this.companyShortCode;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("serviceNum")
   public void setServiceNum(Integer serviceNum) {
      this.serviceNum = serviceNum;
   }

   @JsonProperty("serviceNum")
   public Integer getServiceNum() {
      return this.serviceNum;
   }

   @JsonProperty("expectDeliverDate")
   public void setExpectDeliverDate(String expectDeliverDate) {
      this.expectDeliverDate = expectDeliverDate;
   }

   @JsonProperty("expectDeliverDate")
   public String getExpectDeliverDate() {
      return this.expectDeliverDate;
   }

   @JsonProperty("oldToNew")
   public void setOldToNew(Integer oldToNew) {
      this.oldToNew = oldToNew;
   }

   @JsonProperty("oldToNew")
   public Integer getOldToNew() {
      return this.oldToNew;
   }

   @JsonProperty("mainOrderInfoList")
   public void setMainOrderInfoList(List<MainOrderInfo> mainOrderInfoList) {
      this.mainOrderInfoList = mainOrderInfoList;
   }

   @JsonProperty("mainOrderInfoList")
   public List<MainOrderInfo> getMainOrderInfoList() {
      return this.mainOrderInfoList;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }
}
