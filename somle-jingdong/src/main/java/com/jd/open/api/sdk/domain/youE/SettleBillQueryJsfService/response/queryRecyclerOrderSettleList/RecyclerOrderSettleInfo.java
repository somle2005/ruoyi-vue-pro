package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.response.queryRecyclerOrderSettleList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RecyclerOrderSettleInfo implements Serializable {
   private String orderNo;
   private Date settleFinishDate;
   private String oldCategory2;
   private String oldCategory1;
   private String recyclerName;
   private String oldCategory4;
   private BigDecimal settleAmount;
   private String oldCategory3;
   private Date createDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("settleFinishDate")
   public void setSettleFinishDate(Date settleFinishDate) {
      this.settleFinishDate = settleFinishDate;
   }

   @JsonProperty("settleFinishDate")
   public Date getSettleFinishDate() {
      return this.settleFinishDate;
   }

   @JsonProperty("oldCategory2")
   public void setOldCategory2(String oldCategory2) {
      this.oldCategory2 = oldCategory2;
   }

   @JsonProperty("oldCategory2")
   public String getOldCategory2() {
      return this.oldCategory2;
   }

   @JsonProperty("oldCategory1")
   public void setOldCategory1(String oldCategory1) {
      this.oldCategory1 = oldCategory1;
   }

   @JsonProperty("oldCategory1")
   public String getOldCategory1() {
      return this.oldCategory1;
   }

   @JsonProperty("recyclerName")
   public void setRecyclerName(String recyclerName) {
      this.recyclerName = recyclerName;
   }

   @JsonProperty("recyclerName")
   public String getRecyclerName() {
      return this.recyclerName;
   }

   @JsonProperty("oldCategory4")
   public void setOldCategory4(String oldCategory4) {
      this.oldCategory4 = oldCategory4;
   }

   @JsonProperty("oldCategory4")
   public String getOldCategory4() {
      return this.oldCategory4;
   }

   @JsonProperty("settleAmount")
   public void setSettleAmount(BigDecimal settleAmount) {
      this.settleAmount = settleAmount;
   }

   @JsonProperty("settleAmount")
   public BigDecimal getSettleAmount() {
      return this.settleAmount;
   }

   @JsonProperty("oldCategory3")
   public void setOldCategory3(String oldCategory3) {
      this.oldCategory3 = oldCategory3;
   }

   @JsonProperty("oldCategory3")
   public String getOldCategory3() {
      return this.oldCategory3;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }
}
