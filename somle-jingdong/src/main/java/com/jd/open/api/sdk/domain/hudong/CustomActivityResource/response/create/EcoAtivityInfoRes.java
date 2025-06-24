package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EcoAtivityInfoRes implements Serializable {
   private String mktActBaseNo;

   @JsonProperty("mktActBaseNo")
   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   @JsonProperty("mktActBaseNo")
   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }
}
