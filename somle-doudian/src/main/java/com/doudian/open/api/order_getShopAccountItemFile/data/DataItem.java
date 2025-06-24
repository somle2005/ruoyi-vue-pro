package com.doudian.open.api.order_getShopAccountItemFile.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "12345")
	private Long shopId;

	@SerializedName("bill_date")
	@OpField(desc = "账单日期", example = "2021-10-01")
	private String billDate;

	@SerializedName("url")
	@OpField(desc = "文件url(有效期为1小时)", example = "https://lf3-tos-bill-center-sign.bytetos.com/ecom-bill-center/data/download/item/20211118-%E8%B5%84%E9%87%91%E8%B4%A6%E5%8D%95-77977.csv?x-expires=1637568949&x-signature=qzO81RDjGHfHQHUMFw1HaFyHZnA%3D")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setBillDate(String billDate){
		this.billDate = billDate;
	}

	
	public String getBillDate(){
		return this.billDate;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}