package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class PromiseShipmentResp implements Serializable {
   private Date bigItemShipmentDate;
   private Date bigItemInstallDate;
   private String promiseDate;
   private String promiseTimeRange;

   @JsonProperty("bigItemShipmentDate")
   public void setBigItemShipmentDate(Date bigItemShipmentDate) {
      this.bigItemShipmentDate = bigItemShipmentDate;
   }

   @JsonProperty("bigItemShipmentDate")
   public Date getBigItemShipmentDate() {
      return this.bigItemShipmentDate;
   }

   @JsonProperty("bigItemInstallDate")
   public void setBigItemInstallDate(Date bigItemInstallDate) {
      this.bigItemInstallDate = bigItemInstallDate;
   }

   @JsonProperty("bigItemInstallDate")
   public Date getBigItemInstallDate() {
      return this.bigItemInstallDate;
   }

   @JsonProperty("promiseDate")
   public void setPromiseDate(String promiseDate) {
      this.promiseDate = promiseDate;
   }

   @JsonProperty("promiseDate")
   public String getPromiseDate() {
      return this.promiseDate;
   }

   @JsonProperty("promiseTimeRange")
   public void setPromiseTimeRange(String promiseTimeRange) {
      this.promiseTimeRange = promiseTimeRange;
   }

   @JsonProperty("promiseTimeRange")
   public String getPromiseTimeRange() {
      return this.promiseTimeRange;
   }
}
