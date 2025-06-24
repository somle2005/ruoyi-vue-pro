package com.doudian.open.api.open_getAuthInfo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenGetAuthInfoParam {


	@SerializedName("auth_id")
	@OpField(required = true , desc = "授权主体ID，这里为店铺ID", example= "12121321212")
	private String authId;

	@SerializedName("auth_subject_type")
	@OpField(required = false , desc = "授权主体类型，默认为店铺授权，不需要填写。其他类型枚举值如下：YunCang -云仓；WuLiuShang -物流商；WLGongYingShang -物流供应商；MiniApp -小程序 MCN-联盟MCN机构 DouKe-联盟抖客 Colonel-联盟团长", example= "WuLiuShang")
	private String authSubjectType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setAuthSubjectType(String authSubjectType){
		this.authSubjectType = authSubjectType;
	}

	
	public String getAuthSubjectType(){
		return this.authSubjectType;
	}

}