package com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getVenderCommentsForJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PopCommentJosVo implements Serializable {
   private String commentId;
   private String skuid;
   private String content;
   private Date creationTime;
   private String skuImage;
   private String skuName;
   private int replyCount;
   private int status;
   private int score;
   private int usefulCount;
   private Boolean isVenderReply;
   private String nickName;
   private List<PopCommentReplyVo> replies;
   private List<ImageUgcVo> images;
   private List<VideoUgcVo> videos;
   private int imiageStatus;
   private String pin;
   private Long orderId;
   private String openIdBuyer;
   private String xidBuyer;
   private String encryptOrderId;

   @JsonProperty("commentId")
   public void setCommentId(String commentId) {
      this.commentId = commentId;
   }

   @JsonProperty("commentId")
   public String getCommentId() {
      return this.commentId;
   }

   @JsonProperty("skuid")
   public void setSkuid(String skuid) {
      this.skuid = skuid;
   }

   @JsonProperty("skuid")
   public String getSkuid() {
      return this.skuid;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("creationTime")
   public void setCreationTime(Date creationTime) {
      this.creationTime = creationTime;
   }

   @JsonProperty("creationTime")
   public Date getCreationTime() {
      return this.creationTime;
   }

   @JsonProperty("skuImage")
   public void setSkuImage(String skuImage) {
      this.skuImage = skuImage;
   }

   @JsonProperty("skuImage")
   public String getSkuImage() {
      return this.skuImage;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("replyCount")
   public void setReplyCount(int replyCount) {
      this.replyCount = replyCount;
   }

   @JsonProperty("replyCount")
   public int getReplyCount() {
      return this.replyCount;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("score")
   public void setScore(int score) {
      this.score = score;
   }

   @JsonProperty("score")
   public int getScore() {
      return this.score;
   }

   @JsonProperty("usefulCount")
   public void setUsefulCount(int usefulCount) {
      this.usefulCount = usefulCount;
   }

   @JsonProperty("usefulCount")
   public int getUsefulCount() {
      return this.usefulCount;
   }

   @JsonProperty("isVenderReply")
   public void setIsVenderReply(Boolean isVenderReply) {
      this.isVenderReply = isVenderReply;
   }

   @JsonProperty("isVenderReply")
   public Boolean getIsVenderReply() {
      return this.isVenderReply;
   }

   @JsonProperty("nickName")
   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   @JsonProperty("nickName")
   public String getNickName() {
      return this.nickName;
   }

   @JsonProperty("replies")
   public void setReplies(List<PopCommentReplyVo> replies) {
      this.replies = replies;
   }

   @JsonProperty("replies")
   public List<PopCommentReplyVo> getReplies() {
      return this.replies;
   }

   @JsonProperty("images")
   public void setImages(List<ImageUgcVo> images) {
      this.images = images;
   }

   @JsonProperty("images")
   public List<ImageUgcVo> getImages() {
      return this.images;
   }

   @JsonProperty("videos")
   public void setVideos(List<VideoUgcVo> videos) {
      this.videos = videos;
   }

   @JsonProperty("videos")
   public List<VideoUgcVo> getVideos() {
      return this.videos;
   }

   @JsonProperty("imiageStatus")
   public void setImiageStatus(int imiageStatus) {
      this.imiageStatus = imiageStatus;
   }

   @JsonProperty("imiageStatus")
   public int getImiageStatus() {
      return this.imiageStatus;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }

   @JsonProperty("encrypt_orderId")
   public void setEncryptOrderId(String encryptOrderId) {
      this.encryptOrderId = encryptOrderId;
   }

   @JsonProperty("encrypt_orderId")
   public String getEncryptOrderId() {
      return this.encryptOrderId;
   }
}
