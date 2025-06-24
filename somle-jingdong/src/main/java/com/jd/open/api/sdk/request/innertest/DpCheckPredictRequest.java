package com.jd.open.api.sdk.request.innertest;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.innertest.DpCheckPredictResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DpCheckPredictRequest extends AbstractRequest implements JdRequest<DpCheckPredictResponse> {
   private String imgurl;
   private String cateId;

   public void setImgurl(String imgurl) {
      this.imgurl = imgurl;
   }

   public String getImgurl() {
      return this.imgurl;
   }

   public void setCateId(String cateId) {
      this.cateId = cateId;
   }

   public String getCateId() {
      return this.cateId;
   }

   public String getApiMethod() {
      return "jingdong.dp.check.predict";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("imgurl", this.imgurl);
      pmap.put("cate_id", this.cateId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DpCheckPredictResponse> getResponseClass() {
      return DpCheckPredictResponse.class;
   }
}
