package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TemplateDTO implements Serializable {
   private List<StandardTemplate> sDatas;
   private List<UserTemplate> uDatas;
   private List<IsvResourceDo> diyDatas;
   private List<CustomAreaDo> udiyDatas;

   @JsonProperty("sDatas")
   public void setSDatas(List<StandardTemplate> sDatas) {
      this.sDatas = sDatas;
   }

   @JsonProperty("sDatas")
   public List<StandardTemplate> getSDatas() {
      return this.sDatas;
   }

   @JsonProperty("uDatas")
   public void setUDatas(List<UserTemplate> uDatas) {
      this.uDatas = uDatas;
   }

   @JsonProperty("uDatas")
   public List<UserTemplate> getUDatas() {
      return this.uDatas;
   }

   @JsonProperty("diyDatas")
   public void setDiyDatas(List<IsvResourceDo> diyDatas) {
      this.diyDatas = diyDatas;
   }

   @JsonProperty("diyDatas")
   public List<IsvResourceDo> getDiyDatas() {
      return this.diyDatas;
   }

   @JsonProperty("udiyDatas")
   public void setUdiyDatas(List<CustomAreaDo> udiyDatas) {
      this.udiyDatas = udiyDatas;
   }

   @JsonProperty("udiyDatas")
   public List<CustomAreaDo> getUdiyDatas() {
      return this.udiyDatas;
   }
}
