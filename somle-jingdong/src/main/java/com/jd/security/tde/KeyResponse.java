package com.jd.security.tde;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KeyResponse {
   private int status_code;
   private String status_message;
   private String tid;
   private long ts;
   private String enc_service;
   private List<ServiceKeyInfo> service_key_list;
   private int key_cache_disabled;
   private int key_backup_disabled;

   public int getStatus_code() {
      return this.status_code;
   }

   public void setStatus_code(int v) {
      this.status_code = v;
   }

   public String getStatus_message() {
      return this.status_message;
   }

   public void setStatus_message(String v) {
      this.status_message = v;
   }

   public long getTs() {
      return this.ts;
   }

   public void setTs(long v) {
      this.ts = v;
   }

   public int getKey_cache_disabled() {
      return this.key_cache_disabled;
   }

   public int getKey_backup_disabled() {
      return this.key_backup_disabled;
   }

   public String getTid() {
      return this.tid;
   }

   public void setTid(String v) {
      this.tid = v;
   }

   public String getEnc_service() {
      return this.enc_service;
   }

   public List<ServiceKeyInfo> getService_key_list() {
      return this.service_key_list;
   }

   public KeyResponse() {
   }

   public KeyResponse(int status_code, String status_message) {
      this.status_code = status_code;
      this.status_message = status_message;
      this.ts = (new Date()).getTime();
   }

   public void setEnc_service(String enc_service) {
      this.enc_service = enc_service;
   }

   public void setService_key_list(List<ServiceKeyInfo> service_key_list) {
      this.service_key_list = service_key_list;
   }

   public void setKey_cache_disabled(int key_cache_disabled) {
      this.key_cache_disabled = key_cache_disabled;
   }

   public void setKey_backup_disabled(int key_backup_disabled) {
      this.key_backup_disabled = key_backup_disabled;
   }

   public KeyResponse(int status_code, String status_message, int key_cache_disable, int key_backup_disable, String tid, String enc_service, ArrayList<ServiceKeyInfo> serviceKeyInfoList) {
      this.status_code = status_code;
      this.status_message = status_message;
      this.key_cache_disabled = key_cache_disable;
      this.key_backup_disabled = key_backup_disable;
      this.tid = tid;
      this.enc_service = enc_service;
      this.ts = (new Date()).getTime();
      this.service_key_list = new ArrayList();
      this.service_key_list.addAll(serviceKeyInfoList);
   }
}
