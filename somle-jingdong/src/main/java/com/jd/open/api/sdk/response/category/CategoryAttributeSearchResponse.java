package com.jd.open.api.sdk.response.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryAttributeSearchResponse extends AbstractResponse {
   private List<Attribute> attributes;
   private int total;

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("attributes")
   public List<Attribute> getAttributes() {
      return this.attributes;
   }

   @JsonProperty("attributes")
   public void setAttributes(List<Attribute> attributes) {
      this.attributes = attributes;
   }

   public static class Attribute {
      private long aid;
      private String name;
      private boolean isKeyProp;
      private boolean isColorProp;
      private boolean isSizeProp;
      private boolean isSaleProp;
      private long indexId;
      private String status;
      private String attType;
      private long inputType;
      private String options;
      private String isReq;
      private String isFet;
      private String isNav;
      private String cid;
      private String groupId;

      @JsonProperty("cid")
      public String getCid() {
         return this.cid;
      }

      @JsonProperty("cid")
      public void setCid(String cid) {
         this.cid = cid;
      }

      @JsonProperty("aid")
      public long getAid() {
         return this.aid;
      }

      @JsonProperty("aid")
      public void setAid(long aid) {
         this.aid = aid;
      }

      @JsonProperty("name")
      public String getName() {
         return this.name;
      }

      @JsonProperty("name")
      public void setName(String name) {
         this.name = name;
      }

      @JsonProperty("is_key_prop")
      public boolean getKeyProp() {
         return this.isKeyProp;
      }

      @JsonProperty("is_key_prop")
      public void setKeyProp(boolean keyProp) {
         this.isKeyProp = keyProp;
      }

      @JsonProperty("is_sale_prop")
      public boolean getSaleProp() {
         return this.isSaleProp;
      }

      @JsonProperty("is_sale_prop")
      public void setSaleProp(boolean saleProp) {
         this.isSaleProp = saleProp;
      }

      @JsonProperty("is_color_prop")
      public boolean isColorProp() {
         return this.isColorProp;
      }

      @JsonProperty("is_color_prop")
      public void setColorProp(boolean colorProp) {
         this.isColorProp = colorProp;
      }

      @JsonProperty("is_size_prop")
      public boolean isSizeProp() {
         return this.isSizeProp;
      }

      @JsonProperty("is_size_prop")
      public void setSizeProp(boolean sizeProp) {
         this.isSizeProp = sizeProp;
      }

      @JsonProperty("index_id")
      public long getIndexId() {
         return this.indexId;
      }

      @JsonProperty("index_id")
      public void setIndexId(long indexId) {
         this.indexId = indexId;
      }

      @JsonProperty("status")
      public String getStatus() {
         return this.status;
      }

      @JsonProperty("status")
      public void setStatus(String status) {
         this.status = status;
      }

      @JsonProperty("att_type")
      public String getAttType() {
         return this.attType;
      }

      @JsonProperty("att_type")
      public void setAttType(String attType) {
         this.attType = attType;
      }

      @JsonProperty("input_type")
      public long getInputType() {
         return this.inputType;
      }

      @JsonProperty("input_type")
      public void setInputType(long inputType) {
         this.inputType = inputType;
      }

      @JsonProperty("options")
      public String getOptions() {
         return this.options;
      }

      @JsonProperty("options")
      public void setOptions(String options) {
         this.options = options;
      }

      @JsonProperty("is_req")
      public String getReq() {
         return this.isReq;
      }

      @JsonProperty("is_req")
      public void setReq(String req) {
         this.isReq = req;
      }

      @JsonProperty("is_fet")
      public String getFet() {
         return this.isFet;
      }

      @JsonProperty("is_fet")
      public void setFet(String fet) {
         this.isFet = fet;
      }

      @JsonProperty("is_nav")
      public String getNav() {
         return this.isNav;
      }

      @JsonProperty("is_nav")
      public void setNav(String nav) {
         this.isNav = nav;
      }

      @JsonProperty("group_id")
      public String getGroupId() {
         return this.groupId;
      }

      @JsonProperty("group_id")
      public void setGroupId(String groupId) {
         this.groupId = groupId;
      }
   }
}
