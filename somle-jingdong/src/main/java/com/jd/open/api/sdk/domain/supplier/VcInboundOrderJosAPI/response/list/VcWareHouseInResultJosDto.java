package com.jd.open.api.sdk.domain.supplier.VcInboundOrderJosAPI.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VcWareHouseInResultJosDto implements Serializable {
   private Integer recordCount;
   private List<VcWareHouseInJosDto> vcWareHouseInJosDtos;
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

   @JsonProperty("vcWareHouseInJosDtos")
   public void setVcWareHouseInJosDtos(List<VcWareHouseInJosDto> vcWareHouseInJosDtos) {
      this.vcWareHouseInJosDtos = vcWareHouseInJosDtos;
   }

   @JsonProperty("vcWareHouseInJosDtos")
   public List<VcWareHouseInJosDto> getVcWareHouseInJosDtos() {
      return this.vcWareHouseInJosDtos;
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
