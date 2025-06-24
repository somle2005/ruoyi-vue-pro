package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ServiceDetailInfoExport implements Serializable {
   private Long[] wareId;
   private String[] wareName;
   private String[] wareBrand;
   private Integer[] afsDetailType;
   private String[] wareDescribe;
   private Integer[] wareCid1;
   private Integer[] wareCid2;
   private Integer[] wareCid3;
   private BigDecimal[] payPrice;

   @JsonProperty("wareId")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String[] wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String[] getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareBrand")
   public void setWareBrand(String[] wareBrand) {
      this.wareBrand = wareBrand;
   }

   @JsonProperty("wareBrand")
   public String[] getWareBrand() {
      return this.wareBrand;
   }

   @JsonProperty("afsDetailType")
   public void setAfsDetailType(Integer[] afsDetailType) {
      this.afsDetailType = afsDetailType;
   }

   @JsonProperty("afsDetailType")
   public Integer[] getAfsDetailType() {
      return this.afsDetailType;
   }

   @JsonProperty("wareDescribe")
   public void setWareDescribe(String[] wareDescribe) {
      this.wareDescribe = wareDescribe;
   }

   @JsonProperty("wareDescribe")
   public String[] getWareDescribe() {
      return this.wareDescribe;
   }

   @JsonProperty("wareCid1")
   public void setWareCid1(Integer[] wareCid1) {
      this.wareCid1 = wareCid1;
   }

   @JsonProperty("wareCid1")
   public Integer[] getWareCid1() {
      return this.wareCid1;
   }

   @JsonProperty("wareCid2")
   public void setWareCid2(Integer[] wareCid2) {
      this.wareCid2 = wareCid2;
   }

   @JsonProperty("wareCid2")
   public Integer[] getWareCid2() {
      return this.wareCid2;
   }

   @JsonProperty("wareCid3")
   public void setWareCid3(Integer[] wareCid3) {
      this.wareCid3 = wareCid3;
   }

   @JsonProperty("wareCid3")
   public Integer[] getWareCid3() {
      return this.wareCid3;
   }

   @JsonProperty("payPrice")
   public void setPayPrice(BigDecimal[] payPrice) {
      this.payPrice = payPrice;
   }

   @JsonProperty("payPrice")
   public BigDecimal[] getPayPrice() {
      return this.payPrice;
   }
}
