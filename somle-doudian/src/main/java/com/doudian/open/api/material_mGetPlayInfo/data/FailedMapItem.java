package com.doudian.open.api.material_mGetPlayInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedMapItem {


	@SerializedName("ErrCode")
	@OpField(desc = "错误码", example = "10001")
	private Integer errCode;

	@SerializedName("ErrMsg")
	@OpField(desc = "错误信息", example = "参数错误")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setErrCode(Integer errCode){
		this.errCode = errCode;
	}

	
	public Integer getErrCode(){
		return this.errCode;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

}