package com.doudian.open.api.address_listAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CommonPhone {


	@SerializedName("area_num")
	@OpField(desc = "区号;", example = "0635")
	private String areaNum;

	@SerializedName("main_num")
	@OpField(desc = "主机号;", example = "5781308")
	private String mainNum;

	@SerializedName("auxiliary_num")
	@OpField(desc = "分机号;", example = "1111")
	private String auxiliaryNum;

	@SerializedName("num")
	@OpField(desc = "拼接之后的联系方式;", example = "0635-5781308-1111")
	private String num;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAreaNum(String areaNum){
		this.areaNum = areaNum;
	}

	
	public String getAreaNum(){
		return this.areaNum;
	}

	
	public void setMainNum(String mainNum){
		this.mainNum = mainNum;
	}

	
	public String getMainNum(){
		return this.mainNum;
	}

	
	public void setAuxiliaryNum(String auxiliaryNum){
		this.auxiliaryNum = auxiliaryNum;
	}

	
	public String getAuxiliaryNum(){
		return this.auxiliaryNum;
	}

	
	public void setNum(String num){
		this.num = num;
	}

	
	public String getNum(){
		return this.num;
	}

}