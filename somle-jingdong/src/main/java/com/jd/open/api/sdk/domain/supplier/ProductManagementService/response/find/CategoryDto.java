package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CategoryDto implements Serializable {
   private Integer id;
   private String name;
   private Integer depth;
   private Integer cid3;
   private String cid3Name;
   private Integer catState;

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

   @JsonProperty("depth")
   public void setDepth(Integer depth) {
      this.depth = depth;
   }

   @JsonProperty("depth")
   public Integer getDepth() {
      return this.depth;
   }

   @JsonProperty("cid3")
   public void setCid3(Integer cid3) {
      this.cid3 = cid3;
   }

   @JsonProperty("cid3")
   public Integer getCid3() {
      return this.cid3;
   }

   @JsonProperty("cid3_name")
   public void setCid3Name(String cid3Name) {
      this.cid3Name = cid3Name;
   }

   @JsonProperty("cid3_name")
   public String getCid3Name() {
      return this.cid3Name;
   }

   @JsonProperty("catState")
   public void setCatState(Integer catState) {
      this.catState = catState;
   }

   @JsonProperty("catState")
   public Integer getCatState() {
      return this.catState;
   }
}
