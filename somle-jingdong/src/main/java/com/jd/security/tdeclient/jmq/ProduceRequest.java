package com.jd.security.tdeclient.jmq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.directional.JosSecretApiReportGetRequest;
import java.io.IOException;
import java.util.HashMap;

public class ProduceRequest<T extends BasicMessage> {
   String token;
   String serverUrl;
   T messages;

   public String getToken() {
      return this.token;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getServerUrl() {
      return this.serverUrl;
   }

   public void setServerUrl(String serverUrl) {
      this.serverUrl = serverUrl;
   }

   public T getMessages() {
      return this.messages;
   }

   public void setMessages(T messages) {
      this.messages = messages;
   }

   public ProduceRequest(String token, String serverUrl, T messages) {
      this.token = token;
      this.serverUrl = serverUrl;
      this.messages = messages;
   }

   public static ProduceRequest getInitRequest(String token, String serverUrl, String host, String service, String sdkVer, String env) {
      return new ProduceRequest(token, serverUrl, new InitMessage(host, service, sdkVer, env));
   }

   public static ProduceRequest getEventRequest(String token, String serverUrl, String host, String service, String sdkVer, String env, int event_code, String event) {
      return new ProduceRequest(token, serverUrl, new EventMessage(host, service, sdkVer, env, event_code, event));
   }

   public static ProduceRequest getKPEventRequest(String token, String serverUrl, String host, String service, String sdkVer, String env, int event_code, String event, int major_kver, HashMap<String, Integer> keylist) {
      return new ProduceRequest(token, serverUrl, new KPEventMessage(host, service, sdkVer, env, event_code, event, major_kver, keylist));
   }

   public static ProduceRequest getErrorRequest(String token, String serverUrl, String host, String service, String sdkVer, String env, int level, int err_code, String err_msg, String stack_trace) {
      return new ProduceRequest(token, serverUrl, new ErrorMessage(host, service, sdkVer, env, level, err_code, err_msg, stack_trace));
   }

   public static ProduceRequest getStatisticRequest(String token, String serverUrl, String host, String service, String sdkVer, String env, long[] stat) {
      return new ProduceRequest(token, serverUrl, new StatisticMessage(host, service, sdkVer, env, stat));
   }

   public JosSecretApiReportGetRequest convertToJosSecretApiReportRequest() throws IOException {
      JosSecretApiReportGetRequest josSecretApiReportGetRequest = new JosSecretApiReportGetRequest();
      josSecretApiReportGetRequest.setBusinessId(this.messages.getBusinessId());
      josSecretApiReportGetRequest.setServerUrl(this.serverUrl);
      josSecretApiReportGetRequest.setText(this.messages.getText());
      josSecretApiReportGetRequest.setAttribute(JsonUtil.toJson(this.messages.getAttributes()));
      return josSecretApiReportGetRequest;
   }
}
