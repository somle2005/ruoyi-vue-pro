package com.doudian.open.api.product_auditList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_auditList.param.*;

//auto generated, do not edit

public class ProductAuditListRequest extends DoudianOpRequest<ProductAuditListParam> {



	@Override
	public String getUrlPath(){
		return "/product/auditList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductAuditListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}