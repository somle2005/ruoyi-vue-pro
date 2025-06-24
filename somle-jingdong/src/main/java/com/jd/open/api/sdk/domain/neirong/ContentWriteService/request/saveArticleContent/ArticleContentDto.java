package com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveArticleContent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ArticleContentDto implements Serializable {
   private String ext;
   private Integer contentSource;
   private List<String> indexImages;
   private String subTitle;
   private Long creatorId;
   private Integer style;
   private List<DescInfo> descriptionStrs;
   private Integer subChannelId;
   private String title;
   private String introduction;
   private List<TagInfo> nhTagInfos;
   private List<String> skuIds;
   private String talentIp;

   @JsonProperty("ext")
   public void setExt(String ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public String getExt() {
      return this.ext;
   }

   @JsonProperty("contentSource")
   public void setContentSource(Integer contentSource) {
      this.contentSource = contentSource;
   }

   @JsonProperty("contentSource")
   public Integer getContentSource() {
      return this.contentSource;
   }

   @JsonProperty("indexImages")
   public void setIndexImages(List<String> indexImages) {
      this.indexImages = indexImages;
   }

   @JsonProperty("indexImages")
   public List<String> getIndexImages() {
      return this.indexImages;
   }

   @JsonProperty("subTitle")
   public void setSubTitle(String subTitle) {
      this.subTitle = subTitle;
   }

   @JsonProperty("subTitle")
   public String getSubTitle() {
      return this.subTitle;
   }

   @JsonProperty("creatorId")
   public void setCreatorId(Long creatorId) {
      this.creatorId = creatorId;
   }

   @JsonProperty("creatorId")
   public Long getCreatorId() {
      return this.creatorId;
   }

   @JsonProperty("style")
   public void setStyle(Integer style) {
      this.style = style;
   }

   @JsonProperty("style")
   public Integer getStyle() {
      return this.style;
   }

   @JsonProperty("descriptionStrs")
   public void setDescriptionStrs(List<DescInfo> descriptionStrs) {
      this.descriptionStrs = descriptionStrs;
   }

   @JsonProperty("descriptionStrs")
   public List<DescInfo> getDescriptionStrs() {
      return this.descriptionStrs;
   }

   @JsonProperty("subChannelId")
   public void setSubChannelId(Integer subChannelId) {
      this.subChannelId = subChannelId;
   }

   @JsonProperty("subChannelId")
   public Integer getSubChannelId() {
      return this.subChannelId;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("introduction")
   public void setIntroduction(String introduction) {
      this.introduction = introduction;
   }

   @JsonProperty("introduction")
   public String getIntroduction() {
      return this.introduction;
   }

   @JsonProperty("nhTagInfos")
   public void setNhTagInfos(List<TagInfo> nhTagInfos) {
      this.nhTagInfos = nhTagInfos;
   }

   @JsonProperty("nhTagInfos")
   public List<TagInfo> getNhTagInfos() {
      return this.nhTagInfos;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(List<String> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public List<String> getSkuIds() {
      return this.skuIds;
   }

   @JsonProperty("talentIp")
   public void setTalentIp(String talentIp) {
      this.talentIp = talentIp;
   }

   @JsonProperty("talentIp")
   public String getTalentIp() {
      return this.talentIp;
   }
}
