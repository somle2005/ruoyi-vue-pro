package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.evaluateB2BLwbFreightMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class GeneralFreightsDTO implements Serializable {
   private String buNo;
   private String businessNo;
   private Date expDate;
   private Double totalAmount;

   @JsonProperty("buNo")
   public void setBuNo(String buNo) {
      this.buNo = buNo;
   }

   @JsonProperty("buNo")
   public String getBuNo() {
      return this.buNo;
   }

   @JsonProperty("businessNo")
   public void setBusinessNo(String businessNo) {
      this.businessNo = businessNo;
   }

   @JsonProperty("businessNo")
   public String getBusinessNo() {
      return this.businessNo;
   }

   @JsonProperty("expDate")
   public void setExpDate(Date expDate) {
      this.expDate = expDate;
   }

   @JsonProperty("expDate")
   public Date getExpDate() {
      return this.expDate;
   }

   @JsonProperty("totalAmount")
   public void setTotalAmount(Double totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public Double getTotalAmount() {
      return this.totalAmount;
   }
}
