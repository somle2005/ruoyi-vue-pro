package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialAuditReasonItem {


	@SerializedName("material_type")
	@OpField(desc = "0-主图视频、1-白底图、4-长图、17-测评视频", example = "0")
	private String materialType;

	@SerializedName("reasons")
	@OpField(desc = "素材类型对应的驳回原因", example = "[白底图不符合规范,白底图太黑了]")
	private List<String> reasons;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}

	
	public String getMaterialType(){
		return this.materialType;
	}

	
	public void setReasons(List<String> reasons){
		this.reasons = reasons;
	}

	
	public List<String> getReasons(){
		return this.reasons;
	}

}