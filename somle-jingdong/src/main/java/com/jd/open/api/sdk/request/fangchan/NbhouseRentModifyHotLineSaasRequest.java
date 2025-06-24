package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.NbhouseRentModifyHotLineSaasResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NbhouseRentModifyHotLineSaasRequest extends AbstractRequest implements JdRequest<NbhouseRentModifyHotLineSaasResponse> {
   private Long id;
   private String phoneName;
   private Integer workHourStart;
   private Integer workHourEnd;
   private String phoneLanding;
   private String type;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setPhoneName(String phoneName) {
      this.phoneName = phoneName;
   }

   public String getPhoneName() {
      return this.phoneName;
   }

   public void setWorkHourStart(Integer workHourStart) {
      this.workHourStart = workHourStart;
   }

   public Integer getWorkHourStart() {
      return this.workHourStart;
   }

   public void setWorkHourEnd(Integer workHourEnd) {
      this.workHourEnd = workHourEnd;
   }

   public Integer getWorkHourEnd() {
      return this.workHourEnd;
   }

   public void setPhoneLanding(String phoneLanding) {
      this.phoneLanding = phoneLanding;
   }

   public String getPhoneLanding() {
      return this.phoneLanding;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.nbhouse.rent.modifyHotLineSaas";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("phoneName", this.phoneName);
      pmap.put("workHourStart", this.workHourStart);
      pmap.put("workHourEnd", this.workHourEnd);
      pmap.put("phoneLanding", this.phoneLanding);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<NbhouseRentModifyHotLineSaasResponse> getResponseClass() {
      return NbhouseRentModifyHotLineSaasResponse.class;
   }
}
