package com.jd.open.api.sdk.domain.QL.StationInfoJosService.response.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StationInfoResult implements Serializable {
   private String value;
   private String desc;

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
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
