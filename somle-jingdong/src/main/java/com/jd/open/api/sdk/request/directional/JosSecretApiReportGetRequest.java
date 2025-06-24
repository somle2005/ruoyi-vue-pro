package com.jd.open.api.sdk.request.directional;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.directional.JosSecretApiReportGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosSecretApiReportGetRequest extends AbstractRequest implements JdRequest<JosSecretApiReportGetResponse> {
   private String serverUrl;
   private Long customerUserId;
   private String businessId;
   private String text;
   private String attribute;

   public String getServerUrl() {
      return this.serverUrl;
   }

   public void setServerUrl(String serverUrl) {
      this.serverUrl = serverUrl;
   }

   public Long getCustomerUserId() {
      return this.customerUserId;
   }

   public void setCustomerUserId(Long customerUserId) {
      this.customerUserId = customerUserId;
   }

   public String getBusinessId() {
      return this.businessId;
   }

   public void setBusinessId(String businessId) {
      this.businessId = businessId;
   }

   public String getText() {
      return this.text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public String getAttribute() {
      return this.attribute;
   }

   public void setAttribute(String attribute) {
      this.attribute = attribute;
   }

   public String getApiMethod() {
      return "jingdong.jos.secret.api.report.get";
   }

   public String getAppJsonParams() throws IOException {
      Map map = new TreeMap();
      map.put("server_url", this.serverUrl);
      map.put("customer_user_id", this.customerUserId);
      map.put("businessId", this.businessId);
      map.put("text", this.text);
      map.put("attribute", this.attribute);
      return JsonUtil.toJson(map);
   }

   public Class<JosSecretApiReportGetResponse> getResponseClass() {
      return JosSecretApiReportGetResponse.class;
   }
}
