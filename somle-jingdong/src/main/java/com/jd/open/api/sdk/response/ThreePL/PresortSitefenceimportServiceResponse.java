package com.jd.open.api.sdk.response.ThreePL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ThreePL.PresortBaseSiteFenceImportService.response.service.FenceImportResponseDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PresortSitefenceimportServiceResponse extends AbstractResponse {
   private FenceImportResponseDto sitefenceimportResult;

   @JsonProperty("sitefenceimport_result")
   public void setSitefenceimportResult(FenceImportResponseDto sitefenceimportResult) {
      this.sitefenceimportResult = sitefenceimportResult;
   }

   @JsonProperty("sitefenceimport_result")
   public FenceImportResponseDto getSitefenceimportResult() {
      return this.sitefenceimportResult;
   }
}
