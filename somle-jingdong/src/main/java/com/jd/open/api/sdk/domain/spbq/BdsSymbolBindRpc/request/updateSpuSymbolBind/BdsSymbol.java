package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.request.updateSpuSymbolBind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BdsSymbol implements Serializable {
   private Long secondClassifyId;
   private List<String> qualifyUrlList;
   private Date qualifyEndDate;
   private String name;
   private Long id;

   @JsonProperty("secondClassifyId")
   public void setSecondClassifyId(Long secondClassifyId) {
      this.secondClassifyId = secondClassifyId;
   }

   @JsonProperty("secondClassifyId")
   public Long getSecondClassifyId() {
      return this.secondClassifyId;
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

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }
}
