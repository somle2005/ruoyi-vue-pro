package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.synHouseResourceVideo.HouseResourceVideoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangHouseResourceSynHouseResourceVideoResponse extends AbstractResponse {
   private HouseResourceVideoResult synhouseresourcevideoResult;

   @JsonProperty("synhouseresourcevideo_result")
   public void setSynhouseresourcevideoResult(HouseResourceVideoResult synhouseresourcevideoResult) {
      this.synhouseresourcevideoResult = synhouseresourcevideoResult;
   }

   @JsonProperty("synhouseresourcevideo_result")
   public HouseResourceVideoResult getSynhouseresourcevideoResult() {
      return this.synhouseresourcevideoResult;
   }
}
