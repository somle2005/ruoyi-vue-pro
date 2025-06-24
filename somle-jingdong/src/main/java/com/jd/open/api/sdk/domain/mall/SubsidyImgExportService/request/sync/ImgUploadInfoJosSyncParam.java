package com.jd.open.api.sdk.domain.mall.SubsidyImgExportService.request.sync;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ImgUploadInfoJosSyncParam implements Serializable {
   private Long orderId;
   private List<ImgUploadExtParam> imgExtList;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("imgExtList")
   public void setImgExtList(List<ImgUploadExtParam> imgExtList) {
      this.imgExtList = imgExtList;
   }

   @JsonProperty("imgExtList")
   public List<ImgUploadExtParam> getImgExtList() {
      return this.imgExtList;
   }
}
