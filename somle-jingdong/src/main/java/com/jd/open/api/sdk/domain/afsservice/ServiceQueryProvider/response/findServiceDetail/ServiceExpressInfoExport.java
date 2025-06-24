package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ServiceExpressInfoExport implements Serializable {
   private Long afsServiceId;
   private BigDecimal freightMoney;
   private String expressCompany;
   private Date deliveryDate;
   private Date createDate;
   private String expressCode;

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("freightMoney")
   public void setFreightMoney(BigDecimal freightMoney) {
      this.freightMoney = freightMoney;
   }

   @JsonProperty("freightMoney")
   public BigDecimal getFreightMoney() {
      return this.freightMoney;
   }

   @JsonProperty("expressCompany")
   public void setExpressCompany(String expressCompany) {
      this.expressCompany = expressCompany;
   }

   @JsonProperty("expressCompany")
   public String getExpressCompany() {
      return this.expressCompany;
   }

   @JsonProperty("deliveryDate")
   public void setDeliveryDate(Date deliveryDate) {
      this.deliveryDate = deliveryDate;
   }

   @JsonProperty("deliveryDate")
   public Date getDeliveryDate() {
      return this.deliveryDate;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("expressCode")
   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   @JsonProperty("expressCode")
   public String getExpressCode() {
      return this.expressCode;
   }
}
