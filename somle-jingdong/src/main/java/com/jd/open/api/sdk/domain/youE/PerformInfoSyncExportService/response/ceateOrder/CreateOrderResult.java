package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.ceateOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CreateOrderResult implements Serializable {
   private List<CreateOrderDataResult> createOrderDataResultList;

   @JsonProperty("createOrderDataResultList")
   public void setCreateOrderDataResultList(List<CreateOrderDataResult> createOrderDataResultList) {
      this.createOrderDataResultList = createOrderDataResultList;
   }

   @JsonProperty("createOrderDataResultList")
   public List<CreateOrderDataResult> getCreateOrderDataResultList() {
      return this.createOrderDataResultList;
   }
}
