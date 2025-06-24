package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.infos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShipmentCompanyJosDO implements Serializable {
   private Integer companyId;
   private String companyName;

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }
}
