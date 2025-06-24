package com.doudian.open.api.logistics_updateOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsUpdateOrderData {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "DPK363023514956")
	private String trackNo;

	@SerializedName("sort_code")
	@OpField(desc = "分拣码（三段码）", example = "400-W00 000")
	private String sortCode;

	@SerializedName("package_center_code")
	@OpField(desc = "集包地代码", example = "52")
	private String packageCenterCode;

	@SerializedName("package_center_name")
	@OpField(desc = "集包名称", example = "杭州中转包1")
	private String packageCenterName;

	@SerializedName("short_address_code")
	@OpField(desc = "大头笔编码", example = "L51-00-16")
	private String shortAddressCode;

	@SerializedName("short_address_name")
	@OpField(desc = "大头笔名称", example = "123456")
	private String shortAddressName;

	@SerializedName("extra_resp")
	@OpField(desc = "扩展字段", example = "{123456}")
	private String extraResp;


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

	
	public void setSortCode(String sortCode){
		this.sortCode = sortCode;
	}

	
	public String getSortCode(){
		return this.sortCode;
	}

	
	public void setPackageCenterCode(String packageCenterCode){
		this.packageCenterCode = packageCenterCode;
	}

	
	public String getPackageCenterCode(){
		return this.packageCenterCode;
	}

	
	public void setPackageCenterName(String packageCenterName){
		this.packageCenterName = packageCenterName;
	}

	
	public String getPackageCenterName(){
		return this.packageCenterName;
	}

	
	public void setShortAddressCode(String shortAddressCode){
		this.shortAddressCode = shortAddressCode;
	}

	
	public String getShortAddressCode(){
		return this.shortAddressCode;
	}

	
	public void setShortAddressName(String shortAddressName){
		this.shortAddressName = shortAddressName;
	}

	
	public String getShortAddressName(){
		return this.shortAddressName;
	}

	
	public void setExtraResp(String extraResp){
		this.extraResp = extraResp;
	}

	
	public String getExtraResp(){
		return this.extraResp;
	}

}