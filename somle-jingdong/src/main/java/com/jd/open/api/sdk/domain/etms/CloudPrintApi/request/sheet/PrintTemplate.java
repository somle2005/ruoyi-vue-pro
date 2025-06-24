package com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PrintTemplate implements Serializable {
   private String paperSize;

   @JsonProperty("paperSize")
   public void setPaperSize(String paperSize) {
      this.paperSize = paperSize;
   }

   @JsonProperty("paperSize")
   public String getPaperSize() {
      return this.paperSize;
   }
}
