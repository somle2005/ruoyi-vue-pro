package com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.request.transportGoodOvasItems;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosGoodsOvasRequest implements Serializable {
   private String deptName;
   private List<GoodsNoVasRequest> goodsNoVasRequestList;
   private String sellerName;
   private Long deptId;
   private String sellerNo;
   private String deptNo;

   @JsonProperty("deptName")
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String getDeptName() {
      return this.deptName;
   }

   @JsonProperty("goodsNoVasRequestList")
   public void setGoodsNoVasRequestList(List<GoodsNoVasRequest> goodsNoVasRequestList) {
      this.goodsNoVasRequestList = goodsNoVasRequestList;
   }

   @JsonProperty("goodsNoVasRequestList")
   public List<GoodsNoVasRequest> getGoodsNoVasRequestList() {
      return this.goodsNoVasRequestList;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("deptId")
   public void setDeptId(Long deptId) {
      this.deptId = deptId;
   }

   @JsonProperty("deptId")
   public Long getDeptId() {
      return this.deptId;
   }

   @JsonProperty("sellerNo")
   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }
}
