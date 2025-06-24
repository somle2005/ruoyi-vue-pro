package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class SysParam implements Serializable {
   private Map<String, Object> sysExt;
   private String appKey;
   private String privateKey;
   private String sysCode;
   private String htCode;
   private String vtCode;
   private int mcChannel;
   private int forceBot;
   private String page;

   @JsonProperty("sysExt")
   public void setSysExt(Map<String, Object> sysExt) {
      this.sysExt = sysExt;
   }

   @JsonProperty("sysExt")
   public Map<String, Object> getSysExt() {
      return this.sysExt;
   }

   @JsonProperty("appKey")
   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   @JsonProperty("appKey")
   public String getAppKey() {
      return this.appKey;
   }

   @JsonProperty("privateKey")
   public void setPrivateKey(String privateKey) {
      this.privateKey = privateKey;
   }

   @JsonProperty("privateKey")
   public String getPrivateKey() {
      return this.privateKey;
   }

   @JsonProperty("sysCode")
   public void setSysCode(String sysCode) {
      this.sysCode = sysCode;
   }

   @JsonProperty("sysCode")
   public String getSysCode() {
      return this.sysCode;
   }

   @JsonProperty("htCode")
   public void setHtCode(String htCode) {
      this.htCode = htCode;
   }

   @JsonProperty("htCode")
   public String getHtCode() {
      return this.htCode;
   }

   @JsonProperty("vtCode")
   public void setVtCode(String vtCode) {
      this.vtCode = vtCode;
   }

   @JsonProperty("vtCode")
   public String getVtCode() {
      return this.vtCode;
   }

   @JsonProperty("mcChannel")
   public void setMcChannel(int mcChannel) {
      this.mcChannel = mcChannel;
   }

   @JsonProperty("mcChannel")
   public int getMcChannel() {
      return this.mcChannel;
   }

   @JsonProperty("forceBot")
   public void setForceBot(int forceBot) {
      this.forceBot = forceBot;
   }

   @JsonProperty("forceBot")
   public int getForceBot() {
      return this.forceBot;
   }

   @JsonProperty("page")
   public void setPage(String page) {
      this.page = page;
   }

   @JsonProperty("page")
   public String getPage() {
      return this.page;
   }
}
