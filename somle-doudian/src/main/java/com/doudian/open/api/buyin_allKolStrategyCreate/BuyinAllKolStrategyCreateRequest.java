package com.doudian.open.api.buyin_allKolStrategyCreate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_allKolStrategyCreate.param.*;

//auto generated, do not edit

public class BuyinAllKolStrategyCreateRequest extends DoudianOpRequest<BuyinAllKolStrategyCreateParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/allKolStrategyCreate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinAllKolStrategyCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}