package com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VcWareHouseOutDetailResultJosDto implements Serializable {
   private List<VcWareHouseOutDetailDto> vcWareHouseOutDetailDtos;
   private String remark1;
   private String remark2;
   private String remark3;
   private String remark4;
   private String remark5;
   private Boolean success;
   private String resultMessage;

   @JsonProperty("vcWareHouseOutDetailDtos")
   public void setVcWareHouseOutDetailDtos(List<VcWareHouseOutDetailDto> vcWareHouseOutDetailDtos) {
      this.vcWareHouseOutDetailDtos = vcWareHouseOutDetailDtos;
   }

   @JsonProperty("vcWareHouseOutDetailDtos")
   public List<VcWareHouseOutDetailDto> getVcWareHouseOutDetailDtos() {
      return this.vcWareHouseOutDetailDtos;
   }

   @JsonProperty("remark1")
   public void setRemark1(String remark1) {
      this.remark1 = remark1;
   }

   @JsonProperty("remark1")
   public String getRemark1() {
      return this.remark1;
   }

   @JsonProperty("remark2")
   public void setRemark2(String remark2) {
      this.remark2 = remark2;
   }

   @JsonProperty("remark2")
   public String getRemark2() {
      return this.remark2;
   }

   @JsonProperty("remark3")
   public void setRemark3(String remark3) {
      this.remark3 = remark3;
   }

   @JsonProperty("remark3")
   public String getRemark3() {
      return this.remark3;
   }

   @JsonProperty("remark4")
   public void setRemark4(String remark4) {
      this.remark4 = remark4;
   }

   @JsonProperty("remark4")
   public String getRemark4() {
      return this.remark4;
   }

   @JsonProperty("remark5")
   public void setRemark5(String remark5) {
      this.remark5 = remark5;
   }

   @JsonProperty("remark5")
   public String getRemark5() {
      return this.remark5;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
