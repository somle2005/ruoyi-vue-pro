package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QuestionType implements Serializable {
   private String code;
   private String parentCode;
   private String name;
   private String extJsonStr;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("parentCode")
   public void setParentCode(String parentCode) {
      this.parentCode = parentCode;
   }

   @JsonProperty("parentCode")
   public String getParentCode() {
      return this.parentCode;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
