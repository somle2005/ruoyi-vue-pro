package com.jd.open.api.sdk.domain.supplier.SalesReturnJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosSalesReturnDto implements Serializable {
   private String[] vendorCode;
   private String[] serialNo;
   private String[] rkBusId;
   private Date[] rkTime;

   @JsonProperty("vendorCode")
   public void setVendorCode(String[] vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String[] getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(String[] serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("serialNo")
   public String[] getSerialNo() {
      return this.serialNo;
   }

   @JsonProperty("rkBusId")
   public void setRkBusId(String[] rkBusId) {
      this.rkBusId = rkBusId;
   }

   @JsonProperty("rkBusId")
   public String[] getRkBusId() {
      return this.rkBusId;
   }

   @JsonProperty("rkTime")
   public void setRkTime(Date[] rkTime) {
      this.rkTime = rkTime;
   }

   @JsonProperty("rkTime")
   public Date[] getRkTime() {
      return this.rkTime;
   }
}
