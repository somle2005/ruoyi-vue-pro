package com.jd.open.api.sdk.domain.afsservice.NegotiationQuerySoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class NegotiationCloseDetailDTO implements Serializable {
   private Integer communicationFlag;
   private List<Integer[]> communicateChannels;
   private String communicateChannelsDesc;
   private Integer negotiationProgramme;
   private String negotiationProgrammeDesc;
   private List<String[]> negotiationImages;
   private Integer rejectId;
   private String rejectReasonDesc;

   @JsonProperty("communicationFlag")
   public void setCommunicationFlag(Integer communicationFlag) {
      this.communicationFlag = communicationFlag;
   }

   @JsonProperty("communicationFlag")
   public Integer getCommunicationFlag() {
      return this.communicationFlag;
   }

   @JsonProperty("communicateChannels")
   public void setCommunicateChannels(List<Integer[]> communicateChannels) {
      this.communicateChannels = communicateChannels;
   }

   @JsonProperty("communicateChannels")
   public List<Integer[]> getCommunicateChannels() {
      return this.communicateChannels;
   }

   @JsonProperty("communicateChannelsDesc")
   public void setCommunicateChannelsDesc(String communicateChannelsDesc) {
      this.communicateChannelsDesc = communicateChannelsDesc;
   }

   @JsonProperty("communicateChannelsDesc")
   public String getCommunicateChannelsDesc() {
      return this.communicateChannelsDesc;
   }

   @JsonProperty("negotiationProgramme")
   public void setNegotiationProgramme(Integer negotiationProgramme) {
      this.negotiationProgramme = negotiationProgramme;
   }

   @JsonProperty("negotiationProgramme")
   public Integer getNegotiationProgramme() {
      return this.negotiationProgramme;
   }

   @JsonProperty("negotiationProgrammeDesc")
   public void setNegotiationProgrammeDesc(String negotiationProgrammeDesc) {
      this.negotiationProgrammeDesc = negotiationProgrammeDesc;
   }

   @JsonProperty("negotiationProgrammeDesc")
   public String getNegotiationProgrammeDesc() {
      return this.negotiationProgrammeDesc;
   }

   @JsonProperty("negotiationImages")
   public void setNegotiationImages(List<String[]> negotiationImages) {
      this.negotiationImages = negotiationImages;
   }

   @JsonProperty("negotiationImages")
   public List<String[]> getNegotiationImages() {
      return this.negotiationImages;
   }

   @JsonProperty("rejectId")
   public void setRejectId(Integer rejectId) {
      this.rejectId = rejectId;
   }

   @JsonProperty("rejectId")
   public Integer getRejectId() {
      return this.rejectId;
   }

   @JsonProperty("rejectReasonDesc")
   public void setRejectReasonDesc(String rejectReasonDesc) {
      this.rejectReasonDesc = rejectReasonDesc;
   }

   @JsonProperty("rejectReasonDesc")
   public String getRejectReasonDesc() {
      return this.rejectReasonDesc;
   }
}
