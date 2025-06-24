package com.doudian.open.msg.trade_OrderTagChange;

import com.doudian.open.core.msg.DoudianOpMsgRequest;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.msg.trade_OrderTagChange.param.*;

//auto generated, do not edit

public class TradeOrderTagChangeRequest extends DoudianOpMsgRequest<TradeOrderTagChangeParam> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}