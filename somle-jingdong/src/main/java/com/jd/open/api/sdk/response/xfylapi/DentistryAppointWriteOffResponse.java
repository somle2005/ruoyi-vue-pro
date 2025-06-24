package com.jd.open.api.sdk.response.xfylapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xfylapi.DentistryThirdDataExportService.response.appointWriteOff.JsfResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DentistryAppointWriteOffResponse extends AbstractResponse {
   private JsfResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(JsfResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public JsfResult getReturnType() {
      return this.returnType;
   }
}
