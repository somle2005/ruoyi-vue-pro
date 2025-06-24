package com.jd.open.api.sdk.request.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.category.CategoryAttributeSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryAttributeSearchRequest extends AbstractRequest implements JdRequest<CategoryAttributeSearchResponse> {
   private String cid;
   private String isKeyProp;
   private String isSaleProp;
   private String aid;
   private String fields;

   @JsonProperty("cid")
   public String getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(String cid) {
      this.cid = cid;
   }

   @JsonProperty("is_key_prop")
   public String getKeyProp() {
      return this.isKeyProp;
   }

   @JsonProperty("is_key_prop")
   public void setKeyProp(String keyProp) {
      this.isKeyProp = keyProp;
   }

   @JsonProperty("is_sale_prop")
   public String getSaleProp() {
      return this.isSaleProp;
   }

   @JsonProperty("is_sale_prop")
   public void setSaleProp(String saleProp) {
      this.isSaleProp = saleProp;
   }

   @JsonProperty("aid")
   public String getAid() {
      return this.aid;
   }

   @JsonProperty("aid")
   public void setAid(String aid) {
      this.aid = aid;
   }

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getApiMethod() {
      return "360buy.ware.get.attribute";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("cid", this.cid);
      map.put("aid", this.aid);
      map.put("is_sale_prop", this.isSaleProp);
      map.put("is_key_prop", this.isKeyProp);
      map.put("fields", this.fields);
      return JsonUtil.toJson(map);
   }

   public Class<CategoryAttributeSearchResponse> getResponseClass() {
      return CategoryAttributeSearchResponse.class;
   }
}
