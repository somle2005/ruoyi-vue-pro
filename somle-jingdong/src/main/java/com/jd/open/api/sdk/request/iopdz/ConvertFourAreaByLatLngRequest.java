package com.jd.open.api.sdk.request.iopdz;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.iopdz.ConvertFourAreaByLatLngResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ConvertFourAreaByLatLngRequest extends AbstractRequest implements JdRequest<ConvertFourAreaByLatLngResponse> {
   private double latitude;
   private double longitude;

   public void setLatitude(double latitude) {
      this.latitude = latitude;
   }

   public double getLatitude() {
      return this.latitude;
   }

   public void setLongitude(double longitude) {
      this.longitude = longitude;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public String getApiMethod() {
      return "jingdong.convertFourAreaByLatLng";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("latitude", this.latitude);
      pmap.put("longitude", this.longitude);
      return JsonUtil.toJson(pmap);
   }

   public Class<ConvertFourAreaByLatLngResponse> getResponseClass() {
      return ConvertFourAreaByLatLngResponse.class;
   }
}
