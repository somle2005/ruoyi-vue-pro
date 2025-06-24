package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.response.batchAddOrUpdateSupplierStock.RemoteResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JdiSupplyBatchAddOrUpdateSupplierStockResponse extends AbstractResponse {
   private RemoteResultBean remoteResultBean;

   @JsonProperty("remoteResultBean")
   public void setRemoteResultBean(RemoteResultBean remoteResultBean) {
      this.remoteResultBean = remoteResultBean;
   }

   @JsonProperty("remoteResultBean")
   public RemoteResultBean getRemoteResultBean() {
      return this.remoteResultBean;
   }
}
