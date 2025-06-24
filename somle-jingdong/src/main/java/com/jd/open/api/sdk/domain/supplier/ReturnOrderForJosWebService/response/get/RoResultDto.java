package com.jd.open.api.sdk.domain.supplier.ReturnOrderForJosWebService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RoResultDto implements Serializable {
   private Integer pageIndex;
   private Integer pageSize;
   private Integer recordCount;
   private List<RoDto> roDtoList;

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("roDtoList")
   public void setRoDtoList(List<RoDto> roDtoList) {
      this.roDtoList = roDtoList;
   }

   @JsonProperty("roDtoList")
   public List<RoDto> getRoDtoList() {
      return this.roDtoList;
   }
}
