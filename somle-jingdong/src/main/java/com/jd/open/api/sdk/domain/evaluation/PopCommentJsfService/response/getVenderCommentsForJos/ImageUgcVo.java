package com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getVenderCommentsForJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImageUgcVo implements Serializable {
   private Long id;
   private String imgUrl;
   private String imgTitle;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgTitle")
   public void setImgTitle(String imgTitle) {
      this.imgTitle = imgTitle;
   }

   @JsonProperty("imgTitle")
   public String getImgTitle() {
      return this.imgTitle;
   }
}
