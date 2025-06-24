package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.modifyVenderRemark;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GXResponse implements Serializable {
   private Integer code;
   private String desc;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }
}
