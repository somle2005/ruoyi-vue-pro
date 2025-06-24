package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.getESFIdAndSkuIdByExternalId.EsfIdAndSkuIDResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangHouseResourceGetESFIdAndSkuIdByExternalIdResponse extends AbstractResponse {
   private EsfIdAndSkuIDResult getesfidandskuidbyexternalidResult;

   @JsonProperty("getesfidandskuidbyexternalid_result")
   public void setGetesfidandskuidbyexternalidResult(EsfIdAndSkuIDResult getesfidandskuidbyexternalidResult) {
      this.getesfidandskuidbyexternalidResult = getesfidandskuidbyexternalidResult;
   }

   @JsonProperty("getesfidandskuidbyexternalid_result")
   public EsfIdAndSkuIDResult getGetesfidandskuidbyexternalidResult() {
      return this.getesfidandskuidbyexternalidResult;
   }
}
