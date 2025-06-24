package com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveVideoContent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TagInfo implements Serializable {
   private Long tagId;
   private String tagName;
   private Long thirdClassifyId;

   @JsonProperty("tagId")
   public void setTagId(Long tagId) {
      this.tagId = tagId;
   }

   @JsonProperty("tagId")
   public Long getTagId() {
      return this.tagId;
   }

   @JsonProperty("tagName")
   public void setTagName(String tagName) {
      this.tagName = tagName;
   }

   @JsonProperty("tagName")
   public String getTagName() {
      return this.tagName;
   }

   @JsonProperty("thirdClassifyId")
   public void setThirdClassifyId(Long thirdClassifyId) {
      this.thirdClassifyId = thirdClassifyId;
   }

   @JsonProperty("thirdClassifyId")
   public Long getThirdClassifyId() {
      return this.thirdClassifyId;
   }
}
