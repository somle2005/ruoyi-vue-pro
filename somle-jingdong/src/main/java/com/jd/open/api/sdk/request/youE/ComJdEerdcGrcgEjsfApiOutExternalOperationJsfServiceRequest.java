package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.ComJdEerdcGrcgEjsfApiOutExternalOperationJsfServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdEerdcGrcgEjsfApiOutExternalOperationJsfServiceRequest extends AbstractRequest implements JdRequest<ComJdEerdcGrcgEjsfApiOutExternalOperationJsfServiceResponse> {
   private String operType;
   private String jsonData;
   private String extStr;

   public void setOperType(String operType) {
      this.operType = operType;
   }

   public String getOperType() {
      return this.operType;
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
      return "jingdong.com.jd.eerdc.grcg.ejsf.api.out.ExternalOperationJsfService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operType", this.operType);
      pmap.put("jsonData", this.jsonData);
      pmap.put("extStr", this.extStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdEerdcGrcgEjsfApiOutExternalOperationJsfServiceResponse> getResponseClass() {
      return ComJdEerdcGrcgEjsfApiOutExternalOperationJsfServiceResponse.class;
   }
}
