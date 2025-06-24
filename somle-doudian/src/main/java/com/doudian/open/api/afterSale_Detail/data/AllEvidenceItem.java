package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AllEvidenceItem {


	@SerializedName("type")
	@OpField(desc = "证据类型  1:图片 2:视频 3:视频 4:文本 5:pdf", example = "1")
	private Integer type;

	@SerializedName("urls")
	@OpField(desc = "资源地址", example = "图片链接")
	private List<String> urls;

	@SerializedName("desc")
	@OpField(desc = "证据描述", example = "描述")
	private String desc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setType(Integer type){
		this.type = type;
	}

	
	public Integer getType(){
		return this.type;
	}

	
	public void setUrls(List<String> urls){
		this.urls = urls;
	}

	
	public List<String> getUrls(){
		return this.urls;
	}

	
	public void setDesc(String desc){
		this.desc = desc;
	}

	
	public String getDesc(){
		return this.desc;
	}

}