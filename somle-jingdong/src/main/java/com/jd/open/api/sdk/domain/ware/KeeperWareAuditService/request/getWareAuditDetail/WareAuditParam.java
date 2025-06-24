package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.request.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareAuditParam implements Serializable {
   private Long wareId;
   private Integer sourceLabel;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("sourceLabel")
   public void setSourceLabel(Integer sourceLabel) {
      this.sourceLabel = sourceLabel;
   }

   @JsonProperty("sourceLabel")
   public Integer getSourceLabel() {
      return this.sourceLabel;
   }
}
