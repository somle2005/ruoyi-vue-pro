package com.doudian.open.api.freightTemplate_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Data {


	@SerializedName("template")
	@OpField(desc = "模板信息", example = "")
	private Template template;

	@SerializedName("columns")
	@OpField(desc = "规则", example = "")
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