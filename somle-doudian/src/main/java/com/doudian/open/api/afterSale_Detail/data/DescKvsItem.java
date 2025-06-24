package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DescKvsItem {


	@SerializedName("key")
	@OpField(desc = "行头", example = "举证说明")
	private String key;

	@SerializedName("value")
	@OpField(desc = "内容", example = "测试")
	private String value;

	@SerializedName("highlight")
	@OpField(desc = "是否高亮展示", example = "false")
	private Boolean highlight;

	@SerializedName("notice")
	@OpField(desc = "额外提示", example = "空")
	private String notice;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

	
	public void setHighlight(Boolean highlight){
		this.highlight = highlight;
	}

	
	public Boolean getHighlight(){
		return this.highlight;
	}

	
	public void setNotice(String notice){
		this.notice = notice;
	}

	
	public String getNotice(){
		return this.notice;
	}

}