package com.jd.open.api.sdk.domain.wujiemiandan.WaybillBigShotApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RlsDetailDTO implements Serializable {
   private String twoDimensionCode;
   private String codingMapping;
   private String proCode;

   @JsonProperty("twoDimensionCode")
   public void setTwoDimensionCode(String twoDimensionCode) {
      this.twoDimensionCode = twoDimensionCode;
   }

   @JsonProperty("twoDimensionCode")
   public String getTwoDimensionCode() {
      return this.twoDimensionCode;
   }

   @JsonProperty("codingMapping")
   public void setCodingMapping(String codingMapping) {
      this.codingMapping = codingMapping;
   }

   @JsonProperty("codingMapping")
   public String getCodingMapping() {
      return this.codingMapping;
   }

   @JsonProperty("proCode")
   public void setProCode(String proCode) {
      this.proCode = proCode;
   }

   @JsonProperty("proCode")
   public String getProCode() {
      return this.proCode;
   }
}
