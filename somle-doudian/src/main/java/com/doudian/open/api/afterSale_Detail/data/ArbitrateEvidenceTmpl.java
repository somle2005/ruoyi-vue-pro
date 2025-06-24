package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ArbitrateEvidenceTmpl {


	@SerializedName("images")
	@OpField(desc = "仲裁图片示例", example = "仲裁图片示例")
	private List<String> images;

	@SerializedName("describe")
	@OpField(desc = "仲裁描述", example = "仲裁描述")
	private String describe;

	@SerializedName("dead_line")
	@OpField(desc = "示例截止时间", example = "1735660800")
	private Long deadLine;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setImages(List<String> images){
		this.images = images;
	}

	
	public List<String> getImages(){
		return this.images;
	}

	
	public void setDescribe(String describe){
		this.describe = describe;
	}

	
	public String getDescribe(){
		return this.describe;
	}

	
	public void setDeadLine(Long deadLine){
		this.deadLine = deadLine;
	}

	
	public Long getDeadLine(){
		return this.deadLine;
	}

}