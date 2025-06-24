package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.NbhouseRentListPlotInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NbhouseRentListPlotInfoRequest extends AbstractRequest implements JdRequest<NbhouseRentListPlotInfoResponse> {
   private Double lat;
   private Double lon;
   private Double distance;
   private String plotName;
   private Integer plotCode;
   private String matchName;
   private Integer currentPage;
   private Integer pageSize;

   public void setLat(Double lat) {
      this.lat = lat;
   }

   public Double getLat() {
      return this.lat;
   }

   public void setLon(Double lon) {
      this.lon = lon;
   }

   public Double getLon() {
      return this.lon;
   }

   public void setDistance(Double distance) {
      this.distance = distance;
   }

   public Double getDistance() {
      return this.distance;
   }

   public void setPlotName(String plotName) {
      this.plotName = plotName;
   }

   public String getPlotName() {
      return this.plotName;
   }

   public void setPlotCode(Integer plotCode) {
      this.plotCode = plotCode;
   }

   public Integer getPlotCode() {
      return this.plotCode;
   }

   public void setMatchName(String matchName) {
      this.matchName = matchName;
   }

   public String getMatchName() {
      return this.matchName;
   }

   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   public Integer getCurrentPage() {
      return this.currentPage;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.nbhouse.rent.listPlotInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("lat", this.lat);
      pmap.put("lon", this.lon);
      pmap.put("distance", this.distance);
      pmap.put("plotName", this.plotName);
      pmap.put("plotCode", this.plotCode);
      pmap.put("matchName", this.matchName);
      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<NbhouseRentListPlotInfoResponse> getResponseClass() {
      return NbhouseRentListPlotInfoResponse.class;
   }
}
