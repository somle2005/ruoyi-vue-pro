package com.jd.open.api.sdk.domain.alpha.AlphaService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Carrier implements Serializable {
   private Integer id;
   private String name;
   private Integer type;
   private String description;
   private String agreeFlag;
   private String useFlag;
   private Integer sort;
   private String comments;
   private String printFlag;
   private String templateName;
   private String pin;
   private String jdAccount;
   private String link;
   private Double score;
   private Integer isDefault;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }

   @JsonProperty("agreeFlag")
   public void setAgreeFlag(String agreeFlag) {
      this.agreeFlag = agreeFlag;
   }

   @JsonProperty("agreeFlag")
   public String getAgreeFlag() {
      return this.agreeFlag;
   }

   @JsonProperty("useFlag")
   public void setUseFlag(String useFlag) {
      this.useFlag = useFlag;
   }

   @JsonProperty("useFlag")
   public String getUseFlag() {
      return this.useFlag;
   }

   @JsonProperty("sort")
   public void setSort(Integer sort) {
      this.sort = sort;
   }

   @JsonProperty("sort")
   public Integer getSort() {
      return this.sort;
   }

   @JsonProperty("comments")
   public void setComments(String comments) {
      this.comments = comments;
   }

   @JsonProperty("comments")
   public String getComments() {
      return this.comments;
   }

   @JsonProperty("printFlag")
   public void setPrintFlag(String printFlag) {
      this.printFlag = printFlag;
   }

   @JsonProperty("printFlag")
   public String getPrintFlag() {
      return this.printFlag;
   }

   @JsonProperty("templateName")
   public void setTemplateName(String templateName) {
      this.templateName = templateName;
   }

   @JsonProperty("templateName")
   public String getTemplateName() {
      return this.templateName;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("jdAccount")
   public void setJdAccount(String jdAccount) {
      this.jdAccount = jdAccount;
   }

   @JsonProperty("jdAccount")
   public String getJdAccount() {
      return this.jdAccount;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }

   @JsonProperty("score")
   public void setScore(Double score) {
      this.score = score;
   }

   @JsonProperty("score")
   public Double getScore() {
      return this.score;
   }

   @JsonProperty("isDefault")
   public void setIsDefault(Integer isDefault) {
      this.isDefault = isDefault;
   }

   @JsonProperty("isDefault")
   public Integer getIsDefault() {
      return this.isDefault;
   }
}
