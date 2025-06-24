package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.NbhouseRentSpuPublishServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NbhouseRentSpuPublishServiceRequest extends AbstractRequest implements JdRequest<NbhouseRentSpuPublishServiceResponse> {
   private Long staffId;
   private Long plotId;
   private Long spuId;
   private String spuName;
   private Long skuId;
   private String skuName;
   private String houseSourceCode;

   public void setStaffId(Long staffId) {
      this.staffId = staffId;
   }

   public Long getStaffId() {
      return this.staffId;
   }

   public void setPlotId(Long plotId) {
      this.plotId = plotId;
   }

   public Long getPlotId() {
      return this.plotId;
   }

   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   public Long getSpuId() {
      return this.spuId;
   }

   public void setSpuName(String spuName) {
      this.spuName = spuName;
   }

   public String getSpuName() {
      return this.spuName;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public String getSkuName() {
      return this.skuName;
   }

   public void setHouseSourceCode(String houseSourceCode) {
      this.houseSourceCode = houseSourceCode;
   }

   public String getHouseSourceCode() {
      return this.houseSourceCode;
   }

   public String getApiMethod() {
      return "jingdong.nbhouse.rent.spu.publishService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("staffId", this.staffId);
      pmap.put("plotId", this.plotId);
      pmap.put("spuId", this.spuId);
      pmap.put("spuName", this.spuName);
      pmap.put("skuId", this.skuId);
      pmap.put("skuName", this.skuName);
      pmap.put("houseSourceCode", this.houseSourceCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<NbhouseRentSpuPublishServiceResponse> getResponseClass() {
      return NbhouseRentSpuPublishServiceResponse.class;
   }
}
