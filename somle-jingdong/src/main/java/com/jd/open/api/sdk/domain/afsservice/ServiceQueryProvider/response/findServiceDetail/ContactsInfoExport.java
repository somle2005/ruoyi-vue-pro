package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ContactsInfoExport implements Serializable {
   private AddressInfoExport addressInfoExport;
   private String contactsName;
   private String contactsTel;
   private String contactsPhone;
   private String contactsZipCode;

   @JsonProperty("addressInfoExport")
   public void setAddressInfoExport(AddressInfoExport addressInfoExport) {
      this.addressInfoExport = addressInfoExport;
   }

   @JsonProperty("addressInfoExport")
   public AddressInfoExport getAddressInfoExport() {
      return this.addressInfoExport;
   }

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

   @JsonProperty("contactsPhone")
   public void setContactsPhone(String contactsPhone) {
      this.contactsPhone = contactsPhone;
   }

   @JsonProperty("contactsPhone")
   public String getContactsPhone() {
      return this.contactsPhone;
   }

   @JsonProperty("contactsZipCode")
   public void setContactsZipCode(String contactsZipCode) {
      this.contactsZipCode = contactsZipCode;
   }

   @JsonProperty("contactsZipCode")
   public String getContactsZipCode() {
      return this.contactsZipCode;
   }
}
