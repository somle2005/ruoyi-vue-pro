package com.jd.open.api.sdk.response.tools;

import com.jd.open.api.sdk.response.AbstractResponse;

public class TimeGetResponse extends AbstractResponse {
   private String time;

   public String getTime() {
      return this.time;
   }

   public void setTime(String time) {
      this.time = time;
   }
}
