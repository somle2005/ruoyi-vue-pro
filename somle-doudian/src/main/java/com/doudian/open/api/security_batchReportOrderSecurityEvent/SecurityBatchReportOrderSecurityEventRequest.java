package com.doudian.open.api.security_batchReportOrderSecurityEvent;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.security_batchReportOrderSecurityEvent.param.*;

//auto generated, do not edit

public class SecurityBatchReportOrderSecurityEventRequest extends DoudianOpRequest<SecurityBatchReportOrderSecurityEventParam> {



	@Override
	public String getUrlPath(){
		return "/security/batchReportOrderSecurityEvent";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SecurityBatchReportOrderSecurityEventResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}