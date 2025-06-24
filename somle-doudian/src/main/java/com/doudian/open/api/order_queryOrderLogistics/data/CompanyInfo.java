package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CompanyInfo {


	@SerializedName("express_no")
	@OpField(desc = "快递单号", example = "1")
	private String expressNo;

	@SerializedName("company_name")
	@OpField(desc = "快递公司中文名称：顺丰快递", example = "1")
	private String companyName;

	@SerializedName("express_company")
	@OpField(desc = "快递公司：shunfeng", example = "1")
	private String expressCompany;

	@SerializedName("telephone")
	@OpField(desc = "快递公司电话", example = "1")
	private String telephone;

	@SerializedName("icon")
	@OpField(desc = "快递公司图标", example = "1")
	private String icon;

	@SerializedName("url")
	@OpField(desc = "快递公司官网地址", example = "1")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExpressNo(String expressNo){
		this.expressNo = expressNo;
	}

	
	public String getExpressNo(){
		return this.expressNo;
	}

	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	
	public String getCompanyName(){
		return this.companyName;
	}

	
	public void setExpressCompany(String expressCompany){
		this.expressCompany = expressCompany;
	}

	
	public String getExpressCompany(){
		return this.expressCompany;
	}

	
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}

	
	public String getTelephone(){
		return this.telephone;
	}

	
	public void setIcon(String icon){
		this.icon = icon;
	}

	
	public String getIcon(){
		return this.icon;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}