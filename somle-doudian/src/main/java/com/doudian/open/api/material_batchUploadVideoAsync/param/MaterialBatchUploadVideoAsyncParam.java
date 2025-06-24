package com.doudian.open.api.material_batchUploadVideoAsync.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialBatchUploadVideoAsyncParam {


	@SerializedName("materials")
	@OpField(required = true , desc = "素材信息", example= "")
	private List<MaterialsItem> materials;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterials(List<MaterialsItem> materials){
		this.materials = materials;
	}

	
	public List<MaterialsItem> getMaterials(){
		return this.materials;
	}

}