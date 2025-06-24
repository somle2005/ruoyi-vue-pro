package com.doudian.open.api.logistics_fetchBluetoothCmd.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WaybillAppliesItem {


	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "12345")
	private String trackNo;

	@SerializedName("std_template_code")
	@OpField(required = true , desc = "标准模板code。已支持的模板信息 https://bytedance.feishu.cn/sheets/VFmQsxJNth8t2OtWWDJca5BbnDb?sheet=p92gXy", example= "zt_76_130_v2")
	private String stdTemplateCode;

	@SerializedName("cus_template_url")
	@OpField(required = false , desc = "自定义区模板url。（传了cus_print_data后url和code其中一个必传）", example= "https://lf3-cm.ecombdstatic.com/obj/logistics-davinci/publicElements/zt_76_130_v2_1633693132.xml")
	private String cusTemplateUrl;

	@SerializedName("cus_template_code")
	@OpField(required = false , desc = "自定义区模板code（目前仅支持模板设计器的自定义区模板）", example= "1234")
	private String cusTemplateCode;

	@SerializedName("cus_print_data")
	@OpField(required = false , desc = "自定义区json数据", example= "{customKey:customValue}")
	private String cusPrintData;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setStdTemplateCode(String stdTemplateCode){
		this.stdTemplateCode = stdTemplateCode;
	}

	
	public String getStdTemplateCode(){
		return this.stdTemplateCode;
	}

	
	public void setCusTemplateUrl(String cusTemplateUrl){
		this.cusTemplateUrl = cusTemplateUrl;
	}

	
	public String getCusTemplateUrl(){
		return this.cusTemplateUrl;
	}

	
	public void setCusTemplateCode(String cusTemplateCode){
		this.cusTemplateCode = cusTemplateCode;
	}

	
	public String getCusTemplateCode(){
		return this.cusTemplateCode;
	}

	
	public void setCusPrintData(String cusPrintData){
		this.cusPrintData = cusPrintData;
	}

	
	public String getCusPrintData(){
		return this.cusPrintData;
	}

}