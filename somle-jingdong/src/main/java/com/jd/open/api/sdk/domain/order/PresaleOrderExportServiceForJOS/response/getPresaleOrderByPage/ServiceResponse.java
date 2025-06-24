package com.jd.open.api.sdk.domain.order.PresaleOrderExportServiceForJOS.response.getPresaleOrderByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ServiceResponse implements Serializable {
   private String code;
   private List<PresaleOrderVO> data;
   private String detail;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(List<PresaleOrderVO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<PresaleOrderVO> getData() {
      return this.data;
   }

   @JsonProperty("detail")
   public void setDetail(String detail) {
      this.detail = detail;
   }

   @JsonProperty("detail")
   public String getDetail() {
      return this.detail;
   }
}
