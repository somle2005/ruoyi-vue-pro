package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuBarcodeRule {


	@SerializedName("barcode_rule")
	@OpField(desc = "条码值", example = "")
	private BarcodeRule barcodeRule;

	@SerializedName("barcode_image_rule")
	@OpField(desc = "条码图", example = "")
	private BarcodeImageRule barcodeImageRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBarcodeRule(BarcodeRule barcodeRule){
		this.barcodeRule = barcodeRule;
	}

	
	public BarcodeRule getBarcodeRule(){
		return this.barcodeRule;
	}

	
	public void setBarcodeImageRule(BarcodeImageRule barcodeImageRule){
		this.barcodeImageRule = barcodeImageRule;
	}

	
	public BarcodeImageRule getBarcodeImageRule(){
		return this.barcodeImageRule;
	}

}