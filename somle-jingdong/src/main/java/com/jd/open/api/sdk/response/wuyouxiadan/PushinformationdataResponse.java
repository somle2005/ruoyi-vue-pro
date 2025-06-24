package com.jd.open.api.sdk.response.wuyouxiadan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wuyouxiadan.CarefreeOutOperationJsfService.response.pushinformationdata.ResultVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PushinformationdataResponse extends AbstractResponse {
   private ResultVO pushinformationdataResult;

   @JsonProperty("pushinformationdata_result")
   public void setPushinformationdataResult(ResultVO pushinformationdataResult) {
      this.pushinformationdataResult = pushinformationdataResult;
   }

   @JsonProperty("pushinformationdata_result")
   public ResultVO getPushinformationdataResult() {
      return this.pushinformationdataResult;
   }
}
