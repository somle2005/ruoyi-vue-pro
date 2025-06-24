package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getOrderOpRec;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GetOrderOpRecResult implements Serializable {
   private String msg;
   private String code;
   private String uuid;
   private List<OperateRecordDTO> data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("data")
   public void setData(List<OperateRecordDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OperateRecordDTO> getData() {
      return this.data;
   }
}
