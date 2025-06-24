package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class LwbStatus implements Serializable {
   private Long id;
   private Long wbId;
   private Long sellerId;
   private Long deptId;
   private Integer status;
   private String operation;
   private String operateSystem;
   private Date operateDate;
   private Byte bizType;
   private Date createTime;
   private Date updateTime;
   private String createUser;
   private String updateUser;
   private Byte yn;
   private String statusDesc;
   private String packageBarcode;

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

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("operation")
   public void setOperation(String operation) {
      this.operation = operation;
   }

   @JsonProperty("operation")
   public String getOperation() {
      return this.operation;
   }

   @JsonProperty("operateSystem")
   public void setOperateSystem(String operateSystem) {
      this.operateSystem = operateSystem;
   }

   @JsonProperty("operateSystem")
   public String getOperateSystem() {
      return this.operateSystem;
   }

   @JsonProperty("operateDate")
   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   @JsonProperty("operateDate")
   public Date getOperateDate() {
      return this.operateDate;
   }

   @JsonProperty("bizType")
   public void setBizType(Byte bizType) {
      this.bizType = bizType;
   }

   @JsonProperty("bizType")
   public Byte getBizType() {
      return this.bizType;
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

   @JsonProperty("statusDesc")
   public void setStatusDesc(String statusDesc) {
      this.statusDesc = statusDesc;
   }

   @JsonProperty("statusDesc")
   public String getStatusDesc() {
      return this.statusDesc;
   }

   @JsonProperty("packageBarcode")
   public void setPackageBarcode(String packageBarcode) {
      this.packageBarcode = packageBarcode;
   }

   @JsonProperty("packageBarcode")
   public String getPackageBarcode() {
      return this.packageBarcode;
   }
}
