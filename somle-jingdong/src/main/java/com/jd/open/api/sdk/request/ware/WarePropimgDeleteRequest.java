package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WarePropimgDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgDeleteRequest extends AbstractRequest implements JdRequest<WarePropimgDeleteResponse> {
   private String wareId;
   private String attributeValueId;
   private String imageId;

   public String getApiMethod() {
      return "360buy.ware.propimg.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("attribute_value_id", this.attributeValueId);
      pmap.put("image_id", this.imageId);
      return JsonUtil.toJson(pmap);
   }

   public Class getResponseClass() {
      return WarePropimgDeleteResponse.class;
   }

   public String getAttributeValueId() {
      return this.attributeValueId;
   }

   public void setAttributeValueId(String attributeValueId) {
      this.attributeValueId = attributeValueId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getImageId() {
      return this.imageId;
   }

   public void setImageId(String imageId) {
      this.imageId = imageId;
   }
}
