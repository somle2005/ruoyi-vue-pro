package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.WarePropimg;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WarePropimgsSearchResponse extends AbstractResponse {
   private List<WarePropimg> warePropimg;
   private int total;

   @JsonProperty("propimgs")
   public List<WarePropimg> getWarePropimg() {
      return this.warePropimg;
   }

   @JsonProperty("propimgs")
   public void setWarePropimg(List<WarePropimg> warePropimg) {
      this.warePropimg = warePropimg;
   }

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }
}
