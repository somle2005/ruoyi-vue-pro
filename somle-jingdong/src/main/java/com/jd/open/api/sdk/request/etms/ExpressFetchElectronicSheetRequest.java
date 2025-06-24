package com.jd.open.api.sdk.request.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet.PrintObject;
import com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet.PrintTemplate;
import com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet.UserEnv;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.ExpressFetchElectronicSheetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ExpressFetchElectronicSheetRequest extends AbstractRequest implements JdRequest<ExpressFetchElectronicSheetResponse> {
   private PrintObject printObject;
   private UserEnv userEnv;
   private PrintTemplate printTemplate;

   public String getApiMethod() {
      return "jingdong.express.fetch.electronic.sheet";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("printObject", this.printObject);
      pmap.put("userEnv", this.userEnv);
      pmap.put("printTemplate", this.printTemplate);
      return JsonUtil.toJson(pmap);
   }

   public Class<ExpressFetchElectronicSheetResponse> getResponseClass() {
      return ExpressFetchElectronicSheetResponse.class;
   }

   @JsonProperty("printObject")
   public void setPrintObject(PrintObject printObject) {
      this.printObject = printObject;
   }

   @JsonProperty("printObject")
   public PrintObject getPrintObject() {
      return this.printObject;
   }

   @JsonProperty("userEnv")
   public void setUserEnv(UserEnv userEnv) {
      this.userEnv = userEnv;
   }

   @JsonProperty("userEnv")
   public UserEnv getUserEnv() {
      return this.userEnv;
   }

   @JsonProperty("printTemplate")
   public void setPrintTemplate(PrintTemplate printTemplate) {
      this.printTemplate = printTemplate;
   }

   @JsonProperty("printTemplate")
   public PrintTemplate getPrintTemplate() {
      return this.printTemplate;
   }
}
