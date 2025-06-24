package com.doudian.open.api.afterSale_CancelSendGoodsSuccess;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_CancelSendGoodsSuccess.param.*;

//auto generated, do not edit

public class AfterSaleCancelSendGoodsSuccessRequest extends DoudianOpRequest<AfterSaleCancelSendGoodsSuccessParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/CancelSendGoodsSuccess";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleCancelSendGoodsSuccessResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}