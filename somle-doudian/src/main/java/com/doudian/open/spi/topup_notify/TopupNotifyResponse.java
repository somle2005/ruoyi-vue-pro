package com.doudian.open.spi.topup_notify;

import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_notify.data.*;

//auto generated, do not edit

public class TopupNotifyResponse extends DoudianOpSpiResponse<TopupNotifyData> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}