package com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.response.queryOperateCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CategoryOperateDto implements Serializable {
   private Long fid;
   private Boolean canView;
   private Boolean canSelect;
   private Integer level;
   private String categoryName;
   private ReminderDto appReminder;
   private Long categoryId;
   private ReminderDto pcReminder;
   private List<CategoryOperateDto> subCategories;
   private Boolean leaf;

   @JsonProperty("fid")
   public void setFid(Long fid) {
      this.fid = fid;
   }

   @JsonProperty("fid")
   public Long getFid() {
      return this.fid;
   }

   @JsonProperty("canView")
   public void setCanView(Boolean canView) {
      this.canView = canView;
   }

   @JsonProperty("canView")
   public Boolean getCanView() {
      return this.canView;
   }

   @JsonProperty("canSelect")
   public void setCanSelect(Boolean canSelect) {
      this.canSelect = canSelect;
   }

   @JsonProperty("canSelect")
   public Boolean getCanSelect() {
      return this.canSelect;
   }

   @JsonProperty("level")
   public void setLevel(Integer level) {
      this.level = level;
   }

   @JsonProperty("level")
   public Integer getLevel() {
      return this.level;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("appReminder")
   public void setAppReminder(ReminderDto appReminder) {
      this.appReminder = appReminder;
   }

   @JsonProperty("appReminder")
   public ReminderDto getAppReminder() {
      return this.appReminder;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("pcReminder")
   public void setPcReminder(ReminderDto pcReminder) {
      this.pcReminder = pcReminder;
   }

   @JsonProperty("pcReminder")
   public ReminderDto getPcReminder() {
      return this.pcReminder;
   }

   @JsonProperty("subCategories")
   public void setSubCategories(List<CategoryOperateDto> subCategories) {
      this.subCategories = subCategories;
   }

   @JsonProperty("subCategories")
   public List<CategoryOperateDto> getSubCategories() {
      return this.subCategories;
   }

   @JsonProperty("leaf")
   public void setLeaf(Boolean leaf) {
      this.leaf = leaf;
   }

   @JsonProperty("leaf")
   public Boolean getLeaf() {
      return this.leaf;
   }
}
