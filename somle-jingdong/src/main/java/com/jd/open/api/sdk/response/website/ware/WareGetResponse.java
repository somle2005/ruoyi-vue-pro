package com.jd.open.api.sdk.response.website.ware;

import com.jd.open.api.sdk.domain.website.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareGetResponse extends AbstractResponse {
   private Ware wareModel;

   public Ware getWareModel() {
      return this.wareModel;
   }

   public void setWareModel(Ware wareModel) {
      this.wareModel = wareModel;
   }
}
