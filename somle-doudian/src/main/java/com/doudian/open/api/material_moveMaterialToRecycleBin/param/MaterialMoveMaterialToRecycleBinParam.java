package com.doudian.open.api.material_moveMaterialToRecycleBin.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialMoveMaterialToRecycleBinParam {


	@SerializedName("material_ids")
	@OpField(required = true , desc = "素材id列表，（1）数量不得超过100；（2）同一级目录下的素材", example= "[7000291764753940780]")
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