package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangAddOrUpdateChannelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangAddOrUpdateChannelRequest extends AbstractRequest implements JdRequest<ErsFangAddOrUpdateChannelResponse> {
   private Integer cityCode;
   private Long sourceId;
   private Short businessType;
   private String channelName;
   private String businessLicense;
   private String cityName;
   private String companyLogo;
   private String companyDes;
   private Double purAgentRate;
   private Double sellAgentRate;
   private String purCagentDes;
   private String sellCagentDes;

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public void setBusinessType(Short businessType) {
      this.businessType = businessType;
   }

   public Short getBusinessType() {
      return this.businessType;
   }

   public void setChannelName(String channelName) {
      this.channelName = channelName;
   }

   public String getChannelName() {
      return this.channelName;
   }

   public void setBusinessLicense(String businessLicense) {
      this.businessLicense = businessLicense;
   }

   public String getBusinessLicense() {
      return this.businessLicense;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setCompanyLogo(String companyLogo) {
      this.companyLogo = companyLogo;
   }

   public String getCompanyLogo() {
      return this.companyLogo;
   }

   public void setCompanyDes(String companyDes) {
      this.companyDes = companyDes;
   }

   public String getCompanyDes() {
      return this.companyDes;
   }

   public void setPurAgentRate(Double purAgentRate) {
      this.purAgentRate = purAgentRate;
   }

   public Double getPurAgentRate() {
      return this.purAgentRate;
   }

   public void setSellAgentRate(Double sellAgentRate) {
      this.sellAgentRate = sellAgentRate;
   }

   public Double getSellAgentRate() {
      return this.sellAgentRate;
   }

   public void setPurCagentDes(String purCagentDes) {
      this.purCagentDes = purCagentDes;
   }

   public String getPurCagentDes() {
      return this.purCagentDes;
   }

   public void setSellCagentDes(String sellCagentDes) {
      this.sellCagentDes = sellCagentDes;
   }

   public String getSellCagentDes() {
      return this.sellCagentDes;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.addOrUpdateChannel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      pmap.put("businessType", this.businessType);
      pmap.put("channelName", this.channelName);
      pmap.put("businessLicense", this.businessLicense);
      pmap.put("cityName", this.cityName);
      pmap.put("companyLogo", this.companyLogo);
      pmap.put("companyDes", this.companyDes);
      pmap.put("purAgentRate", this.purAgentRate);
      pmap.put("sellAgentRate", this.sellAgentRate);
      pmap.put("purCagentDes", this.purCagentDes);
      pmap.put("sellCagentDes", this.sellCagentDes);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangAddOrUpdateChannelResponse> getResponseClass() {
      return ErsFangAddOrUpdateChannelResponse.class;
   }
}
