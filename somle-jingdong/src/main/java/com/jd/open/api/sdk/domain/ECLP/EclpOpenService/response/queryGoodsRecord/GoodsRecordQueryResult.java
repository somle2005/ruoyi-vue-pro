package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsRecord;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GoodsRecordQueryResult implements Serializable {
   private String resultCode;
   private String errMsg;
   private List<GoodsRecord> goodsRecordList;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("goodsRecordList")
   public void setGoodsRecordList(List<GoodsRecord> goodsRecordList) {
      this.goodsRecordList = goodsRecordList;
   }

   @JsonProperty("goodsRecordList")
   public List<GoodsRecord> getGoodsRecordList() {
      return this.goodsRecordList;
   }
}
