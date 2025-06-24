package com.doudian.open.api.buyin_exclusivePlanAuthorOperate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_exclusivePlanAuthorOperate.param.*;

//auto generated, do not edit

public class BuyinExclusivePlanAuthorOperateRequest extends DoudianOpRequest<BuyinExclusivePlanAuthorOperateParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/exclusivePlanAuthorOperate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinExclusivePlanAuthorOperateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}