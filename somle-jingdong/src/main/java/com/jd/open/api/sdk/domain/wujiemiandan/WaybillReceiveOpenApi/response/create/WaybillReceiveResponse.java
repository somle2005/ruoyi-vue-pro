package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillReceiveResponse implements Serializable {
   private List<WaybillCodeInfoDTO> waybillCodeInfoList;
   private String platformOrderNo;

   @JsonProperty("waybillCodeInfoList")
   public void setWaybillCodeInfoList(List<WaybillCodeInfoDTO> waybillCodeInfoList) {
      this.waybillCodeInfoList = waybillCodeInfoList;
   }

   @JsonProperty("waybillCodeInfoList")
   public List<WaybillCodeInfoDTO> getWaybillCodeInfoList() {
      return this.waybillCodeInfoList;
   }

   @JsonProperty("platformOrderNo")
   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   @JsonProperty("platformOrderNo")
   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }
}
