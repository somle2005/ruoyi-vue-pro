package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Extra {


	@SerializedName("measure_info")
	@OpField(desc = "度量衡结构化信息", example = "")
	private MeasureInfo measureInfo;

	@SerializedName("cpv_path")
	@OpField(desc = "导航路径信息", example = "")
	private List<CpvPathItem> cpvPath;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMeasureInfo(MeasureInfo measureInfo){
		this.measureInfo = measureInfo;
	}

	
	public MeasureInfo getMeasureInfo(){
		return this.measureInfo;
	}

	
	public void setCpvPath(List<CpvPathItem> cpvPath){
		this.cpvPath = cpvPath;
	}

	
	public List<CpvPathItem> getCpvPath(){
		return this.cpvPath;
	}

}