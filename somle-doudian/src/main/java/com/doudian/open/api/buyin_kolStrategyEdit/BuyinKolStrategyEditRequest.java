package com.doudian.open.api.buyin_kolStrategyEdit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_kolStrategyEdit.param.*;

//auto generated, do not edit

public class BuyinKolStrategyEditRequest extends DoudianOpRequest<BuyinKolStrategyEditParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/kolStrategyEdit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinKolStrategyEditResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}