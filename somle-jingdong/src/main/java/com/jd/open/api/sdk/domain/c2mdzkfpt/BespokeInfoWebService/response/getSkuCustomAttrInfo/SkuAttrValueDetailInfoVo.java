package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuCustomAttrInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuAttrValueDetailInfoVo implements Serializable {
   private Integer id;
   private String name;
   private int selected;
   private String priceId;
   private double priceCount;
   private int priceSource;
   private Object extMap;
   private List<StagePriceLineVo> stagePriceLines;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
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

   @JsonProperty("selected")
   public void setSelected(int selected) {
      this.selected = selected;
   }

   @JsonProperty("selected")
   public int getSelected() {
      return this.selected;
   }

   @JsonProperty("priceId")
   public void setPriceId(String priceId) {
      this.priceId = priceId;
   }

   @JsonProperty("priceId")
   public String getPriceId() {
      return this.priceId;
   }

   @JsonProperty("priceCount")
   public void setPriceCount(double priceCount) {
      this.priceCount = priceCount;
   }

   @JsonProperty("priceCount")
   public double getPriceCount() {
      return this.priceCount;
   }

   @JsonProperty("priceSource")
   public void setPriceSource(int priceSource) {
      this.priceSource = priceSource;
   }

   @JsonProperty("priceSource")
   public int getPriceSource() {
      return this.priceSource;
   }

   @JsonProperty("extMap")
   public void setExtMap(Object extMap) {
      this.extMap = extMap;
   }

   @JsonProperty("extMap")
   public Object getExtMap() {
      return this.extMap;
   }

   @JsonProperty("stagePriceLines")
   public void setStagePriceLines(List<StagePriceLineVo> stagePriceLines) {
      this.stagePriceLines = stagePriceLines;
   }

   @JsonProperty("stagePriceLines")
   public List<StagePriceLineVo> getStagePriceLines() {
      return this.stagePriceLines;
   }
}
