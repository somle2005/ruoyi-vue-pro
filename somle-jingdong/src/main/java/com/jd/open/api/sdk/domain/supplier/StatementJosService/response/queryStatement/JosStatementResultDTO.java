package com.jd.open.api.sdk.domain.supplier.StatementJosService.response.queryStatement;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosStatementResultDTO implements Serializable {
   private boolean success;
   private String resultMessage;
   private List<JosStatementDTO> statementDTOList;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("statementDTOList")
   public void setStatementDTOList(List<JosStatementDTO> statementDTOList) {
      this.statementDTOList = statementDTOList;
   }

   @JsonProperty("statementDTOList")
   public List<JosStatementDTO> getStatementDTOList() {
      return this.statementDTOList;
   }
}
