package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryVmiShopStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VmiShopStockResponse implements Serializable {
   private List<VmiShopStock> vmiShopStocks;
   private String deptNo;

   @JsonProperty("vmiShopStocks")
   public void setVmiShopStocks(List<VmiShopStock> vmiShopStocks) {
      this.vmiShopStocks = vmiShopStocks;
   }

   @JsonProperty("vmiShopStocks")
   public List<VmiShopStock> getVmiShopStocks() {
      return this.vmiShopStocks;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }
}
