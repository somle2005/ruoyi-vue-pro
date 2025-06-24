package com.doudian.open.api.material_searchMaterial;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_searchMaterial.param.*;

//auto generated, do not edit

public class MaterialSearchMaterialRequest extends DoudianOpRequest<MaterialSearchMaterialParam> {



	@Override
	public String getUrlPath(){
		return "/material/searchMaterial";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialSearchMaterialResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}