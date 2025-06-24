package com.jd.open.api.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public abstract class AbstractResponse implements Serializable {
   private static final long serialVersionUID = -1029647126543104295L;
   private String code;
   private String url;
   @JsonProperty("request_id")
   private String requestId;
   @JsonProperty("zh_desc")
   private String zhDesc;
   @JsonProperty("en_desc")
   private String enDesc;
   protected String msg;

   public String getCode() {
      return this.code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getZhDesc() {
      return this.zhDesc;
   }

   public void setZhDesc(String msg) {
      this.zhDesc = msg;
   }

   public String getEnDesc() {
      return this.enDesc;
   }

   public void setEnDesc(String enDesc) {
      this.enDesc = enDesc;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public String getUrl() {
      return this.url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }
}
