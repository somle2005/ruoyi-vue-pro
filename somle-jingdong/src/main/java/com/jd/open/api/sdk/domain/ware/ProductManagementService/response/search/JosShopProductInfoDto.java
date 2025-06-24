package com.jd.open.api.sdk.domain.ware.ProductManagementService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosShopProductInfoDto implements Serializable {
   private List<ShopSkuInfoDto> result;
   private String returnCode;
   private long totalCount;
   private String returnMessage;
   private boolean isSuccess;

   @JsonProperty("result")
   public void setResult(List<ShopSkuInfoDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<ShopSkuInfoDto> getResult() {
      return this.result;
   }

   @JsonProperty("returnCode")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("returnCode")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("returnMessage")
   public void setReturnMessage(String returnMessage) {
      this.returnMessage = returnMessage;
   }

   @JsonProperty("returnMessage")
   public String getReturnMessage() {
      return this.returnMessage;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }
}
