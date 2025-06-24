package com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.request.confirmreceipt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReturnExecuteOrderReceiptInfoSkuDetailDto implements Serializable {
   private Integer productFunctionStatus;
   private Integer productExteriorStatus;
   private String exceptionDesc;
   private Integer confirmNum;
   private List<VcFileInfoDto> skuPicList;
   private String skuUuid;
   private String attachmentInfoDesc;
   private Integer isAnnex;
   private Long skuId;
   private Integer productPackStatus;

   @JsonProperty("productFunctionStatus")
   public void setProductFunctionStatus(Integer productFunctionStatus) {
      this.productFunctionStatus = productFunctionStatus;
   }

   @JsonProperty("productFunctionStatus")
   public Integer getProductFunctionStatus() {
      return this.productFunctionStatus;
   }

   @JsonProperty("productExteriorStatus")
   public void setProductExteriorStatus(Integer productExteriorStatus) {
      this.productExteriorStatus = productExteriorStatus;
   }

   @JsonProperty("productExteriorStatus")
   public Integer getProductExteriorStatus() {
      return this.productExteriorStatus;
   }

   @JsonProperty("exceptionDesc")
   public void setExceptionDesc(String exceptionDesc) {
      this.exceptionDesc = exceptionDesc;
   }

   @JsonProperty("exceptionDesc")
   public String getExceptionDesc() {
      return this.exceptionDesc;
   }

   @JsonProperty("confirmNum")
   public void setConfirmNum(Integer confirmNum) {
      this.confirmNum = confirmNum;
   }

   @JsonProperty("confirmNum")
   public Integer getConfirmNum() {
      return this.confirmNum;
   }

   @JsonProperty("skuPicList")
   public void setSkuPicList(List<VcFileInfoDto> skuPicList) {
      this.skuPicList = skuPicList;
   }

   @JsonProperty("skuPicList")
   public List<VcFileInfoDto> getSkuPicList() {
      return this.skuPicList;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("attachmentInfoDesc")
   public void setAttachmentInfoDesc(String attachmentInfoDesc) {
      this.attachmentInfoDesc = attachmentInfoDesc;
   }

   @JsonProperty("attachmentInfoDesc")
   public String getAttachmentInfoDesc() {
      return this.attachmentInfoDesc;
   }

   @JsonProperty("isAnnex")
   public void setIsAnnex(Integer isAnnex) {
      this.isAnnex = isAnnex;
   }

   @JsonProperty("isAnnex")
   public Integer getIsAnnex() {
      return this.isAnnex;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("productPackStatus")
   public void setProductPackStatus(Integer productPackStatus) {
      this.productPackStatus = productPackStatus;
   }

   @JsonProperty("productPackStatus")
   public Integer getProductPackStatus() {
      return this.productPackStatus;
   }
}
