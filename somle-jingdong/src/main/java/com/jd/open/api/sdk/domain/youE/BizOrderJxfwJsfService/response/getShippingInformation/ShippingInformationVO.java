package com.jd.open.api.sdk.domain.youE.BizOrderJxfwJsfService.response.getShippingInformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ShippingInformationVO implements Serializable {
   private String deliveryOrg;
   private String deliveryOrgName;
   private String orderNo;
   private Date createTime;
   private String deliveryCode;

   @JsonProperty("deliveryOrg")
   public void setDeliveryOrg(String deliveryOrg) {
      this.deliveryOrg = deliveryOrg;
   }

   @JsonProperty("deliveryOrg")
   public String getDeliveryOrg() {
      return this.deliveryOrg;
   }

   @JsonProperty("deliveryOrgName")
   public void setDeliveryOrgName(String deliveryOrgName) {
      this.deliveryOrgName = deliveryOrgName;
   }

   @JsonProperty("deliveryOrgName")
   public String getDeliveryOrgName() {
      return this.deliveryOrgName;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("deliveryCode")
   public void setDeliveryCode(String deliveryCode) {
      this.deliveryCode = deliveryCode;
   }

   @JsonProperty("deliveryCode")
   public String getDeliveryCode() {
      return this.deliveryCode;
   }
}
