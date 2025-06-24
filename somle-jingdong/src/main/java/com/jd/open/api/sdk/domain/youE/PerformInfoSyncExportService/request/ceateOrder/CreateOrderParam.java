package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.ceateOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CreateOrderParam implements Serializable {
   private String standardIdentityId;
   private CreateOrderInfo createOrderInfo;

   @JsonProperty("standardIdentityId")
   public void setStandardIdentityId(String standardIdentityId) {
      this.standardIdentityId = standardIdentityId;
   }

   @JsonProperty("standardIdentityId")
   public String getStandardIdentityId() {
      return this.standardIdentityId;
   }

   @JsonProperty("createOrderInfo")
   public void setCreateOrderInfo(CreateOrderInfo createOrderInfo) {
      this.createOrderInfo = createOrderInfo;
   }

   @JsonProperty("createOrderInfo")
   public CreateOrderInfo getCreateOrderInfo() {
      return this.createOrderInfo;
   }
}
