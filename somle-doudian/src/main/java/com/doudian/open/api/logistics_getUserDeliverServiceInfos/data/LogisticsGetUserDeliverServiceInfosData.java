package com.doudian.open.api.logistics_getUserDeliverServiceInfos.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsGetUserDeliverServiceInfosData {


	@SerializedName("user_service_infos")
	@OpField(desc = "用户发货服务信息", example = "")
	private List<UserServiceInfosItem> userServiceInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUserServiceInfos(List<UserServiceInfosItem> userServiceInfos){
		this.userServiceInfos = userServiceInfos;
	}

	
	public List<UserServiceInfosItem> getUserServiceInfos(){
		return this.userServiceInfos;
	}

}