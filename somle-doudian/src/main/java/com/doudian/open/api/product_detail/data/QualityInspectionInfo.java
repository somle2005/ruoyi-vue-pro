package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityInspectionInfo {


	@SerializedName("mode")
	@OpField(desc = "1: 单库存模式，只允许售卖一个sku；2: 多库存模式，不限售卖次数", example = "1")
	private Integer mode;

	@SerializedName("certificate_code")
	@OpField(desc = "质检证书编码", example = "abc")
	private String certificateCode;

	@SerializedName("agency")
	@OpField(desc = "机构编码", example = "123")
	private String agency;

	@SerializedName("supported")
	@OpField(desc = "是否勾选支持前置质检", example = "false")
	private Boolean supported;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMode(Integer mode){
		this.mode = mode;
	}

	
	public Integer getMode(){
		return this.mode;
	}

	
	public void setCertificateCode(String certificateCode){
		this.certificateCode = certificateCode;
	}

	
	public String getCertificateCode(){
		return this.certificateCode;
	}

	
	public void setAgency(String agency){
		this.agency = agency;
	}

	
	public String getAgency(){
		return this.agency;
	}

	
	public void setSupported(Boolean supported){
		this.supported = supported;
	}

	
	public Boolean getSupported(){
		return this.supported;
	}

}