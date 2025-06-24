package com.jd.open.api.sdk.domain.B2B.B2BWareQueryProviderNew.response.getNew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class BImageDto implements Serializable {
   private Long jdSkuId;
   private Long imageId;
   private Date gmtModify;
   private String imagePath;
   private Long colorId;
   private String bizCode;
   private Long shopSkuId;
   private Date gmtCreate;
   private String colorIdStr;
   private String imgZoneIdStr;
   private Boolean isPrimary;
   private Long id;
   private Integer imageType;
   private Long imgZoneId;
   private Integer imageIndex;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("imageId")
   public void setImageId(Long imageId) {
      this.imageId = imageId;
   }

   @JsonProperty("imageId")
   public Long getImageId() {
      return this.imageId;
   }

   @JsonProperty("gmtModify")
   public void setGmtModify(Date gmtModify) {
      this.gmtModify = gmtModify;
   }

   @JsonProperty("gmtModify")
   public Date getGmtModify() {
      return this.gmtModify;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("colorId")
   public void setColorId(Long colorId) {
      this.colorId = colorId;
   }

   @JsonProperty("colorId")
   public Long getColorId() {
      return this.colorId;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("shopSkuId")
   public void setShopSkuId(Long shopSkuId) {
      this.shopSkuId = shopSkuId;
   }

   @JsonProperty("shopSkuId")
   public Long getShopSkuId() {
      return this.shopSkuId;
   }

   @JsonProperty("gmtCreate")
   public void setGmtCreate(Date gmtCreate) {
      this.gmtCreate = gmtCreate;
   }

   @JsonProperty("gmtCreate")
   public Date getGmtCreate() {
      return this.gmtCreate;
   }

   @JsonProperty("colorIdStr")
   public void setColorIdStr(String colorIdStr) {
      this.colorIdStr = colorIdStr;
   }

   @JsonProperty("colorIdStr")
   public String getColorIdStr() {
      return this.colorIdStr;
   }

   @JsonProperty("imgZoneIdStr")
   public void setImgZoneIdStr(String imgZoneIdStr) {
      this.imgZoneIdStr = imgZoneIdStr;
   }

   @JsonProperty("imgZoneIdStr")
   public String getImgZoneIdStr() {
      return this.imgZoneIdStr;
   }

   @JsonProperty("isPrimary")
   public void setIsPrimary(Boolean isPrimary) {
      this.isPrimary = isPrimary;
   }

   @JsonProperty("isPrimary")
   public Boolean getIsPrimary() {
      return this.isPrimary;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("imageType")
   public void setImageType(Integer imageType) {
      this.imageType = imageType;
   }

   @JsonProperty("imageType")
   public Integer getImageType() {
      return this.imageType;
   }

   @JsonProperty("imgZoneId")
   public void setImgZoneId(Long imgZoneId) {
      this.imgZoneId = imgZoneId;
   }

   @JsonProperty("imgZoneId")
   public Long getImgZoneId() {
      return this.imgZoneId;
   }

   @JsonProperty("imageIndex")
   public void setImageIndex(Integer imageIndex) {
      this.imageIndex = imageIndex;
   }

   @JsonProperty("imageIndex")
   public Integer getImageIndex() {
      return this.imageIndex;
   }
}
