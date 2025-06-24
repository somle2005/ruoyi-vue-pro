package com.jd.open.api.sdk.domain.mall.SubsidyImgExportService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ImgUploadInfoSyncParam implements Serializable {
   private String ocrImei1;
   private Integer combineImgStatus;
   private Long orderId;
   private Integer productImgStatus;
   private String ocrImei2;
   private String productImg;
   private Integer source;
   private String token;
   private Integer outerPackImgStatus;
   private String ocrSn;
   private String appId;
   private String outerPackImg;
   private String combineImg;
   private Integer delayProcess;
   private List<ImgUploadExtParam> imgExtList;
   private String waybillCode;

   @JsonProperty("ocrImei1")
   public void setOcrImei1(String ocrImei1) {
      this.ocrImei1 = ocrImei1;
   }

   @JsonProperty("ocrImei1")
   public String getOcrImei1() {
      return this.ocrImei1;
   }

   @JsonProperty("combineImgStatus")
   public void setCombineImgStatus(Integer combineImgStatus) {
      this.combineImgStatus = combineImgStatus;
   }

   @JsonProperty("combineImgStatus")
   public Integer getCombineImgStatus() {
      return this.combineImgStatus;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("productImgStatus")
   public void setProductImgStatus(Integer productImgStatus) {
      this.productImgStatus = productImgStatus;
   }

   @JsonProperty("productImgStatus")
   public Integer getProductImgStatus() {
      return this.productImgStatus;
   }

   @JsonProperty("ocrImei2")
   public void setOcrImei2(String ocrImei2) {
      this.ocrImei2 = ocrImei2;
   }

   @JsonProperty("ocrImei2")
   public String getOcrImei2() {
      return this.ocrImei2;
   }

   @JsonProperty("productImg")
   public void setProductImg(String productImg) {
      this.productImg = productImg;
   }

   @JsonProperty("productImg")
   public String getProductImg() {
      return this.productImg;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }

   @JsonProperty("token")
   public void setToken(String token) {
      this.token = token;
   }

   @JsonProperty("token")
   public String getToken() {
      return this.token;
   }

   @JsonProperty("outerPackImgStatus")
   public void setOuterPackImgStatus(Integer outerPackImgStatus) {
      this.outerPackImgStatus = outerPackImgStatus;
   }

   @JsonProperty("outerPackImgStatus")
   public Integer getOuterPackImgStatus() {
      return this.outerPackImgStatus;
   }

   @JsonProperty("ocrSn")
   public void setOcrSn(String ocrSn) {
      this.ocrSn = ocrSn;
   }

   @JsonProperty("ocrSn")
   public String getOcrSn() {
      return this.ocrSn;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("outerPackImg")
   public void setOuterPackImg(String outerPackImg) {
      this.outerPackImg = outerPackImg;
   }

   @JsonProperty("outerPackImg")
   public String getOuterPackImg() {
      return this.outerPackImg;
   }

   @JsonProperty("combineImg")
   public void setCombineImg(String combineImg) {
      this.combineImg = combineImg;
   }

   @JsonProperty("combineImg")
   public String getCombineImg() {
      return this.combineImg;
   }

   @JsonProperty("delayProcess")
   public void setDelayProcess(Integer delayProcess) {
      this.delayProcess = delayProcess;
   }

   @JsonProperty("delayProcess")
   public Integer getDelayProcess() {
      return this.delayProcess;
   }

   @JsonProperty("imgExtList")
   public void setImgExtList(List<ImgUploadExtParam> imgExtList) {
      this.imgExtList = imgExtList;
   }

   @JsonProperty("imgExtList")
   public List<ImgUploadExtParam> getImgExtList() {
      return this.imgExtList;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }
}
