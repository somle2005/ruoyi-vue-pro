package com.doudian.open.api.order_downloadShopAccountItem.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadShopAccountItemData {


	@SerializedName("code")
	@OpField(desc = "返回code 100000为成功，其他为失败", example = "10000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "返回描述", example = "SUCCESS")
	private String codeMsg;

	@SerializedName("download_id")
	@OpField(desc = "下载id，有效期24小时", example = "DL202110261638110918901284")
	private String downloadId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setDownloadId(String downloadId){
		this.downloadId = downloadId;
	}

	
	public String getDownloadId(){
		return this.downloadId;
	}

}