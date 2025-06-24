package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityInspectionInfo {


	@SerializedName("supported")
	@OpField(required = false , desc = "是否支持前置质检", example= "true")
	private Boolean supported;

	@SerializedName("agency")
	@OpField(required = false , desc = "机构编码，请通过/inspection/QueryBtasAgencyList接口获取", example= "123")
	private String agency;

	@SerializedName("certificate_code")
	@OpField(required = false , desc = "质检证书编码", example= "111")
	private String certificateCode;

	@SerializedName("mode")
	@OpField(required = false , desc = "1: 单库存模式，只允许售卖一个sku；2: 多库存模式，不限售卖次数", example= "2")
	private Integer mode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupported(Boolean supported){
		this.supported = supported;
	}

	
	public Boolean getSupported(){
		return this.supported;
	}

	
	public void setAgency(String agency){
		this.agency = agency;
	}

	
	public String getAgency(){
		return this.agency;
	}

	
	public void setCertificateCode(String certificateCode){
		this.certificateCode = certificateCode;
	}

	
	public String getCertificateCode(){
		return this.certificateCode;
	}

	
	public void setMode(Integer mode){
		this.mode = mode;
	}

	
	public Integer getMode(){
		return this.mode;
	}

}