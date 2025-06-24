package com.jd.open.api.sdk.domain.unboundedShop.CouponActivityJosService.response.queryActivityPageInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JpassActivityDTO implements Serializable {
   private Long id;
   private String name;
   private Integer status;
   private Date startDate;
   private Integer type;
   private Date endDate;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("startDate")
   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   @JsonProperty("startDate")
   public Date getStartDate() {
      return this.startDate;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("endDate")
   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("endDate")
   public Date getEndDate() {
      return this.endDate;
   }
}
