package com.jd.open.api.sdk.response.innertest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.innertest.OperatePayResource.response.OperatePayResource.BaseResponseVo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OtsOrderbankExportRestOperatePayResourceResponse extends AbstractResponse {
   private BaseResponseVo resVo;

   @JsonProperty("resVo")
   public void setResVo(BaseResponseVo resVo) {
      this.resVo = resVo;
   }

   @JsonProperty("resVo")
   public BaseResponseVo getResVo() {
      return this.resVo;
   }
}
