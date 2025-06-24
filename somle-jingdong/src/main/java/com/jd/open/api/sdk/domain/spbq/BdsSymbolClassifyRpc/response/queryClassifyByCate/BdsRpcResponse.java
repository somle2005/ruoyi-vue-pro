package com.jd.open.api.sdk.domain.spbq.BdsSymbolClassifyRpc.response.queryClassifyByCate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BdsRpcResponse implements Serializable {
   private String msg;
   private Integer code;
   private Integer count;
   private List<BdsSymbolClassifyResult> data;

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

   @JsonProperty("count")
   public void setCount(Integer count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Integer getCount() {
      return this.count;
   }

   @JsonProperty("data")
   public void setData(List<BdsSymbolClassifyResult> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<BdsSymbolClassifyResult> getData() {
      return this.data;
   }
}
