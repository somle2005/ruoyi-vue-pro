package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ConsultationDetail {


	@SerializedName("patient_info")
	@OpField(desc = "患者信息", example = "")
	private PatientInfo patientInfo;

	@SerializedName("consultation_id")
	@OpField(desc = "问诊单 ID", example = "1234")
	private String consultationId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPatientInfo(PatientInfo patientInfo){
		this.patientInfo = patientInfo;
	}

	
	public PatientInfo getPatientInfo(){
		return this.patientInfo;
	}

	
	public void setConsultationId(String consultationId){
		this.consultationId = consultationId;
	}

	
	public String getConsultationId(){
		return this.consultationId;
	}

}