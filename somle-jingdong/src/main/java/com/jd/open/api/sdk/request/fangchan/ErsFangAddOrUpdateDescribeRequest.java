package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangAddOrUpdateDescribeResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangAddOrUpdateDescribeRequest extends AbstractRequest implements JdRequest<ErsFangAddOrUpdateDescribeResponse> {
   private Long channelId;
   private String content;
   private Date publishDate;
   private String sourceUrl;
   private Integer cityCode;
   private Long sourceId;
   private Long pSourceId;

   public void setChannelId(Long channelId) {
      this.channelId = channelId;
   }

   public Long getChannelId() {
      return this.channelId;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setPublishDate(Date publishDate) {
      this.publishDate = publishDate;
   }

   public Date getPublishDate() {
      return this.publishDate;
   }

   public void setSourceUrl(String sourceUrl) {
      this.sourceUrl = sourceUrl;
   }

   public String getSourceUrl() {
      return this.sourceUrl;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public void setPSourceId(Long pSourceId) {
      this.pSourceId = pSourceId;
   }

   public Long getPSourceId() {
      return this.pSourceId;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.addOrUpdateDescribe";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("content", this.content);

      try {
         if (this.publishDate != null) {
            pmap.put("publishDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.publishDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("sourceUrl", this.sourceUrl);
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      pmap.put("pSourceId", this.pSourceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangAddOrUpdateDescribeResponse> getResponseClass() {
      return ErsFangAddOrUpdateDescribeResponse.class;
   }
}
