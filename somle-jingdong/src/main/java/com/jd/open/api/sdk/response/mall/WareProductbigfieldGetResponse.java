package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareProductbigfieldGetResponse extends AbstractResponse {
   private String shouHou;
   private String wdis;
   private String propCode;
   private String wareQd;

   @JsonProperty("shou_hou")
   public void setShouHou(String shouHou) {
      this.shouHou = shouHou;
   }

   @JsonProperty("shou_hou")
   public String getShouHou() {
      return this.shouHou;
   }

   @JsonProperty("wdis")
   public void setWdis(String wdis) {
      this.wdis = wdis;
   }

   @JsonProperty("wdis")
   public String getWdis() {
      return this.wdis;
   }

   @JsonProperty("prop_code")
   public void setPropCode(String propCode) {
      this.propCode = propCode;
   }

   @JsonProperty("prop_code")
   public String getPropCode() {
      return this.propCode;
   }

   @JsonProperty("ware_qd")
   public void setWareQd(String wareQd) {
      this.wareQd = wareQd;
   }

   @JsonProperty("ware_qd")
   public String getWareQd() {
      return this.wareQd;
   }
}
