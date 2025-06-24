package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImgzoneImageQueryAllResponse extends AbstractResponse {
   private int totalNum;
   private String desc;
   private String returnCode;
   private String scrollId;
   private List<ImgzoneImgInfo> result;

   @JsonProperty("total_num")
   public void setTotalNum(int totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("total_num")
   public int getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("return_code")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("return_code")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("scroll_id")
   public void setScrollId(String scrollId) {
      this.scrollId = scrollId;
   }

   @JsonProperty("scroll_id")
   public String getScrollId() {
      return this.scrollId;
   }

   @JsonProperty("result")
   public void setResult(List<ImgzoneImgInfo> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<ImgzoneImgInfo> getResult() {
      return this.result;
   }
}
