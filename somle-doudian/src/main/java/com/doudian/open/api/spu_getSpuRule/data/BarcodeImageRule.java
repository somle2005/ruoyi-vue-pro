package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BarcodeImageRule {


	@SerializedName("data_format")
	@OpField(desc = "数据格式类型", example = "[png,jpg,jpeg]")
	private List<String> dataFormat;

	@SerializedName("is_required")
	@OpField(desc = "是否必填，0:非必填，1:必填", example = "1")
	private Long isRequired;

	@SerializedName("min_num")
	@OpField(desc = "最小数量", example = "1")
	private Long minNum;

	@SerializedName("max_num")
	@OpField(desc = "最大数量", example = "5")
	private Long maxNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDataFormat(List<String> dataFormat){
		this.dataFormat = dataFormat;
	}

	
	public List<String> getDataFormat(){
		return this.dataFormat;
	}

	
	public void setIsRequired(Long isRequired){
		this.isRequired = isRequired;
	}

	
	public Long getIsRequired(){
		return this.isRequired;
	}

	
	public void setMinNum(Long minNum){
		this.minNum = minNum;
	}

	
	public Long getMinNum(){
		return this.minNum;
	}

	
	public void setMaxNum(Long maxNum){
		this.maxNum = maxNum;
	}

	
	public Long getMaxNum(){
		return this.maxNum;
	}

}