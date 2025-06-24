package com.jd.open.api.sdk.domain.unboundedShop.StoreCategoryProvider.response.queryMetaAttrStoreQualificationList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MetaAttrTO implements Serializable {
   private Integer nullable;
   private Integer length;
   private String categoryName;
   private String name;
   private String comment;
   private Long id;
   private Long categoryId;

   @JsonProperty("nullable")
   public void setNullable(Integer nullable) {
      this.nullable = nullable;
   }

   @JsonProperty("nullable")
   public Integer getNullable() {
      return this.nullable;
   }

   @JsonProperty("length")
   public void setLength(Integer length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Integer getLength() {
      return this.length;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("comment")
   public void setComment(String comment) {
      this.comment = comment;
   }

   @JsonProperty("comment")
   public String getComment() {
      return this.comment;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
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
