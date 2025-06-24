package com.jd.open.api.sdk.domain.seller.VenderShopCategoryJosService.response.findSubShopCategoriesByParentCid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class VenderShopCategory implements Serializable {
   private Long cid;
   private Long venderId;
   private Long shopId;
   private Long parentCid;
   private Integer orderNo;
   private String name;
   private Boolean isOpen;
   private Boolean isHomeShow;
   private Integer status;
   private Date createTime;
   private Date modifyTime;

   @JsonProperty("cid")
   public void setCid(Long cid) {
      this.cid = cid;
   }

   @JsonProperty("cid")
   public Long getCid() {
      return this.cid;
   }

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("shop_id")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shop_id")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("parent_cid")
   public void setParentCid(Long parentCid) {
      this.parentCid = parentCid;
   }

   @JsonProperty("parent_cid")
   public Long getParentCid() {
      return this.parentCid;
   }

   @JsonProperty("order_no")
   public void setOrderNo(Integer orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("order_no")
   public Integer getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("is_open")
   public void setIsOpen(Boolean isOpen) {
      this.isOpen = isOpen;
   }

   @JsonProperty("is_open")
   public Boolean getIsOpen() {
      return this.isOpen;
   }

   @JsonProperty("is_home_show")
   public void setIsHomeShow(Boolean isHomeShow) {
      this.isHomeShow = isHomeShow;
   }

   @JsonProperty("is_home_show")
   public Boolean getIsHomeShow() {
      return this.isHomeShow;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("create_time")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("create_time")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("modify_time")
   public void setModifyTime(Date modifyTime) {
      this.modifyTime = modifyTime;
   }

   @JsonProperty("modify_time")
   public Date getModifyTime() {
      return this.modifyTime;
   }
}
