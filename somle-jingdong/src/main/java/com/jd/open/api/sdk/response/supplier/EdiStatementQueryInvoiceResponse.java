package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.InvoiceJosService.response.queryInvoice.JosInvoiceResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiStatementQueryInvoiceResponse extends AbstractResponse {
   private JosInvoiceResultDTO josInvoiceResultDTO;

   @JsonProperty("josInvoiceResultDTO")
   public void setJosInvoiceResultDTO(JosInvoiceResultDTO josInvoiceResultDTO) {
      this.josInvoiceResultDTO = josInvoiceResultDTO;
   }

   @JsonProperty("josInvoiceResultDTO")
   public JosInvoiceResultDTO getJosInvoiceResultDTO() {
      return this.josInvoiceResultDTO;
   }
}
