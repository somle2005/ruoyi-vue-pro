package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.FileItem;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdUploadRequest;
import com.jd.open.api.sdk.response.ware.WarePropimgAddResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgAddRequest extends AbstractRequest implements JdUploadRequest<WarePropimgAddResponse> {
   private String wareId;
   private String attributeValueId;
   private Boolean isMainPic;
   private FileItem image;

   public String getApiMethod() {
      return "360buy.ware.propimg.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("attribute_value_id", this.attributeValueId);
      pmap.put("is_main_pic", this.isMainPic);
      return JsonUtil.toJson(pmap);
   }

   public Map<String, FileItem> getFileParams() {
      Map<String, FileItem> params = new HashMap();
      params.put("image", this.image);
      return params;
   }

   public Class getResponseClass() {
      return WarePropimgAddResponse.class;
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

   public FileItem getImage() {
      return this.image;
   }

   public void setImage(FileItem image) {
      this.image = image;
   }
}
