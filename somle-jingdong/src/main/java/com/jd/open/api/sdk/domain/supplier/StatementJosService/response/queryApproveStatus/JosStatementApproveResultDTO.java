package com.jd.open.api.sdk.domain.supplier.StatementJosService.response.queryApproveStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosStatementApproveResultDTO implements Serializable {
   private boolean success;
   private String resultMessage;
   private List<JosStatementApproveDTO> statementApproveDTOList;

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

   @JsonProperty("statementApproveDTOList")
   public void setStatementApproveDTOList(List<JosStatementApproveDTO> statementApproveDTOList) {
      this.statementApproveDTOList = statementApproveDTOList;
   }

   @JsonProperty("statementApproveDTOList")
   public List<JosStatementApproveDTO> getStatementApproveDTOList() {
      return this.statementApproveDTOList;
   }
}
