package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class LwbGoodsItem implements Serializable {
   private Long id;
   private Long wbId;
   private Long sellerId;
   private Long deptId;
   private String skuCode;
   private String skuName;
   private Integer quantity;
   private Date createTime;
   private Date updateTime;
   private String createUser;
   private String updateUser;
   private Byte yn;
   private Byte operateType;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("wbId")
   public void setWbId(Long wbId) {
      this.wbId = wbId;
   }

   @JsonProperty("wbId")
   public Long getWbId() {
      return this.wbId;
   }

   @JsonProperty("sellerId")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("sellerId")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("deptId")
   public void setDeptId(Long deptId) {
      this.deptId = deptId;
   }

   @JsonProperty("deptId")
   public Long getDeptId() {
      return this.deptId;
   }

   @JsonProperty("skuCode")
   public void setSkuCode(String skuCode) {
      this.skuCode = skuCode;
   }

   @JsonProperty("skuCode")
   public String getSkuCode() {
      return this.skuCode;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("quantity")
   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public Integer getQuantity() {
      return this.quantity;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("updateUser")
   public void setUpdateUser(String updateUser) {
      this.updateUser = updateUser;
   }

   @JsonProperty("updateUser")
   public String getUpdateUser() {
      return this.updateUser;
   }

   @JsonProperty("yn")
   public void setYn(Byte yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Byte getYn() {
      return this.yn;
   }

   @JsonProperty("operateType")
   public void setOperateType(Byte operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Byte getOperateType() {
      return this.operateType;
   }
}
