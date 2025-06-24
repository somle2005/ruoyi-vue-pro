package com.jd.open.api.sdk.domain.supplier.InvoiceJosService.response.queryInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosInvoiceResultDTO implements Serializable {
   private boolean success;
   private String resultMessage;
   private List<JosInvoiceDTO> invoiceDTOList;

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

   @JsonProperty("invoiceDTOList")
   public void setInvoiceDTOList(List<JosInvoiceDTO> invoiceDTOList) {
      this.invoiceDTOList = invoiceDTOList;
   }

   @JsonProperty("invoiceDTOList")
   public List<JosInvoiceDTO> getInvoiceDTOList() {
      return this.invoiceDTOList;
   }
}
