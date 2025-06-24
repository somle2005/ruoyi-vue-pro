package com.doudian.open.spi.topup_query;

import com.doudian.open.core.DoudianOpSpiRequest;
import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_query.param.*;

//auto generated, do not edit

public class TopupQueryRequest extends DoudianOpSpiRequest<TopupQueryParam> {



	@Override
	public  Class<? extends DoudianOpSpiResponse<?>> getResponseClass(){
		return TopupQueryResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public static TopupQueryRequest wrap(Object config){
		TopupQueryRequest ret = new TopupQueryRequest();
		ret.initWithConfig(config);
		return ret;
	}

}