package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.request.createSpuSymbolBind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BdsSymbol implements Serializable {
   private Long secondClassifyId;
   private Long id;
   private String name;
   private List<String> qualifyUrlList;
   private Date qualifyEndDate;

   @JsonProperty("secondClassifyId")
   public void setSecondClassifyId(Long secondClassifyId) {
      this.secondClassifyId = secondClassifyId;
   }

   @JsonProperty("secondClassifyId")
   public Long getSecondClassifyId() {
      return this.secondClassifyId;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("qualifyUrlList")
   public void setQualifyUrlList(List<String> qualifyUrlList) {
      this.qualifyUrlList = qualifyUrlList;
   }

   @JsonProperty("qualifyUrlList")
   public List<String> getQualifyUrlList() {
      return this.qualifyUrlList;
   }

   @JsonProperty("qualifyEndDate")
   public void setQualifyEndDate(Date qualifyEndDate) {
      this.qualifyEndDate = qualifyEndDate;
   }

   @JsonProperty("qualifyEndDate")
   public Date getQualifyEndDate() {
      return this.qualifyEndDate;
   }
}
