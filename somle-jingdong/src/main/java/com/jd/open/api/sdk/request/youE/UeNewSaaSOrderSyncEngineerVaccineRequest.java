package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderSyncEngineerVaccineResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderSyncEngineerVaccineRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderSyncEngineerVaccineResponse> {
   private String venderCode;
   private Integer isVaccination;
   private String appId;
   private String temperature;
   private String identityCard;
   private String vaccineFile;
   private Date vaccinationDate;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setIsVaccination(Integer isVaccination) {
      this.isVaccination = isVaccination;
   }

   public Integer getIsVaccination() {
      return this.isVaccination;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setTemperature(String temperature) {
      this.temperature = temperature;
   }

   public String getTemperature() {
      return this.temperature;
   }

   public void setIdentityCard(String identityCard) {
      this.identityCard = identityCard;
   }

   public String getIdentityCard() {
      return this.identityCard;
   }

   public void setVaccineFile(String vaccineFile) {
      this.vaccineFile = vaccineFile;
   }

   public String getVaccineFile() {
      return this.vaccineFile;
   }

   public void setVaccinationDate(Date vaccinationDate) {
      this.vaccinationDate = vaccinationDate;
   }

   public Date getVaccinationDate() {
      return this.vaccinationDate;
   }

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.syncEngineerVaccine";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("isVaccination", this.isVaccination);
      pmap.put("appId", this.appId);
      pmap.put("temperature", this.temperature);
      pmap.put("identityCard", this.identityCard);
      pmap.put("vaccineFile", this.vaccineFile);

      try {
         if (this.vaccinationDate != null) {
            pmap.put("vaccinationDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.vaccinationDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderSyncEngineerVaccineResponse> getResponseClass() {
      return UeNewSaaSOrderSyncEngineerVaccineResponse.class;
   }
}
