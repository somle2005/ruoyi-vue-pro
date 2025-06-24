package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.ContainerCustomInfoOpenService.response.getOrderCustomInfo.ContainerCustomInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionWarehouseContainerGetOrderCustomInfoResponse extends AbstractResponse {
   private ContainerCustomInfoResult ContainerCustomInfoResult;

   @JsonProperty("ContainerCustomInfoResult")
   public void setContainerCustomInfoResult(ContainerCustomInfoResult ContainerCustomInfoResult) {
      this.ContainerCustomInfoResult = ContainerCustomInfoResult;
   }

   @JsonProperty("ContainerCustomInfoResult")
   public ContainerCustomInfoResult getContainerCustomInfoResult() {
      return this.ContainerCustomInfoResult;
   }
}
