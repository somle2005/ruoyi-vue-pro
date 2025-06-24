package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasImHfsOrderSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasImHfsOrderSearchRequest extends AbstractRequest implements JdRequest<LasImHfsOrderSearchResponse> {
   private String code;
   private Integer offset;
   private String no;
   private String token;

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   public Integer getOffset() {
      return this.offset;
   }

   public void setNo(String no) {
      this.no = no;
   }

   public String getNo() {
      return this.no;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getToken() {
      return this.token;
   }

   public String getApiMethod() {
      return "jingdong.las.im.hfs.order.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("offset", this.offset);
      pmap.put("no", this.no);
      pmap.put("token", this.token);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasImHfsOrderSearchResponse> getResponseClass() {
      return LasImHfsOrderSearchResponse.class;
   }
}
