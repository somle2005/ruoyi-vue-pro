package com.doudian.open.api.spu_createSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BarcodesItem {


	@SerializedName("barcode_type")
	@OpField(required = false , desc = "条码类型，1-69码", example= "1")
	private Integer barcodeType;

	@SerializedName("barcode")
	@OpField(required = false , desc = "条码值", example= "6900388851185")
	private String barcode;

	@SerializedName("barcode_image")
	@OpField(required = false , desc = "条码图", example= "")
	private List<BarcodeImageItem> barcodeImage;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBarcodeType(Integer barcodeType){
		this.barcodeType = barcodeType;
	}

	
	public Integer getBarcodeType(){
		return this.barcodeType;
	}

	
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}

	
	public String getBarcode(){
		return this.barcode;
	}

	
	public void setBarcodeImage(List<BarcodeImageItem> barcodeImage){
		this.barcodeImage = barcodeImage;
	}

	
	public List<BarcodeImageItem> getBarcodeImage(){
		return this.barcodeImage;
	}

}