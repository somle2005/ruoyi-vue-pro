package com.jd.open.api.sdk.domain.B2B.BWareReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BSpuExtendInfoDto implements Serializable {
   private String advWords;
   private String advLinkWords;
   private String advLinkUrl;
   private String shopCategorys;
   private String itemNum;
   private String taxInfo;
   private Integer isSnManage;
   private Integer isSafeDayManage;
   private String safeDays;
   private String productionTime;
   private String warrantyInfo;
   private String servicePhone;
   private String site;
   private Integer transportId;
   private Integer auditState;
   private Long jdSpuId;
   private Long b2bSpuId;
   private String bizCode;
   private String productOwner;
   private String productShortTitle;
   private String desenServicePhone;

   @JsonProperty("advWords")
   public void setAdvWords(String advWords) {
      this.advWords = advWords;
   }

   @JsonProperty("advWords")
   public String getAdvWords() {
      return this.advWords;
   }

   @JsonProperty("advLinkWords")
   public void setAdvLinkWords(String advLinkWords) {
      this.advLinkWords = advLinkWords;
   }

   @JsonProperty("advLinkWords")
   public String getAdvLinkWords() {
      return this.advLinkWords;
   }

   @JsonProperty("advLinkUrl")
   public void setAdvLinkUrl(String advLinkUrl) {
      this.advLinkUrl = advLinkUrl;
   }

   @JsonProperty("advLinkUrl")
   public String getAdvLinkUrl() {
      return this.advLinkUrl;
   }

   @JsonProperty("shopCategorys")
   public void setShopCategorys(String shopCategorys) {
      this.shopCategorys = shopCategorys;
   }

   @JsonProperty("shopCategorys")
   public String getShopCategorys() {
      return this.shopCategorys;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("taxInfo")
   public void setTaxInfo(String taxInfo) {
      this.taxInfo = taxInfo;
   }

   @JsonProperty("taxInfo")
   public String getTaxInfo() {
      return this.taxInfo;
   }

   @JsonProperty("isSnManage")
   public void setIsSnManage(Integer isSnManage) {
      this.isSnManage = isSnManage;
   }

   @JsonProperty("isSnManage")
   public Integer getIsSnManage() {
      return this.isSnManage;
   }

   @JsonProperty("isSafeDayManage")
   public void setIsSafeDayManage(Integer isSafeDayManage) {
      this.isSafeDayManage = isSafeDayManage;
   }

   @JsonProperty("isSafeDayManage")
   public Integer getIsSafeDayManage() {
      return this.isSafeDayManage;
   }

   @JsonProperty("safeDays")
   public void setSafeDays(String safeDays) {
      this.safeDays = safeDays;
   }

   @JsonProperty("safeDays")
   public String getSafeDays() {
      return this.safeDays;
   }

   @JsonProperty("productionTime")
   public void setProductionTime(String productionTime) {
      this.productionTime = productionTime;
   }

   @JsonProperty("productionTime")
   public String getProductionTime() {
      return this.productionTime;
   }

   @JsonProperty("warrantyInfo")
   public void setWarrantyInfo(String warrantyInfo) {
      this.warrantyInfo = warrantyInfo;
   }

   @JsonProperty("warrantyInfo")
   public String getWarrantyInfo() {
      return this.warrantyInfo;
   }

   @JsonProperty("servicePhone")
   public void setServicePhone(String servicePhone) {
      this.servicePhone = servicePhone;
   }

   @JsonProperty("servicePhone")
   public String getServicePhone() {
      return this.servicePhone;
   }

   @JsonProperty("site")
   public void setSite(String site) {
      this.site = site;
   }

   @JsonProperty("site")
   public String getSite() {
      return this.site;
   }

   @JsonProperty("transportId")
   public void setTransportId(Integer transportId) {
      this.transportId = transportId;
   }

   @JsonProperty("transportId")
   public Integer getTransportId() {
      return this.transportId;
   }

   @JsonProperty("auditState")
   public void setAuditState(Integer auditState) {
      this.auditState = auditState;
   }

   @JsonProperty("auditState")
   public Integer getAuditState() {
      return this.auditState;
   }

   @JsonProperty("jdSpuId")
   public void setJdSpuId(Long jdSpuId) {
      this.jdSpuId = jdSpuId;
   }

   @JsonProperty("jdSpuId")
   public Long getJdSpuId() {
      return this.jdSpuId;
   }

   @JsonProperty("b2bSpuId")
   public void setB2bSpuId(Long b2bSpuId) {
      this.b2bSpuId = b2bSpuId;
   }

   @JsonProperty("b2bSpuId")
   public Long getB2bSpuId() {
      return this.b2bSpuId;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("productOwner")
   public void setProductOwner(String productOwner) {
      this.productOwner = productOwner;
   }

   @JsonProperty("productOwner")
   public String getProductOwner() {
      return this.productOwner;
   }

   @JsonProperty("productShortTitle")
   public void setProductShortTitle(String productShortTitle) {
      this.productShortTitle = productShortTitle;
   }

   @JsonProperty("productShortTitle")
   public String getProductShortTitle() {
      return this.productShortTitle;
   }

   @JsonProperty("desen_servicePhone")
   public void setDesenServicePhone(String desenServicePhone) {
      this.desenServicePhone = desenServicePhone;
   }

   @JsonProperty("desen_servicePhone")
   public String getDesenServicePhone() {
      return this.desenServicePhone;
   }
}
