package com.doudian.open.msg.trade_TradePending;

import com.doudian.open.core.msg.DoudianOpMsgRequest;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.msg.trade_TradePending.param.*;

//auto generated, do not edit

public class TradeTradePendingRequest extends DoudianOpMsgRequest<TradeTradePendingParam> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}