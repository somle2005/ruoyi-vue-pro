package com.doudian.open.api.order_downloadToShop.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadToShopData {


	@SerializedName("code")
	@OpField(desc = "状态码    100000-成功   100002-下载记录不存在   100015-文件还未生成   100016-文件已经失效   100025-文件生成失败", example = "100000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "状态说明", example = "success")
	private String codeMsg;

	@SerializedName("url")
	@OpField(desc = "生成的下载链接", example = "https://lf6-tos-bill-center-sign.bytetos.com/ecom-paysettleinfo/data/download/item/DL202108191056192174226975.csv?x-expires=1629345425&x-signature=iaiLmiwJbc%2FMNKFrS6RaHzbdNwU%3D")
	private String url;


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

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}