package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderSyncEngineerVaccineResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderSyncEngineerVaccineRequest extends AbstractRequest implements JdRequest<Jd3csOrderSyncEngineerVaccineResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private Date vaccinationDate;
   private Integer isVaccination;
   private String temperature;
   private String identityCard;
   private String vaccineFile;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setVaccinationDate(Date vaccinationDate) {
      this.vaccinationDate = vaccinationDate;
   }

   public Date getVaccinationDate() {
      return this.vaccinationDate;
   }

   public void setIsVaccination(Integer isVaccination) {
      this.isVaccination = isVaccination;
   }

   public Integer getIsVaccination() {
      return this.isVaccination;
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

   public String getApiMethod() {
      return "jingdong.jd3cs.order.syncEngineerVaccine";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);

      try {
         if (this.vaccinationDate != null) {
            pmap.put("vaccinationDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.vaccinationDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("isVaccination", this.isVaccination);
      pmap.put("temperature", this.temperature);
      pmap.put("identityCard", this.identityCard);
      pmap.put("vaccineFile", this.vaccineFile);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderSyncEngineerVaccineResponse> getResponseClass() {
      return Jd3csOrderSyncEngineerVaccineResponse.class;
   }
}
