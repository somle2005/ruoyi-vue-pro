package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosHousePublishImg implements Serializable {
   private String imgUrl;
   private Integer imgType;
   private String imgTitle;

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgType")
   public void setImgType(Integer imgType) {
      this.imgType = imgType;
   }

   @JsonProperty("imgType")
   public Integer getImgType() {
      return this.imgType;
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
