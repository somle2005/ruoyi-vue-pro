package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOldStationQueryOldStationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOldStationQueryOldStationRequest extends AbstractRequest implements JdRequest<UeRecoveryOldStationQueryOldStationResponse> {
   private String code;
   private Integer size;
   private String appid;
   private String stationName;
   private Integer page;

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setSize(Integer size) {
      this.size = size;
   }

   public Integer getSize() {
      return this.size;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setStationName(String stationName) {
      this.stationName = stationName;
   }

   public String getStationName() {
      return this.stationName;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.oldStation.queryOldStation";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("size", this.size);
      pmap.put("appid", this.appid);
      pmap.put("stationName", this.stationName);
      pmap.put("page", this.page);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOldStationQueryOldStationResponse> getResponseClass() {
      return UeRecoveryOldStationQueryOldStationResponse.class;
   }
}
