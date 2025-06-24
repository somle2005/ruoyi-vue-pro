package com.jd.open.api.sdk.domain.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LogisticsCompanies implements Serializable {
   private static final long serialVersionUID = -7046043924739885785L;
   private List<LogisticsCompany> logisticsList;
   private long venderId;

   @JsonProperty("vender_id")
   public long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("logistics_list")
   public List<LogisticsCompany> getLogisticsList() {
      return this.logisticsList;
   }

   @JsonProperty("logistics_list")
   public void setLogisticsList(List<LogisticsCompany> logisticsList) {
      this.logisticsList = logisticsList;
   }
}
