package com.doudian.open.api.antispam_userLogin.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class User {


	@SerializedName("uid_type")
	@OpField(required = false , desc = "用户类型", example= "12")
	private Integer uidType;

	@SerializedName("user_id")
	@OpField(required = false , desc = "用户 ID", example= "123456")
	private Long userId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUidType(Integer uidType){
		this.uidType = uidType;
	}

	
	public Integer getUidType(){
		return this.uidType;
	}

	
	public void setUserId(Long userId){
		this.userId = userId;
	}

	
	public Long getUserId(){
		return this.userId;
	}

}