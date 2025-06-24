package com.jd.open.api.sdk.domain.ware.GrayScaleService.response.getgrayvalue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosResult implements Serializable {
   private String msg;
   private Integer code;
   private Boolean isSuccess;
   private List<GrayScaleResult> data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public Boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("data")
   public void setData(List<GrayScaleResult> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<GrayScaleResult> getData() {
      return this.data;
   }
}
