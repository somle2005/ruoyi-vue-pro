package com.jd.open.api.sdk.domain.website.response;

import com.jd.open.api.sdk.domain.website.order.CanBuyAddress;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class OrderCanBuyCityResponse extends AbstractResponse {
   private List<CanBuyAddress> canBuyAddresses;

   public List<CanBuyAddress> getCanBuyAddresses() {
      return this.canBuyAddresses;
   }

   public void setCanBuyAddresses(List<CanBuyAddress> canBuyAddresses) {
      this.canBuyAddresses = canBuyAddresses;
   }
}
