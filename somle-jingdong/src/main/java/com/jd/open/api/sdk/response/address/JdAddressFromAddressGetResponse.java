package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.address.JdAddressService.response.get.JdAdressResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JdAddressFromAddressGetResponse extends AbstractResponse {
   private JdAdressResponse getjdaddressfromaddressResult;

   @JsonProperty("getjdaddressfromaddress_result")
   public void setGetjdaddressfromaddressResult(JdAdressResponse getjdaddressfromaddressResult) {
      this.getjdaddressfromaddressResult = getjdaddressfromaddressResult;
   }

   @JsonProperty("getjdaddressfromaddress_result")
   public JdAdressResponse getGetjdaddressfromaddressResult() {
      return this.getjdaddressfromaddressResult;
   }
}
