package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class InvoiceLog implements Serializable {
   private String operatePin;
   private Date operateDate;
   private String operateContent;
   private Integer operateType;
   private String operateTypeName;
   private Integer invoiceState;
   private String invoiceStateName;

   @JsonProperty("operatePin")
   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   @JsonProperty("operatePin")
   public String getOperatePin() {
      return this.operatePin;
   }

   @JsonProperty("operateDate")
   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   @JsonProperty("operateDate")
   public Date getOperateDate() {
      return this.operateDate;
   }

   @JsonProperty("operateContent")
   public void setOperateContent(String operateContent) {
      this.operateContent = operateContent;
   }

   @JsonProperty("operateContent")
   public String getOperateContent() {
      return this.operateContent;
   }

   @JsonProperty("operateType")
   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Integer getOperateType() {
      return this.operateType;
   }

   @JsonProperty("operateTypeName")
   public void setOperateTypeName(String operateTypeName) {
      this.operateTypeName = operateTypeName;
   }

   @JsonProperty("operateTypeName")
   public String getOperateTypeName() {
      return this.operateTypeName;
   }

   @JsonProperty("invoiceState")
   public void setInvoiceState(Integer invoiceState) {
      this.invoiceState = invoiceState;
   }

   @JsonProperty("invoiceState")
   public Integer getInvoiceState() {
      return this.invoiceState;
   }

   @JsonProperty("invoiceStateName")
   public void setInvoiceStateName(String invoiceStateName) {
      this.invoiceStateName = invoiceStateName;
   }

   @JsonProperty("invoiceStateName")
   public String getInvoiceStateName() {
      return this.invoiceStateName;
   }
}
