package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryCheckStockLosses.IsvCheckStock;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpCheckstockQueryCheckStockLossesResponse extends AbstractResponse {
   private List<IsvCheckStock> checkstocklossesList;

   @JsonProperty("checkstocklossesList")
   public void setCheckstocklossesList(List<IsvCheckStock> checkstocklossesList) {
      this.checkstocklossesList = checkstocklossesList;
   }

   @JsonProperty("checkstocklossesList")
   public List<IsvCheckStock> getCheckstocklossesList() {
      return this.checkstocklossesList;
   }
}
