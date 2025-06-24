package com.doudian.open.spi.topup_cancel;

import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_cancel.data.*;

//auto generated, do not edit

public class TopupCancelResponse extends DoudianOpSpiResponse<TopupCancelData> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}