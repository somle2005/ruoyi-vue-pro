package com.jd.open.api.sdk.domain.ware.AttrRecogClient.response.preRecognize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RecogAttrInfo implements Serializable {
   private Integer attrGrpId;
   private Integer inputTypeId;
   private List<RecogAttrValue> comAttValues;
   private String level;
   private Integer comAttId;
   private String comAttName;
   private String attrUnit;
   private String inputUnit;
   private Integer attId;
   private String attrGrpName;
   private String inputType;

   @JsonProperty("attrGrpId")
   public void setAttrGrpId(Integer attrGrpId) {
      this.attrGrpId = attrGrpId;
   }

   @JsonProperty("attrGrpId")
   public Integer getAttrGrpId() {
      return this.attrGrpId;
   }

   @JsonProperty("inputTypeId")
   public void setInputTypeId(Integer inputTypeId) {
      this.inputTypeId = inputTypeId;
   }

   @JsonProperty("inputTypeId")
   public Integer getInputTypeId() {
      return this.inputTypeId;
   }

   @JsonProperty("comAttValues")
   public void setComAttValues(List<RecogAttrValue> comAttValues) {
      this.comAttValues = comAttValues;
   }

   @JsonProperty("comAttValues")
   public List<RecogAttrValue> getComAttValues() {
      return this.comAttValues;
   }

   @JsonProperty("level")
   public void setLevel(String level) {
      this.level = level;
   }

   @JsonProperty("level")
   public String getLevel() {
      return this.level;
   }

   @JsonProperty("comAttId")
   public void setComAttId(Integer comAttId) {
      this.comAttId = comAttId;
   }

   @JsonProperty("comAttId")
   public Integer getComAttId() {
      return this.comAttId;
   }

   @JsonProperty("comAttName")
   public void setComAttName(String comAttName) {
      this.comAttName = comAttName;
   }

   @JsonProperty("comAttName")
   public String getComAttName() {
      return this.comAttName;
   }

   @JsonProperty("attrUnit")
   public void setAttrUnit(String attrUnit) {
      this.attrUnit = attrUnit;
   }

   @JsonProperty("attrUnit")
   public String getAttrUnit() {
      return this.attrUnit;
   }

   @JsonProperty("inputUnit")
   public void setInputUnit(String inputUnit) {
      this.inputUnit = inputUnit;
   }

   @JsonProperty("inputUnit")
   public String getInputUnit() {
      return this.inputUnit;
   }

   @JsonProperty("attId")
   public void setAttId(Integer attId) {
      this.attId = attId;
   }

   @JsonProperty("attId")
   public Integer getAttId() {
      return this.attId;
   }

   @JsonProperty("attrGrpName")
   public void setAttrGrpName(String attrGrpName) {
      this.attrGrpName = attrGrpName;
   }

   @JsonProperty("attrGrpName")
   public String getAttrGrpName() {
      return this.attrGrpName;
   }

   @JsonProperty("inputType")
   public void setInputType(String inputType) {
      this.inputType = inputType;
   }

   @JsonProperty("inputType")
   public String getInputType() {
      return this.inputType;
   }
}
