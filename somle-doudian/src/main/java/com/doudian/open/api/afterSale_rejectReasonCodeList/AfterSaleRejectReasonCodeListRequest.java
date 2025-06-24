package com.doudian.open.api.afterSale_rejectReasonCodeList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_rejectReasonCodeList.param.*;

//auto generated, do not edit

public class AfterSaleRejectReasonCodeListRequest extends DoudianOpRequest<AfterSaleRejectReasonCodeListParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/rejectReasonCodeList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleRejectReasonCodeListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}