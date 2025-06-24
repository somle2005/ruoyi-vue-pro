package com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VcWareHouseOutResultJosDto implements Serializable {
   private Integer recordCount;
   private List<VcWareHouseOutJosDto> vcWareHouseOutJosDtos;
   private Boolean success;
   private String resultMessage;

   @JsonProperty("recordCount")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("vcWareHouseOutJosDtos")
   public void setVcWareHouseOutJosDtos(List<VcWareHouseOutJosDto> vcWareHouseOutJosDtos) {
      this.vcWareHouseOutJosDtos = vcWareHouseOutJosDtos;
   }

   @JsonProperty("vcWareHouseOutJosDtos")
   public List<VcWareHouseOutJosDto> getVcWareHouseOutJosDtos() {
      return this.vcWareHouseOutJosDtos;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
