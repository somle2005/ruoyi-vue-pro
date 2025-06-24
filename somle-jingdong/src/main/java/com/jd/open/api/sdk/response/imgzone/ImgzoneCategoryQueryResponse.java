package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImgzoneCategoryQueryResponse extends AbstractResponse {
   private int returnCode;
   private String desc1;
   private List<ImgzoneCategory> cateList;

   @JsonProperty("return_code")
   public void setReturnCode(int returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public int getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("desc1")
   public void setDesc1(String desc1) {
      this.desc1 = desc1;
   }

   @JsonProperty("desc1")
   public String getDesc1() {
      return this.desc1;
   }

   @JsonProperty("cateList")
   public void setCateList(List<ImgzoneCategory> cateList) {
      this.cateList = cateList;
   }

   @JsonProperty("cateList")
   public List<ImgzoneCategory> getCateList() {
      return this.cateList;
   }
}
