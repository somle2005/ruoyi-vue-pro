package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.validate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuCheckRes implements Serializable {
   private List<SkuErrorVo> errorSkus;
   private Integer total;
   private Integer noPassNo;
   private Integer passNo;

   @JsonProperty("errorSkus")
   public void setErrorSkus(List<SkuErrorVo> errorSkus) {
      this.errorSkus = errorSkus;
   }

   @JsonProperty("errorSkus")
   public List<SkuErrorVo> getErrorSkus() {
      return this.errorSkus;
   }

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("noPassNo")
   public void setNoPassNo(Integer noPassNo) {
      this.noPassNo = noPassNo;
   }

   @JsonProperty("noPassNo")
   public Integer getNoPassNo() {
      return this.noPassNo;
   }

   @JsonProperty("passNo")
   public void setPassNo(Integer passNo) {
      this.passNo = passNo;
   }

   @JsonProperty("passNo")
   public Integer getPassNo() {
      return this.passNo;
   }
}
