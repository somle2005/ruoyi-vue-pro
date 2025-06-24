package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveApi.response.receive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillResultDTO implements Serializable {
   private List<String> waybillCodeList;
   private String platformOrderNo;

   @JsonProperty("waybillCodeList")
   public void setWaybillCodeList(List<String> waybillCodeList) {
      this.waybillCodeList = waybillCodeList;
   }

   @JsonProperty("waybillCodeList")
   public List<String> getWaybillCodeList() {
      return this.waybillCodeList;
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
