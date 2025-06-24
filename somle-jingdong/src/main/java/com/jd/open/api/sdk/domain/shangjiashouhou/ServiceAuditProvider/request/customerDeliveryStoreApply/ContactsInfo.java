package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerDeliveryStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ContactsInfo implements Serializable {
   private String contactsName;
   private String contactsTel;
   private String contactsZipCode;
   private AddressInfo addressInfo;

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
}
