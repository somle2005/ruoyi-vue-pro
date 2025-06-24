package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ActivityScopeDTO implements Serializable {
   private Integer areaType;
   private List<AreaDTO> areaDTOList;
   private List<String> channelList;
   private List<String> promoChannelList;
   private MemberDTO memberDTO;

   @JsonProperty("areaType")
   public void setAreaType(Integer areaType) {
      this.areaType = areaType;
   }

   @JsonProperty("areaType")
   public Integer getAreaType() {
      return this.areaType;
   }

   @JsonProperty("areaDTOList")
   public void setAreaDTOList(List<AreaDTO> areaDTOList) {
      this.areaDTOList = areaDTOList;
   }

   @JsonProperty("areaDTOList")
   public List<AreaDTO> getAreaDTOList() {
      return this.areaDTOList;
   }

   @JsonProperty("channelList")
   public void setChannelList(List<String> channelList) {
      this.channelList = channelList;
   }

   @JsonProperty("channelList")
   public List<String> getChannelList() {
      return this.channelList;
   }

   @JsonProperty("promoChannelList")
   public void setPromoChannelList(List<String> promoChannelList) {
      this.promoChannelList = promoChannelList;
   }

   @JsonProperty("promoChannelList")
   public List<String> getPromoChannelList() {
      return this.promoChannelList;
   }

   @JsonProperty("memberDTO")
   public void setMemberDTO(MemberDTO memberDTO) {
      this.memberDTO = memberDTO;
   }

   @JsonProperty("memberDTO")
   public MemberDTO getMemberDTO() {
      return this.memberDTO;
   }
}
