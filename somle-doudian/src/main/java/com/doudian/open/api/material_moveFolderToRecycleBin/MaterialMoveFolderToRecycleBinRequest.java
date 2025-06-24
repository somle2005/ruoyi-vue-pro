package com.doudian.open.api.material_moveFolderToRecycleBin;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_moveFolderToRecycleBin.param.*;

//auto generated, do not edit

public class MaterialMoveFolderToRecycleBinRequest extends DoudianOpRequest<MaterialMoveFolderToRecycleBinParam> {



	@Override
	public String getUrlPath(){
		return "/material/moveFolderToRecycleBin";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialMoveFolderToRecycleBinResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}