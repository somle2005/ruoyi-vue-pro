package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsNegotiationOperateCreateResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class AfsNegotiationOperateCreateRequest extends AbstractRequest implements JdRequest<AfsNegotiationOperateCreateResponse> {
   private String negotiationReason;
   private Long refId;
   private Integer negotiationPurpose;
   private Integer newCustomerExpect;
   private String newAfsReasons;
   private Integer newAfsReasonId;
   private BigDecimal newRefundMoney;
   private String contactsName;
   private String contactsPhone;
   private String contactsTel;
   private String contactsZipCode;
   private Integer province;
   private Integer city;
   private Integer county;
   private Integer village;
   private String detailAddress;
   private Integer communicationFlag;
   private String communicateChannelsItem;
   private Integer negotiationProgramme;
   private String negotiationProgrammeDesc;
   private String negotiationImagesItem;
   private Integer rejectReason;
   private Integer refundCloseReason;
   private Integer refundReverseReason;
   private Long refundAddressId;

   public void setNegotiationReason(String negotiationReason) {
      this.negotiationReason = negotiationReason;
   }

   public String getNegotiationReason() {
      return this.negotiationReason;
   }

   public void setRefId(Long refId) {
      this.refId = refId;
   }

   public Long getRefId() {
      return this.refId;
   }

   public void setNegotiationPurpose(Integer negotiationPurpose) {
      this.negotiationPurpose = negotiationPurpose;
   }

   public Integer getNegotiationPurpose() {
      return this.negotiationPurpose;
   }

   public void setNewCustomerExpect(Integer newCustomerExpect) {
      this.newCustomerExpect = newCustomerExpect;
   }

   public Integer getNewCustomerExpect() {
      return this.newCustomerExpect;
   }

   public void setNewAfsReasons(String newAfsReasons) {
      this.newAfsReasons = newAfsReasons;
   }

   public String getNewAfsReasons() {
      return this.newAfsReasons;
   }

   public void setNewAfsReasonId(Integer newAfsReasonId) {
      this.newAfsReasonId = newAfsReasonId;
   }

   public Integer getNewAfsReasonId() {
      return this.newAfsReasonId;
   }

   public void setNewRefundMoney(BigDecimal newRefundMoney) {
      this.newRefundMoney = newRefundMoney;
   }

   public BigDecimal getNewRefundMoney() {
      return this.newRefundMoney;
   }

   public void setContactsName(String contactsName) {
      this.contactsName = contactsName;
   }

   public String getContactsName() {
      return this.contactsName;
   }

   public void setContactsPhone(String contactsPhone) {
      this.contactsPhone = contactsPhone;
   }

   public String getContactsPhone() {
      return this.contactsPhone;
   }

   public void setContactsTel(String contactsTel) {
      this.contactsTel = contactsTel;
   }

   public String getContactsTel() {
      return this.contactsTel;
   }

   public void setContactsZipCode(String contactsZipCode) {
      this.contactsZipCode = contactsZipCode;
   }

   public String getContactsZipCode() {
      return this.contactsZipCode;
   }

   public void setProvince(Integer province) {
      this.province = province;
   }

   public Integer getProvince() {
      return this.province;
   }

   public void setCity(Integer city) {
      this.city = city;
   }

   public Integer getCity() {
      return this.city;
   }

   public void setCounty(Integer county) {
      this.county = county;
   }

   public Integer getCounty() {
      return this.county;
   }

   public void setVillage(Integer village) {
      this.village = village;
   }

   public Integer getVillage() {
      return this.village;
   }

   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   public String getDetailAddress() {
      return this.detailAddress;
   }

   public void setCommunicationFlag(Integer communicationFlag) {
      this.communicationFlag = communicationFlag;
   }

   public Integer getCommunicationFlag() {
      return this.communicationFlag;
   }

   public void setCommunicateChannelsItem(String communicateChannelsItem) {
      this.communicateChannelsItem = communicateChannelsItem;
   }

   public String getCommunicateChannelsItem() {
      return this.communicateChannelsItem;
   }

   public void setNegotiationProgramme(Integer negotiationProgramme) {
      this.negotiationProgramme = negotiationProgramme;
   }

   public Integer getNegotiationProgramme() {
      return this.negotiationProgramme;
   }

   public void setNegotiationProgrammeDesc(String negotiationProgrammeDesc) {
      this.negotiationProgrammeDesc = negotiationProgrammeDesc;
   }

   public String getNegotiationProgrammeDesc() {
      return this.negotiationProgrammeDesc;
   }

   public void setNegotiationImagesItem(String negotiationImagesItem) {
      this.negotiationImagesItem = negotiationImagesItem;
   }

   public String getNegotiationImagesItem() {
      return this.negotiationImagesItem;
   }

   public void setRejectReason(Integer rejectReason) {
      this.rejectReason = rejectReason;
   }

   public Integer getRejectReason() {
      return this.rejectReason;
   }

   public void setRefundCloseReason(Integer refundCloseReason) {
      this.refundCloseReason = refundCloseReason;
   }

   public Integer getRefundCloseReason() {
      return this.refundCloseReason;
   }

   public void setRefundReverseReason(Integer refundReverseReason) {
      this.refundReverseReason = refundReverseReason;
   }

   public Integer getRefundReverseReason() {
      return this.refundReverseReason;
   }

   public void setRefundAddressId(Long refundAddressId) {
      this.refundAddressId = refundAddressId;
   }

   public Long getRefundAddressId() {
      return this.refundAddressId;
   }

   public String getApiMethod() {
      return "jingdong.afs.negotiation.operate.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("negotiationReason", this.negotiationReason);
      pmap.put("refId", this.refId);
      pmap.put("negotiationPurpose", this.negotiationPurpose);
      pmap.put("newCustomerExpect", this.newCustomerExpect);
      pmap.put("newAfsReasons", this.newAfsReasons);
      pmap.put("newAfsReasonId", this.newAfsReasonId);
      pmap.put("newRefundMoney", this.newRefundMoney);
      pmap.put("contactsName", this.contactsName);
      pmap.put("contactsPhone", this.contactsPhone);
      pmap.put("contactsTel", this.contactsTel);
      pmap.put("contactsZipCode", this.contactsZipCode);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("village", this.village);
      pmap.put("detailAddress", this.detailAddress);
      pmap.put("communicationFlag", this.communicationFlag);
      pmap.put("communicateChannelsItem", this.communicateChannelsItem);
      pmap.put("negotiationProgramme", this.negotiationProgramme);
      pmap.put("negotiationProgrammeDesc", this.negotiationProgrammeDesc);
      pmap.put("negotiationImagesItem", this.negotiationImagesItem);
      pmap.put("rejectReason", this.rejectReason);
      pmap.put("refundCloseReason", this.refundCloseReason);
      pmap.put("refundReverseReason", this.refundReverseReason);
      pmap.put("refundAddressId", this.refundAddressId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AfsNegotiationOperateCreateResponse> getResponseClass() {
      return AfsNegotiationOperateCreateResponse.class;
   }
}
