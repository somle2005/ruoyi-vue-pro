package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.UploadFileUrlResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UploadFileUrlRequest extends AbstractRequest implements JdRequest<UploadFileUrlResponse> {
   private String venderId;
   private byte[] imageFile;

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public void setImageFile(byte[] imageFile) {
      this.imageFile = imageFile;
   }

   public byte[] getImageFile() {
      return this.imageFile;
   }

   public String getApiMethod() {
      return "jingdong.uploadFileUrl";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("imageFile", this.imageFile);
      return JsonUtil.toJson(pmap);
   }

   public Class<UploadFileUrlResponse> getResponseClass() {
      return UploadFileUrlResponse.class;
   }
}
