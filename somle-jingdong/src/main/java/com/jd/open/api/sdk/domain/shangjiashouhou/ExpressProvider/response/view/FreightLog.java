package com.jd.open.api.sdk.domain.shangjiashouhou.ExpressProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class FreightLog implements Serializable {
   private Long freightId;
   private Date createDate;
   private String createName;
   private String content;
   private String remark;
   private String extJsonStr;

   @JsonProperty("freightId")
   public void setFreightId(Long freightId) {
      this.freightId = freightId;
   }

   @JsonProperty("freightId")
   public Long getFreightId() {
      return this.freightId;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("createName")
   public void setCreateName(String createName) {
      this.createName = createName;
   }

   @JsonProperty("createName")
   public String getCreateName() {
      return this.createName;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
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
