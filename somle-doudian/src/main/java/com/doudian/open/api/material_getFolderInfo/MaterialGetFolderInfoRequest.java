package com.doudian.open.api.material_getFolderInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_getFolderInfo.param.*;

//auto generated, do not edit

public class MaterialGetFolderInfoRequest extends DoudianOpRequest<MaterialGetFolderInfoParam> {



	@Override
	public String getUrlPath(){
		return "/material/getFolderInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialGetFolderInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}