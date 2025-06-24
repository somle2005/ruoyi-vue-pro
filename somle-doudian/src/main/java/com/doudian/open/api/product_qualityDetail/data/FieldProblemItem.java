package com.doudian.open.api.product_qualityDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FieldProblemItem {


	@SerializedName("field_key")
	@OpField(desc = "字段key，category-类目、props-属性、product_name-标题、pic-主图、desc_pic-详情图片、desc_text-详情文字", example = "product_name")
	private String fieldKey;

	@SerializedName("field_name")
	@OpField(desc = "字段名", example = "标题")
	private String fieldName;

	@SerializedName("problem_key")
	@OpField(desc = "问题编码", example = "501")
	private Long problemKey;

	@SerializedName("problem_name")
	@OpField(desc = "问题名", example = "详情页图片较少")
	private String problemName;

	@SerializedName("suggestion")
	@OpField(desc = "问题建议", example = "商品素材缺少，详情页的图片说明较少。促进商品购买的决策性信息过少，影响购买，建议丰富商品信息，上传不少于5张详情图片，将商品优势展示出来")
	private String suggestion;

	@SerializedName("problem_type")
	@OpField(desc = "问题类型编码", example = "1")
	private Long problemType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFieldKey(String fieldKey){
		this.fieldKey = fieldKey;
	}

	
	public String getFieldKey(){
		return this.fieldKey;
	}

	
	public void setFieldName(String fieldName){
		this.fieldName = fieldName;
	}

	
	public String getFieldName(){
		return this.fieldName;
	}

	
	public void setProblemKey(Long problemKey){
		this.problemKey = problemKey;
	}

	
	public Long getProblemKey(){
		return this.problemKey;
	}

	
	public void setProblemName(String problemName){
		this.problemName = problemName;
	}

	
	public String getProblemName(){
		return this.problemName;
	}

	
	public void setSuggestion(String suggestion){
		this.suggestion = suggestion;
	}

	
	public String getSuggestion(){
		return this.suggestion;
	}

	
	public void setProblemType(Long problemType){
		this.problemType = problemType;
	}

	
	public Long getProblemType(){
		return this.problemType;
	}

}