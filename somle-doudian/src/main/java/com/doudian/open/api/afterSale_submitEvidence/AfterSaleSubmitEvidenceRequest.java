package com.doudian.open.api.afterSale_submitEvidence;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_submitEvidence.param.*;

//auto generated, do not edit

public class AfterSaleSubmitEvidenceRequest extends DoudianOpRequest<AfterSaleSubmitEvidenceParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/submitEvidence";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleSubmitEvidenceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}