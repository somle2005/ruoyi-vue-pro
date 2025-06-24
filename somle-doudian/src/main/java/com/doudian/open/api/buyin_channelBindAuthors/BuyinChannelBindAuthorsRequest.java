package com.doudian.open.api.buyin_channelBindAuthors;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_channelBindAuthors.param.*;

//auto generated, do not edit

public class BuyinChannelBindAuthorsRequest extends DoudianOpRequest<BuyinChannelBindAuthorsParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/channelBindAuthors";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinChannelBindAuthorsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}