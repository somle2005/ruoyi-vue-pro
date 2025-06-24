package com.jd.open.api.sdk.domain.order.IGlobalOrderProduceServiceForJos.request.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LogisticsGlobalModel implements Serializable {
   private List<String> logiNoList;
   private int packageNum;
   private Long logiCoprId;
   private Integer logiScope;

   @JsonProperty("logiNoList")
   public void setLogiNoList(List<String> logiNoList) {
      this.logiNoList = logiNoList;
   }

   @JsonProperty("logiNoList")
   public List<String> getLogiNoList() {
      return this.logiNoList;
   }

   @JsonProperty("packageNum")
   public void setPackageNum(int packageNum) {
      this.packageNum = packageNum;
   }

   @JsonProperty("packageNum")
   public int getPackageNum() {
      return this.packageNum;
   }

   @JsonProperty("logiCoprId")
   public void setLogiCoprId(Long logiCoprId) {
      this.logiCoprId = logiCoprId;
   }

   @JsonProperty("logiCoprId")
   public Long getLogiCoprId() {
      return this.logiCoprId;
   }

   @JsonProperty("logiScope")
   public void setLogiScope(Integer logiScope) {
      this.logiScope = logiScope;
   }

   @JsonProperty("logiScope")
   public Integer getLogiScope() {
      return this.logiScope;
   }
}
