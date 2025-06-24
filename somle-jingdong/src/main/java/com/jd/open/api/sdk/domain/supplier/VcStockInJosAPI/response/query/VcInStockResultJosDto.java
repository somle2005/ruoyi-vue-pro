package com.jd.open.api.sdk.domain.supplier.VcStockInJosAPI.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VcInStockResultJosDto implements Serializable {
   private Integer recordCount;
   private List<VcInStockSkuDto> vcInStockSkuDtos;
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

   @JsonProperty("vcInStockSkuDtos")
   public void setVcInStockSkuDtos(List<VcInStockSkuDto> vcInStockSkuDtos) {
      this.vcInStockSkuDtos = vcInStockSkuDtos;
   }

   @JsonProperty("vcInStockSkuDtos")
   public List<VcInStockSkuDto> getVcInStockSkuDtos() {
      return this.vcInStockSkuDtos;
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
