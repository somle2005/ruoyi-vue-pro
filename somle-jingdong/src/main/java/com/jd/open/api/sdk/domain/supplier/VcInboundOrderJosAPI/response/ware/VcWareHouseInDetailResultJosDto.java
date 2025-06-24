package com.jd.open.api.sdk.domain.supplier.VcInboundOrderJosAPI.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VcWareHouseInDetailResultJosDto implements Serializable {
   private List<VcWareHouseInDetailDto> vcWareHouseInDetailDtos;
   private Boolean success;
   private String resultMessage;

   @JsonProperty("vcWareHouseInDetailDtos")
   public void setVcWareHouseInDetailDtos(List<VcWareHouseInDetailDto> vcWareHouseInDetailDtos) {
      this.vcWareHouseInDetailDtos = vcWareHouseInDetailDtos;
   }

   @JsonProperty("vcWareHouseInDetailDtos")
   public List<VcWareHouseInDetailDto> getVcWareHouseInDetailDtos() {
      return this.vcWareHouseInDetailDtos;
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
