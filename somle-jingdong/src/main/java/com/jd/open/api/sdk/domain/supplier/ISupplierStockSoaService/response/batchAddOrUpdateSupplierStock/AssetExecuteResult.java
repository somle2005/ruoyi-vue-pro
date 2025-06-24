package com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.response.batchAddOrUpdateSupplierStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AssetExecuteResult implements Serializable {
   private String id;
   private String errorMsg;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
