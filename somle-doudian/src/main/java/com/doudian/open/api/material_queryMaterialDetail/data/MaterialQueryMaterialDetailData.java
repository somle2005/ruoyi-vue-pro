package com.doudian.open.api.material_queryMaterialDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialQueryMaterialDetailData {


	@SerializedName("material_info")
	@OpField(desc = "素材详情", example = "")
	private MaterialInfo materialInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialInfo(MaterialInfo materialInfo){
		this.materialInfo = materialInfo;
	}

	
	public MaterialInfo getMaterialInfo(){
		return this.materialInfo;
	}

}