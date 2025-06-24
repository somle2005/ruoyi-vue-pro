package com.doudian.open.api.material_deleteMaterial.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialDeleteMaterialParam {


	@SerializedName("material_ids")
	@OpField(required = true , desc = "要删除的素材id列表，最大不得超过100个，只支持删除同一级目录下的素材", example= "[123]")
	private List<String> materialIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialIds(List<String> materialIds){
		this.materialIds = materialIds;
	}

	
	public List<String> getMaterialIds(){
		return this.materialIds;
	}

}