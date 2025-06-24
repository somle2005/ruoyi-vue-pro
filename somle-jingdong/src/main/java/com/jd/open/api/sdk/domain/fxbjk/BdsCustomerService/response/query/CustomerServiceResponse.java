package com.jd.open.api.sdk.domain.fxbjk.BdsCustomerService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomerServiceResponse implements Serializable {
   private List<DetailData> detailDataList;
   private DetailData avgData;
   private DetailData totalData;

   @JsonProperty("detailDataList")
   public void setDetailDataList(List<DetailData> detailDataList) {
      this.detailDataList = detailDataList;
   }

   @JsonProperty("detailDataList")
   public List<DetailData> getDetailDataList() {
      return this.detailDataList;
   }

   @JsonProperty("avgData")
   public void setAvgData(DetailData avgData) {
      this.avgData = avgData;
   }

   @JsonProperty("avgData")
   public DetailData getAvgData() {
      return this.avgData;
   }

   @JsonProperty("totalData")
   public void setTotalData(DetailData totalData) {
      this.totalData = totalData;
   }

   @JsonProperty("totalData")
   public DetailData getTotalData() {
      return this.totalData;
   }
}
