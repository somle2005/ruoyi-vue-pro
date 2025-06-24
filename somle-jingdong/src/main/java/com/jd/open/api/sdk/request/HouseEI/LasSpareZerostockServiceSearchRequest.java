package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockServiceSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockServiceSearchRequest extends AbstractRequest implements JdRequest<LasSpareZerostockServiceSearchResponse> {
   private String begin;
   private String end;
   private Integer index;
   private String vc;
   private String token;

   public void setBegin(String begin) {
      this.begin = begin;
   }

   public String getBegin() {
      return this.begin;
   }

   public void setEnd(String end) {
      this.end = end;
   }

   public String getEnd() {
      return this.end;
   }

   public void setIndex(Integer index) {
      this.index = index;
   }

   public Integer getIndex() {
      return this.index;
   }

   public void setVc(String vc) {
      this.vc = vc;
   }

   public String getVc() {
      return this.vc;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getToken() {
      return this.token;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.service.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("begin", this.begin);
      pmap.put("end", this.end);
      pmap.put("index", this.index);
      pmap.put("vc", this.vc);
      pmap.put("token", this.token);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockServiceSearchResponse> getResponseClass() {
      return LasSpareZerostockServiceSearchResponse.class;
   }
}
