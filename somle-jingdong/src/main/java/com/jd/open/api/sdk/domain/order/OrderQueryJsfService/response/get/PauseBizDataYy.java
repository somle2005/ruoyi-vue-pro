package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PauseBizDataYy implements Serializable {
   private String codDT;
   private String dbDT;
   private String ljDT;

   @JsonProperty("codDT")
   public void setCodDT(String codDT) {
      this.codDT = codDT;
   }

   @JsonProperty("codDT")
   public String getCodDT() {
      return this.codDT;
   }

   @JsonProperty("dbDT")
   public void setDbDT(String dbDT) {
      this.dbDT = dbDT;
   }

   @JsonProperty("dbDT")
   public String getDbDT() {
      return this.dbDT;
   }

   @JsonProperty("ljDT")
   public void setLjDT(String ljDT) {
      this.ljDT = ljDT;
   }

   @JsonProperty("ljDT")
   public String getLjDT() {
      return this.ljDT;
   }
}
