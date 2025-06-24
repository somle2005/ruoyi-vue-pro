package com.doudian.open.api.spu_batchUploadImg.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedListItem {


	@SerializedName("name")
	@OpField(desc = "图片名", example = "demo2")
	private String name;

	@SerializedName("origin_url")
	@OpField(desc = "入参URL", example = "https://static.runoob.com/images/demo/demo2.jpg")
	private String originUrl;

	@SerializedName("err_code")
	@OpField(desc = "失败错误码", example = "2010001")
	private Integer errCode;

	@SerializedName("err_msg")
	@OpField(desc = "失败原因", example = "网络超时")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setOriginUrl(String originUrl){
		this.originUrl = originUrl;
	}

	
	public String getOriginUrl(){
		return this.originUrl;
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