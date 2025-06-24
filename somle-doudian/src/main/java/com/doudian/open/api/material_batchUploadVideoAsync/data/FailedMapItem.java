package com.doudian.open.api.material_batchUploadVideoAsync.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedMapItem {


	@SerializedName("ErrCode")
	@OpField(desc = "错误码", example = "20001")
	private Integer errCode;

	@SerializedName("ErrMsg")
	@OpField(desc = "错误描述", example = "URL无效，请上传有效的素材")
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