package com.jd.open.api.sdk.domain.wujiemiandan.WaybillAppendApi.response.appendreceive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillResultDTO implements Serializable {
   private String platformOrderNo;
   private List<String> waybillCodeList;

   @JsonProperty("platformOrderNo")
   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   @JsonProperty("platformOrderNo")
   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }

   @JsonProperty("waybillCodeList")
   public void setWaybillCodeList(List<String> waybillCodeList) {
      this.waybillCodeList = waybillCodeList;
   }

   @JsonProperty("waybillCodeList")
   public List<String> getWaybillCodeList() {
      return this.waybillCodeList;
   }
}
