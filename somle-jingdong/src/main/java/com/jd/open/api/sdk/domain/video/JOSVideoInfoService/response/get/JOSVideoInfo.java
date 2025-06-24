package com.jd.open.api.sdk.domain.video.JOSVideoInfoService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JOSVideoInfo implements Serializable {
   private Long videoId;
   private String videoName;
   private String videoDesc;
   private Long venderId;
   private Integer videoSize;
   private String cover;
   private String verifier;
   private String verifyDesc;
   private Date createdDate;
   private Date modifiedDate;
   private Integer status;
   private String applyReason;
   private Integer time;
   private Long agentVideoId;
   private Integer videoType;
   private String playUrl;
   private Integer relApplyCount;
   private Integer relPassCount;
   private Integer relRejectCount;

   @JsonProperty("video_id")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("video_id")
   public Long getVideoId() {
      return this.videoId;
   }

   @JsonProperty("video_name")
   public void setVideoName(String videoName) {
      this.videoName = videoName;
   }

   @JsonProperty("video_name")
   public String getVideoName() {
      return this.videoName;
   }

   @JsonProperty("video_desc")
   public void setVideoDesc(String videoDesc) {
      this.videoDesc = videoDesc;
   }

   @JsonProperty("video_desc")
   public String getVideoDesc() {
      return this.videoDesc;
   }

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("video_size")
   public void setVideoSize(Integer videoSize) {
      this.videoSize = videoSize;
   }

   @JsonProperty("video_size")
   public Integer getVideoSize() {
      return this.videoSize;
   }

   @JsonProperty("cover")
   public void setCover(String cover) {
      this.cover = cover;
   }

   @JsonProperty("cover")
   public String getCover() {
      return this.cover;
   }

   @JsonProperty("verifier")
   public void setVerifier(String verifier) {
      this.verifier = verifier;
   }

   @JsonProperty("verifier")
   public String getVerifier() {
      return this.verifier;
   }

   @JsonProperty("verify_desc")
   public void setVerifyDesc(String verifyDesc) {
      this.verifyDesc = verifyDesc;
   }

   @JsonProperty("verify_desc")
   public String getVerifyDesc() {
      return this.verifyDesc;
   }

   @JsonProperty("created_date")
   public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
   }

   @JsonProperty("created_date")
   public Date getCreatedDate() {
      return this.createdDate;
   }

   @JsonProperty("modified_date")
   public void setModifiedDate(Date modifiedDate) {
      this.modifiedDate = modifiedDate;
   }

   @JsonProperty("modified_date")
   public Date getModifiedDate() {
      return this.modifiedDate;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("apply_reason")
   public void setApplyReason(String applyReason) {
      this.applyReason = applyReason;
   }

   @JsonProperty("apply_reason")
   public String getApplyReason() {
      return this.applyReason;
   }

   @JsonProperty("time")
   public void setTime(Integer time) {
      this.time = time;
   }

   @JsonProperty("time")
   public Integer getTime() {
      return this.time;
   }

   @JsonProperty("agent_video_id")
   public void setAgentVideoId(Long agentVideoId) {
      this.agentVideoId = agentVideoId;
   }

   @JsonProperty("agent_video_id")
   public Long getAgentVideoId() {
      return this.agentVideoId;
   }

   @JsonProperty("video_type")
   public void setVideoType(Integer videoType) {
      this.videoType = videoType;
   }

   @JsonProperty("video_type")
   public Integer getVideoType() {
      return this.videoType;
   }

   @JsonProperty("play_url")
   public void setPlayUrl(String playUrl) {
      this.playUrl = playUrl;
   }

   @JsonProperty("play_url")
   public String getPlayUrl() {
      return this.playUrl;
   }

   @JsonProperty("rel_apply_count")
   public void setRelApplyCount(Integer relApplyCount) {
      this.relApplyCount = relApplyCount;
   }

   @JsonProperty("rel_apply_count")
   public Integer getRelApplyCount() {
      return this.relApplyCount;
   }

   @JsonProperty("rel_pass_count")
   public void setRelPassCount(Integer relPassCount) {
      this.relPassCount = relPassCount;
   }

   @JsonProperty("rel_pass_count")
   public Integer getRelPassCount() {
      return this.relPassCount;
   }

   @JsonProperty("rel_reject_count")
   public void setRelRejectCount(Integer relRejectCount) {
      this.relRejectCount = relRejectCount;
   }

   @JsonProperty("rel_reject_count")
   public Integer getRelRejectCount() {
      return this.relRejectCount;
   }
}
