package com.doudian.open.api.logistics_fetchBluetoothCmd.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ErrInfosItem {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "1234")
	private String trackNo;

	@SerializedName("err_code")
	@OpField(desc = "错误code", example = "100001")
	private Integer errCode;

	@SerializedName("err_msg")
	@OpField(desc = "错误msg", example = "参数有误，请检查请求参数")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
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