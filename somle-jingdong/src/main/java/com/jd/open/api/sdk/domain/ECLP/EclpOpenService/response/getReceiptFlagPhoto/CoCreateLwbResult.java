package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getReceiptFlagPhoto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CoCreateLwbResult implements Serializable {
   private int resultCode;
   private String resultMsg;
   private List<B2bLwbBillPhoto> listPhoto;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("listPhoto")
   public void setListPhoto(List<B2bLwbBillPhoto> listPhoto) {
      this.listPhoto = listPhoto;
   }

   @JsonProperty("listPhoto")
   public List<B2bLwbBillPhoto> getListPhoto() {
      return this.listPhoto;
   }
}
