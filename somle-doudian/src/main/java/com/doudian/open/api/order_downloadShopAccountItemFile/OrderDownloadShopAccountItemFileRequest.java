package com.doudian.open.api.order_downloadShopAccountItemFile;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_downloadShopAccountItemFile.param.*;

//auto generated, do not edit

public class OrderDownloadShopAccountItemFileRequest extends DoudianOpRequest<OrderDownloadShopAccountItemFileParam> {



	@Override
	public String getUrlPath(){
		return "/order/downloadShopAccountItemFile";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderDownloadShopAccountItemFileResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}