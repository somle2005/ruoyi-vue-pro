package com.jd.open.api.sdk.response.website.ware;

import com.jd.open.api.sdk.domain.website.ware.Region;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class RegionInfoGetResponse extends AbstractResponse {
   private List<Region> regions;

   public List<Region> getRegions() {
      return this.regions;
   }

   public void setRegions(List<Region> regions) {
      this.regions = regions;
   }
}
