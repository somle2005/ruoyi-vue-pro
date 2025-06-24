package com.jd.open.api.sdk.domain.supplier.DpsSplitOrderInterface.response.splitOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SplitOrderResultDto implements Serializable {
   private Long customOrderId;
   private Integer groupId;

   @JsonProperty("customOrderId")
   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("customOrderId")
   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("groupId")
   public void setGroupId(Integer groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("groupId")
   public Integer getGroupId() {
      return this.groupId;
   }
}
