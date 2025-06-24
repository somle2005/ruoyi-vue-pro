package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncElectronicBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ElectronicBillPreferentialDetail implements Serializable {
   private BigDecimal singlePreferentialAmount;
   private String singlePreferentialName;

   @JsonProperty("singlePreferentialAmount")
   public void setSinglePreferentialAmount(BigDecimal singlePreferentialAmount) {
      this.singlePreferentialAmount = singlePreferentialAmount;
   }

   @JsonProperty("singlePreferentialAmount")
   public BigDecimal getSinglePreferentialAmount() {
      return this.singlePreferentialAmount;
   }

   @JsonProperty("singlePreferentialName")
   public void setSinglePreferentialName(String singlePreferentialName) {
      this.singlePreferentialName = singlePreferentialName;
   }

   @JsonProperty("singlePreferentialName")
   public String getSinglePreferentialName() {
      return this.singlePreferentialName;
   }
}
