package com.jd.open.api.sdk.request.QL;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.QL.StationinfojosserviceDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StationinfojosserviceDeleteRequest extends AbstractRequest implements JdRequest<StationinfojosserviceDeleteResponse> {
   private String companyCode;
   private String stationCode;

   public void setCompanyCode(String companyCode) {
      this.companyCode = companyCode;
   }

   public String getCompanyCode() {
      return this.companyCode;
   }

   public void setStationCode(String stationCode) {
      this.stationCode = stationCode;
   }

   public String getStationCode() {
      return this.stationCode;
   }

   public String getApiMethod() {
      return "jingdong.stationinfojosservice.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("companyCode", this.companyCode);
      pmap.put("stationCode", this.stationCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<StationinfojosserviceDeleteResponse> getResponseClass() {
      return StationinfojosserviceDeleteResponse.class;
   }
}
