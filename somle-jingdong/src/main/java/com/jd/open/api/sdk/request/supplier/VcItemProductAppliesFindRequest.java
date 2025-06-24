package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemProductAppliesFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemProductAppliesFindRequest extends AbstractRequest implements JdRequest<VcItemProductAppliesFindResponse> {
   private String wareId;
   private String wareName;
   private Integer state;
   private String beginTime;
   private String endTime;
   private int page;
   private int length;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   public String getWareName() {
      return this.wareName;
   }

   public void setState(Integer state) {
      this.state = state;
   }

   public Integer getState() {
      return this.state;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setLength(int length) {
      this.length = length;
   }

   public int getLength() {
      return this.length;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.product.applies.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("ware_name", this.wareName);
      pmap.put("state", this.state);
      pmap.put("begin_time", this.beginTime);
      pmap.put("end_time", this.endTime);
      pmap.put("page", this.page);
      pmap.put("length", this.length);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemProductAppliesFindResponse> getResponseClass() {
      return VcItemProductAppliesFindResponse.class;
   }
}
