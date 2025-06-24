package com.jd.open.api.sdk.domain.qcmd.WishOuterForShopApiService.response.queryWishInfoListSec;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class WishInfoDTO implements Serializable {
   private Integer wishTypeId;
   private Integer wishSourceId;
   private Integer status;
   private String wishNo;
   private String wishInfo;
   private Date created;

   @JsonProperty("wishTypeId")
   public void setWishTypeId(Integer wishTypeId) {
      this.wishTypeId = wishTypeId;
   }

   @JsonProperty("wishTypeId")
   public Integer getWishTypeId() {
      return this.wishTypeId;
   }

   @JsonProperty("wishSourceId")
   public void setWishSourceId(Integer wishSourceId) {
      this.wishSourceId = wishSourceId;
   }

   @JsonProperty("wishSourceId")
   public Integer getWishSourceId() {
      return this.wishSourceId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("wishNo")
   public void setWishNo(String wishNo) {
      this.wishNo = wishNo;
   }

   @JsonProperty("wishNo")
   public String getWishNo() {
      return this.wishNo;
   }

   @JsonProperty("wishInfo")
   public void setWishInfo(String wishInfo) {
      this.wishInfo = wishInfo;
   }

   @JsonProperty("wishInfo")
   public String getWishInfo() {
      return this.wishInfo;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }
}
