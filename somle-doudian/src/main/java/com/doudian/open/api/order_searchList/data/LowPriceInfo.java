package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LowPriceInfo {


	@SerializedName("low_price_product")
	@OpField(desc = "超值购信息", example = "")
	private LowPriceProduct lowPriceProduct;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLowPriceProduct(LowPriceProduct lowPriceProduct){
		this.lowPriceProduct = lowPriceProduct;
	}

	
	public LowPriceProduct getLowPriceProduct(){
		return this.lowPriceProduct;
	}

}