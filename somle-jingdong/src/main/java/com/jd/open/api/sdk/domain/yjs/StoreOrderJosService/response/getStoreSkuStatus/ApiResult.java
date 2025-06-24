package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getStoreSkuStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiResult implements Serializable {
   private String uuid;
   private String code;
   private String msg;
   private StorePriceDTO data;

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
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
   public void setData(StorePriceDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public StorePriceDTO getData() {
      return this.data;
   }
}
