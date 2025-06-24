package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BarcodesItem {


	@SerializedName("barcode")
	@OpField(desc = "条码值", example = "6973971701655")
	private String barcode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}

	
	public String getBarcode(){
		return this.barcode;
	}

}