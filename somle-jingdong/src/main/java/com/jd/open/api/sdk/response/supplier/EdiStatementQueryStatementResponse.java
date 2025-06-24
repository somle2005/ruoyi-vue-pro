package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.StatementJosService.response.queryStatement.JosStatementResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiStatementQueryStatementResponse extends AbstractResponse {
   private JosStatementResultDTO josStatementResultDTO;

   @JsonProperty("josStatementResultDTO")
   public void setJosStatementResultDTO(JosStatementResultDTO josStatementResultDTO) {
      this.josStatementResultDTO = josStatementResultDTO;
   }

   @JsonProperty("josStatementResultDTO")
   public JosStatementResultDTO getJosStatementResultDTO() {
      return this.josStatementResultDTO;
   }
}
