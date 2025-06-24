package com.doudian.open.api.shop_getShopCategory.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ShopGetShopCategoryData {


	@SerializedName("data")
	@OpField(desc = "返回参数列表", example = "")
	private List<DataItem> data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
	}

}