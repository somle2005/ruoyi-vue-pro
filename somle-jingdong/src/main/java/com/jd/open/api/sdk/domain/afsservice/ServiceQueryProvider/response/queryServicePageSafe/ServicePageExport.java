package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.queryServicePageSafe;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ServicePageExport implements Serializable {
   private int totalNum;
   private Integer pageSize;
   private Integer pageNumer;
   private List<ServiceExport> serviceExportList;

   @JsonProperty("totalNum")
   public void setTotalNum(int totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public int getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageNumer")
   public void setPageNumer(Integer pageNumer) {
      this.pageNumer = pageNumer;
   }

   @JsonProperty("pageNumer")
   public Integer getPageNumer() {
      return this.pageNumer;
   }

   @JsonProperty("serviceExportList")
   public void setServiceExportList(List<ServiceExport> serviceExportList) {
      this.serviceExportList = serviceExportList;
   }

   @JsonProperty("serviceExportList")
   public List<ServiceExport> getServiceExportList() {
      return this.serviceExportList;
   }
}
