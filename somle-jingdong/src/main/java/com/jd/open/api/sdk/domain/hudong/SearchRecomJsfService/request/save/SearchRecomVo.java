package com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.request.save;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SearchRecomVo implements Serializable {
   private String content;
   private Integer recomTermType;
   private Long actId;
   private Integer recomSubtype;

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("recomTermType")
   public void setRecomTermType(Integer recomTermType) {
      this.recomTermType = recomTermType;
   }

   @JsonProperty("recomTermType")
   public Integer getRecomTermType() {
      return this.recomTermType;
   }

   @JsonProperty("actId")
   public void setActId(Long actId) {
      this.actId = actId;
   }

   @JsonProperty("actId")
   public Long getActId() {
      return this.actId;
   }

   @JsonProperty("recomSubtype")
   public void setRecomSubtype(Integer recomSubtype) {
      this.recomSubtype = recomSubtype;
   }

   @JsonProperty("recomSubtype")
   public Integer getRecomSubtype() {
      return this.recomSubtype;
   }
}
