package com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosPage implements Serializable {
   private int index;
   private int size;
   private long total;
   private int errCod;
   private String errMsg;
   private List<AfsServiceSendResponse> content;

   @JsonProperty("index")
   public void setIndex(int index) {
      this.index = index;
   }

   @JsonProperty("index")
   public int getIndex() {
      return this.index;
   }

   @JsonProperty("size")
   public void setSize(int size) {
      this.size = size;
   }

   @JsonProperty("size")
   public int getSize() {
      return this.size;
   }

   @JsonProperty("total")
   public void setTotal(long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public long getTotal() {
      return this.total;
   }

   @JsonProperty("err_cod")
   public void setErrCod(int errCod) {
      this.errCod = errCod;
   }

   @JsonProperty("err_cod")
   public int getErrCod() {
      return this.errCod;
   }

   @JsonProperty("err_msg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("err_msg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("content")
   public void setContent(List<AfsServiceSendResponse> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<AfsServiceSendResponse> getContent() {
      return this.content;
   }
}
