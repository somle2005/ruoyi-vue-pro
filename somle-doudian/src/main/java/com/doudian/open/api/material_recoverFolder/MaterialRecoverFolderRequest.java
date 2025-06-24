package com.doudian.open.api.material_recoverFolder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_recoverFolder.param.*;

//auto generated, do not edit

public class MaterialRecoverFolderRequest extends DoudianOpRequest<MaterialRecoverFolderParam> {



	@Override
	public String getUrlPath(){
		return "/material/recoverFolder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialRecoverFolderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}