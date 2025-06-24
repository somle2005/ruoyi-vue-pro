package com.jd.open.api.sdk.domain.B2B.B2BOrderMiddleProvider.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SpecSearchInfoReq implements Serializable {
   private String companyName;
   private String venderShopName;

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("venderShopName")
   public void setVenderShopName(String venderShopName) {
      this.venderShopName = venderShopName;
   }

   @JsonProperty("venderShopName")
   public String getVenderShopName() {
      return this.venderShopName;
   }
}
