package com.jd.open.api.sdk.domain.address.BaseAreaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseAreaServiceResponse implements Serializable {
   private Integer resultCode;
   private List<Area> data;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(List<Area> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<Area> getData() {
      return this.data;
   }
}
