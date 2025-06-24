package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ImgzoneCategory implements Serializable {
   private Long cateId;
   private String cateName;
   private Integer cateLevel;
   private Long parentCateId;
   private Integer cateOrder;
   private Date created;
   private Date modified;

   @JsonProperty("cate_id")
   public void setCateId(Long cateId) {
      this.cateId = cateId;
   }

   @JsonProperty("cate_id")
   public Long getCateId() {
      return this.cateId;
   }

   @JsonProperty("cate_name")
   public void setCateName(String cateName) {
      this.cateName = cateName;
   }

   @JsonProperty("cate_name")
   public String getCateName() {
      return this.cateName;
   }

   @JsonProperty("cate_level")
   public void setCateLevel(Integer cateLevel) {
      this.cateLevel = cateLevel;
   }

   @JsonProperty("cate_level")
   public Integer getCateLevel() {
      return this.cateLevel;
   }

   @JsonProperty("parent_cate_id")
   public void setParentCateId(Long parentCateId) {
      this.parentCateId = parentCateId;
   }

   @JsonProperty("parent_cate_id")
   public Long getParentCateId() {
      return this.parentCateId;
   }

   @JsonProperty("cate_order")
   public void setCateOrder(Integer cateOrder) {
      this.cateOrder = cateOrder;
   }

   @JsonProperty("cate_order")
   public Integer getCateOrder() {
      return this.cateOrder;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }
}
