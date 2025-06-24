package com.jd.open.api.sdk;

import com.jd.open.api.sdk.internal.parser.Parser;
import com.jd.open.api.sdk.internal.parser.ParserFactory;
import com.jd.open.api.sdk.internal.util.HttpUtil;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.internal.util.sign.Sign;
import com.jd.open.api.sdk.internal.util.sign.impl.HMacMD5SignImpl;
import com.jd.open.api.sdk.internal.util.sign.impl.HMacSha256SignImpl;
import com.jd.open.api.sdk.internal.util.sign.impl.Md5SignImpl;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.request.JdUploadRequest;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DefaultJdClient implements JdClient {
   public static final String CHARSET_UTF8 = "UTF-8";
   private static final String JSON_PARAM_KEY = "360buy_param_json";
   private static final String OTHER_PARAM_KEY = "other";
   private static final String RESERVE_PARAMS_KEY = "reserveParams";
   private String serverUrl;
   private String accessToken;
   private int connectTimeout;
   private int readTimeout;
   private String appKey;
   private String fuzz;
   private String appSecret;

   public DefaultJdClient(String serverUrl, String accessToken, String appKey, String appSecret) {
      this.connectTimeout = 0;
      this.readTimeout = 0;
      this.serverUrl = serverUrl;
      this.accessToken = accessToken;
      this.appKey = appKey;
      this.appSecret = appSecret;
   }

   public DefaultJdClient(String serverUrl, String accessToken, String appKey, String appSecret, String fuzz) {
      this.connectTimeout = 0;
      this.readTimeout = 0;
      this.serverUrl = serverUrl;
      this.accessToken = accessToken;
      this.appKey = appKey;
      this.appSecret = appSecret;
      this.fuzz = fuzz;
   }

   public DefaultJdClient(String serverUrl, String accessToken, String appKey, String appSecret, int connectTimeout, int readTimeout) {
      this(serverUrl, accessToken, appKey, appSecret);
      this.connectTimeout = connectTimeout;
      this.readTimeout = readTimeout;
   }

   public <T extends AbstractResponse> T execute(JdRequest<T> request) throws Exception {
      String url = this.buildUrl(request);
      Map<String, String> params = new HashMap();
      String json = request.getAppJsonParams();
      params.put("360buy_param_json", json);
      if (request.getOtherParams() != null) {
         params.put("other", request.getOtherParams());
      }

      if (request.getReserveParams() != null) {
         params.put("reserveParams", JsonUtil.toJson(request.getReserveParams()));
      }

      String rsp = null;
      if (request instanceof JdUploadRequest) {
         rsp = HttpUtil.doPost(url, params, ((JdUploadRequest)request).getFileParams(), this.connectTimeout, this.readTimeout, request.getIsvToken());
      } else {
         rsp = HttpUtil.doPost(url, params, this.connectTimeout, this.readTimeout, request.getIsvToken());
      }

      AbstractResponse resp = this.parse(rsp, request.getResponseClass(), request.getApiMethod());
      StringBuffer sb = new StringBuffer();
      sb.append(url).append("&").append("360buy_param_json").append("=").append(json);
      if (request.getReserveParams() != null) {
         sb.append("&").append("reserveParams").append(JsonUtil.toJson(request.getReserveParams()));
      }

      resp.setUrl(sb.toString());
      return (T)resp;
   }

   public <T extends AbstractResponse> String executeToString(JdRequest<T> request) throws Exception {
      String url = this.buildUrl(request);
      Map<String, String> params = new HashMap();
      String json = request.getAppJsonParams();
      params.put("360buy_param_json", json);
      if (request.getOtherParams() != null) {
         params.put("other", request.getOtherParams());
      }

      if (request.getReserveParams() != null) {
         params.put("reserveParams", JsonUtil.toJson(request.getReserveParams()));
      }

      String rsp = null;
      if (request instanceof JdUploadRequest) {
         rsp = HttpUtil.doPost(url, params, ((JdUploadRequest)request).getFileParams(), this.connectTimeout, this.readTimeout, request.getIsvToken());
      } else {
         rsp = HttpUtil.doPost(url, params, this.connectTimeout, this.readTimeout, request.getIsvToken());
      }

      return rsp;
   }

   private <T extends AbstractResponse> String buildUrl(JdRequest<T> request) throws Exception {
      Map<String, String> sysParams = request.getSysParams();
      Map<String, String> pmap = new TreeMap();
      pmap.put("360buy_param_json", request.getAppJsonParams());
      sysParams.put("method", request.getApiMethod());
      sysParams.put("access_token", this.accessToken);
      sysParams.put("app_key", this.appKey);
      if (this.fuzz != null) {
         sysParams.put("jos_result_fuzz", this.fuzz);
      }

      pmap.putAll(sysParams);
      if (request.getReserveParams() != null) {
         pmap.put("reserveParams", JsonUtil.toJson(request.getReserveParams()));
      }

      String sign = this.sign(pmap, this.appSecret);
      sysParams.put("sign", sign);
      StringBuilder sb = new StringBuilder(this.serverUrl);
      sb.append("?");
      sb.append(HttpUtil.buildQuery(sysParams, "UTF-8"));
      return sb.toString();
   }

   private <T extends AbstractResponse> T parse(String rsp, Class<T> responseClass, String apiName) throws JdException {
      Parser parser;
      if (this.serverUrl.endsWith("json")) {
         parser = ParserFactory.getJsonParser();
      } else {
         parser = ParserFactory.getXmlParser();
      }

      return (T)parser.parse(rsp, responseClass, apiName);
   }

   private String sign(Map<String, String> pmap, String appSecret) throws Exception {
      Sign sign = null;
      if ("hmacsha256".equalsIgnoreCase((String)pmap.get("sign_method"))) {
         sign = new HMacSha256SignImpl();
      } else if ("hmacmd5".equalsIgnoreCase((String)pmap.get("sign_method"))) {
         sign = new HMacMD5SignImpl();
      } else {
         sign = new Md5SignImpl();
      }

      return sign.calculateSignature(appSecret, pmap);
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getRequestUrl() {
      return this.serverUrl;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public String getAppSecret() {
      return this.appSecret;
   }
}
