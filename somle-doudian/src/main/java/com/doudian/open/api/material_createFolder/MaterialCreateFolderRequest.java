package com.doudian.open.api.material_createFolder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_createFolder.param.*;

//auto generated, do not edit

public class MaterialCreateFolderRequest extends DoudianOpRequest<MaterialCreateFolderParam> {



	@Override
	public String getUrlPath(){
		return "/material/createFolder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialCreateFolderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}