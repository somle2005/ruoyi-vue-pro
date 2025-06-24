package com.jd.open.api.sdk.domain.afsservice.QuestionTypeCascadeProvider.response.getQuestionTypeCascade;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ComponentExport implements Serializable {
   private String[] codeS;
   private String[] nameS;

   @JsonProperty("codeS")
   public void setCodeS(String[] codeS) {
      this.codeS = codeS;
   }

   @JsonProperty("codeS")
   public String[] getCodeS() {
      return this.codeS;
   }

   @JsonProperty("nameS")
   public void setNameS(String[] nameS) {
      this.nameS = nameS;
   }

   @JsonProperty("nameS")
   public String[] getNameS() {
      return this.nameS;
   }
}
