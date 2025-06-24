package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.queryUlOrderByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UlResultResponse implements Serializable {
   private int code;
   private String msg;
   private int totalRecord;
   private List<UlMainResult> data;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
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

   @JsonProperty("totalRecord")
   public void setTotalRecord(int totalRecord) {
      this.totalRecord = totalRecord;
   }

   @JsonProperty("totalRecord")
   public int getTotalRecord() {
      return this.totalRecord;
   }

   @JsonProperty("data")
   public void setData(List<UlMainResult> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<UlMainResult> getData() {
      return this.data;
   }
}
