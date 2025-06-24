package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedGetServiceProjectInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedGetServiceProjectInfoRequest extends AbstractRequest implements JdRequest<YipCustomizedGetServiceProjectInfoResponse> {
   private Integer secondCdCode;
   private Integer firstCdCode;
   private Integer thirdCdCode;
   private String skuId;

   public void setSecondCdCode(Integer secondCdCode) {
      this.secondCdCode = secondCdCode;
   }

   public Integer getSecondCdCode() {
      return this.secondCdCode;
   }

   public void setFirstCdCode(Integer firstCdCode) {
      this.firstCdCode = firstCdCode;
   }

   public Integer getFirstCdCode() {
      return this.firstCdCode;
   }

   public void setThirdCdCode(Integer thirdCdCode) {
      this.thirdCdCode = thirdCdCode;
   }

   public Integer getThirdCdCode() {
      return this.thirdCdCode;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.yip.customized.getServiceProjectInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("secondCdCode", this.secondCdCode);
      pmap.put("firstCdCode", this.firstCdCode);
      pmap.put("thirdCdCode", this.thirdCdCode);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedGetServiceProjectInfoResponse> getResponseClass() {
      return YipCustomizedGetServiceProjectInfoResponse.class;
   }
}
