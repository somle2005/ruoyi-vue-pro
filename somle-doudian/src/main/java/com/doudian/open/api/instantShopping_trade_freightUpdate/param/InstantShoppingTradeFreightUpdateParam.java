package com.doudian.open.api.instantShopping_trade_freightUpdate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class InstantShoppingTradeFreightUpdateParam {


	@SerializedName("template")
	@OpField(required = false , desc = "运费模板", example= "")
	private Template template;

	@SerializedName("columns")
	@OpField(required = false , desc = "运费规则", example= "")
	private List<ColumnsItem> columns;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplate(Template template){
		this.template = template;
	}

	
	public Template getTemplate(){
		return this.template;
	}

	
	public void setColumns(List<ColumnsItem> columns){
		this.columns = columns;
	}

	
	public List<ColumnsItem> getColumns(){
		return this.columns;
	}

}