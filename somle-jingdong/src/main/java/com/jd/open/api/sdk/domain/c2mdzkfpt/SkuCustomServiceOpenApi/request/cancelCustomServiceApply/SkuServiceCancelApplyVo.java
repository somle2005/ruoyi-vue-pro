package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.cancelCustomServiceApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuServiceCancelApplyVo implements Serializable {
   private String systemCode;
   private String identityId;
   private String supplier;
   private String locale;

   @JsonProperty("systemCode")
   public void setSystemCode(String systemCode) {
      this.systemCode = systemCode;
   }

   @JsonProperty("systemCode")
   public String getSystemCode() {
      return this.systemCode;
   }

   @JsonProperty("identityId")
   public void setIdentityId(String identityId) {
      this.identityId = identityId;
   }

   @JsonProperty("identityId")
   public String getIdentityId() {
      return this.identityId;
   }

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("locale")
   public void setLocale(String locale) {
      this.locale = locale;
   }

   @JsonProperty("locale")
   public String getLocale() {
      return this.locale;
   }
}
