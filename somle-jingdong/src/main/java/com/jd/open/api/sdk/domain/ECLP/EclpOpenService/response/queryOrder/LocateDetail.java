package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LocateDetail implements Serializable {
   private String[] locateSkuNo;
   private String[] locateSkuName;
   private Integer[] plannedQty;
   private Integer[] locateShippedQty;
   private String[] locateIsvLotattrs;
   private String[] locateUnit;

   @JsonProperty("locateSkuNo")
   public void setLocateSkuNo(String[] locateSkuNo) {
      this.locateSkuNo = locateSkuNo;
   }

   @JsonProperty("locateSkuNo")
   public String[] getLocateSkuNo() {
      return this.locateSkuNo;
   }

   @JsonProperty("locateSkuName")
   public void setLocateSkuName(String[] locateSkuName) {
      this.locateSkuName = locateSkuName;
   }

   @JsonProperty("locateSkuName")
   public String[] getLocateSkuName() {
      return this.locateSkuName;
   }

   @JsonProperty("plannedQty")
   public void setPlannedQty(Integer[] plannedQty) {
      this.plannedQty = plannedQty;
   }

   @JsonProperty("plannedQty")
   public Integer[] getPlannedQty() {
      return this.plannedQty;
   }

   @JsonProperty("locateShippedQty")
   public void setLocateShippedQty(Integer[] locateShippedQty) {
      this.locateShippedQty = locateShippedQty;
   }

   @JsonProperty("locateShippedQty")
   public Integer[] getLocateShippedQty() {
      return this.locateShippedQty;
   }

   @JsonProperty("locateIsvLotattrs")
   public void setLocateIsvLotattrs(String[] locateIsvLotattrs) {
      this.locateIsvLotattrs = locateIsvLotattrs;
   }

   @JsonProperty("locateIsvLotattrs")
   public String[] getLocateIsvLotattrs() {
      return this.locateIsvLotattrs;
   }

   @JsonProperty("locateUnit")
   public void setLocateUnit(String[] locateUnit) {
      this.locateUnit = locateUnit;
   }

   @JsonProperty("locateUnit")
   public String[] getLocateUnit() {
      return this.locateUnit;
   }
}
