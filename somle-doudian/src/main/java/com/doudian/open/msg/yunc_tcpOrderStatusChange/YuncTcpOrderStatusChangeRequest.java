package com.doudian.open.msg.yunc_tcpOrderStatusChange;

import com.doudian.open.core.msg.DoudianOpMsgRequest;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.msg.yunc_tcpOrderStatusChange.param.*;

//auto generated, do not edit

public class YuncTcpOrderStatusChangeRequest extends DoudianOpMsgRequest<YuncTcpOrderStatusChangeParam> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}