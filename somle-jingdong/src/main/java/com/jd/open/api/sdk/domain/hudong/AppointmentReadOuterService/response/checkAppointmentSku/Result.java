package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.checkAppointmentSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private String msg;
   private Integer code;
   private Boolean success;
   private List<AppointmentSelectCheckInfo> data;

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

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("data")
   public void setData(List<AppointmentSelectCheckInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<AppointmentSelectCheckInfo> getData() {
      return this.data;
   }
}
