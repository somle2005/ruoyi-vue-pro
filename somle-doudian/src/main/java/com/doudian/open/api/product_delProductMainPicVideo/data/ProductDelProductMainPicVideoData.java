package com.doudian.open.api.product_delProductMainPicVideo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductDelProductMainPicVideoData {


	@SerializedName("material_id")
	@OpField(desc = "删除的素材id", example = "111")
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