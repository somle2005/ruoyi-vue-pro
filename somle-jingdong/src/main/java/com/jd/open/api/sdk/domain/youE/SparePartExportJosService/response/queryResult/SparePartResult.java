package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SparePartResult implements Serializable {
   private List<SparePartResultInfo> sparePartResultInfoList;

   @JsonProperty("sparePartResultInfoList")
   public void setSparePartResultInfoList(List<SparePartResultInfo> sparePartResultInfoList) {
      this.sparePartResultInfoList = sparePartResultInfoList;
   }

   @JsonProperty("sparePartResultInfoList")
   public List<SparePartResultInfo> getSparePartResultInfoList() {
      return this.sparePartResultInfoList;
   }
}
