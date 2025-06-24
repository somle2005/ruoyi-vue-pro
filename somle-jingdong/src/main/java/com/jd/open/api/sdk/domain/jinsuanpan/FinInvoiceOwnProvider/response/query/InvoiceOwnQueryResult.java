package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class InvoiceOwnQueryResult implements Serializable {
   private boolean success;
   private String message;
   private Long total;
   private List<FinInvoiceOwnIvcDetail> data;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(List<FinInvoiceOwnIvcDetail> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<FinInvoiceOwnIvcDetail> getData() {
      return this.data;
   }
}
