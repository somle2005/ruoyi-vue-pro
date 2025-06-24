package com.jd.open.api.sdk.domain.hudong.PresaleWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BusiPlatformInfo implements Serializable {
   private List<Integer[]> channel;
   private Integer selectType;

   @JsonProperty("channel")
   public void setChannel(List<Integer[]> channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public List<Integer[]> getChannel() {
      return this.channel;
   }

   @JsonProperty("selectType")
   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   @JsonProperty("selectType")
   public Integer getSelectType() {
      return this.selectType;
   }
}
