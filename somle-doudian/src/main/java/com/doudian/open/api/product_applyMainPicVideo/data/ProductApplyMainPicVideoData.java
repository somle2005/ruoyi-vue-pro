package com.doudian.open.api.product_applyMainPicVideo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductApplyMainPicVideoData {


	@SerializedName("material_id")
	@OpField(desc = "库中素材ID", example = "7434069266170806000")
	private Long materialId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialId(Long materialId){
		this.materialId = materialId;
	}

	
	public Long getMaterialId(){
		return this.materialId;
	}

}