package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValuesItem_4 {


	@SerializedName("value_name")
	@OpField(required = true , desc = "规格值名称", example= "升高")
	private String valueName;

	@SerializedName("remark")
	@OpField(required = false , desc = "规格值备注信息，如偏大", example= "“test")
	private String remark;

	@SerializedName("cpv_path")
	@OpField(required = false , desc = "规格值的导航样式路径信息，如色系->色值", example= "")
	private List<CpvPathItem> cpvPath;

	@SerializedName("measure_info")
	@OpField(required = false , desc = "度量衡结构化信息，如单果规格的规格值10-13g，包含两个模块：{        measure_info: {          template_id: 50,          values: [            {              module_id: 44,              prefix: ,              suffix: -,              value: 10            },            {              module_id: 45,              prefix: ,              suffix: ,              value: 13,              unit_id: 2,              unit_name: g            }          ]        }", example= "")
	private MeasureInfo measureInfo;

	@SerializedName("value_id")
	@OpField(required = false , desc = "标准销售属性值id", example= "1")
	private Long valueId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setCpvPath(List<CpvPathItem> cpvPath){
		this.cpvPath = cpvPath;
	}

	
	public List<CpvPathItem> getCpvPath(){
		return this.cpvPath;
	}

	
	public void setMeasureInfo(MeasureInfo measureInfo){
		this.measureInfo = measureInfo;
	}

	
	public MeasureInfo getMeasureInfo(){
		return this.measureInfo;
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

}