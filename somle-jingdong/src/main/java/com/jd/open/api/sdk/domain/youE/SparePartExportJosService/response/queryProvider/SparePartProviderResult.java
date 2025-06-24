package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryProvider;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SparePartProviderResult implements Serializable {
   private List<SparePartProviderInfo> sparePartProviderInfoList;

   @JsonProperty("sparePartProviderInfoList")
   public void setSparePartProviderInfoList(List<SparePartProviderInfo> sparePartProviderInfoList) {
      this.sparePartProviderInfoList = sparePartProviderInfoList;
   }

   @JsonProperty("sparePartProviderInfoList")
   public List<SparePartProviderInfo> getSparePartProviderInfoList() {
      return this.sparePartProviderInfoList;
   }
}
