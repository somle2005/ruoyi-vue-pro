package com.doudian.open.api.material_editMaterial;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_editMaterial.param.*;

//auto generated, do not edit

public class MaterialEditMaterialRequest extends DoudianOpRequest<MaterialEditMaterialParam> {



	@Override
	public String getUrlPath(){
		return "/material/editMaterial";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialEditMaterialResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}