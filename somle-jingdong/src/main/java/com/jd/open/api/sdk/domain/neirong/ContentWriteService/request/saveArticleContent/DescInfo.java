package com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveArticleContent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DescInfo implements Serializable {
   private List<String> ids;
   private String id;
   private String type;
   private Object content;

   @JsonProperty("ids")
   public void setIds(List<String> ids) {
      this.ids = ids;
   }

   @JsonProperty("ids")
   public List<String> getIds() {
      return this.ids;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("content")
   public void setContent(Object content) {
      this.content = content;
   }

   @JsonProperty("content")
   public Object getContent() {
      return this.content;
   }
}
