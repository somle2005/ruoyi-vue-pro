package com.jd.open.api.sdk.domain.wujiemiandan.WaybillAppendOpenApi.response.append;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillAppendResponse implements Serializable {
   private List<WaybillCodeInfoDTO> waybillCodeInfoList;

   @JsonProperty("waybillCodeInfoList")
   public void setWaybillCodeInfoList(List<WaybillCodeInfoDTO> waybillCodeInfoList) {
      this.waybillCodeInfoList = waybillCodeInfoList;
   }

   @JsonProperty("waybillCodeInfoList")
   public List<WaybillCodeInfoDTO> getWaybillCodeInfoList() {
      return this.waybillCodeInfoList;
   }
}
