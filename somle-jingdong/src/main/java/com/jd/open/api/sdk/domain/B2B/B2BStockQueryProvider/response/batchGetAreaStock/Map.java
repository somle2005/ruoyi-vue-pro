package com.jd.open.api.sdk.domain.B2B.B2BStockQueryProvider.response.batchGetAreaStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Map implements Serializable {
   private Long skuId;
   private String a;
   private String b;
   private String c;
   private String d;
   private String e;
   private String f;
   private String g;
   private String h;
   private String i;
   private String j;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("a")
   public void setA(String a) {
      this.a = a;
   }

   @JsonProperty("a")
   public String getA() {
      return this.a;
   }

   @JsonProperty("b")
   public void setB(String b) {
      this.b = b;
   }

   @JsonProperty("b")
   public String getB() {
      return this.b;
   }

   @JsonProperty("c")
   public void setC(String c) {
      this.c = c;
   }

   @JsonProperty("c")
   public String getC() {
      return this.c;
   }

   @JsonProperty("d")
   public void setD(String d) {
      this.d = d;
   }

   @JsonProperty("d")
   public String getD() {
      return this.d;
   }

   @JsonProperty("e")
   public void setE(String e) {
      this.e = e;
   }

   @JsonProperty("e")
   public String getE() {
      return this.e;
   }

   @JsonProperty("f")
   public void setF(String f) {
      this.f = f;
   }

   @JsonProperty("f")
   public String getF() {
      return this.f;
   }

   @JsonProperty("g")
   public void setG(String g) {
      this.g = g;
   }

   @JsonProperty("g")
   public String getG() {
      return this.g;
   }

   @JsonProperty("h")
   public void setH(String h) {
      this.h = h;
   }

   @JsonProperty("h")
   public String getH() {
      return this.h;
   }

   @JsonProperty("i")
   public void setI(String i) {
      this.i = i;
   }

   @JsonProperty("i")
   public String getI() {
      return this.i;
   }

   @JsonProperty("j")
   public void setJ(String j) {
      this.j = j;
   }

   @JsonProperty("j")
   public String getJ() {
      return this.j;
   }
}
