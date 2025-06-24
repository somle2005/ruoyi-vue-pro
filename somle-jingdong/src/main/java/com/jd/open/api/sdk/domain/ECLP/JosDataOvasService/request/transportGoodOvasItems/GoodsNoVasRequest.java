package com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.request.transportGoodOvasItems;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GoodsNoVasRequest implements Serializable {
   private String goodsNo;
   private List<VasRequest> vasRequestList;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("vasRequestList")
   public void setVasRequestList(List<VasRequest> vasRequestList) {
      this.vasRequestList = vasRequestList;
   }

   @JsonProperty("vasRequestList")
   public List<VasRequest> getVasRequestList() {
      return this.vasRequestList;
   }
}
