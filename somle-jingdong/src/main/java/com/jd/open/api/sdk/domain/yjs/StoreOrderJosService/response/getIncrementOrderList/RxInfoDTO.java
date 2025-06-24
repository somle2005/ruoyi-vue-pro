package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getIncrementOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RxInfoDTO implements Serializable {
   private String patientName;
   private String phone;
   private Integer sex;
   private Date birthday;
   private Integer age;
   private String rxPic;
   private List<String> rxPicList;
   private String rxDepartment;
   private String hospitalName;
   private String doctorName;
   private String diagnoseResult;
   private String pharmacistName;
   private String auditOpinion;

   @JsonProperty("patientName")
   public void setPatientName(String patientName) {
      this.patientName = patientName;
   }

   @JsonProperty("patientName")
   public String getPatientName() {
      return this.patientName;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("sex")
   public void setSex(Integer sex) {
      this.sex = sex;
   }

   @JsonProperty("sex")
   public Integer getSex() {
      return this.sex;
   }

   @JsonProperty("birthday")
   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }

   @JsonProperty("birthday")
   public Date getBirthday() {
      return this.birthday;
   }

   @JsonProperty("age")
   public void setAge(Integer age) {
      this.age = age;
   }

   @JsonProperty("age")
   public Integer getAge() {
      return this.age;
   }

   @JsonProperty("rxPic")
   public void setRxPic(String rxPic) {
      this.rxPic = rxPic;
   }

   @JsonProperty("rxPic")
   public String getRxPic() {
      return this.rxPic;
   }

   @JsonProperty("rxPicList")
   public void setRxPicList(List<String> rxPicList) {
      this.rxPicList = rxPicList;
   }

   @JsonProperty("rxPicList")
   public List<String> getRxPicList() {
      return this.rxPicList;
   }

   @JsonProperty("rxDepartment")
   public void setRxDepartment(String rxDepartment) {
      this.rxDepartment = rxDepartment;
   }

   @JsonProperty("rxDepartment")
   public String getRxDepartment() {
      return this.rxDepartment;
   }

   @JsonProperty("hospitalName")
   public void setHospitalName(String hospitalName) {
      this.hospitalName = hospitalName;
   }

   @JsonProperty("hospitalName")
   public String getHospitalName() {
      return this.hospitalName;
   }

   @JsonProperty("doctorName")
   public void setDoctorName(String doctorName) {
      this.doctorName = doctorName;
   }

   @JsonProperty("doctorName")
   public String getDoctorName() {
      return this.doctorName;
   }

   @JsonProperty("diagnoseResult")
   public void setDiagnoseResult(String diagnoseResult) {
      this.diagnoseResult = diagnoseResult;
   }

   @JsonProperty("diagnoseResult")
   public String getDiagnoseResult() {
      return this.diagnoseResult;
   }

   @JsonProperty("pharmacistName")
   public void setPharmacistName(String pharmacistName) {
      this.pharmacistName = pharmacistName;
   }

   @JsonProperty("pharmacistName")
   public String getPharmacistName() {
      return this.pharmacistName;
   }

   @JsonProperty("auditOpinion")
   public void setAuditOpinion(String auditOpinion) {
      this.auditOpinion = auditOpinion;
   }

   @JsonProperty("auditOpinion")
   public String getAuditOpinion() {
      return this.auditOpinion;
   }
}
