package com.jd.open.api.sdk.response.EPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.EPT.WareApiClient.response.get.WareApiVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EptWarecenterWareGetResponse extends AbstractResponse {
   private WareApiVO getwareinfobyidResult;

   @JsonProperty("getwareinfobyid_result")
   public void setGetwareinfobyidResult(WareApiVO getwareinfobyidResult) {
      this.getwareinfobyidResult = getwareinfobyidResult;
   }

   @JsonProperty("getwareinfobyid_result")
   public WareApiVO getGetwareinfobyidResult() {
      return this.getwareinfobyidResult;
   }
}
