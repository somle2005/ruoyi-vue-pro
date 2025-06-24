package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzoneCategoryAddResponse extends AbstractResponse {
   private Integer returnCode;
   private String desc;
   private Long cateId;

   @JsonProperty("return_code")
   public void setReturnCode(Integer returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public Integer getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("cate_id")
   public void setCateId(Long cateId) {
      this.cateId = cateId;
   }

   @JsonProperty("cate_id")
   public Long getCateId() {
      return this.cateId;
   }
}
