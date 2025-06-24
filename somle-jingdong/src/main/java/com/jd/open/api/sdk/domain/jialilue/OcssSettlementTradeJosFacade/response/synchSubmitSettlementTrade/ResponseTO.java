package com.jd.open.api.sdk.domain.jialilue.OcssSettlementTradeJosFacade.response.synchSubmitSettlementTrade;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseTO implements Serializable {
   private Integer respCode;
   private String respDesc;

   @JsonProperty("respCode")
   public void setRespCode(Integer respCode) {
      this.respCode = respCode;
   }

   @JsonProperty("respCode")
   public Integer getRespCode() {
      return this.respCode;
   }

   @JsonProperty("respDesc")
   public void setRespDesc(String respDesc) {
      this.respDesc = respDesc;
   }

   @JsonProperty("respDesc")
   public String getRespDesc() {
      return this.respDesc;
   }
}
