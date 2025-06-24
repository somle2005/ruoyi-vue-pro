package com.jd.open.api.sdk.domain.yjs.StoreClient.response.batchQueryStorePOIs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StorePOIResponse implements Serializable {
   private String msg;
   private Integer code;
   private List<StorePOI> data;
   private Integer totalPage;
   private int pageSize;
   private Integer totalCount;
   private int pageNum;
   private String cursorId;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(List<StorePOI> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<StorePOI> getData() {
      return this.data;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("pageNum")
   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   @JsonProperty("pageNum")
   public int getPageNum() {
      return this.pageNum;
   }

   @JsonProperty("cursorId")
   public void setCursorId(String cursorId) {
      this.cursorId = cursorId;
   }

   @JsonProperty("cursorId")
   public String getCursorId() {
      return this.cursorId;
   }
}
