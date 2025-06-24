package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;
import java.util.List;

//auto generated, do not edit

public class ProductAuditInfo {


	@SerializedName("material_audit_status")
	@OpField(desc = "素材审核状态，key=素材类型（0-主图视频、1-白底图、4-长图、17-测评视频），value=审核状态（0-初始化 1-审核中 2-审核通过 3-审核不通过）", example = "{  1: 1}")
	private Map<String,Long> materialAuditStatus;

	@SerializedName("material_audit_reason")
	@OpField(desc = "素材审核驳回原因", example = "")
	private List<MaterialAuditReasonItem> materialAuditReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialAuditStatus(Map<String,Long> materialAuditStatus){
		this.materialAuditStatus = materialAuditStatus;
	}

	
	public Map<String,Long> getMaterialAuditStatus(){
		return this.materialAuditStatus;
	}

	
	public void setMaterialAuditReason(List<MaterialAuditReasonItem> materialAuditReason){
		this.materialAuditReason = materialAuditReason;
	}

	
	public List<MaterialAuditReasonItem> getMaterialAuditReason(){
		return this.materialAuditReason;
	}

}