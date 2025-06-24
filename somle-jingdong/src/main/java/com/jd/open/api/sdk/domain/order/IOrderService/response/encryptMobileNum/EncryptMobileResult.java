package com.jd.open.api.sdk.domain.order.IOrderService.response.encryptMobileNum;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EncryptMobileResult implements Serializable {
   private String cipherText;

   @JsonProperty("cipherText")
   public void setCipherText(String cipherText) {
      this.cipherText = cipherText;
   }

   @JsonProperty("cipherText")
   public String getCipherText() {
      return this.cipherText;
   }
}
