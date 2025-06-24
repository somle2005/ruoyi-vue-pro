package com.jd.open.api.sdk.domain.youE.OrderModuleExportService.request.receiveOrderParts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPart implements Serializable {
   private Integer partsStat;
   private Integer oldPartsQty;
   private String deliverNo;
   private String remark;
   private String deliverCompany;
   private String deliverArriveDate;
   private String newPartsPrice;
   private String oldPartsCode;
   private String newPartsName;
   private String newPartsCode;
   private String oldPartsName;
   private String uniqueId;
   private Integer newPartsQty;

   @JsonProperty("partsStat")
   public void setPartsStat(Integer partsStat) {
      this.partsStat = partsStat;
   }

   @JsonProperty("partsStat")
   public Integer getPartsStat() {
      return this.partsStat;
   }

   @JsonProperty("oldPartsQty")
   public void setOldPartsQty(Integer oldPartsQty) {
      this.oldPartsQty = oldPartsQty;
   }

   @JsonProperty("oldPartsQty")
   public Integer getOldPartsQty() {
      return this.oldPartsQty;
   }

   @JsonProperty("deliverNo")
   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   @JsonProperty("deliverNo")
   public String getDeliverNo() {
      return this.deliverNo;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("deliverCompany")
   public void setDeliverCompany(String deliverCompany) {
      this.deliverCompany = deliverCompany;
   }

   @JsonProperty("deliverCompany")
   public String getDeliverCompany() {
      return this.deliverCompany;
   }

   @JsonProperty("deliverArriveDate")
   public void setDeliverArriveDate(String deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   @JsonProperty("deliverArriveDate")
   public String getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   @JsonProperty("newPartsPrice")
   public void setNewPartsPrice(String newPartsPrice) {
      this.newPartsPrice = newPartsPrice;
   }

   @JsonProperty("newPartsPrice")
   public String getNewPartsPrice() {
      return this.newPartsPrice;
   }

   @JsonProperty("oldPartsCode")
   public void setOldPartsCode(String oldPartsCode) {
      this.oldPartsCode = oldPartsCode;
   }

   @JsonProperty("oldPartsCode")
   public String getOldPartsCode() {
      return this.oldPartsCode;
   }

   @JsonProperty("newPartsName")
   public void setNewPartsName(String newPartsName) {
      this.newPartsName = newPartsName;
   }

   @JsonProperty("newPartsName")
   public String getNewPartsName() {
      return this.newPartsName;
   }

   @JsonProperty("newPartsCode")
   public void setNewPartsCode(String newPartsCode) {
      this.newPartsCode = newPartsCode;
   }

   @JsonProperty("newPartsCode")
   public String getNewPartsCode() {
      return this.newPartsCode;
   }

   @JsonProperty("oldPartsName")
   public void setOldPartsName(String oldPartsName) {
      this.oldPartsName = oldPartsName;
   }

   @JsonProperty("oldPartsName")
   public String getOldPartsName() {
      return this.oldPartsName;
   }

   @JsonProperty("uniqueId")
   public void setUniqueId(String uniqueId) {
      this.uniqueId = uniqueId;
   }

   @JsonProperty("uniqueId")
   public String getUniqueId() {
      return this.uniqueId;
   }

   @JsonProperty("newPartsQty")
   public void setNewPartsQty(Integer newPartsQty) {
      this.newPartsQty = newPartsQty;
   }

   @JsonProperty("newPartsQty")
   public Integer getNewPartsQty() {
      return this.newPartsQty;
   }
}
