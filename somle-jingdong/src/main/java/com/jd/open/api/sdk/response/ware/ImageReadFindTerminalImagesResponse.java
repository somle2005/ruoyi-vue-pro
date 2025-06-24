package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ImageReadJosService.response.findTerminalImages.JosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImageReadFindTerminalImagesResponse extends AbstractResponse {
   private JosResult josResult;

   @JsonProperty("josResult")
   public void setJosResult(JosResult josResult) {
      this.josResult = josResult;
   }

   @JsonProperty("josResult")
   public JosResult getJosResult() {
      return this.josResult;
   }
}
