package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.request.queryDeptByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Page implements Serializable {
   private int size;
   private int current;

   @JsonProperty("size")
   public void setSize(int size) {
      this.size = size;
   }

   @JsonProperty("size")
   public int getSize() {
      return this.size;
   }

   @JsonProperty("current")
   public void setCurrent(int current) {
      this.current = current;
   }

   @JsonProperty("current")
   public int getCurrent() {
      return this.current;
   }
}
