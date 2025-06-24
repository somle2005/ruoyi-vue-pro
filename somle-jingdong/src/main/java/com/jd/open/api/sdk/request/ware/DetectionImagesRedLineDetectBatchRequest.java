package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.DetectionImagesRedLineDetectBatchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

public class DetectionImagesRedLineDetectBatchRequest extends AbstractRequest implements JdRequest<DetectionImagesRedLineDetectBatchResponse> {
   private TimeZone timeZone;
   private String key;
   private Object value;
   private String detectItem;
   private String imageUrl;

   public void setTimeZone(TimeZone timeZone) {
      this.timeZone = timeZone;
   }

   public TimeZone getTimeZone() {
      return this.timeZone;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getKey() {
      return this.key;
   }

   public void setValue(Object value) {
      this.value = value;
   }

   public Object getValue() {
      return this.value;
   }

   public void setDetectItem(String detectItem) {
      this.detectItem = detectItem;
   }

   public String getDetectItem() {
      return this.detectItem;
   }

   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   public String getImageUrl() {
      return this.imageUrl;
   }

   public String getApiMethod() {
      return "jingdong.detection.imagesRedLineDetectBatch";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("timeZone", this.timeZone);
      pmap.put("key", this.key);
      pmap.put("value", this.value);
      pmap.put("detectItem", this.detectItem);
      pmap.put("imageUrl", this.imageUrl);
      return JsonUtil.toJson(pmap);
   }

   public Class<DetectionImagesRedLineDetectBatchResponse> getResponseClass() {
      return DetectionImagesRedLineDetectBatchResponse.class;
   }
}
