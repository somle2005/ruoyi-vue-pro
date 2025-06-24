package com.jd.open.api.sdk.domain.plgz.CategoryOperateIsvFacade.response.queryOperateCategoryTree;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CategoryOperateDto implements Serializable {
   private Long fid;
   private String msg;
   private String reminderCode;
   private Boolean canSelect;
   private String code;
   private Integer level;
   private ReminderDto pcReminder;
   private Boolean leaf;
   private List<CategoryOperateDto> subCategories;
   private Boolean canView;
   private String categoryName;
   private ReminderDto appReminder;
   private Boolean risk;
   private Long categoryId;

   @JsonProperty("fid")
   public void setFid(Long fid) {
      this.fid = fid;
   }

   @JsonProperty("fid")
   public Long getFid() {
      return this.fid;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("reminderCode")
   public void setReminderCode(String reminderCode) {
      this.reminderCode = reminderCode;
   }

   @JsonProperty("reminderCode")
   public String getReminderCode() {
      return this.reminderCode;
   }

   @JsonProperty("canSelect")
   public void setCanSelect(Boolean canSelect) {
      this.canSelect = canSelect;
   }

   @JsonProperty("canSelect")
   public Boolean getCanSelect() {
      return this.canSelect;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("level")
   public void setLevel(Integer level) {
      this.level = level;
   }

   @JsonProperty("level")
   public Integer getLevel() {
      return this.level;
   }

   @JsonProperty("pcReminder")
   public void setPcReminder(ReminderDto pcReminder) {
      this.pcReminder = pcReminder;
   }

   @JsonProperty("pcReminder")
   public ReminderDto getPcReminder() {
      return this.pcReminder;
   }

   @JsonProperty("leaf")
   public void setLeaf(Boolean leaf) {
      this.leaf = leaf;
   }

   @JsonProperty("leaf")
   public Boolean getLeaf() {
      return this.leaf;
   }

   @JsonProperty("subCategories")
   public void setSubCategories(List<CategoryOperateDto> subCategories) {
      this.subCategories = subCategories;
   }

   @JsonProperty("subCategories")
   public List<CategoryOperateDto> getSubCategories() {
      return this.subCategories;
   }

   @JsonProperty("canView")
   public void setCanView(Boolean canView) {
      this.canView = canView;
   }

   @JsonProperty("canView")
   public Boolean getCanView() {
      return this.canView;
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

   @JsonProperty("risk")
   public void setRisk(Boolean risk) {
      this.risk = risk;
   }

   @JsonProperty("risk")
   public Boolean getRisk() {
      return this.risk;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}
