package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.response.querySymbolApprovalList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BdsSymbolApprovalResult implements Serializable {
   private String approvalStatus;
   private Long symbolId;
   private List<String> qualifyUrl;
   private String firstClassifyName;
   private String remark;
   private Long relationId;
   private Long secondClassifyId;
   private String secondClassifyName;
   private Date qualifyEndDate;
   private Long firstClassifyId;
   private String symbolName;
   private String spuId;
   private String skuId;

   @JsonProperty("approvalStatus")
   public void setApprovalStatus(String approvalStatus) {
      this.approvalStatus = approvalStatus;
   }

   @JsonProperty("approvalStatus")
   public String getApprovalStatus() {
      return this.approvalStatus;
   }

   @JsonProperty("symbolId")
   public void setSymbolId(Long symbolId) {
      this.symbolId = symbolId;
   }

   @JsonProperty("symbolId")
   public Long getSymbolId() {
      return this.symbolId;
   }

   @JsonProperty("qualifyUrl")
   public void setQualifyUrl(List<String> qualifyUrl) {
      this.qualifyUrl = qualifyUrl;
   }

   @JsonProperty("qualifyUrl")
   public List<String> getQualifyUrl() {
      return this.qualifyUrl;
   }

   @JsonProperty("firstClassifyName")
   public void setFirstClassifyName(String firstClassifyName) {
      this.firstClassifyName = firstClassifyName;
   }

   @JsonProperty("firstClassifyName")
   public String getFirstClassifyName() {
      return this.firstClassifyName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("relationId")
   public void setRelationId(Long relationId) {
      this.relationId = relationId;
   }

   @JsonProperty("relationId")
   public Long getRelationId() {
      return this.relationId;
   }

   @JsonProperty("secondClassifyId")
   public void setSecondClassifyId(Long secondClassifyId) {
      this.secondClassifyId = secondClassifyId;
   }

   @JsonProperty("secondClassifyId")
   public Long getSecondClassifyId() {
      return this.secondClassifyId;
   }

   @JsonProperty("secondClassifyName")
   public void setSecondClassifyName(String secondClassifyName) {
      this.secondClassifyName = secondClassifyName;
   }

   @JsonProperty("secondClassifyName")
   public String getSecondClassifyName() {
      return this.secondClassifyName;
   }

   @JsonProperty("qualifyEndDate")
   public void setQualifyEndDate(Date qualifyEndDate) {
      this.qualifyEndDate = qualifyEndDate;
   }

   @JsonProperty("qualifyEndDate")
   public Date getQualifyEndDate() {
      return this.qualifyEndDate;
   }

   @JsonProperty("firstClassifyId")
   public void setFirstClassifyId(Long firstClassifyId) {
      this.firstClassifyId = firstClassifyId;
   }

   @JsonProperty("firstClassifyId")
   public Long getFirstClassifyId() {
      return this.firstClassifyId;
   }

   @JsonProperty("symbolName")
   public void setSymbolName(String symbolName) {
      this.symbolName = symbolName;
   }

   @JsonProperty("symbolName")
   public String getSymbolName() {
      return this.symbolName;
   }

   @JsonProperty("spuId")
   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public String getSpuId() {
      return this.spuId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
