package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosHousePublishImg implements Serializable {
   private Integer imgType;
   private String imgTitle;
   private String imgUrl;

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

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }
}
