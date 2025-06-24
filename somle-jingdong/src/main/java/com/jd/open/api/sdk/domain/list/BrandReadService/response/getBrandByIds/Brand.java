package com.jd.open.api.sdk.domain.list.BrandReadService.response.getBrandByIds;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Brand implements Serializable {
   private Integer brandId;
   private String brandName;
   private String enName;
   private String localName;
   private String code;
   private String flagshipUrl;
   private String logoUrl;
   private String tradeMarkHolder;
   private String tradeMarkPaper;
   private String brandGroupName;
   private String declaration;
   private String invoiceImage;
   private String overPackImg;
   private Integer mainBrandId;
   private Integer applySource;
   private Integer isMainBrand;
   private Integer status;
   private String disableReason;
   private Integer yn;
   private Date created;
   private Date modified;
   private String isRegChina;
   private String regNumber;
   private String brandSource;
   private Integer auditStatus;
   private Map<String, String> features;
   private String venderId;
   private String tenant;

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("enName")
   public void setEnName(String enName) {
      this.enName = enName;
   }

   @JsonProperty("enName")
   public String getEnName() {
      return this.enName;
   }

   @JsonProperty("localName")
   public void setLocalName(String localName) {
      this.localName = localName;
   }

   @JsonProperty("localName")
   public String getLocalName() {
      return this.localName;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("flagshipUrl")
   public void setFlagshipUrl(String flagshipUrl) {
      this.flagshipUrl = flagshipUrl;
   }

   @JsonProperty("flagshipUrl")
   public String getFlagshipUrl() {
      return this.flagshipUrl;
   }

   @JsonProperty("logoUrl")
   public void setLogoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
   }

   @JsonProperty("logoUrl")
   public String getLogoUrl() {
      return this.logoUrl;
   }

   @JsonProperty("tradeMarkHolder")
   public void setTradeMarkHolder(String tradeMarkHolder) {
      this.tradeMarkHolder = tradeMarkHolder;
   }

   @JsonProperty("tradeMarkHolder")
   public String getTradeMarkHolder() {
      return this.tradeMarkHolder;
   }

   @JsonProperty("tradeMarkPaper")
   public void setTradeMarkPaper(String tradeMarkPaper) {
      this.tradeMarkPaper = tradeMarkPaper;
   }

   @JsonProperty("tradeMarkPaper")
   public String getTradeMarkPaper() {
      return this.tradeMarkPaper;
   }

   @JsonProperty("brandGroupName")
   public void setBrandGroupName(String brandGroupName) {
      this.brandGroupName = brandGroupName;
   }

   @JsonProperty("brandGroupName")
   public String getBrandGroupName() {
      return this.brandGroupName;
   }

   @JsonProperty("declaration")
   public void setDeclaration(String declaration) {
      this.declaration = declaration;
   }

   @JsonProperty("declaration")
   public String getDeclaration() {
      return this.declaration;
   }

   @JsonProperty("invoiceImage")
   public void setInvoiceImage(String invoiceImage) {
      this.invoiceImage = invoiceImage;
   }

   @JsonProperty("invoiceImage")
   public String getInvoiceImage() {
      return this.invoiceImage;
   }

   @JsonProperty("overPackImg")
   public void setOverPackImg(String overPackImg) {
      this.overPackImg = overPackImg;
   }

   @JsonProperty("overPackImg")
   public String getOverPackImg() {
      return this.overPackImg;
   }

   @JsonProperty("mainBrandId")
   public void setMainBrandId(Integer mainBrandId) {
      this.mainBrandId = mainBrandId;
   }

   @JsonProperty("mainBrandId")
   public Integer getMainBrandId() {
      return this.mainBrandId;
   }

   @JsonProperty("applySource")
   public void setApplySource(Integer applySource) {
      this.applySource = applySource;
   }

   @JsonProperty("applySource")
   public Integer getApplySource() {
      return this.applySource;
   }

   @JsonProperty("isMainBrand")
   public void setIsMainBrand(Integer isMainBrand) {
      this.isMainBrand = isMainBrand;
   }

   @JsonProperty("isMainBrand")
   public Integer getIsMainBrand() {
      return this.isMainBrand;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("disableReason")
   public void setDisableReason(String disableReason) {
      this.disableReason = disableReason;
   }

   @JsonProperty("disableReason")
   public String getDisableReason() {
      return this.disableReason;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("isRegChina")
   public void setIsRegChina(String isRegChina) {
      this.isRegChina = isRegChina;
   }

   @JsonProperty("isRegChina")
   public String getIsRegChina() {
      return this.isRegChina;
   }

   @JsonProperty("regNumber")
   public void setRegNumber(String regNumber) {
      this.regNumber = regNumber;
   }

   @JsonProperty("regNumber")
   public String getRegNumber() {
      return this.regNumber;
   }

   @JsonProperty("brandSource")
   public void setBrandSource(String brandSource) {
      this.brandSource = brandSource;
   }

   @JsonProperty("brandSource")
   public String getBrandSource() {
      return this.brandSource;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }

   @JsonProperty("features")
   public void setFeatures(Map<String, String> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Map<String, String> getFeatures() {
      return this.features;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("tenant")
   public void setTenant(String tenant) {
      this.tenant = tenant;
   }

   @JsonProperty("tenant")
   public String getTenant() {
      return this.tenant;
   }
}
