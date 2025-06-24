package com.doudian.open.api.spu_getSpuTpl.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuGetSpuTplData {


	@SerializedName("product_format")
	@OpField(desc = "属性信息", example = "-")
	private List<ProductFormatItem> productFormat;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductFormat(List<ProductFormatItem> productFormat){
		this.productFormat = productFormat;
	}

	
	public List<ProductFormatItem> getProductFormat(){
		return this.productFormat;
	}

}