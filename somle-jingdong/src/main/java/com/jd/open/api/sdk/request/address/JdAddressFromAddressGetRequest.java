package com.jd.open.api.sdk.request.address;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.address.JdAddressFromAddressGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JdAddressFromAddressGetRequest extends AbstractRequest implements JdRequest<JdAddressFromAddressGetResponse> {
   private String userid;
   private String key;
   private int provinceId;
   private int cityId;
   private int countryId;
   private int townId;
   private String address;
   private boolean shipping;

   public void setUserid(String userid) {
      this.userid = userid;
   }

   public String getUserid() {
      return this.userid;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getKey() {
      return this.key;
   }

   public void setProvinceId(int provinceId) {
      this.provinceId = provinceId;
   }

   public int getProvinceId() {
      return this.provinceId;
   }

   public void setCityId(int cityId) {
      this.cityId = cityId;
   }

   public int getCityId() {
      return this.cityId;
   }

   public void setCountryId(int countryId) {
      this.countryId = countryId;
   }

   public int getCountryId() {
      return this.countryId;
   }

   public void setTownId(int townId) {
      this.townId = townId;
   }

   public int getTownId() {
      return this.townId;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setShipping(boolean shipping) {
      this.shipping = shipping;
   }

   public boolean getShipping() {
      return this.shipping;
   }

   public String getApiMethod() {
      return "jingdong.JdAddressFromAddress.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userid", this.userid);
      pmap.put("key", this.key);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countryId", this.countryId);
      pmap.put("townId", this.townId);
      pmap.put("address", this.address);
      pmap.put("shipping", this.shipping);
      return JsonUtil.toJson(pmap);
   }

   public Class<JdAddressFromAddressGetResponse> getResponseClass() {
      return JdAddressFromAddressGetResponse.class;
   }
}
