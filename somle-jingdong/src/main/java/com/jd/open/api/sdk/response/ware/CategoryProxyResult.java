package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class CategoryProxyResult implements Serializable {
   private Long cid;
   private Long parentCid;
   private Long sellerId;
   private String cName;
   private Integer status;
   private Integer hasLeaf;
   private Integer lev;
   private Integer sortNumber;
   private Integer homeShow;
   private Date created;
   private Date modified;

   @JsonProperty("cid")
   public void setCid(Long cid) {
      this.cid = cid;
   }

   @JsonProperty("cid")
   public Long getCid() {
      return this.cid;
   }

   @JsonProperty("parent_cid")
   public void setParentCid(Long parentCid) {
      this.parentCid = parentCid;
   }

   @JsonProperty("parent_cid")
   public Long getParentCid() {
      return this.parentCid;
   }

   @JsonProperty("seller_id")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("seller_id")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("cname")
   public void setCName(String cName) {
      this.cName = cName;
   }

   @JsonProperty("cname")
   public String getCName() {
      return this.cName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("has_leaf")
   public void setHasLeaf(Integer hasLeaf) {
      this.hasLeaf = hasLeaf;
   }

   @JsonProperty("has_leaf")
   public Integer getHasLeaf() {
      return this.hasLeaf;
   }

   @JsonProperty("lev")
   public void setLev(Integer lev) {
      this.lev = lev;
   }

   @JsonProperty("lev")
   public Integer getLev() {
      return this.lev;
   }

   @JsonProperty("sort_number")
   public void setSortNumber(Integer sortNumber) {
      this.sortNumber = sortNumber;
   }

   @JsonProperty("sort_number")
   public Integer getSortNumber() {
      return this.sortNumber;
   }

   @JsonProperty("home_show")
   public void setHomeShow(Integer homeShow) {
      this.homeShow = homeShow;
   }

   @JsonProperty("home_show")
   public Integer getHomeShow() {
      return this.homeShow;
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
