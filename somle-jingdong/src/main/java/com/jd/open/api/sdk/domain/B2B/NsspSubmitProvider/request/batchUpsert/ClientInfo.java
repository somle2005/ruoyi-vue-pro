package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchUpsert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private UniformBizInfo uniformBizInfo;
   private String ip;
   private String opretor;

   @JsonProperty("uniformBizInfo")
   public void setUniformBizInfo(UniformBizInfo uniformBizInfo) {
      this.uniformBizInfo = uniformBizInfo;
   }

   @JsonProperty("uniformBizInfo")
   public UniformBizInfo getUniformBizInfo() {
      return this.uniformBizInfo;
   }

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }

   @JsonProperty("opretor")
   public void setOpretor(String opretor) {
      this.opretor = opretor;
   }

   @JsonProperty("opretor")
   public String getOpretor() {
      return this.opretor;
   }
}
