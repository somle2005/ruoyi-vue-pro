package com.doudian.open.spi.topup_query;

import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_query.data.*;

//auto generated, do not edit

public class TopupQueryResponse extends DoudianOpSpiResponse<TopupQueryData> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}