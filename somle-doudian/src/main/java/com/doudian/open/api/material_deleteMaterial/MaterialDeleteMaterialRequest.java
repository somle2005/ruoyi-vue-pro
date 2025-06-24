package com.doudian.open.api.material_deleteMaterial;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_deleteMaterial.param.*;

//auto generated, do not edit

public class MaterialDeleteMaterialRequest extends DoudianOpRequest<MaterialDeleteMaterialParam> {



	@Override
	public String getUrlPath(){
		return "/material/deleteMaterial";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialDeleteMaterialResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}