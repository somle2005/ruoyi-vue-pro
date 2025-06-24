package com.jd.open.api.sdk.domain.kdgjapi.WaybillAutoRecoverDetailApi.response.autoRecycleDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResponsePageDTO implements Serializable {
   private Integer curPage;
   private Integer pageSize;
   private Integer totalPage;
   private Integer totalRow;
   private Integer start;
   private Integer end;
   private List<WaybillAutoRecoverDetailDTO> result;

   @JsonProperty("curPage")
   public void setCurPage(Integer curPage) {
      this.curPage = curPage;
   }

   @JsonProperty("curPage")
   public Integer getCurPage() {
      return this.curPage;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("totalRow")
   public void setTotalRow(Integer totalRow) {
      this.totalRow = totalRow;
   }

   @JsonProperty("totalRow")
   public Integer getTotalRow() {
      return this.totalRow;
   }

   @JsonProperty("start")
   public void setStart(Integer start) {
      this.start = start;
   }

   @JsonProperty("start")
   public Integer getStart() {
      return this.start;
   }

   @JsonProperty("end")
   public void setEnd(Integer end) {
      this.end = end;
   }

   @JsonProperty("end")
   public Integer getEnd() {
      return this.end;
   }

   @JsonProperty("result")
   public void setResult(List<WaybillAutoRecoverDetailDTO> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<WaybillAutoRecoverDetailDTO> getResult() {
      return this.result;
   }
}
