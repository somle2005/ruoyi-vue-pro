package com.doudian.open.api.order_downloadToShop.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadToShopParam {


	@SerializedName("download_id")
	@OpField(required = true , desc = "生成的download_id", example= "DL202108191056192174226975")
	private String downloadId;


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

}