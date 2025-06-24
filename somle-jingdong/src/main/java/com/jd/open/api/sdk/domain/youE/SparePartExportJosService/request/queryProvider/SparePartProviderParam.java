package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.queryProvider;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartProviderParam implements Serializable {
   private Integer companyType;

   @JsonProperty("companyType")
   public void setCompanyType(Integer companyType) {
      this.companyType = companyType;
   }

   @JsonProperty("companyType")
   public Integer getCompanyType() {
      return this.companyType;
   }
}
