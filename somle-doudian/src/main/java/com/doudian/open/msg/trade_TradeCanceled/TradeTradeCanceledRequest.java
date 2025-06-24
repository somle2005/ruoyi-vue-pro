package com.doudian.open.msg.trade_TradeCanceled;

import com.doudian.open.core.msg.DoudianOpMsgRequest;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.msg.trade_TradeCanceled.param.*;

//auto generated, do not edit

public class TradeTradeCanceledRequest extends DoudianOpMsgRequest<TradeTradeCanceledParam> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}