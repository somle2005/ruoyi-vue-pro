package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.evaluateB2BLwbFreightMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FreightsDataDTO implements Serializable {
   private Integer bizCode;
   private String bizMessage;
   private GeneralFreightsDTO generalInfo;
   private List<DetailFreightsDTO> detailInfo;

   @JsonProperty("bizCode")
   public void setBizCode(Integer bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public Integer getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("bizMessage")
   public void setBizMessage(String bizMessage) {
      this.bizMessage = bizMessage;
   }

   @JsonProperty("bizMessage")
   public String getBizMessage() {
      return this.bizMessage;
   }

   @JsonProperty("generalInfo")
   public void setGeneralInfo(GeneralFreightsDTO generalInfo) {
      this.generalInfo = generalInfo;
   }

   @JsonProperty("generalInfo")
   public GeneralFreightsDTO getGeneralInfo() {
      return this.generalInfo;
   }

   @JsonProperty("detailInfo")
   public void setDetailInfo(List<DetailFreightsDTO> detailInfo) {
      this.detailInfo = detailInfo;
   }

   @JsonProperty("detailInfo")
   public List<DetailFreightsDTO> getDetailInfo() {
      return this.detailInfo;
   }
}
