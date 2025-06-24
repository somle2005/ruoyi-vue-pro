package com.jd.open.api.sdk.domain.ware.KeeperDetectionService.response.textRedLineDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TextDetectResult implements Serializable {
   private boolean sensitive;
   private String sensitiveWords;

   @JsonProperty("sensitive")
   public void setSensitive(boolean sensitive) {
      this.sensitive = sensitive;
   }

   @JsonProperty("sensitive")
   public boolean getSensitive() {
      return this.sensitive;
   }

   @JsonProperty("sensitiveWords")
   public void setSensitiveWords(String sensitiveWords) {
      this.sensitiveWords = sensitiveWords;
   }

   @JsonProperty("sensitiveWords")
   public String getSensitiveWords() {
      return this.sensitiveWords;
   }
}
