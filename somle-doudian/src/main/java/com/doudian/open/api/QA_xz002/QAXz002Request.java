package com.doudian.open.api.QA_xz002;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.QA_xz002.param.*;

//auto generated, do not edit

public class QAXz002Request extends DoudianOpRequest<QAXz002Param> {



	@Override
	public String getUrlPath(){
		return "/QA/xz002";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return QAXz002Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}