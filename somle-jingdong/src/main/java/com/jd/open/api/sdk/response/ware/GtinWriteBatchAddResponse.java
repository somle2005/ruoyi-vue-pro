package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.GtinReceiveRpc.response.batchAdd.ResultVo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GtinWriteBatchAddResponse extends AbstractResponse {
   private ResultVo resultVo;

   @JsonProperty("resultVo")
   public void setResultVo(ResultVo resultVo) {
      this.resultVo = resultVo;
   }

   @JsonProperty("resultVo")
   public ResultVo getResultVo() {
      return this.resultVo;
   }
}
