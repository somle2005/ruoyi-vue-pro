package com.jd.open.api.sdk.domain.youE.OldStationJsfService.response.queryOldStation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageResultDTO implements Serializable {
   private Integer total;
   private List<OldStationDTO> list;

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("list")
   public void setList(List<OldStationDTO> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<OldStationDTO> getList() {
      return this.list;
   }
}
