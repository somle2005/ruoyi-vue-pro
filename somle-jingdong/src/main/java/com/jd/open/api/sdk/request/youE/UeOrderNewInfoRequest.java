package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.UEService.request.info.SiteInfoDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewInfoResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewInfoRequest extends AbstractRequest implements JdRequest<UeOrderNewInfoResponse> {
   private List<SiteInfoDto> siteInfoList;

   public String getApiMethod() {
      return "jingdong.ue.order.new.info";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("siteInfoList", this.siteInfoList);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewInfoResponse> getResponseClass() {
      return UeOrderNewInfoResponse.class;
   }

   @JsonProperty("siteInfoList")
   public void setSiteInfoList(List<SiteInfoDto> siteInfoList) {
      this.siteInfoList = siteInfoList;
   }

   @JsonProperty("siteInfoList")
   public List<SiteInfoDto> getSiteInfoList() {
      return this.siteInfoList;
   }
}
