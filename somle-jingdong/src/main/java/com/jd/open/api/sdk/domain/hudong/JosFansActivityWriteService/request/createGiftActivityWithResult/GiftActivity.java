package com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.request.createGiftActivityWithResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GiftActivity implements Serializable {
   private Integer isPrize;
   private List<GiftRuleActivity> giftRuleActivityList;
   private String descInfo;
   private String modifier;
   private String sourceLink;
   private Integer isSinglePrize;
   private Integer channel;
   private Integer source;
   private String supplierCode;
   private Integer autoStop;
   private Date modified;
   private Long rfId;
   private Date startTime;
   private Long id;
   private Date validate;
   private Integer isEverydayAward;
   private String creator;
   private String subtitleName;
   private Integer riskValue;
   private Date created;
   private String taskIds;
   private String name;
   private String sourceCloseLink;
   private String pictureLink;
   private Date endTime;
   private String sourceName;
   private String ext;

   @JsonProperty("isPrize")
   public void setIsPrize(Integer isPrize) {
      this.isPrize = isPrize;
   }

   @JsonProperty("isPrize")
   public Integer getIsPrize() {
      return this.isPrize;
   }

   @JsonProperty("giftRuleActivityList")
   public void setGiftRuleActivityList(List<GiftRuleActivity> giftRuleActivityList) {
      this.giftRuleActivityList = giftRuleActivityList;
   }

   @JsonProperty("giftRuleActivityList")
   public List<GiftRuleActivity> getGiftRuleActivityList() {
      return this.giftRuleActivityList;
   }

   @JsonProperty("descInfo")
   public void setDescInfo(String descInfo) {
      this.descInfo = descInfo;
   }

   @JsonProperty("descInfo")
   public String getDescInfo() {
      return this.descInfo;
   }

   @JsonProperty("modifier")
   public void setModifier(String modifier) {
      this.modifier = modifier;
   }

   @JsonProperty("modifier")
   public String getModifier() {
      return this.modifier;
   }

   @JsonProperty("sourceLink")
   public void setSourceLink(String sourceLink) {
      this.sourceLink = sourceLink;
   }

   @JsonProperty("sourceLink")
   public String getSourceLink() {
      return this.sourceLink;
   }

   @JsonProperty("isSinglePrize")
   public void setIsSinglePrize(Integer isSinglePrize) {
      this.isSinglePrize = isSinglePrize;
   }

   @JsonProperty("isSinglePrize")
   public Integer getIsSinglePrize() {
      return this.isSinglePrize;
   }

   @JsonProperty("channel")
   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public Integer getChannel() {
      return this.channel;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }

   @JsonProperty("supplierCode")
   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   @JsonProperty("supplierCode")
   public String getSupplierCode() {
      return this.supplierCode;
   }

   @JsonProperty("autoStop")
   public void setAutoStop(Integer autoStop) {
      this.autoStop = autoStop;
   }

   @JsonProperty("autoStop")
   public Integer getAutoStop() {
      return this.autoStop;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("rfId")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long getRfId() {
      return this.rfId;
   }

   @JsonProperty("startTime")
   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public Date getStartTime() {
      return this.startTime;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("validate")
   public void setValidate(Date validate) {
      this.validate = validate;
   }

   @JsonProperty("validate")
   public Date getValidate() {
      return this.validate;
   }

   @JsonProperty("isEverydayAward")
   public void setIsEverydayAward(Integer isEverydayAward) {
      this.isEverydayAward = isEverydayAward;
   }

   @JsonProperty("isEverydayAward")
   public Integer getIsEverydayAward() {
      return this.isEverydayAward;
   }

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("subtitleName")
   public void setSubtitleName(String subtitleName) {
      this.subtitleName = subtitleName;
   }

   @JsonProperty("subtitleName")
   public String getSubtitleName() {
      return this.subtitleName;
   }

   @JsonProperty("riskValue")
   public void setRiskValue(Integer riskValue) {
      this.riskValue = riskValue;
   }

   @JsonProperty("riskValue")
   public Integer getRiskValue() {
      return this.riskValue;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("taskIds")
   public void setTaskIds(String taskIds) {
      this.taskIds = taskIds;
   }

   @JsonProperty("taskIds")
   public String getTaskIds() {
      return this.taskIds;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("sourceCloseLink")
   public void setSourceCloseLink(String sourceCloseLink) {
      this.sourceCloseLink = sourceCloseLink;
   }

   @JsonProperty("sourceCloseLink")
   public String getSourceCloseLink() {
      return this.sourceCloseLink;
   }

   @JsonProperty("pictureLink")
   public void setPictureLink(String pictureLink) {
      this.pictureLink = pictureLink;
   }

   @JsonProperty("pictureLink")
   public String getPictureLink() {
      return this.pictureLink;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("sourceName")
   public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
   }

   @JsonProperty("sourceName")
   public String getSourceName() {
      return this.sourceName;
   }

   @JsonProperty("ext")
   public void setExt(String ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public String getExt() {
      return this.ext;
   }
}
