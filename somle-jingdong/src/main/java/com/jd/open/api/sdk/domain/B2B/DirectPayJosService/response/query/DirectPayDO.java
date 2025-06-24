package com.jd.open.api.sdk.domain.B2B.DirectPayJosService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class DirectPayDO implements Serializable {
   private Integer purchaseId;
   private Integer payType;
   private Integer compensateId;
   private BigDecimal payForSeller;
   private Integer payState;
   private String created;
   private Integer sellerId;
   private String sellerName;
   private BigDecimal payForUser;
   private String modified;

   @JsonProperty("purchaseId")
   public void setPurchaseId(Integer purchaseId) {
      this.purchaseId = purchaseId;
   }

   @JsonProperty("purchaseId")
   public Integer getPurchaseId() {
      return this.purchaseId;
   }

   @JsonProperty("payType")
   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public Integer getPayType() {
      return this.payType;
   }

   @JsonProperty("compensateId")
   public void setCompensateId(Integer compensateId) {
      this.compensateId = compensateId;
   }

   @JsonProperty("compensateId")
   public Integer getCompensateId() {
      return this.compensateId;
   }

   @JsonProperty("payForSeller")
   public void setPayForSeller(BigDecimal payForSeller) {
      this.payForSeller = payForSeller;
   }

   @JsonProperty("payForSeller")
   public BigDecimal getPayForSeller() {
      return this.payForSeller;
   }

   @JsonProperty("payState")
   public void setPayState(Integer payState) {
      this.payState = payState;
   }

   @JsonProperty("payState")
   public Integer getPayState() {
      return this.payState;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("sellerId")
   public void setSellerId(Integer sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("sellerId")
   public Integer getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("payForUser")
   public void setPayForUser(BigDecimal payForUser) {
      this.payForUser = payForUser;
   }

   @JsonProperty("payForUser")
   public BigDecimal getPayForUser() {
      return this.payForUser;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }
}
