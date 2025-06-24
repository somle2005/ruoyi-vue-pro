package com.doudian.open.api.order_downloadShopAccountItemFile.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadShopAccountItemFileData {


	@SerializedName("url")
	@OpField(desc = "文件url，链接时效为1小时", example = "https://lf9-tos-bill-center-sign.bytetos.com/ecom-paysettleinfo/data/download/item/DL202111041446472412450342.csv?x-expires=1636012061&x-signature=yz1M9N%2BXGMtBXyMFT9O75buK26w%3D")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}