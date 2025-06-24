package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SparePartBrandResult implements Serializable {
   private List<SparePartBrandInfo> sparePartBrandInfoList;

   @JsonProperty("sparePartBrandInfoList")
   public void setSparePartBrandInfoList(List<SparePartBrandInfo> sparePartBrandInfoList) {
      this.sparePartBrandInfoList = sparePartBrandInfoList;
   }

   @JsonProperty("sparePartBrandInfoList")
   public List<SparePartBrandInfo> getSparePartBrandInfoList() {
      return this.sparePartBrandInfoList;
   }
}
