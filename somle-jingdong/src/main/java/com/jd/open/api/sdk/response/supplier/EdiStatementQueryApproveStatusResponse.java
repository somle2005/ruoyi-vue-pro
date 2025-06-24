package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.StatementJosService.response.queryApproveStatus.JosStatementApproveResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiStatementQueryApproveStatusResponse extends AbstractResponse {
   private JosStatementApproveResultDTO statementApproveResultDTO;

   @JsonProperty("statementApproveResultDTO")
   public void setStatementApproveResultDTO(JosStatementApproveResultDTO statementApproveResultDTO) {
      this.statementApproveResultDTO = statementApproveResultDTO;
   }

   @JsonProperty("statementApproveResultDTO")
   public JosStatementApproveResultDTO getStatementApproveResultDTO() {
      return this.statementApproveResultDTO;
   }
}
