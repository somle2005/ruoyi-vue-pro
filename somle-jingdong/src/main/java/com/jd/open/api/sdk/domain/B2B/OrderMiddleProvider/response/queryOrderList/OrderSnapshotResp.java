package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderSnapshotResp implements Serializable {
   private Integer type;
   private String snapshot;

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("snapshot")
   public void setSnapshot(String snapshot) {
      this.snapshot = snapshot;
   }

   @JsonProperty("snapshot")
   public String getSnapshot() {
      return this.snapshot;
   }
}
