package com.doudian.open.api.material_editFolder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_editFolder.param.*;

//auto generated, do not edit

public class MaterialEditFolderRequest extends DoudianOpRequest<MaterialEditFolderParam> {



	@Override
	public String getUrlPath(){
		return "/material/editFolder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialEditFolderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}