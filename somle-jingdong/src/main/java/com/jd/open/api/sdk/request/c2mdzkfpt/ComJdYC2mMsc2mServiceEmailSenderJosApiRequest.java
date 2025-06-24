package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.ComJdYC2mMsc2mServiceEmailSenderJosApiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdYC2mMsc2mServiceEmailSenderJosApiRequest extends AbstractRequest implements JdRequest<ComJdYC2mMsc2mServiceEmailSenderJosApiResponse> {
   private String lastName;
   private String firstName;
   private String password;
   private String phoneNumber;
   private String city;
   private String domain;
   private String companyName;
   private String postalCode;
   private String addressLine1;
   private String id;
   private String userName;
   private String email;

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setDomain(String domain) {
      this.domain = domain;
   }

   public String getDomain() {
      return this.domain;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public String getPostalCode() {
      return this.postalCode;
   }

   public void setAddressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
   }

   public String getAddressLine1() {
      return this.addressLine1;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getId() {
      return this.id;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserName() {
      return this.userName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public String getApiMethod() {
      return "jingdong.com.jd.y.c2m.msc2m.service.EmailSenderJosApi";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("lastName", this.lastName);
      pmap.put("firstName", this.firstName);
      pmap.put("password", this.password);
      pmap.put("phoneNumber", this.phoneNumber);
      pmap.put("city", this.city);
      pmap.put("domain", this.domain);
      pmap.put("companyName", this.companyName);
      pmap.put("postalCode", this.postalCode);
      pmap.put("addressLine1", this.addressLine1);
      pmap.put("id", this.id);
      pmap.put("userName", this.userName);
      pmap.put("email", this.email);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdYC2mMsc2mServiceEmailSenderJosApiResponse> getResponseClass() {
      return ComJdYC2mMsc2mServiceEmailSenderJosApiResponse.class;
   }
}
