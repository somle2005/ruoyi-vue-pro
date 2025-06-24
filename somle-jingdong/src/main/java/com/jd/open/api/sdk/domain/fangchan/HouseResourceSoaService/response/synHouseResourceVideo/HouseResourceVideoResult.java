package com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.synHouseResourceVideo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HouseResourceVideoResult implements Serializable {
   private int code;
   private boolean success;
   private String errorMsg;
   private HouseResourceVideoDTO houseResourceVideoDTO;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("houseResourceVideoDTO")
   public void setHouseResourceVideoDTO(HouseResourceVideoDTO houseResourceVideoDTO) {
      this.houseResourceVideoDTO = houseResourceVideoDTO;
   }

   @JsonProperty("houseResourceVideoDTO")
   public HouseResourceVideoDTO getHouseResourceVideoDTO() {
      return this.houseResourceVideoDTO;
   }
}
