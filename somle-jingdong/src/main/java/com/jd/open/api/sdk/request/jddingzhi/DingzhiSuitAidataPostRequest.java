package com.jd.open.api.sdk.request.jddingzhi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jddingzhi.DingzhiSuitAidataPostResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DingzhiSuitAidataPostRequest extends AbstractRequest implements JdRequest<DingzhiSuitAidataPostResponse> {
   private String output;
   private String input;
   private String bizNo;
   private String invokeRealTimes;
   private String createTime;
   private String isAdopt;
   private String extInfo;
   private String user;

   public void setOutput(String output) {
      this.output = output;
   }

   public String getOutput() {
      return this.output;
   }

   public void setInput(String input) {
      this.input = input;
   }

   public String getInput() {
      return this.input;
   }

   public void setBizNo(String bizNo) {
      this.bizNo = bizNo;
   }

   public String getBizNo() {
      return this.bizNo;
   }

   public void setInvokeRealTimes(String invokeRealTimes) {
      this.invokeRealTimes = invokeRealTimes;
   }

   public String getInvokeRealTimes() {
      return this.invokeRealTimes;
   }

   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   public String getCreateTime() {
      return this.createTime;
   }

   public void setIsAdopt(String isAdopt) {
      this.isAdopt = isAdopt;
   }

   public String getIsAdopt() {
      return this.isAdopt;
   }

   public void setExtInfo(String extInfo) {
      this.extInfo = extInfo;
   }

   public String getExtInfo() {
      return this.extInfo;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public String getUser() {
      return this.user;
   }

   public String getApiMethod() {
      return "jingdong.dingzhi.suit.aidata.post";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("output", this.output);
      pmap.put("input", this.input);
      pmap.put("bizNo", this.bizNo);
      pmap.put("invokeRealTimes", this.invokeRealTimes);
      pmap.put("createTime", this.createTime);
      pmap.put("isAdopt", this.isAdopt);
      pmap.put("extInfo", this.extInfo);
      pmap.put("user", this.user);
      return JsonUtil.toJson(pmap);
   }

   public Class<DingzhiSuitAidataPostResponse> getResponseClass() {
      return DingzhiSuitAidataPostResponse.class;
   }
}
