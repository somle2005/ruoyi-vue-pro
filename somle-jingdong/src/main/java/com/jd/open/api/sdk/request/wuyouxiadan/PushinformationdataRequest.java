package com.jd.open.api.sdk.request.wuyouxiadan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wuyouxiadan.PushinformationdataResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PushinformationdataRequest extends AbstractRequest implements JdRequest<PushinformationdataResponse> {
   private Integer dataType;
   private String jsonData;
   private String extStr;

   public void setDataType(Integer dataType) {
      this.dataType = dataType;
   }

   public Integer getDataType() {
      return this.dataType;
   }

   public void setJsonData(String jsonData) {
      this.jsonData = jsonData;
   }

   public String getJsonData() {
      return this.jsonData;
   }

   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   public String getExtStr() {
      return this.extStr;
   }

   public String getApiMethod() {
      return "jingdong.pushinformationdata";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("dataType", this.dataType);
      pmap.put("jsonData", this.jsonData);
      pmap.put("extStr", this.extStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<PushinformationdataResponse> getResponseClass() {
      return PushinformationdataResponse.class;
   }
}
