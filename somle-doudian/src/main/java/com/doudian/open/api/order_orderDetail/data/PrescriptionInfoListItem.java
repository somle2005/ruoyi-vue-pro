package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PrescriptionInfoListItem {


	@SerializedName("consultation_detail")
	@OpField(desc = "问诊单", example = "")
	private ConsultationDetail consultationDetail;

	@SerializedName("prescription_detail")
	@OpField(desc = "处方单", example = "")
	private PrescriptionDetail prescriptionDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setConsultationDetail(ConsultationDetail consultationDetail){
		this.consultationDetail = consultationDetail;
	}

	
	public ConsultationDetail getConsultationDetail(){
		return this.consultationDetail;
	}

	
	public void setPrescriptionDetail(PrescriptionDetail prescriptionDetail){
		this.prescriptionDetail = prescriptionDetail;
	}

	
	public PrescriptionDetail getPrescriptionDetail(){
		return this.prescriptionDetail;
	}

}