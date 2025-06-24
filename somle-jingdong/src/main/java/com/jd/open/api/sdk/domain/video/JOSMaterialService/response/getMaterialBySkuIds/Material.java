package com.jd.open.api.sdk.domain.video.JOSMaterialService.response.getMaterialBySkuIds;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Material implements Serializable {
   private Long videoId;
   private Integer type;
   private String verifyDesc;
   private String url;
   private String content;
   private Integer order;
   private Integer status;

   @JsonProperty("videoId")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public Long getVideoId() {
      return this.videoId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("verifyDesc")
   public void setVerifyDesc(String verifyDesc) {
      this.verifyDesc = verifyDesc;
   }

   @JsonProperty("verifyDesc")
   public String getVerifyDesc() {
      return this.verifyDesc;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("order")
   public void setOrder(Integer order) {
      this.order = order;
   }

   @JsonProperty("order")
   public Integer getOrder() {
      return this.order;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
