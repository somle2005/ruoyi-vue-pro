package com.doudian.open.api.freightTemplate_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FreightTemplateCreateParam {


	@SerializedName("template")
	@OpField(required = true , desc = "运费模板信息", example= "")
	private Template template;

	@SerializedName("columns")
	@OpField(required = false , desc = "运费模板规则信息；每种类型模板可创建的规则类型: 阶梯计价模板-默认规则，普通计价规则，包邮规则，限运规则;固定运费模板-包邮规则，限运规则;固定运费模板-包邮规则，限运规则;包邮模板-限运规则;货到付款模板-限运规则", example= "")
	private List<ColumnsItem> columns;

	@SerializedName("upsert_transfer_rule")
	@OpField(required = false , desc = "是否插入中转规则", example= "false")
	private Boolean upsertTransferRule;


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

	
	public void setUpsertTransferRule(Boolean upsertTransferRule){
		this.upsertTransferRule = upsertTransferRule;
	}

	
	public Boolean getUpsertTransferRule(){
		return this.upsertTransferRule;
	}

}