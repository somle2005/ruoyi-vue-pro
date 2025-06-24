package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryLwbByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class LwbStatusInfo implements Serializable {
   private Integer status;
   private String operator;
   private String operation;
   private String operateSystem;
   private Date operateDate;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("operator")
   public void setOperator(String operator) {
      this.operator = operator;
   }

   @JsonProperty("operator")
   public String getOperator() {
      return this.operator;
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
}
