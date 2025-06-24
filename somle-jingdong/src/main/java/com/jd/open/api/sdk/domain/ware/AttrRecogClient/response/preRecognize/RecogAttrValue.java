package com.jd.open.api.sdk.domain.ware.AttrRecogClient.response.preRecognize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RecogAttrValue implements Serializable {
   private Float score;
   private Integer id;
   private String value;

   @JsonProperty("score")
   public void setScore(Float score) {
      this.score = score;
   }

   @JsonProperty("score")
   public Float getScore() {
      return this.score;
   }

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
   }
}
