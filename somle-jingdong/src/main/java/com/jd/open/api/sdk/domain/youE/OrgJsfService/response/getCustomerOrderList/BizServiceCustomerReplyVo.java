package com.jd.open.api.sdk.domain.youE.OrgJsfService.response.getCustomerOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BizServiceCustomerReplyVo implements Serializable {
   private String createdBy;
   private Date created;
   private List<BizServiceCustomerAppendixVo> bizServiceCustomerAppendixVoList;
   private String content;
   private String replyTime;

   @JsonProperty("createdBy")
   public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
   }

   @JsonProperty("createdBy")
   public String getCreatedBy() {
      return this.createdBy;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("bizServiceCustomerAppendixVoList")
   public void setBizServiceCustomerAppendixVoList(List<BizServiceCustomerAppendixVo> bizServiceCustomerAppendixVoList) {
      this.bizServiceCustomerAppendixVoList = bizServiceCustomerAppendixVoList;
   }

   @JsonProperty("bizServiceCustomerAppendixVoList")
   public List<BizServiceCustomerAppendixVo> getBizServiceCustomerAppendixVoList() {
      return this.bizServiceCustomerAppendixVoList;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("replyTime")
   public void setReplyTime(String replyTime) {
      this.replyTime = replyTime;
   }

   @JsonProperty("replyTime")
   public String getReplyTime() {
      return this.replyTime;
   }
}
