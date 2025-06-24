package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.ChannelSoaService.response.addOrUpdateChannel.BooleanResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangAddOrUpdateChannelResponse extends AbstractResponse {
   private BooleanResult addorupdatechannelResult;

   @JsonProperty("addorupdatechannel_result")
   public void setAddorupdatechannelResult(BooleanResult addorupdatechannelResult) {
      this.addorupdatechannelResult = addorupdatechannelResult;
   }

   @JsonProperty("addorupdatechannel_result")
   public BooleanResult getAddorupdatechannelResult() {
      return this.addorupdatechannelResult;
   }
}
