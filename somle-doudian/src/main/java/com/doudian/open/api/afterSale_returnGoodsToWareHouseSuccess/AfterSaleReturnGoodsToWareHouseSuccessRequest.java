package com.doudian.open.api.afterSale_returnGoodsToWareHouseSuccess;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_returnGoodsToWareHouseSuccess.param.*;

//auto generated, do not edit

public class AfterSaleReturnGoodsToWareHouseSuccessRequest extends DoudianOpRequest<AfterSaleReturnGoodsToWareHouseSuccessParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/returnGoodsToWareHouseSuccess";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleReturnGoodsToWareHouseSuccessResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}