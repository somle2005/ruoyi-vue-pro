package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CompanyInfo {


	@SerializedName("company_name")
	@OpField(desc = "快递公司名称", example = "中通快递")
	private String companyName;

	@SerializedName("express_company")
	@OpField(desc = "快递公司编码", example = "zhongtong")
	private String expressCompany;

	@SerializedName("telephone")
	@OpField(desc = "快递公司电话", example = "400-XXX-XXXX")
	private String telephone;

	@SerializedName("icon")
	@OpField(desc = "快递公司图标", example = "https://XXXX")
	private String icon;

	@SerializedName("url")
	@OpField(desc = "快递公司官网", example = "www.zto.cn")
	private String url;

	@SerializedName("express_no")
	@OpField(desc = "快递单号", example = "75530132493095")
	private String expressNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setExpressNo(String expressNo){
		this.expressNo = expressNo;
	}

	
	public String getExpressNo(){
		return this.expressNo;
	}

}