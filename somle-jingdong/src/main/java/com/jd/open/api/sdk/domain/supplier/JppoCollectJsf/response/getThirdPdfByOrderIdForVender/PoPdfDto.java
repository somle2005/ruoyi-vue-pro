package com.jd.open.api.sdk.domain.supplier.JppoCollectJsf.response.getThirdPdfByOrderIdForVender;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PoPdfDto implements Serializable {
   private String pdfUrl;
   private Integer printCount;
   private Long jdOrderId;

   @JsonProperty("pdfUrl")
   public void setPdfUrl(String pdfUrl) {
      this.pdfUrl = pdfUrl;
   }

   @JsonProperty("pdfUrl")
   public String getPdfUrl() {
      return this.pdfUrl;
   }

   @JsonProperty("printCount")
   public void setPrintCount(Integer printCount) {
      this.printCount = printCount;
   }

   @JsonProperty("printCount")
   public Integer getPrintCount() {
      return this.printCount;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }
}
