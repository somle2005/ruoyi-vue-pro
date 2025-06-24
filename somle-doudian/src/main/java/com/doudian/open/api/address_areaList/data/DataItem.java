package com.doudian.open.api.address_areaList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("area_id")
	@OpField(desc = "", example = "")
	private Long areaId;

	@SerializedName("area")
	@OpField(desc = "", example = "")
	private String area;

	@SerializedName("father_id")
	@OpField(desc = "", example = "")
	private Long fatherId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAreaId(Long areaId){
		this.areaId = areaId;
	}

	
	public Long getAreaId(){
		return this.areaId;
	}

	
	public void setArea(String area){
		this.area = area;
	}

	
	public String getArea(){
		return this.area;
	}

	
	public void setFatherId(Long fatherId){
		this.fatherId = fatherId;
	}

	
	public Long getFatherId(){
		return this.fatherId;
	}

}