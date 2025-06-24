package com.doudian.open.msg.product_change;

import com.doudian.open.core.msg.DoudianOpMsgRequest;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.msg.product_change.param.*;

//auto generated, do not edit

public class ProductChangeRequest extends DoudianOpMsgRequest<ProductChangeParam> {



	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}