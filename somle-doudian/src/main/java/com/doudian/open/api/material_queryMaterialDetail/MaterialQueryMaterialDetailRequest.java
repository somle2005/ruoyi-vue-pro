package com.doudian.open.api.material_queryMaterialDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_queryMaterialDetail.param.*;

//auto generated, do not edit

public class MaterialQueryMaterialDetailRequest extends DoudianOpRequest<MaterialQueryMaterialDetailParam> {



	@Override
	public String getUrlPath(){
		return "/material/queryMaterialDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialQueryMaterialDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}