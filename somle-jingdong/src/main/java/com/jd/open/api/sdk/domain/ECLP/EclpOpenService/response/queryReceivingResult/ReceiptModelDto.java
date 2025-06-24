package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryReceivingResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReceiptModelDto implements Serializable {
   private String receiptNo;
   private String ownerNo;
   private String supplierNo;
   private Integer status;
   private List<ReceiptDetailModelDto> detailModelDtos;

   @JsonProperty("receiptNo")
   public void setReceiptNo(String receiptNo) {
      this.receiptNo = receiptNo;
   }

   @JsonProperty("receiptNo")
   public String getReceiptNo() {
      return this.receiptNo;
   }

   @JsonProperty("ownerNo")
   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   @JsonProperty("ownerNo")
   public String getOwnerNo() {
      return this.ownerNo;
   }

   @JsonProperty("supplierNo")
   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   @JsonProperty("supplierNo")
   public String getSupplierNo() {
      return this.supplierNo;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("detailModelDtos")
   public void setDetailModelDtos(List<ReceiptDetailModelDto> detailModelDtos) {
      this.detailModelDtos = detailModelDtos;
   }

   @JsonProperty("detailModelDtos")
   public List<ReceiptDetailModelDto> getDetailModelDtos() {
      return this.detailModelDtos;
   }
}
