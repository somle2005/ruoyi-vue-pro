package com.jd.open.api.sdk.domain.josaq.UserRelatedRpcService.response.getUserInfoByXId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OAuthUserInfo implements Serializable {
   private String nickName;
   private String imageUrl;
   private String gendar;

   @JsonProperty("nickName")
   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   @JsonProperty("nickName")
   public String getNickName() {
      return this.nickName;
   }

   @JsonProperty("imageUrl")
   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   @JsonProperty("imageUrl")
   public String getImageUrl() {
      return this.imageUrl;
   }

   @JsonProperty("gendar")
   public void setGendar(String gendar) {
      this.gendar = gendar;
   }

   @JsonProperty("gendar")
   public String getGendar() {
      return this.gendar;
   }
}
