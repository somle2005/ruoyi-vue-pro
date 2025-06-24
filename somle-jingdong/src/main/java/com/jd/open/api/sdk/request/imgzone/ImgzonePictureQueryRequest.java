package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzonePictureQueryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureQueryRequest extends AbstractRequest implements JdRequest<ImgzonePictureQueryResponse> {
   private String pictureId;
   private Integer pictureCateId;
   private String pictureName;
   private Date startDate;
   private Date endDate;
   private Integer pageNum;
   private Integer pageSize;

   public void setPictureId(String pictureId) {
      this.pictureId = pictureId;
   }

   public String getPictureId() {
      return this.pictureId;
   }

   public void setPictureCateId(Integer pictureCateId) {
      this.pictureCateId = pictureCateId;
   }

   public Integer getPictureCateId() {
      return this.pictureCateId;
   }

   public void setPictureName(String pictureName) {
      this.pictureName = pictureName;
   }

   public String getPictureName() {
      return this.pictureName;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.picture.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("picture_id", this.pictureId);
      pmap.put("picture_cate_id", this.pictureCateId);
      pmap.put("picture_name", this.pictureName);

      try {
         if (this.startDate != null) {
            pmap.put("start_date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endDate != null) {
            pmap.put("end_Date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("page_num", this.pageNum);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzonePictureQueryResponse> getResponseClass() {
      return ImgzonePictureQueryResponse.class;
   }
}
