package com.doudian.open.api.buyin_orientKolStrategyCreate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_orientKolStrategyCreate.param.*;

//auto generated, do not edit

public class BuyinOrientKolStrategyCreateRequest extends DoudianOpRequest<BuyinOrientKolStrategyCreateParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/orientKolStrategyCreate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinOrientKolStrategyCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}