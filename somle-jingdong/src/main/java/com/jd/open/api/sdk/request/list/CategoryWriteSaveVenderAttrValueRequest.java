package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryWriteSaveVenderAttrValueResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryWriteSaveVenderAttrValueRequest extends AbstractRequest implements JdRequest<CategoryWriteSaveVenderAttrValueResponse> {
   private Long valueId;
   private String attValue;
   private Long attributeId;
   private Long categoryId;
   private Integer indexId;
   private String key;
   private String value;

   public void setValueId(Long valueId) {
      this.valueId = valueId;
   }

   public Long getValueId() {
      return this.valueId;
   }

   public void setAttValue(String attValue) {
      this.attValue = attValue;
   }

   public String getAttValue() {
      return this.attValue;
   }

   public void setAttributeId(Long attributeId) {
      this.attributeId = attributeId;
   }

   public Long getAttributeId() {
      return this.attributeId;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setIndexId(Integer indexId) {
      this.indexId = indexId;
   }

   public Integer getIndexId() {
      return this.indexId;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getKey() {
      return this.key;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }

   public String getApiMethod() {
      return "jingdong.category.write.saveVenderAttrValue";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("valueId", this.valueId);
      pmap.put("attValue", this.attValue);
      pmap.put("attributeId", this.attributeId);
      pmap.put("categoryId", this.categoryId);
      pmap.put("indexId", this.indexId);
      pmap.put("key", this.key);
      pmap.put("value", this.value);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryWriteSaveVenderAttrValueResponse> getResponseClass() {
      return CategoryWriteSaveVenderAttrValueResponse.class;
   }
}
