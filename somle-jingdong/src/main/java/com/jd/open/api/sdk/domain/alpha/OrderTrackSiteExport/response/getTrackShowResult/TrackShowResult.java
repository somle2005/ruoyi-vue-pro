package com.jd.open.api.sdk.domain.alpha.OrderTrackSiteExport.response.getTrackShowResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TrackShowResult implements Serializable {
   private List<TrackShowVo> ziyingShowResult;
   private List<TrackShowVo> thirdPsShowResult;
   private List<DaJiaDianInstallVO> daJiaDianInstallResult;

   @JsonProperty("ziyingShowResult")
   public void setZiyingShowResult(List<TrackShowVo> ziyingShowResult) {
      this.ziyingShowResult = ziyingShowResult;
   }

   @JsonProperty("ziyingShowResult")
   public List<TrackShowVo> getZiyingShowResult() {
      return this.ziyingShowResult;
   }

   @JsonProperty("thirdPsShowResult")
   public void setThirdPsShowResult(List<TrackShowVo> thirdPsShowResult) {
      this.thirdPsShowResult = thirdPsShowResult;
   }

   @JsonProperty("thirdPsShowResult")
   public List<TrackShowVo> getThirdPsShowResult() {
      return this.thirdPsShowResult;
   }

   @JsonProperty("daJiaDianInstallResult")
   public void setDaJiaDianInstallResult(List<DaJiaDianInstallVO> daJiaDianInstallResult) {
      this.daJiaDianInstallResult = daJiaDianInstallResult;
   }

   @JsonProperty("daJiaDianInstallResult")
   public List<DaJiaDianInstallVO> getDaJiaDianInstallResult() {
      return this.daJiaDianInstallResult;
   }
}
