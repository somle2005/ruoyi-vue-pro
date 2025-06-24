package com.jd.open.api.sdk.domain.shangjiashouhou.DoorPickwareSupportQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private boolean success;
   private String code;
   private String msg;
   private List<PickwareInfo> data;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("data")
   public void setData(List<PickwareInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<PickwareInfo> getData() {
      return this.data;
   }
}
