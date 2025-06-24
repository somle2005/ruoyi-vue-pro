package com.doudian.open.api.material_moveMaterialToRecycleBin;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_moveMaterialToRecycleBin.param.*;

//auto generated, do not edit

public class MaterialMoveMaterialToRecycleBinRequest extends DoudianOpRequest<MaterialMoveMaterialToRecycleBinParam> {



	@Override
	public String getUrlPath(){
		return "/material/moveMaterialToRecycleBin";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialMoveMaterialToRecycleBinResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}