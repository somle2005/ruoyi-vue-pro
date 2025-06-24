package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PrescriptionDetail {


	@SerializedName("img_urls")
	@OpField(desc = "处方图片", example = "[xxxxx]")
	private List<String> imgUrls;

	@SerializedName("create_time")
	@OpField(desc = "处方单生成时间戳", example = "1711531958")
	private Long createTime;

	@SerializedName("status")
	@OpField(desc = "处方单状态；1-收单 2-创建处方待审核 3-审核中 4-审核拒绝 5-审核同意 6-审核超时拒绝 20-过期取消", example = "1")
	private String status;

	@SerializedName("consultation_id")
	@OpField(desc = "问诊单 ID", example = "123456")
	private String consultationId;

	@SerializedName("prescription_id")
	@OpField(desc = "处方单 ID", example = "123456")
	private String prescriptionId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setImgUrls(List<String> imgUrls){
		this.imgUrls = imgUrls;
	}

	
	public List<String> getImgUrls(){
		return this.imgUrls;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setStatus(String status){
		this.status = status;
	}

	
	public String getStatus(){
		return this.status;
	}

	
	public void setConsultationId(String consultationId){
		this.consultationId = consultationId;
	}

	
	public String getConsultationId(){
		return this.consultationId;
	}

	
	public void setPrescriptionId(String prescriptionId){
		this.prescriptionId = prescriptionId;
	}

	
	public String getPrescriptionId(){
		return this.prescriptionId;
	}

}