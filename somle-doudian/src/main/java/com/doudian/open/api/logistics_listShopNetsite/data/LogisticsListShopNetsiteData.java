package com.doudian.open.api.logistics_listShopNetsite.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsListShopNetsiteData {


	@SerializedName("netsites")
	@OpField(desc = "商家已开通的网点列表信息", example = "-")
	private List<NetsitesItem> netsites;

	@SerializedName("logistics_code")
	@OpField(desc = "快递公司编码", example = "zhongtong")
	private String logisticsCode;

	@SerializedName("company_type")
	@OpField(desc = "物流服务商业务类型 1：直营  2：加盟 3：落地配 4：直营带网点", example = "1")
	private Integer companyType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNetsites(List<NetsitesItem> netsites){
		this.netsites = netsites;
	}

	
	public List<NetsitesItem> getNetsites(){
		return this.netsites;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setCompanyType(Integer companyType){
		this.companyType = companyType;
	}

	
	public Integer getCompanyType(){
		return this.companyType;
	}

}