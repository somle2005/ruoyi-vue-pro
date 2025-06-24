package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class RecycleInfo implements Serializable {
   private BigDecimal realResiduePrice;
   private String nameplatePic;
   private String userVerifyPic;
   private Integer progressing;
   private RecycleCarInfo recycleCarInfo;

   @JsonProperty("realResiduePrice")
   public void setRealResiduePrice(BigDecimal realResiduePrice) {
      this.realResiduePrice = realResiduePrice;
   }

   @JsonProperty("realResiduePrice")
   public BigDecimal getRealResiduePrice() {
      return this.realResiduePrice;
   }

   @JsonProperty("nameplatePic")
   public void setNameplatePic(String nameplatePic) {
      this.nameplatePic = nameplatePic;
   }

   @JsonProperty("nameplatePic")
   public String getNameplatePic() {
      return this.nameplatePic;
   }

   @JsonProperty("userVerifyPic")
   public void setUserVerifyPic(String userVerifyPic) {
      this.userVerifyPic = userVerifyPic;
   }

   @JsonProperty("userVerifyPic")
   public String getUserVerifyPic() {
      return this.userVerifyPic;
   }

   @JsonProperty("progressing")
   public void setProgressing(Integer progressing) {
      this.progressing = progressing;
   }

   @JsonProperty("progressing")
   public Integer getProgressing() {
      return this.progressing;
   }

   @JsonProperty("recycleCarInfo")
   public void setRecycleCarInfo(RecycleCarInfo recycleCarInfo) {
      this.recycleCarInfo = recycleCarInfo;
   }

   @JsonProperty("recycleCarInfo")
   public RecycleCarInfo getRecycleCarInfo() {
      return this.recycleCarInfo;
   }
}
