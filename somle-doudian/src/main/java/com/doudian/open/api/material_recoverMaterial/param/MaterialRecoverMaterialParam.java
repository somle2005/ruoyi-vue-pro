package com.doudian.open.api.material_recoverMaterial.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialRecoverMaterialParam {


	@SerializedName("material_ids")
	@OpField(required = true , desc = "素材id列表", example= "[7000291764753940780]")
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