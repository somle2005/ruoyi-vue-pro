package com.jd.open.api.sdk.domain.ware.GtinReceiveRpc.request.batchAdd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class GtinVo implements Serializable {
   private String[] importer;
   private String[] gtin;
   private String[] brandName;
   private String[] certificateCode;
   private String[] address;
   private String[] origin;
   private String[] specification;
   private Long[] serialNo;
   private String[] productDesc;
   private String[] productImageUrls;
   private String[] tcCode;
   private String[] firmName;
   private Integer[] status;
   private Date[] baseCreateTime;
   private Date[] baseLastUpdated;
   private Date[] saleDate;

   @JsonProperty("importer")
   public void setImporter(String[] importer) {
      this.importer = importer;
   }

   @JsonProperty("importer")
   public String[] getImporter() {
      return this.importer;
   }

   @JsonProperty("gtin")
   public void setGtin(String[] gtin) {
      this.gtin = gtin;
   }

   @JsonProperty("gtin")
   public String[] getGtin() {
      return this.gtin;
   }

   @JsonProperty("brandName")
   public void setBrandName(String[] brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String[] getBrandName() {
      return this.brandName;
   }

   @JsonProperty("certificateCode")
   public void setCertificateCode(String[] certificateCode) {
      this.certificateCode = certificateCode;
   }

   @JsonProperty("certificateCode")
   public String[] getCertificateCode() {
      return this.certificateCode;
   }

   @JsonProperty("address")
   public void setAddress(String[] address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String[] getAddress() {
      return this.address;
   }

   @JsonProperty("origin")
   public void setOrigin(String[] origin) {
      this.origin = origin;
   }

   @JsonProperty("origin")
   public String[] getOrigin() {
      return this.origin;
   }

   @JsonProperty("specification")
   public void setSpecification(String[] specification) {
      this.specification = specification;
   }

   @JsonProperty("specification")
   public String[] getSpecification() {
      return this.specification;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(Long[] serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("serialNo")
   public Long[] getSerialNo() {
      return this.serialNo;
   }

   @JsonProperty("productDesc")
   public void setProductDesc(String[] productDesc) {
      this.productDesc = productDesc;
   }

   @JsonProperty("productDesc")
   public String[] getProductDesc() {
      return this.productDesc;
   }

   @JsonProperty("productImageUrls")
   public void setProductImageUrls(String[] productImageUrls) {
      this.productImageUrls = productImageUrls;
   }

   @JsonProperty("productImageUrls")
   public String[] getProductImageUrls() {
      return this.productImageUrls;
   }

   @JsonProperty("tcCode")
   public void setTcCode(String[] tcCode) {
      this.tcCode = tcCode;
   }

   @JsonProperty("tcCode")
   public String[] getTcCode() {
      return this.tcCode;
   }

   @JsonProperty("firmName")
   public void setFirmName(String[] firmName) {
      this.firmName = firmName;
   }

   @JsonProperty("firmName")
   public String[] getFirmName() {
      return this.firmName;
   }

   @JsonProperty("status")
   public void setStatus(Integer[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer[] getStatus() {
      return this.status;
   }

   @JsonProperty("baseCreateTime")
   public void setBaseCreateTime(Date[] baseCreateTime) {
      this.baseCreateTime = baseCreateTime;
   }

   @JsonProperty("baseCreateTime")
   public Date[] getBaseCreateTime() {
      return this.baseCreateTime;
   }

   @JsonProperty("baseLastUpdated")
   public void setBaseLastUpdated(Date[] baseLastUpdated) {
      this.baseLastUpdated = baseLastUpdated;
   }

   @JsonProperty("baseLastUpdated")
   public Date[] getBaseLastUpdated() {
      return this.baseLastUpdated;
   }

   @JsonProperty("saleDate")
   public void setSaleDate(Date[] saleDate) {
      this.saleDate = saleDate;
   }

   @JsonProperty("saleDate")
   public Date[] getSaleDate() {
      return this.saleDate;
   }
}
