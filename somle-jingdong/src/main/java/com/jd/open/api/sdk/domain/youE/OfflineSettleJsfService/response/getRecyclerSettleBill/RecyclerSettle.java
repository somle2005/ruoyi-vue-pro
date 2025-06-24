package com.jd.open.api.sdk.domain.youE.OfflineSettleJsfService.response.getRecyclerSettleBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class RecyclerSettle implements Serializable {
   private Date createDate;
   private String remark;
   private String settleNo;
   private Integer stat;
   private Integer opstatus;
   private Integer serviceTypeId;
   private String serviceTypeName;
   private Double settleAmount;
   private Double adjustAdmount;
   private String adjustRemark;
   private Integer recyclerId;
   private String recyclerName;
   private Double payAmount;
   private Integer firstLevelCatId;
   private String firstLevelCat;
   private Integer secondLevelCatId;
   private String secondLevelCat;
   private Integer thirdLevelCatId;
   private String thirdLevelCat;

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("opstatus")
   public void setOpstatus(Integer opstatus) {
      this.opstatus = opstatus;
   }

   @JsonProperty("opstatus")
   public Integer getOpstatus() {
      return this.opstatus;
   }

   @JsonProperty("serviceTypeId")
   public void setServiceTypeId(Integer serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   @JsonProperty("serviceTypeId")
   public Integer getServiceTypeId() {
      return this.serviceTypeId;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }

   @JsonProperty("settleAmount")
   public void setSettleAmount(Double settleAmount) {
      this.settleAmount = settleAmount;
   }

   @JsonProperty("settleAmount")
   public Double getSettleAmount() {
      return this.settleAmount;
   }

   @JsonProperty("adjustAdmount")
   public void setAdjustAdmount(Double adjustAdmount) {
      this.adjustAdmount = adjustAdmount;
   }

   @JsonProperty("adjustAdmount")
   public Double getAdjustAdmount() {
      return this.adjustAdmount;
   }

   @JsonProperty("adjustRemark")
   public void setAdjustRemark(String adjustRemark) {
      this.adjustRemark = adjustRemark;
   }

   @JsonProperty("adjustRemark")
   public String getAdjustRemark() {
      return this.adjustRemark;
   }

   @JsonProperty("recyclerId")
   public void setRecyclerId(Integer recyclerId) {
      this.recyclerId = recyclerId;
   }

   @JsonProperty("recyclerId")
   public Integer getRecyclerId() {
      return this.recyclerId;
   }

   @JsonProperty("recyclerName")
   public void setRecyclerName(String recyclerName) {
      this.recyclerName = recyclerName;
   }

   @JsonProperty("recyclerName")
   public String getRecyclerName() {
      return this.recyclerName;
   }

   @JsonProperty("payAmount")
   public void setPayAmount(Double payAmount) {
      this.payAmount = payAmount;
   }

   @JsonProperty("payAmount")
   public Double getPayAmount() {
      return this.payAmount;
   }

   @JsonProperty("firstLevelCatId")
   public void setFirstLevelCatId(Integer firstLevelCatId) {
      this.firstLevelCatId = firstLevelCatId;
   }

   @JsonProperty("firstLevelCatId")
   public Integer getFirstLevelCatId() {
      return this.firstLevelCatId;
   }

   @JsonProperty("firstLevelCat")
   public void setFirstLevelCat(String firstLevelCat) {
      this.firstLevelCat = firstLevelCat;
   }

   @JsonProperty("firstLevelCat")
   public String getFirstLevelCat() {
      return this.firstLevelCat;
   }

   @JsonProperty("secondLevelCatId")
   public void setSecondLevelCatId(Integer secondLevelCatId) {
      this.secondLevelCatId = secondLevelCatId;
   }

   @JsonProperty("secondLevelCatId")
   public Integer getSecondLevelCatId() {
      return this.secondLevelCatId;
   }

   @JsonProperty("secondLevelCat")
   public void setSecondLevelCat(String secondLevelCat) {
      this.secondLevelCat = secondLevelCat;
   }

   @JsonProperty("secondLevelCat")
   public String getSecondLevelCat() {
      return this.secondLevelCat;
   }

   @JsonProperty("thirdLevelCatId")
   public void setThirdLevelCatId(Integer thirdLevelCatId) {
      this.thirdLevelCatId = thirdLevelCatId;
   }

   @JsonProperty("thirdLevelCatId")
   public Integer getThirdLevelCatId() {
      return this.thirdLevelCatId;
   }

   @JsonProperty("thirdLevelCat")
   public void setThirdLevelCat(String thirdLevelCat) {
      this.thirdLevelCat = thirdLevelCat;
   }

   @JsonProperty("thirdLevelCat")
   public String getThirdLevelCat() {
      return this.thirdLevelCat;
   }
}
