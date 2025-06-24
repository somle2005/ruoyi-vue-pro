package com.doudian.open.api.material_searchFolder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_searchFolder.param.*;

//auto generated, do not edit

public class MaterialSearchFolderRequest extends DoudianOpRequest<MaterialSearchFolderParam> {



	@Override
	public String getUrlPath(){
		return "/material/searchFolder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialSearchFolderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}