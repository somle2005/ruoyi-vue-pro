package com.doudian.open.api.material_recoverMaterial;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_recoverMaterial.param.*;

//auto generated, do not edit

public class MaterialRecoverMaterialRequest extends DoudianOpRequest<MaterialRecoverMaterialParam> {



	@Override
	public String getUrlPath(){
		return "/material/recoverMaterial";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialRecoverMaterialResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}