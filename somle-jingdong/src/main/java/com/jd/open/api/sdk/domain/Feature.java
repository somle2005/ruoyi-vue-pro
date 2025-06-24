package com.jd.open.api.sdk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feature {
   private String type = "com.jd.pop.ware.ic.api.domain.Feature";
   private String key;
   private String value;
   private String cn;

   @JsonProperty("@type")
   public String getType() {
      return this.type;
   }

   public Feature() {
   }

   public Feature(String key, String value) {
      this.key = key;
      this.value = value;
   }

   public Feature(String key, String value, String cn) {
      this.key = key;
      this.value = value;
      this.cn = cn;
   }

   public String getKey() {
      return this.key;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getCn() {
      return this.cn;
   }

   public void setCn(String cn) {
      this.cn = cn;
   }

   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Feature [");
      if (this.key != null) {
         builder.append("key=").append(this.key).append(", ");
      }

      if (this.value != null) {
         builder.append("value=").append(this.value).append(", ");
      }

      if (this.cn != null) {
         builder.append("cn=").append(this.cn);
      }

      builder.append("]");
      return builder.toString();
   }
}
