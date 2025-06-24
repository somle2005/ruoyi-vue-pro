package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DataItem {


	@SerializedName("measure_templates")
	@OpField(desc = "度量衡模版，可为多个，一般情况为一个", example = "")
	private List<MeasureTemplatesItem> measureTemplates;

	@SerializedName("has_sub_property")
	@OpField(desc = "是否有下级级联属性", example = "false")
	private Boolean hasSubProperty;

	@SerializedName("cid")
	@OpField(desc = "【已废弃】老类目id，请使用category_id字段", example = "31918")
	private Long cid;

	@SerializedName("property_name")
	@OpField(desc = "属性名称", example = "材质")
	private String propertyName;

	@SerializedName("options")
	@OpField(desc = "属性可选值列表，为空时需要手动填写", example = "")
	private List<OptionsItem> options;

	@SerializedName("required")
	@OpField(desc = "1：创建商品时该属性字段必填 0：创建商品时该属性字段选填", example = "0")
	private Long required;

	@SerializedName("status")
	@OpField(desc = "属性状态，0：有效，1：失效", example = "1")
	private Long status;

	@SerializedName("type")
	@OpField(desc = "输入text、单选select、多选multi_select、时间戳timestamp、时间段timerange", example = "text")
	private String type;

	@SerializedName("category_id")
	@OpField(desc = "新版类目id（优先使用）", example = "31918")
	private Long categoryId;

	@SerializedName("multi_select_max")
	@OpField(desc = "最大多选数", example = "5")
	private Long multiSelectMax;

	@SerializedName("property_type")
	@OpField(desc = "属性类型，0 绑定属性 1关键属性 2售卖属性 3 商品属性", example = "1")
	private Long propertyType;

	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "14133")
	private Long propertyId;

	@SerializedName("sequence")
	@OpField(desc = "属性顺序", example = "2")
	private Long sequence;

	@SerializedName("relation_id")
	@OpField(desc = "关系id,SPU类目使用，表示自己的上一个关键属性ID", example = "1")
	private Long relationId;

	@SerializedName("diy_type")
	@OpField(desc = "商品属性是否有支持商家自定义，1=支持自定义，0=不支持自定义。 使用场景：当开发者传入自定义的属性值时需在创建或更新商品接口的属性时，需把【product_format_new】字段中传入diy_type=1并且value=0；", example = "1")
	private Long diyType;

	@SerializedName("important_type")
	@OpField(desc = "0:非重要属性，1:重要属性", example = "1")
	private Long importantType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMeasureTemplates(List<MeasureTemplatesItem> measureTemplates){
		this.measureTemplates = measureTemplates;
	}

	
	public List<MeasureTemplatesItem> getMeasureTemplates(){
		return this.measureTemplates;
	}

	
	public void setHasSubProperty(Boolean hasSubProperty){
		this.hasSubProperty = hasSubProperty;
	}

	
	public Boolean getHasSubProperty(){
		return this.hasSubProperty;
	}

	
	public void setCid(Long cid){
		this.cid = cid;
	}

	
	public Long getCid(){
		return this.cid;
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	
	public List<OptionsItem> getOptions(){
		return this.options;
	}

	
	public void setRequired(Long required){
		this.required = required;
	}

	
	public Long getRequired(){
		return this.required;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setType(String type){
		this.type = type;
	}

	
	public String getType(){
		return this.type;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setMultiSelectMax(Long multiSelectMax){
		this.multiSelectMax = multiSelectMax;
	}

	
	public Long getMultiSelectMax(){
		return this.multiSelectMax;
	}

	
	public void setPropertyType(Long propertyType){
		this.propertyType = propertyType;
	}

	
	public Long getPropertyType(){
		return this.propertyType;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	
	public Long getSequence(){
		return this.sequence;
	}

	
	public void setRelationId(Long relationId){
		this.relationId = relationId;
	}

	
	public Long getRelationId(){
		return this.relationId;
	}

	
	public void setDiyType(Long diyType){
		this.diyType = diyType;
	}

	
	public Long getDiyType(){
		return this.diyType;
	}

	
	public void setImportantType(Long importantType){
		this.importantType = importantType;
	}

	
	public Long getImportantType(){
		return this.importantType;
	}

}