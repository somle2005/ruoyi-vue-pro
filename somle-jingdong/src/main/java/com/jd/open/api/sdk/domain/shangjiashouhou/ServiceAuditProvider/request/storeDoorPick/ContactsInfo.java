package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.storeDoorPick;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ContactsInfo implements Serializable {
   private String contactsName;
   private String contactsTel;
   private String contactsZipCode;
   private AddressInfo addressInfo;
   private String contactsName1;
   private String contactsTel1;
   private String contactsZipCode1;
   private AddressInfo addressInfo1;

   @JsonProperty("contactsName")
   public void setContactsName(String contactsName) {
      this.contactsName = contactsName;
   }

   @JsonProperty("contactsName")
   public String getContactsName() {
      return this.contactsName;
   }

   @JsonProperty("contactsTel")
   public void setContactsTel(String contactsTel) {
      this.contactsTel = contactsTel;
   }

   @JsonProperty("contactsTel")
   public String getContactsTel() {
      return this.contactsTel;
   }

   @JsonProperty("contactsZipCode")
   public void setContactsZipCode(String contactsZipCode) {
      this.contactsZipCode = contactsZipCode;
   }

   @JsonProperty("contactsZipCode")
   public String getContactsZipCode() {
      return this.contactsZipCode;
   }

   @JsonProperty("addressInfo")
   public void setAddressInfo(AddressInfo addressInfo) {
      this.addressInfo = addressInfo;
   }

   @JsonProperty("addressInfo")
   public AddressInfo getAddressInfo() {
      return this.addressInfo;
   }

   @JsonProperty("contactsName1")
   public void setContactsName1(String contactsName1) {
      this.contactsName1 = contactsName1;
   }

   @JsonProperty("contactsName1")
   public String getContactsName1() {
      return this.contactsName1;
   }

   @JsonProperty("contactsTel1")
   public void setContactsTel1(String contactsTel1) {
      this.contactsTel1 = contactsTel1;
   }

   @JsonProperty("contactsTel1")
   public String getContactsTel1() {
      return this.contactsTel1;
   }

   @JsonProperty("contactsZipCode1")
   public void setContactsZipCode1(String contactsZipCode1) {
      this.contactsZipCode1 = contactsZipCode1;
   }

   @JsonProperty("contactsZipCode1")
   public String getContactsZipCode1() {
      return this.contactsZipCode1;
   }

   @JsonProperty("addressInfo1")
   public void setAddressInfo1(AddressInfo addressInfo1) {
      this.addressInfo1 = addressInfo1;
   }

   @JsonProperty("addressInfo1")
   public AddressInfo getAddressInfo1() {
      return this.addressInfo1;
   }
}
