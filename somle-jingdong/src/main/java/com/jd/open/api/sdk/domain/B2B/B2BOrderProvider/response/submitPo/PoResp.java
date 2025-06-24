package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.response.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class PoResp implements Serializable {
   private Long poId;
   private String thirdPoId;
   private String userName;
   private BigDecimal orderAmount;
   private BigDecimal orderNeedMoney;
   private BigDecimal freight;
   private BigDecimal rebeat;
   private Boolean repeatFlag;
   private Map<String, String> extMsg;
   private List<SkuResp> boughtSkus;

   @JsonProperty("poId")
   public void setPoId(Long poId) {
      this.poId = poId;
   }

   @JsonProperty("poId")
   public Long getPoId() {
      return this.poId;
   }

   @JsonProperty("thirdPoId")
   public void setThirdPoId(String thirdPoId) {
      this.thirdPoId = thirdPoId;
   }

   @JsonProperty("thirdPoId")
   public String getThirdPoId() {
      return this.thirdPoId;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("orderAmount")
   public void setOrderAmount(BigDecimal orderAmount) {
      this.orderAmount = orderAmount;
   }

   @JsonProperty("orderAmount")
   public BigDecimal getOrderAmount() {
      return this.orderAmount;
   }

   @JsonProperty("orderNeedMoney")
   public void setOrderNeedMoney(BigDecimal orderNeedMoney) {
      this.orderNeedMoney = orderNeedMoney;
   }

   @JsonProperty("orderNeedMoney")
   public BigDecimal getOrderNeedMoney() {
      return this.orderNeedMoney;
   }

   @JsonProperty("freight")
   public void setFreight(BigDecimal freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public BigDecimal getFreight() {
      return this.freight;
   }

   @JsonProperty("rebeat")
   public void setRebeat(BigDecimal rebeat) {
      this.rebeat = rebeat;
   }

   @JsonProperty("rebeat")
   public BigDecimal getRebeat() {
      return this.rebeat;
   }

   @JsonProperty("repeatFlag")
   public void setRepeatFlag(Boolean repeatFlag) {
      this.repeatFlag = repeatFlag;
   }

   @JsonProperty("repeatFlag")
   public Boolean getRepeatFlag() {
      return this.repeatFlag;
   }

   @JsonProperty("extMsg")
   public void setExtMsg(Map<String, String> extMsg) {
      this.extMsg = extMsg;
   }

   @JsonProperty("extMsg")
   public Map<String, String> getExtMsg() {
      return this.extMsg;
   }

   @JsonProperty("boughtSkus")
   public void setBoughtSkus(List<SkuResp> boughtSkus) {
      this.boughtSkus = boughtSkus;
   }

   @JsonProperty("boughtSkus")
   public List<SkuResp> getBoughtSkus() {
      return this.boughtSkus;
   }
}
