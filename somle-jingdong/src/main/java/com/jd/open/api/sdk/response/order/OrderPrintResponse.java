package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.PrintResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderPrintResponse extends AbstractResponse {
   private static final long serialVersionUID = 3887565612364754892L;
   private PrintResult printResult;

   @JsonProperty("print_result")
   public PrintResult getPrintResult() {
      return this.printResult;
   }

   @JsonProperty("print_result")
   public void setPrintResult(PrintResult printResult) {
      this.printResult = printResult;
   }
}
