package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.SmsModelConfigReadService.response.getSmsModelConfigByParams.SmsModelConfig;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ApiSmsModelConfigReadServiceGetSmsModelConfigByParamsResponse extends AbstractResponse {
   private List<SmsModelConfig> list;

   @JsonProperty("list")
   public void setList(List<SmsModelConfig> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<SmsModelConfig> getList() {
      return this.list;
   }
}
