package com.jd.open.api.sdk.domain.vopdz.QueryAddressOpenProvider.response.queryJdAreaIdList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryJdAreaIdListOpenResp implements Serializable {
   private List<AreaInfoBaseResp> areaInfoList;

   @JsonProperty("areaInfoList")
   public void setAreaInfoList(List<AreaInfoBaseResp> areaInfoList) {
      this.areaInfoList = areaInfoList;
   }

   @JsonProperty("areaInfoList")
   public List<AreaInfoBaseResp> getAreaInfoList() {
      return this.areaInfoList;
   }
}
