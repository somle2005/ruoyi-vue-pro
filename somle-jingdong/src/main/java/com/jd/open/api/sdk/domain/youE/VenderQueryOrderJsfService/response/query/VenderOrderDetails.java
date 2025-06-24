package com.jd.open.api.sdk.domain.youE.VenderQueryOrderJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VenderOrderDetails implements Serializable {
   private Integer stat;
   private BigDecimal reducedOldDeductionAmount;
   private String orderNo;
   private Long orderId;
   private String recyclerName;
   private Date takeOutDate;
   private Integer withholdStat;
   private String withholdOrderNo;
   private Integer sceneType;
   private BigDecimal subsidyPriceForNewPromo;
   private BigDecimal popPlatformSubsidyAmount;
   private Date finishDate;
   private String oldSku;
   private BigDecimal reducePopSubsidyGovAmount;
   private BigDecimal reducePopSubsidyGovRatio;

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("reducedOldDeductionAmount")
   public void setReducedOldDeductionAmount(BigDecimal reducedOldDeductionAmount) {
      this.reducedOldDeductionAmount = reducedOldDeductionAmount;
   }

   @JsonProperty("reducedOldDeductionAmount")
   public BigDecimal getReducedOldDeductionAmount() {
      return this.reducedOldDeductionAmount;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("recyclerName")
   public void setRecyclerName(String recyclerName) {
      this.recyclerName = recyclerName;
   }

   @JsonProperty("recyclerName")
   public String getRecyclerName() {
      return this.recyclerName;
   }

   @JsonProperty("takeOutDate")
   public void setTakeOutDate(Date takeOutDate) {
      this.takeOutDate = takeOutDate;
   }

   @JsonProperty("takeOutDate")
   public Date getTakeOutDate() {
      return this.takeOutDate;
   }

   @JsonProperty("withholdStat")
   public void setWithholdStat(Integer withholdStat) {
      this.withholdStat = withholdStat;
   }

   @JsonProperty("withholdStat")
   public Integer getWithholdStat() {
      return this.withholdStat;
   }

   @JsonProperty("withholdOrderNo")
   public void setWithholdOrderNo(String withholdOrderNo) {
      this.withholdOrderNo = withholdOrderNo;
   }

   @JsonProperty("withholdOrderNo")
   public String getWithholdOrderNo() {
      return this.withholdOrderNo;
   }

   @JsonProperty("sceneType")
   public void setSceneType(Integer sceneType) {
      this.sceneType = sceneType;
   }

   @JsonProperty("sceneType")
   public Integer getSceneType() {
      return this.sceneType;
   }

   @JsonProperty("subsidyPriceForNewPromo")
   public void setSubsidyPriceForNewPromo(BigDecimal subsidyPriceForNewPromo) {
      this.subsidyPriceForNewPromo = subsidyPriceForNewPromo;
   }

   @JsonProperty("subsidyPriceForNewPromo")
   public BigDecimal getSubsidyPriceForNewPromo() {
      return this.subsidyPriceForNewPromo;
   }

   @JsonProperty("popPlatformSubsidyAmount")
   public void setPopPlatformSubsidyAmount(BigDecimal popPlatformSubsidyAmount) {
      this.popPlatformSubsidyAmount = popPlatformSubsidyAmount;
   }

   @JsonProperty("popPlatformSubsidyAmount")
   public BigDecimal getPopPlatformSubsidyAmount() {
      return this.popPlatformSubsidyAmount;
   }

   @JsonProperty("finishDate")
   public void setFinishDate(Date finishDate) {
      this.finishDate = finishDate;
   }

   @JsonProperty("finishDate")
   public Date getFinishDate() {
      return this.finishDate;
   }

   @JsonProperty("oldSku")
   public void setOldSku(String oldSku) {
      this.oldSku = oldSku;
   }

   @JsonProperty("oldSku")
   public String getOldSku() {
      return this.oldSku;
   }

   @JsonProperty("reducePopSubsidyGovAmount")
   public void setReducePopSubsidyGovAmount(BigDecimal reducePopSubsidyGovAmount) {
      this.reducePopSubsidyGovAmount = reducePopSubsidyGovAmount;
   }

   @JsonProperty("reducePopSubsidyGovAmount")
   public BigDecimal getReducePopSubsidyGovAmount() {
      return this.reducePopSubsidyGovAmount;
   }

   @JsonProperty("reducePopSubsidyGovRatio")
   public void setReducePopSubsidyGovRatio(BigDecimal reducePopSubsidyGovRatio) {
      this.reducePopSubsidyGovRatio = reducePopSubsidyGovRatio;
   }

   @JsonProperty("reducePopSubsidyGovRatio")
   public BigDecimal getReducePopSubsidyGovRatio() {
      return this.reducePopSubsidyGovRatio;
   }
}
