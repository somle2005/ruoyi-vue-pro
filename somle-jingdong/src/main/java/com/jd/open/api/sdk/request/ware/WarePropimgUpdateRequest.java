package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WarePropimgUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgUpdateRequest extends AbstractRequest implements JdRequest<WarePropimgUpdateResponse> {
   private String wareId;
   private String attributeValueId;
   private Boolean isMainPic;
   private String imageId;

   public String getApiMethod() {
      return "360buy.ware.propimg.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("attribute_value_id", this.attributeValueId);
      pmap.put("is_main_pic", this.isMainPic);
      pmap.put("image_id", this.imageId);
      return JsonUtil.toJson(pmap);
   }

   public Class getResponseClass() {
      return WarePropimgUpdateResponse.class;
   }

   public String getAttributeValueId() {
      return this.attributeValueId;
   }

   public void setAttributeValueId(String attributeValueId) {
      this.attributeValueId = attributeValueId;
   }

   public Boolean getMainPic() {
      return this.isMainPic;
   }

   public void setMainPic(Boolean mainPic) {
      this.isMainPic = mainPic;
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
