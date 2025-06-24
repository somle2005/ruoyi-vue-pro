package com.doudian.open.api.logistics_fetchBluetoothCmd;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_fetchBluetoothCmd.param.*;

//auto generated, do not edit

public class LogisticsFetchBluetoothCmdRequest extends DoudianOpRequest<LogisticsFetchBluetoothCmdParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/fetchBluetoothCmd";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsFetchBluetoothCmdResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}