package com.jd.open.api.sdk.domain.hudong.AppointmentWriteOuterService.response.createAppointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OperateResult implements Serializable {
   private String errfileLink;
   private List<String> dataList;
   private Long errorNum;
   private List<ErrData> errDataList;

   @JsonProperty("errfileLink")
   public void setErrfileLink(String errfileLink) {
      this.errfileLink = errfileLink;
   }

   @JsonProperty("errfileLink")
   public String getErrfileLink() {
      return this.errfileLink;
   }

   @JsonProperty("dataList")
   public void setDataList(List<String> dataList) {
      this.dataList = dataList;
   }

   @JsonProperty("dataList")
   public List<String> getDataList() {
      return this.dataList;
   }

   @JsonProperty("errorNum")
   public void setErrorNum(Long errorNum) {
      this.errorNum = errorNum;
   }

   @JsonProperty("errorNum")
   public Long getErrorNum() {
      return this.errorNum;
   }

   @JsonProperty("errDataList")
   public void setErrDataList(List<ErrData> errDataList) {
      this.errDataList = errDataList;
   }

   @JsonProperty("errDataList")
   public List<ErrData> getErrDataList() {
      return this.errDataList;
   }
}
