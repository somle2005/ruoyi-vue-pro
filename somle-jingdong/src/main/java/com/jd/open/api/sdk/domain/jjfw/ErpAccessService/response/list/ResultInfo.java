package com.jd.open.api.sdk.domain.jjfw.ErpAccessService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private List<Warehouse> warehouseList;
   private String errMsg;
   private Integer pageSize;
   private Integer resultCode;
   private List<String> siteList;

   @JsonProperty("warehouseList")
   public void setWarehouseList(List<Warehouse> warehouseList) {
      this.warehouseList = warehouseList;
   }

   @JsonProperty("warehouseList")
   public List<Warehouse> getWarehouseList() {
      return this.warehouseList;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("siteList")
   public void setSiteList(List<String> siteList) {
      this.siteList = siteList;
   }

   @JsonProperty("siteList")
   public List<String> getSiteList() {
      return this.siteList;
   }
}
