package com.jd.open.api.sdk.response.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.tool.ShortUrlService.response.generateURL.UrlInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ShorturlGenerateURLResponse extends AbstractResponse {
   private UrlInfo generatejdurlResult;

   @JsonProperty("generatejdurl_result")
   public void setGeneratejdurlResult(UrlInfo generatejdurlResult) {
      this.generatejdurlResult = generatejdurlResult;
   }

   @JsonProperty("generatejdurl_result")
   public UrlInfo getGeneratejdurlResult() {
      return this.generatejdurlResult;
   }
}
