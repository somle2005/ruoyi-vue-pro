package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceLogProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ServiceLog implements Serializable {
   private Long afsLogId;
   private Long serviceId;
   private Integer relationType;
   private String relationTypeName;
   private Integer operateType;
   private String operateTypeName;
   private String operateRemark;
   private String operatePin;
   private String operateName;
   private Date operateDate;
   private String extJsonStr;

   @JsonProperty("afsLogId")
   public void setAfsLogId(Long afsLogId) {
      this.afsLogId = afsLogId;
   }

   @JsonProperty("afsLogId")
   public Long getAfsLogId() {
      return this.afsLogId;
   }

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("relationType")
   public void setRelationType(Integer relationType) {
      this.relationType = relationType;
   }

   @JsonProperty("relationType")
   public Integer getRelationType() {
      return this.relationType;
   }

   @JsonProperty("relationTypeName")
   public void setRelationTypeName(String relationTypeName) {
      this.relationTypeName = relationTypeName;
   }

   @JsonProperty("relationTypeName")
   public String getRelationTypeName() {
      return this.relationTypeName;
   }

   @JsonProperty("operateType")
   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Integer getOperateType() {
      return this.operateType;
   }

   @JsonProperty("operateTypeName")
   public void setOperateTypeName(String operateTypeName) {
      this.operateTypeName = operateTypeName;
   }

   @JsonProperty("operateTypeName")
   public String getOperateTypeName() {
      return this.operateTypeName;
   }

   @JsonProperty("operateRemark")
   public void setOperateRemark(String operateRemark) {
      this.operateRemark = operateRemark;
   }

   @JsonProperty("operateRemark")
   public String getOperateRemark() {
      return this.operateRemark;
   }

   @JsonProperty("operatePin")
   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   @JsonProperty("operatePin")
   public String getOperatePin() {
      return this.operatePin;
   }

   @JsonProperty("operateName")
   public void setOperateName(String operateName) {
      this.operateName = operateName;
   }

   @JsonProperty("operateName")
   public String getOperateName() {
      return this.operateName;
   }

   @JsonProperty("operateDate")
   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   @JsonProperty("operateDate")
   public Date getOperateDate() {
      return this.operateDate;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
