package com.jd.open.api.sdk.domain.user.UserRelatedRpcService.response.getUserInfoByOpenId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OAuthUserInfo implements Serializable {
   private String nickName;
   private String imageUrl;
   private Integer gendar;

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
   public void setGendar(Integer gendar) {
      this.gendar = gendar;
   }

   @JsonProperty("gendar")
   public Integer getGendar() {
      return this.gendar;
   }
}
