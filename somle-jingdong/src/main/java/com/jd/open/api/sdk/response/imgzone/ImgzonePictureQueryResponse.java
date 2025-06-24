package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImgzonePictureQueryResponse extends AbstractResponse {
   private Integer returnCode;
   private String desc;
   private Integer totalNum;
   private List<ImgzoneImgInfo> imgList;

   @JsonProperty("return_code")
   public void setReturnCode(Integer returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public Integer getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("total_num")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("total_num")
   public Integer getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("imgList")
   public void setImgList(List<ImgzoneImgInfo> imgList) {
      this.imgList = imgList;
   }

   @JsonProperty("imgList")
   public List<ImgzoneImgInfo> getImgList() {
      return this.imgList;
   }
}
