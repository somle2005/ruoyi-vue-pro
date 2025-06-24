package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.request.queryPromiseTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class TemplateQueryItem implements Serializable {
   private Date pickDate;
   private Long templateId;
   private Integer type;
   private Integer pickDays;

   @JsonProperty("pickDate")
   public void setPickDate(Date pickDate) {
      this.pickDate = pickDate;
   }

   @JsonProperty("pickDate")
   public Date getPickDate() {
      return this.pickDate;
   }

   @JsonProperty("templateId")
   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public Long getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("pickDays")
   public void setPickDays(Integer pickDays) {
      this.pickDays = pickDays;
   }

   @JsonProperty("pickDays")
   public Integer getPickDays() {
      return this.pickDays;
   }
}
