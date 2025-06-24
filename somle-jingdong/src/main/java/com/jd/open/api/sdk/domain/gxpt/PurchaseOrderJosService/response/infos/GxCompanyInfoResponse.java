package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.infos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GxCompanyInfoResponse implements Serializable {
   private int code;
   private String msg;
   private List<ShipmentCompanyJosDO> data;

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

   @JsonProperty("data")
   public void setData(List<ShipmentCompanyJosDO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ShipmentCompanyJosDO> getData() {
      return this.data;
   }
}
