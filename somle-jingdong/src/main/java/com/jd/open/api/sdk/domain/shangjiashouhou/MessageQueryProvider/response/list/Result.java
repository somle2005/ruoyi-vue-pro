package com.jd.open.api.sdk.domain.shangjiashouhou.MessageQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private List<MessageInfo> data;

   @JsonProperty("data")
   public void setData(List<MessageInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<MessageInfo> getData() {
      return this.data;
   }
}
