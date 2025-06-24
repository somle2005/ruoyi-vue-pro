package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.querySparePart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SparePartInfoResult implements Serializable {
   private List<SparePartData> sparePartDataList;

   @JsonProperty("sparePartDataList")
   public void setSparePartDataList(List<SparePartData> sparePartDataList) {
      this.sparePartDataList = sparePartDataList;
   }

   @JsonProperty("sparePartDataList")
   public List<SparePartData> getSparePartDataList() {
      return this.sparePartDataList;
   }
}
