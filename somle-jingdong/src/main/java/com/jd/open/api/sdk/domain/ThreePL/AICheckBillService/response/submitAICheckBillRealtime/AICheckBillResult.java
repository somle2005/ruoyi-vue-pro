package com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.response.submitAICheckBillRealtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AICheckBillResult implements Serializable {
   private String imageMd5;
   private Integer imgAutoFlag;
   private String imgAutoResult;
   private Integer imgManualFlag;

   @JsonProperty("imageMd5")
   public void setImageMd5(String imageMd5) {
      this.imageMd5 = imageMd5;
   }

   @JsonProperty("imageMd5")
   public String getImageMd5() {
      return this.imageMd5;
   }

   @JsonProperty("imgAutoFlag")
   public void setImgAutoFlag(Integer imgAutoFlag) {
      this.imgAutoFlag = imgAutoFlag;
   }

   @JsonProperty("imgAutoFlag")
   public Integer getImgAutoFlag() {
      return this.imgAutoFlag;
   }

   @JsonProperty("imgAutoResult")
   public void setImgAutoResult(String imgAutoResult) {
      this.imgAutoResult = imgAutoResult;
   }

   @JsonProperty("imgAutoResult")
   public String getImgAutoResult() {
      return this.imgAutoResult;
   }

   @JsonProperty("imgManualFlag")
   public void setImgManualFlag(Integer imgManualFlag) {
      this.imgManualFlag = imgManualFlag;
   }

   @JsonProperty("imgManualFlag")
   public Integer getImgManualFlag() {
      return this.imgManualFlag;
   }
}
