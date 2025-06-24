package com.jd.open.api.sdk.request.neirong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.neirong.ContentStatusQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ContentStatusQueryRequest extends AbstractRequest implements JdRequest<ContentStatusQueryResponse> {
   private String monitorSource;
   private Integer subPosition;
   private Integer style;
   private String attribute1;
   private Integer contentType;

   public void setMonitorSource(String monitorSource) {
      this.monitorSource = monitorSource;
   }

   public String getMonitorSource() {
      return this.monitorSource;
   }

   public void setSubPosition(Integer subPosition) {
      this.subPosition = subPosition;
   }

   public Integer getSubPosition() {
      return this.subPosition;
   }

   public void setStyle(Integer style) {
      this.style = style;
   }

   public Integer getStyle() {
      return this.style;
   }

   public void setAttribute1(String attribute1) {
      this.attribute1 = attribute1;
   }

   public String getAttribute1() {
      return this.attribute1;
   }

   public void setContentType(Integer contentType) {
      this.contentType = contentType;
   }

   public Integer getContentType() {
      return this.contentType;
   }

   public String getApiMethod() {
      return "jingdong.content.status.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("monitorSource", this.monitorSource);
      pmap.put("subPosition", this.subPosition);
      pmap.put("style", this.style);
      pmap.put("attribute1", this.attribute1);
      pmap.put("contentType", this.contentType);
      return JsonUtil.toJson(pmap);
   }

   public Class<ContentStatusQueryResponse> getResponseClass() {
      return ContentStatusQueryResponse.class;
   }
}
