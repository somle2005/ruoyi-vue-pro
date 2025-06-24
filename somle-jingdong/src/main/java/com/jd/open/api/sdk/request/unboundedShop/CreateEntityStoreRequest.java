package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.CreateEntityStoreResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CreateEntityStoreRequest extends AbstractRequest implements JdRequest<CreateEntityStoreResponse> {
   private String name;
   private Long addCode;
   private String addName;
   private String coordinate;
   private String phone;
   private String item;
   private String customerId;
   private String categoryName;
   private String extendJson;
   private byte[] imageFile;
   private Long addCode4;
   private String mobile;
   private Long categoryId2;
   private String slogan;
   private Long qualificationId;
   private String startingTime;
   private String endingTime;
   private String imgUrl;
   private Boolean isPermanent;
   private String logoUrl;
   private String storeOpenTimeDayStr;
   private String storeOpenTimeDayJSONArrayString;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setAddCode(Long addCode) {
      this.addCode = addCode;
   }

   public Long getAddCode() {
      return this.addCode;
   }

   public void setAddName(String addName) {
      this.addName = addName;
   }

   public String getAddName() {
      return this.addName;
   }

   public void setCoordinate(String coordinate) {
      this.coordinate = coordinate;
   }

   public String getCoordinate() {
      return this.coordinate;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setItem(String item) {
      this.item = item;
   }

   public String getItem() {
      return this.item;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public String getCustomerId() {
      return this.customerId;
   }

   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   public String getCategoryName() {
      return this.categoryName;
   }

   public void setExtendJson(String extendJson) {
      this.extendJson = extendJson;
   }

   public String getExtendJson() {
      return this.extendJson;
   }

   public void setImageFile(byte[] imageFile) {
      this.imageFile = imageFile;
   }

   public byte[] getImageFile() {
      return this.imageFile;
   }

   public void setAddCode4(Long addCode4) {
      this.addCode4 = addCode4;
   }

   public Long getAddCode4() {
      return this.addCode4;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
   }

   public void setCategoryId2(Long categoryId2) {
      this.categoryId2 = categoryId2;
   }

   public Long getCategoryId2() {
      return this.categoryId2;
   }

   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   public String getSlogan() {
      return this.slogan;
   }

   public void setQualificationId(Long qualificationId) {
      this.qualificationId = qualificationId;
   }

   public Long getQualificationId() {
      return this.qualificationId;
   }

   public void setStartingTime(String startingTime) {
      this.startingTime = startingTime;
   }

   public String getStartingTime() {
      return this.startingTime;
   }

   public void setEndingTime(String endingTime) {
      this.endingTime = endingTime;
   }

   public String getEndingTime() {
      return this.endingTime;
   }

   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   public String getImgUrl() {
      return this.imgUrl;
   }

   public void setIsPermanent(Boolean isPermanent) {
      this.isPermanent = isPermanent;
   }

   public Boolean getIsPermanent() {
      return this.isPermanent;
   }

   public void setLogoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
   }

   public String getLogoUrl() {
      return this.logoUrl;
   }

   public void setStoreOpenTimeDayStr(String storeOpenTimeDayStr) {
      this.storeOpenTimeDayStr = storeOpenTimeDayStr;
   }

   public String getStoreOpenTimeDayStr() {
      return this.storeOpenTimeDayStr;
   }

   public void setStoreOpenTimeDayJSONArrayString(String storeOpenTimeDayJSONArrayString) {
      this.storeOpenTimeDayJSONArrayString = storeOpenTimeDayJSONArrayString;
   }

   public String getStoreOpenTimeDayJSONArrayString() {
      return this.storeOpenTimeDayJSONArrayString;
   }

   public String getApiMethod() {
      return "jingdong.createEntityStore";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("name", this.name);
      pmap.put("addCode", this.addCode);
      pmap.put("addName", this.addName);
      pmap.put("coordinate", this.coordinate);
      pmap.put("phone", this.phone);
      pmap.put("item", this.item);
      pmap.put("customerId", this.customerId);
      pmap.put("categoryName", this.categoryName);
      pmap.put("extendJson", this.extendJson);
      pmap.put("imageFile", this.imageFile);
      pmap.put("addCode4", this.addCode4);
      pmap.put("mobile", this.mobile);
      pmap.put("categoryId2", this.categoryId2);
      pmap.put("slogan", this.slogan);
      pmap.put("qualificationId", this.qualificationId);
      pmap.put("startingTime", this.startingTime);
      pmap.put("endingTime", this.endingTime);
      pmap.put("imgUrl", this.imgUrl);
      pmap.put("isPermanent", this.isPermanent);
      pmap.put("logoUrl", this.logoUrl);
      pmap.put("storeOpenTimeDayStr", this.storeOpenTimeDayStr);
      pmap.put("storeOpenTimeDayJSONArrayString", this.storeOpenTimeDayJSONArrayString);
      return JsonUtil.toJson(pmap);
   }

   public Class<CreateEntityStoreResponse> getResponseClass() {
      return CreateEntityStoreResponse.class;
   }
}
