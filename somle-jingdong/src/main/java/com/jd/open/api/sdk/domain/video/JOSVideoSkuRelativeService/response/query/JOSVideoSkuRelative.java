package com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JOSVideoSkuRelative implements Serializable {
   private Long id;
   private Long videoId;
   private Long venderId;
   private Long productId;
   private Long skuId;
   private Long categoryId;
   private Integer status;
   private String verifier;
   private String verifyDesc;
   private String applyReason;
   private Date createdDate;
   private Date modifiedDate;
   private Integer videoType;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("videoId")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public Long getVideoId() {
      return this.videoId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("verifier")
   public void setVerifier(String verifier) {
      this.verifier = verifier;
   }

   @JsonProperty("verifier")
   public String getVerifier() {
      return this.verifier;
   }

   @JsonProperty("verifyDesc")
   public void setVerifyDesc(String verifyDesc) {
      this.verifyDesc = verifyDesc;
   }

   @JsonProperty("verifyDesc")
   public String getVerifyDesc() {
      return this.verifyDesc;
   }

   @JsonProperty("applyReason")
   public void setApplyReason(String applyReason) {
      this.applyReason = applyReason;
   }

   @JsonProperty("applyReason")
   public String getApplyReason() {
      return this.applyReason;
   }

   @JsonProperty("createdDate")
   public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
   }

   @JsonProperty("createdDate")
   public Date getCreatedDate() {
      return this.createdDate;
   }

   @JsonProperty("modifiedDate")
   public void setModifiedDate(Date modifiedDate) {
      this.modifiedDate = modifiedDate;
   }

   @JsonProperty("modifiedDate")
   public Date getModifiedDate() {
      return this.modifiedDate;
   }

   @JsonProperty("videoType")
   public void setVideoType(Integer videoType) {
      this.videoType = videoType;
   }

   @JsonProperty("videoType")
   public Integer getVideoType() {
      return this.videoType;
   }
}
