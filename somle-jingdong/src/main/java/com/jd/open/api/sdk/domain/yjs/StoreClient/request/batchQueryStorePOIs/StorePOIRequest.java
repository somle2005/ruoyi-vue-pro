package com.jd.open.api.sdk.domain.yjs.StoreClient.request.batchQueryStorePOIs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StorePOIRequest implements Serializable {
   private int pageSize;
   private int pageNum;
   private String cursorId;

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
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
