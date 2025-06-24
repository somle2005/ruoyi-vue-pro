package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderCartonBySoNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderDTO implements Serializable {
   private String isvSoNo;
   private String soNo;
   private Integer cartonNum;
   private List<CartonDTO> cartonList;

   @JsonProperty("isvSoNo")
   public void setIsvSoNo(String isvSoNo) {
      this.isvSoNo = isvSoNo;
   }

   @JsonProperty("isvSoNo")
   public String getIsvSoNo() {
      return this.isvSoNo;
   }

   @JsonProperty("soNo")
   public void setSoNo(String soNo) {
      this.soNo = soNo;
   }

   @JsonProperty("soNo")
   public String getSoNo() {
      return this.soNo;
   }

   @JsonProperty("cartonNum")
   public void setCartonNum(Integer cartonNum) {
      this.cartonNum = cartonNum;
   }

   @JsonProperty("cartonNum")
   public Integer getCartonNum() {
      return this.cartonNum;
   }

   @JsonProperty("cartonList")
   public void setCartonList(List<CartonDTO> cartonList) {
      this.cartonList = cartonList;
   }

   @JsonProperty("cartonList")
   public List<CartonDTO> getCartonList() {
      return this.cartonList;
   }
}
