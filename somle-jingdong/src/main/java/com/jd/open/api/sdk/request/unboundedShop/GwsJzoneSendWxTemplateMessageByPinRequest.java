package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.GwsJzoneSendWxTemplateMessageByPinResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GwsJzoneSendWxTemplateMessageByPinRequest extends AbstractRequest implements JdRequest<GwsJzoneSendWxTemplateMessageByPinResponse> {
   private String channel;
   private String pin;
   private String appId;
   private String color;
   private String name;
   private String value;
   private String msgUrl;
   private String templateId;
   private String shortTemplateId;
   private String openIdBuyer;
   private String xidBuyer;

   public void setChannel(String channel) {
      this.channel = channel;
   }

   public String getChannel() {
      return this.channel;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getColor() {
      return this.color;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }

   public void setMsgUrl(String msgUrl) {
      this.msgUrl = msgUrl;
   }

   public String getMsgUrl() {
      return this.msgUrl;
   }

   public void setTemplateId(String templateId) {
      this.templateId = templateId;
   }

   public String getTemplateId() {
      return this.templateId;
   }

   public void setShortTemplateId(String shortTemplateId) {
      this.shortTemplateId = shortTemplateId;
   }

   public String getShortTemplateId() {
      return this.shortTemplateId;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.gws.jzone.sendWxTemplateMessageByPin";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channel", this.channel);
      pmap.put("pin", this.pin);
      pmap.put("appId", this.appId);
      pmap.put("color", this.color);
      pmap.put("name", this.name);
      pmap.put("value", this.value);
      pmap.put("msgUrl", this.msgUrl);
      pmap.put("templateId", this.templateId);
      pmap.put("shortTemplateId", this.shortTemplateId);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<GwsJzoneSendWxTemplateMessageByPinResponse> getResponseClass() {
      return GwsJzoneSendWxTemplateMessageByPinResponse.class;
   }
}
