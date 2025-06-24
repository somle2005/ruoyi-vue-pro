package com.jd.open.api.sdk.domain.ware.GtinReceiveRpc.request.batchAdd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchAddVo implements Serializable {
   private List<GtinVo> gtinVos;
   private String appName;
   private String ip;
   private String uuid;

   @JsonProperty("gtinVos")
   public void setGtinVos(List<GtinVo> gtinVos) {
      this.gtinVos = gtinVos;
   }

   @JsonProperty("gtinVos")
   public List<GtinVo> getGtinVos() {
      return this.gtinVos;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }
}
