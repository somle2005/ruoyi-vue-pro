package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class JosHouseSpu implements Serializable {
   private List<JosHousePublishImg> houseImgGroups;
   private List<JosHouseSpuCertificate> certificates;
   private Integer handleType;
   private Short spuFlag;
   private String spuTitle;
   private BigDecimal spuAvgAmt;
   private BigDecimal spuTotalAmt;
   private List<JosHouseSpuAddress> spuAddresss;

   @JsonProperty("houseImgGroups")
   public void setHouseImgGroups(List<JosHousePublishImg> houseImgGroups) {
      this.houseImgGroups = houseImgGroups;
   }

   @JsonProperty("houseImgGroups")
   public List<JosHousePublishImg> getHouseImgGroups() {
      return this.houseImgGroups;
   }

   @JsonProperty("certificates")
   public void setCertificates(List<JosHouseSpuCertificate> certificates) {
      this.certificates = certificates;
   }

   @JsonProperty("certificates")
   public List<JosHouseSpuCertificate> getCertificates() {
      return this.certificates;
   }

   @JsonProperty("handleType")
   public void setHandleType(Integer handleType) {
      this.handleType = handleType;
   }

   @JsonProperty("handleType")
   public Integer getHandleType() {
      return this.handleType;
   }

   @JsonProperty("spuFlag")
   public void setSpuFlag(Short spuFlag) {
      this.spuFlag = spuFlag;
   }

   @JsonProperty("spuFlag")
   public Short getSpuFlag() {
      return this.spuFlag;
   }

   @JsonProperty("spuTitle")
   public void setSpuTitle(String spuTitle) {
      this.spuTitle = spuTitle;
   }

   @JsonProperty("spuTitle")
   public String getSpuTitle() {
      return this.spuTitle;
   }

   @JsonProperty("spuAvgAmt")
   public void setSpuAvgAmt(BigDecimal spuAvgAmt) {
      this.spuAvgAmt = spuAvgAmt;
   }

   @JsonProperty("spuAvgAmt")
   public BigDecimal getSpuAvgAmt() {
      return this.spuAvgAmt;
   }

   @JsonProperty("spuTotalAmt")
   public void setSpuTotalAmt(BigDecimal spuTotalAmt) {
      this.spuTotalAmt = spuTotalAmt;
   }

   @JsonProperty("spuTotalAmt")
   public BigDecimal getSpuTotalAmt() {
      return this.spuTotalAmt;
   }

   @JsonProperty("spuAddresss")
   public void setSpuAddresss(List<JosHouseSpuAddress> spuAddresss) {
      this.spuAddresss = spuAddresss;
   }

   @JsonProperty("spuAddresss")
   public List<JosHouseSpuAddress> getSpuAddresss() {
      return this.spuAddresss;
   }
}
