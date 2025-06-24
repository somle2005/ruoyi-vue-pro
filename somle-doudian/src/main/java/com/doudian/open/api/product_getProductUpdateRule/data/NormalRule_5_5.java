package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class NormalRule_5_5 {


	@SerializedName("description")
	@OpField(desc = "描述信息", example = "定制商品的发货时间从消费者上传定制信息后开始计算，为提升转化，商详页的时效文案展示为“上传定制信息后x天内发货”，定制商品仅支持配置48小时以上的时间。")
	private String description;

	@SerializedName("delay_options")
	@OpField(desc = "可用的延迟发货天数", example = "[]")
	private List<Long> delayOptions;

	@SerializedName("deny_description")
	@OpField(desc = "不可用信息", example = "不可用原因")
	private String denyDescription;

	@SerializedName("display")
	@OpField(desc = "是否可见", example = "true")
	private String display;

	@SerializedName("support")
	@OpField(desc = "是否支持", example = "true")
	private String support;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDescription(String description){
		this.description = description;
	}

	
	public String getDescription(){
		return this.description;
	}

	
	public void setDelayOptions(List<Long> delayOptions){
		this.delayOptions = delayOptions;
	}

	
	public List<Long> getDelayOptions(){
		return this.delayOptions;
	}

	
	public void setDenyDescription(String denyDescription){
		this.denyDescription = denyDescription;
	}

	
	public String getDenyDescription(){
		return this.denyDescription;
	}

	
	public void setDisplay(String display){
		this.display = display;
	}

	
	public String getDisplay(){
		return this.display;
	}

	
	public void setSupport(String support){
		this.support = support;
	}

	
	public String getSupport(){
		return this.support;
	}

}