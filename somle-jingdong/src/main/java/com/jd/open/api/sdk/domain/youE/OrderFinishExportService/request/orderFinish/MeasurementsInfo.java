package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class MeasurementsInfo implements Serializable {
   private String measurementsFileUrl;
   private List<MeasurementsData> measurementsDataList;
   private Integer measureResultType;
   private String feedbackInfo;

   @JsonProperty("measurementsFileUrl")
   public void setMeasurementsFileUrl(String measurementsFileUrl) {
      this.measurementsFileUrl = measurementsFileUrl;
   }

   @JsonProperty("measurementsFileUrl")
   public String getMeasurementsFileUrl() {
      return this.measurementsFileUrl;
   }

   @JsonProperty("measurementsDataList")
   public void setMeasurementsDataList(List<MeasurementsData> measurementsDataList) {
      this.measurementsDataList = measurementsDataList;
   }

   @JsonProperty("measurementsDataList")
   public List<MeasurementsData> getMeasurementsDataList() {
      return this.measurementsDataList;
   }

   @JsonProperty("measureResultType")
   public void setMeasureResultType(Integer measureResultType) {
      this.measureResultType = measureResultType;
   }

   @JsonProperty("measureResultType")
   public Integer getMeasureResultType() {
      return this.measureResultType;
   }

   @JsonProperty("feedbackInfo")
   public void setFeedbackInfo(String feedbackInfo) {
      this.feedbackInfo = feedbackInfo;
   }

   @JsonProperty("feedbackInfo")
   public String getFeedbackInfo() {
      return this.feedbackInfo;
   }
}
