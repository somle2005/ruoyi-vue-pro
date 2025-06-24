package com.jd.security.tde;

public class MKData {
   private String id;
   private String key_string;
   private String key_type;
   private long key_exp;
   private long key_effective;
   private int version;
   private int key_status;
   private String key_digest;

   public void setVersion(int v) {
      this.version = v;
   }

   public int getVersion() {
      return this.version;
   }

   public void setId(String v) {
      this.id = v;
   }

   public String getId() {
      return this.id;
   }

   public String getKey_string() {
      return this.key_string;
   }

   public String getKey_type() {
      return this.key_type;
   }

   public void setKey_type(String kt) {
      this.key_type = kt;
   }

   public long getKey_exp() {
      return this.key_exp;
   }

   public long getKey_effective() {
      return this.key_effective;
   }

   public void setKey_exp(long ke) {
      this.key_exp = ke;
   }

   public void setKey_status(int v) {
      this.key_status = v;
   }

   public int getKey_status() {
      return this.key_status;
   }

   public String getKey_digest() {
      return this.key_digest;
   }

   public void setKey_digest(String v) {
      this.key_digest = v;
   }

   public MKData() {
   }

   public MKData(String id, String key_string, int version, String key_type, long key_exp, long effective_ts, int key_status, String key_digest) {
      this.id = id;
      this.key_string = key_string;
      this.key_type = key_type;
      this.key_exp = key_exp;
      this.key_effective = effective_ts;
      this.version = version;
      this.key_status = key_status;
      this.key_digest = key_digest;
   }

   public void setKey_string(String key_string) {
      this.key_string = key_string;
   }

   public void setKey_effective(long key_effective) {
      this.key_effective = key_effective;
   }
}
