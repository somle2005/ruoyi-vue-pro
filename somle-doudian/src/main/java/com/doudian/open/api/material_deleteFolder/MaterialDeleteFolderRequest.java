package com.doudian.open.api.material_deleteFolder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_deleteFolder.param.*;

//auto generated, do not edit

public class MaterialDeleteFolderRequest extends DoudianOpRequest<MaterialDeleteFolderParam> {



	@Override
	public String getUrlPath(){
		return "/material/deleteFolder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialDeleteFolderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}