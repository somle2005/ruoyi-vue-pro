package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.response.queryPromiseTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ReservedPromiseTemplate implements Serializable {
   private String templateName;
   private Date pickDate;
   private Long templateId;
   private Integer pickDays;

   @JsonProperty("templateName")
   public void setTemplateName(String templateName) {
      this.templateName = templateName;
   }

   @JsonProperty("templateName")
   public String getTemplateName() {
      return this.templateName;
   }

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

   @JsonProperty("pickDays")
   public void setPickDays(Integer pickDays) {
      this.pickDays = pickDays;
   }

   @JsonProperty("pickDays")
   public Integer getPickDays() {
      return this.pickDays;
   }
}
