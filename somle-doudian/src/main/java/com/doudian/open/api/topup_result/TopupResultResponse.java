package com.doudian.open.api.topup_result;

import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.topup_result.data.*;

//auto generated, do not edit

public class TopupResultResponse extends DoudianOpResponse<TopupResultData> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}