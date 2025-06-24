package com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.response.getSkuList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageDTO implements Serializable {
   private Long totalSize;
   private List<Map> content;

   @JsonProperty("totalSize")
   public void setTotalSize(Long totalSize) {
      this.totalSize = totalSize;
   }

   @JsonProperty("totalSize")
   public Long getTotalSize() {
      return this.totalSize;
   }

   @JsonProperty("content")
   public void setContent(List<Map> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<Map> getContent() {
      return this.content;
   }
}
