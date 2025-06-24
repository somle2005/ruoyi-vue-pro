package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzoneIcImageDeleteByQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzoneIcImageDeleteByQueryRequest extends AbstractRequest implements JdRequest<ImgzoneIcImageDeleteByQueryResponse> {
   private String imgId;
   private String imgJfsKey;
   private String operate;

   public void setImgId(String imgId) {
      this.imgId = imgId;
   }

   public String getImgId() {
      return this.imgId;
   }

   public void setImgJfsKey(String imgJfsKey) {
      this.imgJfsKey = imgJfsKey;
   }

   public String getImgJfsKey() {
      return this.imgJfsKey;
   }

   public void setOperate(String operate) {
      this.operate = operate;
   }

   public String getOperate() {
      return this.operate;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.ic.image.deleteByQuery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("imgId", this.imgId);
      pmap.put("imgJfsKey", this.imgJfsKey);
      pmap.put("operate", this.operate);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzoneIcImageDeleteByQueryResponse> getResponseClass() {
      return ImgzoneIcImageDeleteByQueryResponse.class;
   }
}
