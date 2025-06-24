package com.jd.open.api.sdk.domain.ware.SizeHelperTemplateService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Template implements Serializable {
   private Long id;
   private Long templateType;
   private String title;
   private String content;
   private Integer isHalfSize;
   private Integer status;
   private List<Attribute> attrList;
   private List<Long> wareIdList;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("templateType")
   public void setTemplateType(Long templateType) {
      this.templateType = templateType;
   }

   @JsonProperty("templateType")
   public Long getTemplateType() {
      return this.templateType;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("isHalfSize")
   public void setIsHalfSize(Integer isHalfSize) {
      this.isHalfSize = isHalfSize;
   }

   @JsonProperty("isHalfSize")
   public Integer getIsHalfSize() {
      return this.isHalfSize;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("attrList")
   public void setAttrList(List<Attribute> attrList) {
      this.attrList = attrList;
   }

   @JsonProperty("attrList")
   public List<Attribute> getAttrList() {
      return this.attrList;
   }

   @JsonProperty("wareIdList")
   public void setWareIdList(List<Long> wareIdList) {
      this.wareIdList = wareIdList;
   }

   @JsonProperty("wareIdList")
   public List<Long> getWareIdList() {
      return this.wareIdList;
   }
}
