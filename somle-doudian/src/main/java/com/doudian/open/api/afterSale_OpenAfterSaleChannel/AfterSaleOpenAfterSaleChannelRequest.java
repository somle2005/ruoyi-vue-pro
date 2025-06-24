package com.doudian.open.api.afterSale_OpenAfterSaleChannel;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_OpenAfterSaleChannel.param.*;

//auto generated, do not edit

public class AfterSaleOpenAfterSaleChannelRequest extends DoudianOpRequest<AfterSaleOpenAfterSaleChannelParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/OpenAfterSaleChannel";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleOpenAfterSaleChannelResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}