package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.http.response.ware.ObjA_Price;
import com.jd.open.api.sdk.domain.mall.http.response.ware.ObjExtAttrCollection;
import com.jd.open.api.sdk.domain.mall.http.response.ware.Paragraph;
import com.jd.open.api.sdk.domain.mall.http.response.ware.Summary;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SearchWareResponse extends AbstractResponse {
   private Summary Summary;
   private List<ObjA_Price> objAPrice;
   private List<ObjExtAttrCollection> ObjExtAttrCollection;
   private List<Paragraph> Paragraph;

   @JsonProperty("Summary")
   public void setSummary(Summary Summary) {
      this.Summary = Summary;
   }

   @JsonProperty("Summary")
   public Summary getSummary() {
      return this.Summary;
   }

   @JsonProperty("ObjA_Price")
   public void setObjAPrice(List<ObjA_Price> objAPrice) {
      this.objAPrice = objAPrice;
   }

   @JsonProperty("ObjA_Price")
   public List<ObjA_Price> getObjAPrice() {
      return this.objAPrice;
   }

   @JsonProperty("ObjExtAttrCollection")
   public void setObjExtAttrCollection(List<ObjExtAttrCollection> ObjExtAttrCollection) {
      this.ObjExtAttrCollection = ObjExtAttrCollection;
   }

   @JsonProperty("ObjExtAttrCollection")
   public List<ObjExtAttrCollection> getObjExtAttrCollection() {
      return this.ObjExtAttrCollection;
   }

   @JsonProperty("Paragraph")
   public void setParagraph(List<Paragraph> Paragraph) {
      this.Paragraph = Paragraph;
   }

   @JsonProperty("Paragraph")
   public List<Paragraph> getParagraph() {
      return this.Paragraph;
   }
}
