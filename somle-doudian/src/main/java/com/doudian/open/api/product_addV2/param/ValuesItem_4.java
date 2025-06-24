package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValuesItem_4 {


	@SerializedName("remark")
	@OpField(required = false , desc = "备注", example= "偏深")
	private String remark;

	@SerializedName("value_name")
	@OpField(required = true , desc = "规格值名称", example= "白色")
	private String valueName;

	@SerializedName("cpv_path")
	@OpField(required = false , desc = "规格值导航路径", example= "")
	private List<CpvPathItem> cpvPath;

	@SerializedName("measure_info")
	@OpField(required = false , desc = "度量衡结构化信息", example= "")
	private MeasureInfo measureInfo;

	@SerializedName("value_id")
	@OpField(required = false , desc = "规格值标准属性值id", example= "2341")
	private Long valueId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
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