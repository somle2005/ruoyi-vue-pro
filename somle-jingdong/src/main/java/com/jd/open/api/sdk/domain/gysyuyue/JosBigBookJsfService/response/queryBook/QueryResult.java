package com.jd.open.api.sdk.domain.gysyuyue.JosBigBookJsfService.response.queryBook;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryResult implements Serializable {
   private int total;
   private int code;
   private boolean success;
   private String message;
   private List<HariQueryResult> list;

   @JsonProperty("total")
   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("total")
   public int getTotal() {
      return this.total;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("list")
   public void setList(List<HariQueryResult> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<HariQueryResult> getList() {
      return this.list;
   }
}
