package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.IsvAddisvlogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsvAddisvlogRequest extends AbstractRequest implements JdRequest<IsvAddisvlogResponse> {
   private String account;
   private String clientIp;
   private String operationTime;
   private String operationContent;
   private String useIsvAppkey;
   private String reqjosUrl;
   private String touchNumber;
   private String touchFiles;

   public void setAccount(String account) {
      this.account = account;
   }

   public String getAccount() {
      return this.account;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public void setOperationTime(String operationTime) {
      this.operationTime = operationTime;
   }

   public String getOperationTime() {
      return this.operationTime;
   }

   public void setOperationContent(String operationContent) {
      this.operationContent = operationContent;
   }

   public String getOperationContent() {
      return this.operationContent;
   }

   public void setUseIsvAppkey(String useIsvAppkey) {
      this.useIsvAppkey = useIsvAppkey;
   }

   public String getUseIsvAppkey() {
      return this.useIsvAppkey;
   }

   public void setReqjosUrl(String reqjosUrl) {
      this.reqjosUrl = reqjosUrl;
   }

   public String getReqjosUrl() {
      return this.reqjosUrl;
   }

   public void setTouchNumber(String touchNumber) {
      this.touchNumber = touchNumber;
   }

   public String getTouchNumber() {
      return this.touchNumber;
   }

   public void setTouchFiles(String touchFiles) {
      this.touchFiles = touchFiles;
   }

   public String getTouchFiles() {
      return this.touchFiles;
   }

   public String getApiMethod() {
      return "jingdong.isv.addisvlog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("account", this.account);
      pmap.put("clientIp", this.clientIp);
      pmap.put("operationTime", this.operationTime);
      pmap.put("operationContent", this.operationContent);
      pmap.put("useIsvAppkey", this.useIsvAppkey);
      pmap.put("reqjosUrl", this.reqjosUrl);
      pmap.put("touchNumber", this.touchNumber);
      pmap.put("touchFiles", this.touchFiles);
      return JsonUtil.toJson(pmap);
   }

   public Class<IsvAddisvlogResponse> getResponseClass() {
      return IsvAddisvlogResponse.class;
   }
}
