package com.jd.open.api.sdk.domain.HouseEI.ImServiceProviderExternalJsfSerivce.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosPage implements Serializable {
   private int size;
   private String nexQueCod;
   private String curQueCod;
   private int errCod;
   private String errMsg;
   private List<ImPendingOrderDto> content;

   @JsonProperty("size")
   public void setSize(int size) {
      this.size = size;
   }

   @JsonProperty("size")
   public int getSize() {
      return this.size;
   }

   @JsonProperty("nex_que_cod")
   public void setNexQueCod(String nexQueCod) {
      this.nexQueCod = nexQueCod;
   }

   @JsonProperty("nex_que_cod")
   public String getNexQueCod() {
      return this.nexQueCod;
   }

   @JsonProperty("cur_que_cod")
   public void setCurQueCod(String curQueCod) {
      this.curQueCod = curQueCod;
   }

   @JsonProperty("cur_que_cod")
   public String getCurQueCod() {
      return this.curQueCod;
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
   public void setContent(List<ImPendingOrderDto> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<ImPendingOrderDto> getContent() {
      return this.content;
   }
}
