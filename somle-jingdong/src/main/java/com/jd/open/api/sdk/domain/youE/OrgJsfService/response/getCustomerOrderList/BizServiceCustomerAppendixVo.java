package com.jd.open.api.sdk.domain.youE.OrgJsfService.response.getCustomerOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BizServiceCustomerAppendixVo implements Serializable {
   private Long size;
   private String title;
   private String type;
   private String url;

   @JsonProperty("size")
   public void setSize(Long size) {
      this.size = size;
   }

   @JsonProperty("size")
   public Long getSize() {
      return this.size;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }
}
