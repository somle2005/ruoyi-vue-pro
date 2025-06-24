package com.doudian.open.msg.yunc_orderStatusChange;

import com.doudian.open.core.msg.DoudianOpMsgRequest;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.msg.yunc_orderStatusChange.param.*;

//auto generated, do not edit

public class YuncOrderStatusChangeRequest extends DoudianOpMsgRequest<YuncOrderStatusChangeParam> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}