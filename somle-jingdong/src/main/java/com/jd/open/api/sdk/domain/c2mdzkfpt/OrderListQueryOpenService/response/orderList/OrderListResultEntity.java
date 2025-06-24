package com.jd.open.api.sdk.domain.c2mdzkfpt.OrderListQueryOpenService.response.orderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderListResultEntity implements Serializable {
   private long total;
   private Boolean success;
   private List<OrderBaseEntity> orderBaseEntityList;
   private String errorCode;
   private String errorMsg;

   @JsonProperty("total")
   public void setTotal(long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public long getTotal() {
      return this.total;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("orderBaseEntityList")
   public void setOrderBaseEntityList(List<OrderBaseEntity> orderBaseEntityList) {
      this.orderBaseEntityList = orderBaseEntityList;
   }

   @JsonProperty("orderBaseEntityList")
   public List<OrderBaseEntity> getOrderBaseEntityList() {
      return this.orderBaseEntityList;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
