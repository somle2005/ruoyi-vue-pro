package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.ImgSoaService.response.batchSynHouseResourceImg.ImgSynResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangHouseResourceBatchSynHouseResourceImgResponse extends AbstractResponse {
   private ImgSynResult synhouseimgResult;

   @JsonProperty("synhouseimg_result")
   public void setSynhouseimgResult(ImgSynResult synhouseimgResult) {
      this.synhouseimgResult = synhouseimgResult;
   }

   @JsonProperty("synhouseimg_result")
   public ImgSynResult getSynhouseimgResult() {
      return this.synhouseimgResult;
   }
}
