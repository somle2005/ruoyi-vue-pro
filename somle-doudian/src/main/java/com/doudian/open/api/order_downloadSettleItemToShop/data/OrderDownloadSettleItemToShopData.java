package com.doudian.open.api.order_downloadSettleItemToShop.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadSettleItemToShopData {


	@SerializedName("download_id")
	@OpField(desc = "返回的download_id", example = "DL202108191056192174226975")
	private String downloadId;

	@SerializedName("code")
	@OpField(desc = "状态码", example = "100000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "状态信息", example = "success")
	private String codeMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDownloadId(String downloadId){
		this.downloadId = downloadId;
	}

	
	public String getDownloadId(){
		return this.downloadId;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setCodeMsg(String codeMsg){
		this.codeMsg = codeMsg;
	}

	
	public String getCodeMsg(){
		return this.codeMsg;
	}

}