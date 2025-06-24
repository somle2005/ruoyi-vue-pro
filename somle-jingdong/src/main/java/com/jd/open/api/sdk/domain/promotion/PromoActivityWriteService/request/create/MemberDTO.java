package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MemberDTO implements Serializable {
   private JdMemberDTO jdMemberDTO;
   private Integer plusMemeber;
   private Integer qqMemeber;
   private Integer shopMember;
   private Integer samMember;

   @JsonProperty("jdMemberDTO")
   public void setJdMemberDTO(JdMemberDTO jdMemberDTO) {
      this.jdMemberDTO = jdMemberDTO;
   }

   @JsonProperty("jdMemberDTO")
   public JdMemberDTO getJdMemberDTO() {
      return this.jdMemberDTO;
   }

   @JsonProperty("plusMemeber")
   public void setPlusMemeber(Integer plusMemeber) {
      this.plusMemeber = plusMemeber;
   }

   @JsonProperty("plusMemeber")
   public Integer getPlusMemeber() {
      return this.plusMemeber;
   }

   @JsonProperty("qqMemeber")
   public void setQqMemeber(Integer qqMemeber) {
      this.qqMemeber = qqMemeber;
   }

   @JsonProperty("qqMemeber")
   public Integer getQqMemeber() {
      return this.qqMemeber;
   }

   @JsonProperty("shopMember")
   public void setShopMember(Integer shopMember) {
      this.shopMember = shopMember;
   }

   @JsonProperty("shopMember")
   public Integer getShopMember() {
      return this.shopMember;
   }

   @JsonProperty("samMember")
   public void setSamMember(Integer samMember) {
      this.samMember = samMember;
   }

   @JsonProperty("samMember")
   public Integer getSamMember() {
      return this.samMember;
   }
}
