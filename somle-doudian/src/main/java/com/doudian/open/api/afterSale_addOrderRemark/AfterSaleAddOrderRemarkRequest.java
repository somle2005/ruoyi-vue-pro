package com.doudian.open.api.afterSale_addOrderRemark;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_addOrderRemark.param.*;

//auto generated, do not edit

public class AfterSaleAddOrderRemarkRequest extends DoudianOpRequest<AfterSaleAddOrderRemarkParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/addOrderRemark";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleAddOrderRemarkResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}