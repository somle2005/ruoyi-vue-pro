package com.jd.open.api.sdk.domain.ware.ImageReadJosService.response.findTerminalImages;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosTerminalImage implements Serializable {
   private List<JosImageInfo> imageInfos;
   private JosImageGroup imageGroup;

   @JsonProperty("imageInfos")
   public void setImageInfos(List<JosImageInfo> imageInfos) {
      this.imageInfos = imageInfos;
   }

   @JsonProperty("imageInfos")
   public List<JosImageInfo> getImageInfos() {
      return this.imageInfos;
   }

   @JsonProperty("imageGroup")
   public void setImageGroup(JosImageGroup imageGroup) {
      this.imageGroup = imageGroup;
   }

   @JsonProperty("imageGroup")
   public JosImageGroup getImageGroup() {
      return this.imageGroup;
   }
}
