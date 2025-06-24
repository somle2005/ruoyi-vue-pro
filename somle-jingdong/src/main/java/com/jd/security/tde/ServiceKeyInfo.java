package com.jd.security.tde;

import java.util.ArrayList;
import java.util.List;

public class ServiceKeyInfo {
   private String service;
   private int current_key_version;
   private String grant_usage;
   private List<MKData> keys;

   public String getService() {
      return this.service;
   }

   public void setService(String service) {
      this.service = service;
   }

   public int getCurrent_key_version() {
      return this.current_key_version;
   }

   public void setCurrent_key_version(int current_key_version) {
      this.current_key_version = current_key_version;
   }

   public String getGrant_usage() {
      return this.grant_usage;
   }

   public void setGrant_usage(String grant_usage) {
      this.grant_usage = grant_usage;
   }

   public List<MKData> getKeys() {
      return this.keys;
   }

   public void setKeys(List<MKData> keys) {
      this.keys = keys;
   }

   public ServiceKeyInfo() {
   }

   public ServiceKeyInfo(String service, int version, String grant_usage, ArrayList<MKData> keys) {
      this.service = service;
      this.current_key_version = version;
      this.grant_usage = grant_usage;
      this.keys = new ArrayList();
      this.keys.addAll(keys);
   }
}
