package com.jd.open.api.sdk.domain.B2B.BWareReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BSkuChildsInfoDto implements Serializable {
   private Integer childNum;

   @JsonProperty("childNum")
   public void setChildNum(Integer childNum) {
      this.childNum = childNum;
   }

   @JsonProperty("childNum")
   public Integer getChildNum() {
      return this.childNum;
   }
}
