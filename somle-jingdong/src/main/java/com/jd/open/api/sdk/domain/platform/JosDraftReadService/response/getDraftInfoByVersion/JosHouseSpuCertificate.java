package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosHouseSpuCertificate implements Serializable {
   private String certificateBound;
   private String certificateName;
   private Date certificateTime;
   private String certificateImg;

   @JsonProperty("certificateBound")
   public void setCertificateBound(String certificateBound) {
      this.certificateBound = certificateBound;
   }

   @JsonProperty("certificateBound")
   public String getCertificateBound() {
      return this.certificateBound;
   }

   @JsonProperty("certificateName")
   public void setCertificateName(String certificateName) {
      this.certificateName = certificateName;
   }

   @JsonProperty("certificateName")
   public String getCertificateName() {
      return this.certificateName;
   }

   @JsonProperty("certificateTime")
   public void setCertificateTime(Date certificateTime) {
      this.certificateTime = certificateTime;
   }

   @JsonProperty("certificateTime")
   public Date getCertificateTime() {
      return this.certificateTime;
   }

   @JsonProperty("certificateImg")
   public void setCertificateImg(String certificateImg) {
      this.certificateImg = certificateImg;
   }

   @JsonProperty("certificateImg")
   public String getCertificateImg() {
      return this.certificateImg;
   }
}
