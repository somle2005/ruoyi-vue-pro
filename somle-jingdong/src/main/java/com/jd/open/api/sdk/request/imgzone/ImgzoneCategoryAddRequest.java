package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzoneCategoryAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzoneCategoryAddRequest extends AbstractRequest implements JdRequest<ImgzoneCategoryAddResponse> {
   private String cateName;
   private Long parentCateId;

   public void setCateName(String cateName) {
      this.cateName = cateName;
   }

   public String getCateName() {
      return this.cateName;
   }

   public void setParentCateId(Long parentCateId) {
      this.parentCateId = parentCateId;
   }

   public Long getParentCateId() {
      return this.parentCateId;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.category.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cate_name", this.cateName);
      pmap.put("parent_cate_id", this.parentCateId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzoneCategoryAddResponse> getResponseClass() {
      return ImgzoneCategoryAddResponse.class;
   }
}
