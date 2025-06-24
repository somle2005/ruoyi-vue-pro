package com.jd.open.api.sdk.domain.B2B.B2bUserToPoolReadService.response.queryUserToPool;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class B2bUserToPoolDto implements Serializable {
   private String mappingId;
   private String attributeId;
   private Integer mappingLevel;
   private Long b2bMappingId;
   private Integer cateType;
   private Integer wareMappingType;
   private String bizPoolType;
   private Date modified;
   private String ext;
   private String editor;
   private String creator;
   private Date created;
   private Long b2bPoolId;
   private String b2bPoolName;
   private String routerParam;
   private Integer cateId;
   private Integer mappingType;
   private String thirdMappingId;
   private String outerMappingId;
   private Integer dataSource;
   private Integer status;

   @JsonProperty("mappingId")
   public void setMappingId(String mappingId) {
      this.mappingId = mappingId;
   }

   @JsonProperty("mappingId")
   public String getMappingId() {
      return this.mappingId;
   }

   @JsonProperty("attributeId")
   public void setAttributeId(String attributeId) {
      this.attributeId = attributeId;
   }

   @JsonProperty("attributeId")
   public String getAttributeId() {
      return this.attributeId;
   }

   @JsonProperty("mappingLevel")
   public void setMappingLevel(Integer mappingLevel) {
      this.mappingLevel = mappingLevel;
   }

   @JsonProperty("mappingLevel")
   public Integer getMappingLevel() {
      return this.mappingLevel;
   }

   @JsonProperty("b2bMappingId")
   public void setB2bMappingId(Long b2bMappingId) {
      this.b2bMappingId = b2bMappingId;
   }

   @JsonProperty("b2bMappingId")
   public Long getB2bMappingId() {
      return this.b2bMappingId;
   }

   @JsonProperty("cateType")
   public void setCateType(Integer cateType) {
      this.cateType = cateType;
   }

   @JsonProperty("cateType")
   public Integer getCateType() {
      return this.cateType;
   }

   @JsonProperty("wareMappingType")
   public void setWareMappingType(Integer wareMappingType) {
      this.wareMappingType = wareMappingType;
   }

   @JsonProperty("wareMappingType")
   public Integer getWareMappingType() {
      return this.wareMappingType;
   }

   @JsonProperty("bizPoolType")
   public void setBizPoolType(String bizPoolType) {
      this.bizPoolType = bizPoolType;
   }

   @JsonProperty("bizPoolType")
   public String getBizPoolType() {
      return this.bizPoolType;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("ext")
   public void setExt(String ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public String getExt() {
      return this.ext;
   }

   @JsonProperty("editor")
   public void setEditor(String editor) {
      this.editor = editor;
   }

   @JsonProperty("editor")
   public String getEditor() {
      return this.editor;
   }

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("b2bPoolId")
   public void setB2bPoolId(Long b2bPoolId) {
      this.b2bPoolId = b2bPoolId;
   }

   @JsonProperty("b2bPoolId")
   public Long getB2bPoolId() {
      return this.b2bPoolId;
   }

   @JsonProperty("b2bPoolName")
   public void setB2bPoolName(String b2bPoolName) {
      this.b2bPoolName = b2bPoolName;
   }

   @JsonProperty("b2bPoolName")
   public String getB2bPoolName() {
      return this.b2bPoolName;
   }

   @JsonProperty("routerParam")
   public void setRouterParam(String routerParam) {
      this.routerParam = routerParam;
   }

   @JsonProperty("routerParam")
   public String getRouterParam() {
      return this.routerParam;
   }

   @JsonProperty("cateId")
   public void setCateId(Integer cateId) {
      this.cateId = cateId;
   }

   @JsonProperty("cateId")
   public Integer getCateId() {
      return this.cateId;
   }

   @JsonProperty("mappingType")
   public void setMappingType(Integer mappingType) {
      this.mappingType = mappingType;
   }

   @JsonProperty("mappingType")
   public Integer getMappingType() {
      return this.mappingType;
   }

   @JsonProperty("thirdMappingId")
   public void setThirdMappingId(String thirdMappingId) {
      this.thirdMappingId = thirdMappingId;
   }

   @JsonProperty("thirdMappingId")
   public String getThirdMappingId() {
      return this.thirdMappingId;
   }

   @JsonProperty("outerMappingId")
   public void setOuterMappingId(String outerMappingId) {
      this.outerMappingId = outerMappingId;
   }

   @JsonProperty("outerMappingId")
   public String getOuterMappingId() {
      return this.outerMappingId;
   }

   @JsonProperty("dataSource")
   public void setDataSource(Integer dataSource) {
      this.dataSource = dataSource;
   }

   @JsonProperty("dataSource")
   public Integer getDataSource() {
      return this.dataSource;
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
