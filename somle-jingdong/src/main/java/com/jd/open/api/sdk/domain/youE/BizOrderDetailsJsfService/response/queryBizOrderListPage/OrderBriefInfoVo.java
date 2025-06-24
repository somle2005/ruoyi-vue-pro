package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderListPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderBriefInfoVo implements Serializable {
   private String orderNo;
   private Date assignDate;
   private Date createDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("assignDate")
   public void setAssignDate(Date assignDate) {
      this.assignDate = assignDate;
   }

   @JsonProperty("assignDate")
   public Date getAssignDate() {
      return this.assignDate;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }
}
