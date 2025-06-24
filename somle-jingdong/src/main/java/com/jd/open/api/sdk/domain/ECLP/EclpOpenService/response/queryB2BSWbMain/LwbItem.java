package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LwbItem implements Serializable {
   private Long id;
   private String lwbNo;
   private Long wbId;
   private Long sellerId;
   private Long deptId;
   private String packageNo;
   private String packageName;
   private BigDecimal length;
   private BigDecimal width;
   private BigDecimal height;
   private BigDecimal weight;
   private BigDecimal volume;
   private Date createTime;
   private Date updateTime;
   private String createUser;
   private String updateUser;
   private Byte yn;
   private Byte operateType;
   private Byte installFlag;
   private String firstCategoryNo;
   private String firstCategoryName;
   private String secondCategoryNo;
   private String secondCategoryName;
   private String thirdCategoryNo;
   private String thirdCategoryName;
   private String brandNo;
   private String brandName;
   private String productSku;
   private Integer provinceId;
   private String provinceName;
   private Integer cityId;
   private Integer districtId;
   private Integer streetId;
   private Long packageId;
   private String productId;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("lwbNo")
   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   @JsonProperty("lwbNo")
   public String getLwbNo() {
      return this.lwbNo;
   }

   @JsonProperty("wbId")
   public void setWbId(Long wbId) {
      this.wbId = wbId;
   }

   @JsonProperty("wbId")
   public Long getWbId() {
      return this.wbId;
   }

   @JsonProperty("sellerId")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("sellerId")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("deptId")
   public void setDeptId(Long deptId) {
      this.deptId = deptId;
   }

   @JsonProperty("deptId")
   public Long getDeptId() {
      return this.deptId;
   }

   @JsonProperty("packageNo")
   public void setPackageNo(String packageNo) {
      this.packageNo = packageNo;
   }

   @JsonProperty("packageNo")
   public String getPackageNo() {
      return this.packageNo;
   }

   @JsonProperty("packageName")
   public void setPackageName(String packageName) {
      this.packageName = packageName;
   }

   @JsonProperty("packageName")
   public String getPackageName() {
      return this.packageName;
   }

   @JsonProperty("length")
   public void setLength(BigDecimal length) {
      this.length = length;
   }

   @JsonProperty("length")
   public BigDecimal getLength() {
      return this.length;
   }

   @JsonProperty("width")
   public void setWidth(BigDecimal width) {
      this.width = width;
   }

   @JsonProperty("width")
   public BigDecimal getWidth() {
      return this.width;
   }

   @JsonProperty("height")
   public void setHeight(BigDecimal height) {
      this.height = height;
   }

   @JsonProperty("height")
   public BigDecimal getHeight() {
      return this.height;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }

   @JsonProperty("volume")
   public void setVolume(BigDecimal volume) {
      this.volume = volume;
   }

   @JsonProperty("volume")
   public BigDecimal getVolume() {
      return this.volume;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("updateUser")
   public void setUpdateUser(String updateUser) {
      this.updateUser = updateUser;
   }

   @JsonProperty("updateUser")
   public String getUpdateUser() {
      return this.updateUser;
   }

   @JsonProperty("yn")
   public void setYn(Byte yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Byte getYn() {
      return this.yn;
   }

   @JsonProperty("operateType")
   public void setOperateType(Byte operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Byte getOperateType() {
      return this.operateType;
   }

   @JsonProperty("installFlag")
   public void setInstallFlag(Byte installFlag) {
      this.installFlag = installFlag;
   }

   @JsonProperty("installFlag")
   public Byte getInstallFlag() {
      return this.installFlag;
   }

   @JsonProperty("firstCategoryNo")
   public void setFirstCategoryNo(String firstCategoryNo) {
      this.firstCategoryNo = firstCategoryNo;
   }

   @JsonProperty("firstCategoryNo")
   public String getFirstCategoryNo() {
      return this.firstCategoryNo;
   }

   @JsonProperty("firstCategoryName")
   public void setFirstCategoryName(String firstCategoryName) {
      this.firstCategoryName = firstCategoryName;
   }

   @JsonProperty("firstCategoryName")
   public String getFirstCategoryName() {
      return this.firstCategoryName;
   }

   @JsonProperty("secondCategoryNo")
   public void setSecondCategoryNo(String secondCategoryNo) {
      this.secondCategoryNo = secondCategoryNo;
   }

   @JsonProperty("secondCategoryNo")
   public String getSecondCategoryNo() {
      return this.secondCategoryNo;
   }

   @JsonProperty("secondCategoryName")
   public void setSecondCategoryName(String secondCategoryName) {
      this.secondCategoryName = secondCategoryName;
   }

   @JsonProperty("secondCategoryName")
   public String getSecondCategoryName() {
      return this.secondCategoryName;
   }

   @JsonProperty("thirdCategoryNo")
   public void setThirdCategoryNo(String thirdCategoryNo) {
      this.thirdCategoryNo = thirdCategoryNo;
   }

   @JsonProperty("thirdCategoryNo")
   public String getThirdCategoryNo() {
      return this.thirdCategoryNo;
   }

   @JsonProperty("thirdCategoryName")
   public void setThirdCategoryName(String thirdCategoryName) {
      this.thirdCategoryName = thirdCategoryName;
   }

   @JsonProperty("thirdCategoryName")
   public String getThirdCategoryName() {
      return this.thirdCategoryName;
   }

   @JsonProperty("brandNo")
   public void setBrandNo(String brandNo) {
      this.brandNo = brandNo;
   }

   @JsonProperty("brandNo")
   public String getBrandNo() {
      return this.brandNo;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("productSku")
   public void setProductSku(String productSku) {
      this.productSku = productSku;
   }

   @JsonProperty("productSku")
   public String getProductSku() {
      return this.productSku;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("districtId")
   public void setDistrictId(Integer districtId) {
      this.districtId = districtId;
   }

   @JsonProperty("districtId")
   public Integer getDistrictId() {
      return this.districtId;
   }

   @JsonProperty("streetId")
   public void setStreetId(Integer streetId) {
      this.streetId = streetId;
   }

   @JsonProperty("streetId")
   public Integer getStreetId() {
      return this.streetId;
   }

   @JsonProperty("packageId")
   public void setPackageId(Long packageId) {
      this.packageId = packageId;
   }

   @JsonProperty("packageId")
   public Long getPackageId() {
      return this.packageId;
   }

   @JsonProperty("productId")
   public void setProductId(String productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public String getProductId() {
      return this.productId;
   }
}
