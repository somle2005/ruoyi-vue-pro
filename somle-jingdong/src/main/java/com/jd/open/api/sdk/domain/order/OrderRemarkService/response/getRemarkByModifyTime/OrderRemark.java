package com.jd.open.api.sdk.domain.order.OrderRemarkService.response.getRemarkByModifyTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderRemark implements Serializable {
   private Long orderId;
   private String remark;
   private Date created;
   private Date modified;
   private Integer flag;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
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

   @JsonProperty("flag")
   public void setFlag(Integer flag) {
      this.flag = flag;
   }

   @JsonProperty("flag")
   public Integer getFlag() {
      return this.flag;
   }
}
