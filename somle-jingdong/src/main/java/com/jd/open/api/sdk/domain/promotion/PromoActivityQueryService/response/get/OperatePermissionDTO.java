package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OperatePermissionDTO implements Serializable {
   private Boolean allowOthersOperate;
   private Boolean allowOthersCheck;
   private Boolean allowOtherUserOperate;
   private Boolean allowOtherUserCheck;

   @JsonProperty("allowOthersOperate")
   public void setAllowOthersOperate(Boolean allowOthersOperate) {
      this.allowOthersOperate = allowOthersOperate;
   }

   @JsonProperty("allowOthersOperate")
   public Boolean getAllowOthersOperate() {
      return this.allowOthersOperate;
   }

   @JsonProperty("allowOthersCheck")
   public void setAllowOthersCheck(Boolean allowOthersCheck) {
      this.allowOthersCheck = allowOthersCheck;
   }

   @JsonProperty("allowOthersCheck")
   public Boolean getAllowOthersCheck() {
      return this.allowOthersCheck;
   }

   @JsonProperty("allowOtherUserOperate")
   public void setAllowOtherUserOperate(Boolean allowOtherUserOperate) {
      this.allowOtherUserOperate = allowOtherUserOperate;
   }

   @JsonProperty("allowOtherUserOperate")
   public Boolean getAllowOtherUserOperate() {
      return this.allowOtherUserOperate;
   }

   @JsonProperty("allowOtherUserCheck")
   public void setAllowOtherUserCheck(Boolean allowOtherUserCheck) {
      this.allowOtherUserCheck = allowOtherUserCheck;
   }

   @JsonProperty("allowOtherUserCheck")
   public Boolean getAllowOtherUserCheck() {
      return this.allowOtherUserCheck;
   }
}
