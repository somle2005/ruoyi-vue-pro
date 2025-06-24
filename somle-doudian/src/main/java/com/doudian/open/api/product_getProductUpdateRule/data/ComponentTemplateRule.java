package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ComponentTemplateRule {


	@SerializedName("interval_size_symbol")
	@OpField(desc = "区间符号", example = "[]")
	private List<String> intervalSizeSymbol;

	@SerializedName("size_dimension_range")
	@OpField(desc = "维度下尺码范围", example = "")
	private Map<String,SizeDimensionRangeItem> sizeDimensionRange;

	@SerializedName("support_template_sub_type")
	@OpField(desc = "当前类目支持的尺码模版子类型", example = "clothing")
	private String supportTemplateSubType;

	@SerializedName("is_show")
	@OpField(desc = "是否展示尺码信息", example = "true")
	private Boolean isShow;

	@SerializedName("must_input")
	@OpField(desc = "尺码信息是否必填", example = "false")
	private Boolean mustInput;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIntervalSizeSymbol(List<String> intervalSizeSymbol){
		this.intervalSizeSymbol = intervalSizeSymbol;
	}

	
	public List<String> getIntervalSizeSymbol(){
		return this.intervalSizeSymbol;
	}

	
	public void setSizeDimensionRange(Map<String,SizeDimensionRangeItem> sizeDimensionRange){
		this.sizeDimensionRange = sizeDimensionRange;
	}

	
	public Map<String,SizeDimensionRangeItem> getSizeDimensionRange(){
		return this.sizeDimensionRange;
	}

	
	public void setSupportTemplateSubType(String supportTemplateSubType){
		this.supportTemplateSubType = supportTemplateSubType;
	}

	
	public String getSupportTemplateSubType(){
		return this.supportTemplateSubType;
	}

	
	public void setIsShow(Boolean isShow){
		this.isShow = isShow;
	}

	
	public Boolean getIsShow(){
		return this.isShow;
	}

	
	public void setMustInput(Boolean mustInput){
		this.mustInput = mustInput;
	}

	
	public Boolean getMustInput(){
		return this.mustInput;
	}

}